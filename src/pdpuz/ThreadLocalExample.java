package pdpuz;

import java.util.*;
import java.util.concurrent.*;

public class CallableExecutorExample {

    public static void main(String[] args) {
        CallableExecutorExample app = new CallableExecutorExample();

        Callable<String> singleTask = () -> {
            Thread.sleep(1500);
            return "Single Callable task finished on " + Thread.currentThread().getName();
        };

        List<Callable<String>> taskList = Arrays.asList(
                () -> {
                    Thread.sleep(1000);
                    return "Task 1 done by " + Thread.currentThread().getName();
                },
                () -> {
                    Thread.sleep(2000);
                    return "Task 2 done by " + Thread.currentThread().getName();
                },
                () -> {
                    Thread.sleep(1200);
                    return "Task 3 done by " + Thread.currentThread().getName();
                }
        );

        app.executeCallableTask(singleTask);

        System.out.println("\n====================\n");

        app.executeCallableTask(taskList);
    }

    public void executeCallableTask(Callable<String> task) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(task);

        try {
            System.out.println("Checking single task status...");
            while (!future.isDone()) {
                System.out.println("Task is still running...");
                Thread.sleep(500);
            }

            if (future.isDone()) {
                System.out.println("✅ Result: " + future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    public void executeCallableTask(List<Callable<String>> tasks) {
        ExecutorService executor = Executors.newFixedThreadPool(tasks.size());

        try {
            List<Future<String>> futures = executor.invokeAll(tasks);

            for (Future<String> future : futures) {
                while (!future.isDone()) {
                    System.out.println("Waiting for a task to finish...");
                    Thread.sleep(300);
                }

                if (future.isDone()) {
                    System.out.println("✅ Result: " + future.get());
                }
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
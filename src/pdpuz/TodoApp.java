package pdpuz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoApp {

    // Task model
    static class Task {
        String description;
        LocalDateTime time;

        public Task(String description, LocalDateTime time) {
            this.description = description;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        System.out.println("=== Simple TODO App ===");
        System.out.println("Tasklarni kiriting (format: task tavsifi va necha daqiqadan so‘ng bajariladi)");
        System.out.println("Masalan: I will practice HTML for 1 hour");
        System.out.println("Yozishni to‘xtatish uchun 'exit' deb yozing.\n");

        while (true) {
            System.out.print("Task description: ");
            String desc = scanner.nextLine();
            if (desc.equalsIgnoreCase("exit")) break;

            System.out.print("Necha daqiqadan so‘ng bajariladi? ");
            int minutes = scanner.nextInt();
            scanner.nextLine(); // nextLine() buffer tozalash uchun

            LocalDateTime taskTime = LocalDateTime.now().plusMinutes(minutes);
            tasks.add(new Task(desc, taskTime));

            // Taskni rejalashtiramiz
            long delay = ChronoUnit.MILLIS.between(LocalDateTime.now(), taskTime);

            scheduler.schedule(() -> {
                System.out.println("\n🔔 Vaqti yetdi! Task: " + desc + " (" + LocalDateTime.now() + ")");
            }, delay, TimeUnit.MILLISECONDS);
        }

        System.out.println("\n✅ Barcha tasklar rejalashtirildi!");
        System.out.println("Dastur tasklarni kuzatishda davom etadi...");

        // Dastur tugamasin
        try {
            scheduler.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }
}
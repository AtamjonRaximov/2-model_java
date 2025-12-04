package pdpuz;

import java.util.Stack;

public class Solution_ {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        int x =1;
        obj.push(x);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(obj.peek());


    }

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();


    public MyQueue() {


    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}

package pdpuz;

import java.util.Stack;

public class Solution_232 {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public Solution_232() {

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

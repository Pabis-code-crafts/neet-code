package org.example.stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }

    private void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }
    private void top(){
        System.out.println(stack.peek());
    }

    private void getMin() {
        System.out.println(minStack.peek());
    }

    private void push(int i) {
        stack.push(i);
        if(minStack.isEmpty()){
            minStack.push(i);
        }
        if(minStack.peek()>=i){
            minStack.push(i);
        }
    }
}

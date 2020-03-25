package com.d9nich.exercise8;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        MyStack myStack2 = (MyStack) myStack.clone();
        myStack.push(10);
        System.out.println(myStack);
        System.out.println(myStack2);
    }
}

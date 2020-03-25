package com.d9nich.exercise8;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    public Object clone() {
        try {
            MyStack resultOfClone = (MyStack) (super.clone());
            resultOfClone.list = new ArrayList<>(list);
            return resultOfClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}

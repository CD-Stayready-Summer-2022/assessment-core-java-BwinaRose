package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T>{
    private List<T> stack = new ArrayList<T>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T i) {
        stack.add(i);
    }

    public T pop() throws EmptyStackException {
        if (stack.isEmpty()) {
            EmptyStackException EmptyStackException = new EmptyStackException();
            throw EmptyStackException;
        }
        T top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }

    public T peek() { if (stack.isEmpty()) {
        return null;
    }
        return stack.get(stack.size() - 1);}

    public Integer size(){
        return stack.size();
    }
}

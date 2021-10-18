package com.bridgelabz;

import org.junit.Test;

public class StackTest {
    @Test
    //for testing push method
    public void push(){
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
    }
    @Test
    public void peek(){
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.peek();
    }
    @Test
    public void pop(){
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.pop();
        stack.display();

    }
    @Test
    public void enqueue(){
        Queue queue=new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
    }
}

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

}

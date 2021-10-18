package com.bridgelabz;
import com.bridgelabz.com.bridgelabz.com.bridgelabz.Node;

import java.util.EmptyStackException;

/**
 * author:- Sunanda Shil
 * @param <t>
 */
public class Stack<t> {
    private Node Top;
    //For adding the element
    public void push(t data) {
        Node tempdata = new Node(data);
        tempdata.next = Top;
        Top = tempdata;

    }
    //For checking the peek element
    public  void peek(){
        if (Top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(Top.data);
        }

    }
    public void pop(){
        while(Top!=null)
        {
            if (Top==null){
                System.out.println("Stack is empty");
            }
            else{
                Top=Top.next;
            }
        }

    }
//for triversing
    public void display() {
        Node current = Top;
        while (current != null) {
            System.out.println(current.data + "");
            current=current.next;
        }
    }
}

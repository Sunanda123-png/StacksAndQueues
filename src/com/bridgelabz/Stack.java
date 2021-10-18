package com.bridgelabz;
import com.bridgelabz.com.bridgelabz.com.bridgelabz.Node;

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
//for triversing
    public void display() {
        Node current = Top;
        while (current != null) {
            System.out.println(current.data + "");
            current=current.next;
        }
    }
}

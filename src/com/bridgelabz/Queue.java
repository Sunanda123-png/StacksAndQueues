package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.com.bridgelabz.Node;

public class Queue<t> {
    private Node<t> front;
    private Node<t> rear;
    public void enqueue(t data){
        if(front==null){
            rear=new Node<t>(data);
        }
        else{
            rear.next=new Node<t>(data);
            rear=rear.next;
        }
    }
    public t dequeue(){
        if(front!=null){
            t result=front.data;
            front=front.next;
            return result;
        }
        return null;
    }
}

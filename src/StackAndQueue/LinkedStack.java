package StackAndQueue;

import Interfaces.IStack;
import LinkedList.GeneralNodes.Node;

public abstract class LinkedStack<T> implements IStack<T> {
    private  Node<T> top;
    private  Node<T> fund;

    public LinkedStack() { this.top = this.fund=  null;    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    public Node<T> getFund() {
        return fund;
    }

    public void setFund(Node<T> fund) {
        this.fund = fund;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);  //create Node
        if(this.top == null){ //check if there is elements
            this.top= newNode;
            this.fund = newNode;
        }else{
            newNode.setNext(this.top);
            this.top = newNode;
        }
    }

    public void pop(){ this.top  = this.top.getNext();  }

    public abstract void printStack();

    public void clearStack(){
        Node<T> aux = this.top;
        while (aux!=null){
           pop();
           aux = aux.getNext();
        }
        this.fund = null;
    }
}

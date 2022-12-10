package StackAndQueue;

import Interfaces.IStack;
import LinkedList.GeneralNodes.Node;

public class LinkedStack<T> implements IStack<T> {
    Node<T> top;
    Node<T> fund;

    public LinkedStack() { this.top = this.fund=  null;    }

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

    public void printStack(){
        Node<T> aux = this.top;
        while (aux!=null){
            System.out.println(aux.getData());
            aux = aux.getNext();
        }
    }

    public void clearStack(){
        Node<T> aux = this.top;
        while (aux!=null){
           pop();
           aux = aux.getNext();
        }
        this.fund = null;
    }
}

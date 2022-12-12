package StackAndQueue;

import Interfaces.IQueue;
import LinkedList.GeneralNodes.Node;
import model.Product;

public abstract class QueueList<T> implements IQueue<T>  {

    private Node<T> front , rear; //
    public QueueList() {
        this.front = this.rear = null;
    }
    public Node<T> getFront() {
        return front;
    }
    public void setFront(Node<T> front) {
        this.front = front;
    }
    public Node<T> getRear() {
        return rear;
    }
    public void setRear(Node<T> rear) {
        this.rear = rear;
    }

    public void  enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (this.getFront() == null){
            this.setFront(newNode);
            this.setRear(newNode);
        }else{
            Node<T> aux = this.front;

            while (aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
            this.rear = newNode;
        }
    } // add


    public  void  dequeue(){
        if (this.front !=null){
            if (this.front == this.rear) this.front = this.rear = null; //one element
            else this.front =this.front.getNext();

        }
    } // deleted


    public void cleanQueue(){
        this.front = this.rear = null;
    }
    public abstract void printQueueorder();



    /*public void printQueue(){
        Node<T> aux = this.front;
        if (this.front!=null)  System.out.println(aux);
        else System.out.println("There aren´t information");
        System.out.println();
    }*/
}

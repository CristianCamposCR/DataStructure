package LinkedList.GeneralList;

import Interfaces.ILinkedList;
import LinkedList.GeneralNodes.DoublyNode;
import model.Employ;

public  abstract  class DoublyList<T> implements ILinkedList<T> {
    DoublyNode<T> head;

    public DoublyList() {this.head = null;}

    public DoublyList(DoublyNode<T> head) {
        this.head = head;
    }

    public DoublyNode<T> getHead() {
        return head;
    }

    public void setHead(DoublyNode<T> head) {
        this.head = head;
    }

    @Override
    public void insert(T data) {
        DoublyNode<T> newNode = new DoublyNode<T>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            DoublyNode<T> aux = this.head;
            while (aux.getNext() != null) {
                aux = (DoublyNode<T>) aux.getNext();
            }
            aux.setNext(newNode);
            newNode.setPrev(aux);
        }

    }

    @Override
    public void remove(T data) {

    }


    public abstract T searchByPosition(int index) ;

    public abstract void  printList();
}

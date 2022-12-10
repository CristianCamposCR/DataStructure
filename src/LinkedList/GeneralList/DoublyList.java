package LinkedList.GeneralList;

import Interfaces.ILinkedList;
import LinkedList.GeneralNodes.DoublyNode;

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

    }

    @Override
    public void remove(T data) {

    }
    public abstract void searchByValue(T data) ;

    public abstract void  printList();
}

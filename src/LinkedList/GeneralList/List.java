package LinkedList.GeneralList;

import Interfaces.ILinkedList;
import LinkedList.GeneralNodes.Node;
import model.Table;

public abstract class List<T>  implements ILinkedList<T> {
    //Linked List Simple and Circular Linked List, They have the same environment
    Node<T> head ;

    public List() {
        this.head = null;
    }

    public List(Node<T> head) {
        this.head = head;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public void insert(T data){
        Node<T> newNodeStack = new Node<>(data);

        if (this.getHead() == null){
            this.setHead(newNodeStack);
        }else{
            Node<T> aux = this.getHead();
            while (aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(newNodeStack);
        }
    }

    @Override
    public void remove(T data) {

    }

    public abstract void searchByValue(T data) ;


    public abstract void  printList();


}

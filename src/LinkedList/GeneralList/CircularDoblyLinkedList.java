package LinkedList.GeneralList;

import Interfaces.ILinkedList;
import LinkedList.GeneralNodes.DoublyNode;
import LinkedList.GeneralNodes.Node;

public abstract class CircularDoblyLinkedList<T> implements ILinkedList<T> {

    DoublyNode<T> head;

    public CircularDoblyLinkedList() {
        this.head = null;
    }

    public CircularDoblyLinkedList(DoublyNode<T> head) {
        this.head = head;
    }

    public DoublyNode<T> getHead(){
        return head;
    }

    public void setHead(DoublyNode<T> head) {
        this.head = head;
    }


    //metodo para insertar en la lista
    @Override
    public void insert(T data) {
        DoublyNode<T> newNodo = new DoublyNode<>(data);

        if (this.head == null){
            this.head = newNodo;
            this.head.setNext(this.head);
            this.head.setPrev(this.head);
        }else{
            DoublyNode<T> aux = this.head;
            while (aux.getNext()!=this.head){
                aux = (DoublyNode<T>) aux.getNext();
            }
            aux.setNext(newNodo);
            newNodo.setPrev(aux);

            this.head.setPrev(newNodo);
            newNodo.setNext(this.head);
        }
    }

    //metodo para quitar el ultimo elemento de la lista
    @Override
    public void remove(T data) {
        DoublyNode<T> aux = this.head;

        while (aux.getNext() != this.head){
            aux = (DoublyNode<T>) aux.getNext();
        }
        this.head = (DoublyNode<T>) this.head.getNext();
        this.head.setPrev(aux);
        aux.setNext(this.head);
    }




    //metodos abstractos a implementar en otras clases
    public abstract T searchByPosition(int index) ;

    public abstract void printList();

}

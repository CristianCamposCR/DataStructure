package LinkedList.GeneralList;

import Interfaces.ILinkedList;
import LinkedList.GeneralNodes.Node;

public abstract class CircularLinkedList<T> implements ILinkedList<T> {

    Node<T> head;

    public CircularLinkedList() {
        this.head = null;
    }

    public CircularLinkedList(Node<T> head) {
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
        Node<T> newNodo = new Node<T>(data);

        if (this.head == null){
            this.head = newNodo;
            this.head.setNext(this.head);
        }else{
            Node<T> aux = this.head;
            while (aux.getNext()!=this.head){
                aux = aux.getNext();
            }
            aux.setNext(newNodo);
            newNodo.setNext(this.head);

        }
    }

    @Override
    public void remove(T data){
        Node<T> aux = this.head;

        while (aux.getNext() != this.head){
            aux = aux.getNext();
        }
        this.head = this.head.getNext();
        aux.setNext(this.head);
    }

    public abstract void searchByValue(T data) ;


    public abstract void  printList();




/*    public void printName(){
        Node<T>  aux = this.head;
        while (aux.getNext() !=this.head){
            System.out.println(aux + " Next " + aux.getNext());
            aux = aux.getNext();
        }
        System.out.println(aux + " Next " + aux.getNext());
    }


    public void printNameLimit(int limit){
        Node<T>  aux = this.head;
        while (aux.getNext() !=this.head && limit!=1){
            System.out.println(aux + " Next " + aux.getNext());
            aux = aux.getNext();
            limit--;
        }
        System.out.println(aux + " Next " + aux.getNext());


    }

    public String searchByIndex(int index){
        Node<T>  aux = this.head;
        if (aux==null) return "/";

        while (aux.getNext() !=this.head && index!=1){
            aux = aux.getNext();
            index--;
        }

        if (index>1) return "/";
        return null;

    }

    public boolean editName(int index, String name){
        Node<T>  aux = this.head;
        if (aux==null) return false;

        while (aux.getNext() !=this.head && index!=1){
            aux = aux.getNext();
            index--;
        }

        if (index>1){return false;}
        else{
//            aux.(name);
            return true;
        }

    }*/

}

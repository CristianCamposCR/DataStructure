package ProyectLeFesitin.Lists;

import LinkedList.GeneralNodes.Node;
import StackAndQueue.QueueList;
import model.Product;

public class OrderQueue extends QueueList<Product> {
    public OrderQueue() {

    }

    @Override
    public void printQueueorder() {
        Node<Product> aux = this.getFront();
        while (aux!=null) {
            System.out.println(aux.getData());
            aux = aux.getNext();
        }
    }

    public float clean() {
        Node<Product> aux = this.getFront();
        float subtotal=0;
        while (aux!=null) {
            subtotal += aux.getData().getPrice();
            System.out.println(aux.getData());
            dequeue();
            aux = aux.getNext();
        }
        return subtotal;
    }
}

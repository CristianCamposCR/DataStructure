package ProyectLeFesitin.Lists;

import LinkedList.GeneralNodes.Node;
import StackAndQueue.QueueList;
import model.Drinks;
import model.Meal;
import model.Product;

public class ProductQueue extends QueueList<Product> {


    public ProductQueue() {

    }

    @Override
    public void printQueueorder() {
        Node<Product> aux = this.getFront();
        while (aux!=null) {
            System.out.println(aux.getData());
            aux = aux.getNext();
        }
    }

}

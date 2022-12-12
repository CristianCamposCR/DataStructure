package ProyectLeFesitin.Lists;

import LinkedList.GeneralList.CircularLinkedList;
import LinkedList.GeneralNodes.DoublyNode;
import LinkedList.GeneralNodes.Node;
import model.Drinks;
import model.Employ;

public class DrinksCircularLinkedList extends CircularLinkedList<Drinks> {

    public DrinksCircularLinkedList() {
        this.insert(new Drinks("Jute", 100f,  "Refrescante", 415, "Coca cola", false ));
        this.insert(new Drinks("Jumpa", 100f,  "Buena", 600, "Pepsi", false ));
        this.insert(new Drinks("Belakatornic", 100f,  "Rica", 1000, "Joly", false ));
        this.insert(new Drinks("Geeks", 100f,  "Sabrosa", 250, "Corona", true ));
        this.insert(new Drinks("Chavito", 100f,  "Fria", 250, "victoria", true ));
    }

    @Override
    public Drinks searchByPosition(int index) {
        Node<Drinks> aux = this.getHead();

        if (aux.getData() != null) {
            while (aux != null && index != 1) {
                aux = aux.getNext();
                index--;
            }
            return aux.getData();
        }

        return null;
    }

    @Override
    public void printList() {
        Node<Drinks>  aux = this.getHead();
        int count = 1;
        while (aux.getNext() != this.getHead()){
            System.out.println("["+count+"] "+aux.getData().toString() );
            aux = aux.getNext();
            count++;
        }
        System.out.println("["+count+"] "+ aux.getData().toString() );



    }
}


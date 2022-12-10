package ProyectLeFesitin.Lists;

import LinkedList.GeneralList.CircularLinkedList;
import LinkedList.GeneralNodes.Node;
import model.Drinks;

public class DrinksCircularLinkedList extends CircularLinkedList<Drinks> {

    public DrinksCircularLinkedList() {
        this.insert(new Drinks("Jute", 100f,  "Refrescante", 415, "Coca cola", false ));
        this.insert(new Drinks("Jumpa", 100f,  "Buena", 600, "Pepsi", false ));
        this.insert(new Drinks("Belakatornic", 100f,  "Rica", 1000, "Joly", false ));
        this.insert(new Drinks("Geeks", 100f,  "Sabrosa", 250, "Corona", true ));
        this.insert(new Drinks("Chavito", 100f,  "Fria", 250, "victoria", true ));
    }

    @Override
    public void searchByValue(Drinks data) {

    }

    @Override
    public void printList() {

        Node<Drinks>  aux = this.getHead();
        while (aux.getNext() != this.getHead()){
            System.out.println(aux.getData().toString() );
            aux = aux.getNext();
        }
        System.out.println(aux.getData().toString() );



    }
}


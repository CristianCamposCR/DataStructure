package ProyectLeFesitin.Lists;

import LinkedList.GeneralList.CircularDoblyLinkedList;
import LinkedList.GeneralNodes.Node;
import model.Meal;

public class MealDoblyCricularLinkedList extends CircularDoblyLinkedList<Meal> {

    public MealDoblyCricularLinkedList() {
        this.insert(new Meal("Milanesa", 85f, "Milanesa acompañada con frijoles", "N/A"));
        this.insert(new Meal("Hamburguesa sencilla", 105f, "Hamburgesa con una carne, vegetales y queso", "N/A"));
        this.insert(new Meal("Chilaquiles", 90f, "Chilaquiles con pollo, crema queso, frijoles y pan", "N/A"));
        this.insert(new Meal("Crema de champiñon", 70f, "Crema de champiñon 200 gr", "N/A"));
        this.insert(new Meal("Ensalada", 55f, "Lechuga, jitomate, pollo y zanahoria", "N/A"));
        this.insert(new Meal("Enchiladas", 67f, "Enchiladas verdes con queso crema y pollo", "N/A"));
    }

    //Metodos abstractos que vienen de la clase circulardoblylinkedlist
    @Override
    public void searchByValue(Meal data) {

    }

    @Override
    public void printList() {
        Node<Meal> aux = this.getHead();
        while (aux.getNext() != this.getHead()){
            System.out.println(aux.getData().toString());
            aux = aux.getNext();
        }
        System.out.println(aux.getData().toString());
    }
}

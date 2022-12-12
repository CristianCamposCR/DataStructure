package ProyectLeFesitin.Lists;

import LinkedList.GeneralList.CircularDoblyLinkedList;
import LinkedList.GeneralNodes.DoublyNode;
import LinkedList.GeneralNodes.Node;
import model.Drinks;
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

    @Override
    public Meal searchByPosition(int index) {
        DoublyNode<Meal> aux = this.getHead();

        if (aux.getData() != null) {
            while (aux != null && index != 1) {
                aux = (DoublyNode<Meal>) aux.getNext();
                index--;
            }
            return aux.getData();
        }

        return null;
    }

    //Metodos abstractos que vienen de la clase circulardoblylinkedlist



    @Override
    public void printList() {
        Node<Meal> aux = this.getHead();
        int count = 1;
        while (aux.getNext() != this.getHead()){
            System.out.println("["+count+"] "+aux.getData().toString());
            aux = aux.getNext();
            count++;
        }
        System.out.println("["+count+"] "+ aux.getData().toString());
    }
}

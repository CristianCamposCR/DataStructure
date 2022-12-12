package ProyectLeFesitin.Lists;

import LinkedList.GeneralList.CircularDoblyLinkedList;
import LinkedList.GeneralNodes.DoublyNode;
import LinkedList.GeneralNodes.Node;
import model.Drinks;
import model.Meal;

public class MealDoblyCricularLinkedList extends CircularDoblyLinkedList<Meal> {

    public MealDoblyCricularLinkedList() {
        this.insert(new Meal("Milanesa", 85f, "Milanese accompanied with beans", "N/A"));
        this.insert(new Meal("Hamburguesa sencilla", 105f, "Burger with meat, vegetables and cheese", "N/A"));
        this.insert(new Meal("Chilaquiles", 90f, "Chilaquiles with chicken, cream cheese, beans and bread", "N/A"));
        this.insert(new Meal("Crema de champiñon", 70f, "Mushroom cream 200 gr", "N/A"));
        this.insert(new Meal("Ensalada", 55f, "Lettuce, tomato, chicken and carrot", "N/A"));
        this.insert(new Meal("Enchiladas", 67f, "Green enchiladas with cream cheese and chicken", "N/A"));
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
        System.out.println("------------------------------------------");
        Node<Meal> aux = this.getHead();
        int count = 1;
        while (aux.getNext() != this.getHead()){
            System.out.println("["+count+"] "+aux.getData().toString());
            aux = aux.getNext();
            count++;
        }
        System.out.println("["+count+"] "+ aux.getData().toString());
        System.out.println("------------------------------------------");

    }
}

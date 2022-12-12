package ProyectLeFesitin.Lists;


import LinkedList.GeneralList.DoublyList;
import LinkedList.GeneralNodes.DoublyNode;
import model.Employ;

public class EmployDoublyLinkedList extends DoublyList<Employ> {

    public EmployDoublyLinkedList() {
        this.insert(new Employ("Joel", "JH4", 1000, "Worker"));
        this.insert(new Employ("Yisman", "YD7", 1000, "Scrum Master"));
        this.insert(new Employ("Cristian", "CR7", 1000, "Product owner"));
        this.insert(new Employ("Maycon", "MC9", 1000, "Worker"));
        this.insert(new Employ("Eduardo", "EP6", 1000, "Worker"));
    }

    @Override
    public Employ searchByPosition(int index) {
        DoublyNode<Employ> aux = this.getHead();

        if (aux.getData() != null) {
            while (aux != null && index != 1) {
                aux = (DoublyNode<Employ>) aux.getNext();
                index--;
            }
            return aux.getData();
        }

        return null;
    }


    @Override
    public void printList() {
        System.out.println("------------------------------------------");
        DoublyNode<Employ> aux = this.getHead();
        int count =1;
        while (aux != null) {
            System.out.println("Waiter ["+count+"]: " + aux.getData().getName() + " Position: " + aux.getData().getPosition());
            aux = (DoublyNode<Employ>) aux.getNext();
            count++;
        }
        System.out.println("------------------------------------------");

    }
}

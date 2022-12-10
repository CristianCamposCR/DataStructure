package ProyectLeFesitin.Lists;

import LinkedList.GeneralList.List;
import LinkedList.GeneralNodes.Node;
import model.Table;

public class TableLinkedListSimple extends List<Table> {

    public TableLinkedListSimple() {
        this.insert(new Table(1,true));
        this.insert(new Table(2,true));
        this.insert(new Table(3,false));
        this.insert(new Table(4,false));
        this.insert(new Table(5,false));
    }

    @Override
    public void searchByValue(Table data) {

    }


    @Override
    public void printList() {
        Node<Table> current = this.getHead();
        while (current!=null){
            String available = current.getData().isAvailable()?"is":"isn't";
            System.out.println("The table \""+current.getData().getId()+"\" " +available + " available"  );
            current = current.getNext();
        }

    }
}

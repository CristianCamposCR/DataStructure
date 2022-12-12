package ProyectLeFesitin.Lists;


import LinkedList.GeneralNodes.Node;
import StackAndQueue.LinkedStack;
import model.MailBox;

public class MailboxStack extends LinkedStack<MailBox> {

   private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public MailboxStack() {
        this.push(new MailBox(count,"Alejandro", "Suggest", "The program is the best"));
        count++;
        this.push(new MailBox(count,"Jatziry", "Suggest", "Very slow"));
        count++;
        this.push(new MailBox(count,"Daniela", "Suggest", "You should implement an interface for the user"));
    }

    @Override
    public void printStack() {
        Node<MailBox> aux = this.getTop();
        while (aux!=null){
            System.out.println(aux.getData());
            aux = aux.getNext();
        }
    }
}

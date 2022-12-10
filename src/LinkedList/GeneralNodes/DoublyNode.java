package LinkedList.GeneralNodes;

public class DoublyNode<T> extends Node<T> {

    private Node<T> prev;


    public DoublyNode(T data) {
        super(data);
        this.prev = null;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "DoublyNode{" +
                "prev=" + prev +
                '}';
    }
}


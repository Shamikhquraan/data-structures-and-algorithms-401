package linked.list;

public class Node<T> {
    public  T value;
    public int data;
    public Node next;

    public Node (T value){
        this.value=value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
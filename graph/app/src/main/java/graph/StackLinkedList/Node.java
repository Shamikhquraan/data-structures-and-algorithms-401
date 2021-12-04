package graph.StackLinkedList;

public class Node<T> {
    public Object neighbor;
    private Node<T> next;
    private final T data;
    public Node(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
}

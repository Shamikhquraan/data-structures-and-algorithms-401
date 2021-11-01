package trees;

public class Node<T> {
    public int value;
    public Node left;
    public Node right;
    Node(T value) {
        this.value = (int) value;
        right = null;
        left = null;
    }
}
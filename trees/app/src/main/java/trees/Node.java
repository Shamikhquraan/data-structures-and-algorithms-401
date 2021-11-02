package trees;

public class Node<T> {
    T value;
    public Node left;
    public Node right;
    Node(T value) {
        this.value =value;
        right = null;
        left = null;
    }
}
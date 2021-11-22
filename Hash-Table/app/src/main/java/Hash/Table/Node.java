package Hash.Table;
public class Node <T> {

    T value;
    Node left;
    Node right;

    Node(T value) {
        this.value = value;
        right = null;
        left = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    public String toStringLeft() {
        return "Node{" +
                "left=" + left +
                '}';
    }


    public String toStringRight() {
        return "Node{" +
                "right=" + right +
                '}';
    }
}
package trees;

public class BinarySearchTree extends  BinaryTree {


    private Node addToTree(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addToTree(current.left, value);
        } else if (value > current.value) {
            current.right = addToTree(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void insert(int value) {
        root = addToTree(root, value);
    }
    private boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNode(current.left, value)
                : containsNode(current.right, value);
    }

    public boolean contain(int value) {
        return containsNode(root, value);
    }


}
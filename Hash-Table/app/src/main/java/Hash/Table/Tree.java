package Hash.Table;
import java.util.ArrayList;
import java.util.List;


public class Tree <T> {
    Node root;
    Tree() {
        root = null;
    }

    public boolean isEmpty() {
        if (root != null) {
            return false;
        } else {
            System.out.println("Tree is empty!");
            return true;
        }
    }

    public void getRoot() {
        if (root != null) {
            System.out.println(root.value);
        } else {
            System.out.println("Tree is empty!");
        }
    }

    public List<T> preOrder(Node node) {
        List<T> list = new ArrayList<>();
        if (node != null) {
            list.add((T) node.value);
            if (node.left != null)
                list.addAll(preOrder(node.left));
            if (node.right != null)
                list.addAll(preOrder(node.right));
        }
        return list;
    }


    public List<T> inOrder(Node node) {
        List<T> list = new ArrayList<>();
        if (node != null) {
            if (node.left != null)
                list.addAll(preOrder(node.left));
            list.add((T) node.value);
            if (node.right != null)
                list.addAll(preOrder(node.right));
        }
        return list;
    }


    public List<T> postOrder(Node node) {
        List<T> list = new ArrayList<>();
        if (node != null) {
            if (node.left != null)
                list.addAll(preOrder(node.left));
            if (node.right != null)
                list.addAll(preOrder(node.right));
            list.add((T) node.value);
        }
        return list;
    }



    private Node addToTree(Node<Integer> current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if ( value <  current.value) {
            current.left = addToTree(current.left, value);
        } else if (value > current.value) {
            current.right = addToTree(current.right, value);
        } else {

            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addToTree(root, value);
    }
}


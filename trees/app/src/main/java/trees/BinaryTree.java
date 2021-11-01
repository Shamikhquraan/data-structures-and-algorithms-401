package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree <T> {
    Node root;
    BinaryTree()
    {
        root = null;
    }
    public List<Integer> preOrder(Node node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            list.add(node.value);
            if (node.left != null)
                list.addAll(preOrder(node.left));
            if (node.right != null)
                list.addAll(preOrder(node.right));
        }
        return list;
    }


    public List<Integer> inOrder(Node node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            if (node.left != null)
                list.addAll(preOrder(node.left));
            list.add(node.value);
            if (node.right != null)
                list.addAll(preOrder(node.right));
        }
        return list;
    }


    public List<Integer> postOrder(Node node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            if (node.left != null)
                list.addAll(preOrder(node.left));
            if (node.right != null)
                list.addAll(preOrder(node.right));
            list.add(node.value);
        }
        return list;
    }

    private int findMax(Node node)
    {
        if (node == null) {
            return 0;
        }
        int res = node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    public int getMax(){
        return   findMax(root);
    }

}
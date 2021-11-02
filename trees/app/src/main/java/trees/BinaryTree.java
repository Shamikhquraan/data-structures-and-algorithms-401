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
            list.add((Integer) node.value);
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
            list.add((Integer) node.value);
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
            list.add((Integer) node.value);
        }
        return list;
    }

    private int findMax(Node node)
    {
        if (node == null) {
            return 0;
        }
        int res = (int) node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }



    public static  Queue<Integer> breadthFirst(BinaryTree tree) {
        Queue<Node> queue = new LinkedList<>() ;
        Queue<Integer> list = new LinkedList<>() ;
        if (tree.root == null)
            return null;
        queue.clear();
        queue.add(tree.root);
        list.add((Integer) tree.root.value);
        while(!queue.isEmpty()){
            Node node = queue.remove();

            if(node.left != null){
                queue.add(node.left);
                list.add((Integer) node.left.value);
            }
            if(node.right != null) {
                queue.add(node.right);
                list.add((Integer) node.right.value);
            }
        }
        return list;
    }
    public boolean isEmpty() {
        if (root != null){
            return  false;
        } else {
            System.out.println("Tree is empty!");
            return true;
        }
    }
    public void getRoot() {
        if (root != null){
            System.out.println(root.value);
        } else {
            System.out.println("Tree is empty!");
        }

    }
    public int getMax(){
        return   findMax(root);
    }

}
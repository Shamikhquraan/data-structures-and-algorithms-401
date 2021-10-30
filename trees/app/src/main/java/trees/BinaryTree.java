package trees;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node root;
    ArrayList<T> arrayList =new ArrayList();
    public ArrayList<T> preOrder( Node root){
        if (root!=null) {
            arrayList.add((T) root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
        return arrayList;
    }
    public ArrayList<T> inOrder( Node root){
        if (root!=null) {
            inOrder(root.left);
            arrayList.add((T) root.value);
            inOrder(root.right);
        }
        return arrayList;
    }
    public ArrayList<T> postOrder( Node root){
        if (root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            arrayList.add((T) root.value);
        }
        return arrayList;
    }
}
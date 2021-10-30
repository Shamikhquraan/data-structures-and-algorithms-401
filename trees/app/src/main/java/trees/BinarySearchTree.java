package trees;

import java.util.ArrayList;

public class BinarySearchTree <T> extends BinaryTree{

    public void insert(Integer key) {
        Node node = new Node(key);
        Node temp = root;
        if (root == null) {
            root = node;
            return;
        }
        while (temp != null) {
            if(key> (Integer) temp.value){
                if(temp.right ==null){
                    temp.right =node;
                    return;
                }else {
                    temp =temp.right;
                }
            }
            else if(key< (Integer) temp.value){
                if(temp.left ==null){
                    temp.left =node;
                    return;
                }else {
                    temp =temp.left;
                }
            }
        }
    }

    public boolean contains(Integer key) {
        Node temp = root;

        while(temp!=null){
            if (temp.value == key) {
                return true;
            }
            if(key>(Integer) temp.value){
                if(temp.right!=null){
                    temp=temp.right;
                }else {
                    return false;
                }
            }
            else if(key<(Integer) temp.value){
                if(temp.left!=null){
                    temp=temp.left;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
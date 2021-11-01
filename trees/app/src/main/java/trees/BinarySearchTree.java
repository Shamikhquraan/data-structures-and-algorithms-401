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
    public T getMax(){
        return findMax(root ,0);
    }
    public T findMax(Node root , int n){
        Node sim =root;
        while (sim!=null){
            if (sim.right!=null){
                sim=sim.right;
            }else {
                return (T) sim.value;
            }
        }
        String str="EMPTY TREE";
        return (T) str;
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
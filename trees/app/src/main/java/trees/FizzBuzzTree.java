package trees;

import java.util.ArrayList;

public class FizzBuzzTree  {


    private static void recursion(Node current) {
        if (current != null) {
            recursion(current.left);
            changer(current);
            recursion(current.right);
        }
    }

    private static void changer(Node current) {
        if ((Integer)current.value % 15 == 0) {
            current.value="FizzBuzz";
        } else if ((Integer)current.value % 5 == 0) {
            current.value="Buzz";
        } else if ((Integer)current.value % 3 == 0) {
            current.value="Fizz";
        }
        System.out.println(current.value);
    }

    public static BinaryTree fizzBuzzTree(BinaryTree tree) {
        recursion(tree.root);
        return tree;
    }
}
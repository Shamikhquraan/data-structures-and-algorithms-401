/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
    public static void main(String[] args) {
        //output inorder post contain
        BinarySearchTree treeForT=new BinarySearchTree();
        treeForT.insert(20);
        System.out.println(treeForT.postOrder(treeForT.root)+" postOrder");
        System.out.println(treeForT.contains(20));
        treeForT.insert(60);
        System.out.println(treeForT.inOrder(treeForT.root)+" inOrder");
        System.out.println(treeForT.contains(20));
        treeForT.insert(80);
        System.out.println(treeForT.inOrder(treeForT.root)+" inOrder");
    }
}
package Hash.Table;
import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {
    public static List treeIntersection(Tree tree1, Tree tree2) {
        List treeOne = tree1.inOrder(tree1.root);
        List treeTwo = tree1.inOrder(tree2.root);
        List results = new ArrayList<>();
        HashTable hashtable = new HashTable();
        for (int i = 0; i < treeOne.size(); i++) {
            hashtable.add(treeOne.get(i),i);
            if (hashtable.contain(treeTwo.get(i))){
                results.add(treeTwo.get(i));
            }
        }
        return  results;
    }
}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Hash.Table;

import static Hash.Table.RepeatedWord.repeatedWord;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        HashTable<String,Integer> hashTable= new HashTable<>();
        hashTable.add("Shamikh" , 811);
        Integer key = hashTable.get("Shamikh");
        System.out.println(key);
        hashTable.add("10", 36);
        System.out.println( hashTable.contain("10"));
        String string = "far strawberry am far  is am  strawberry";
        System.out.println(repeatedWord(string));

        Tree tree = new Tree();
        tree.add(23);
        tree.add(13);
        tree.add(20);
        tree.add(8);
        tree.add(65);
        Tree tree2 = new Tree();
        tree2.add(65);
        tree2.add(20);
        tree2.add(13);
        tree2.add(3);
        tree2.add(8);
        System.out.println(TreeIntersection.treeIntersection(tree, tree2));

//------------------------------------------------
        HashTable table = new HashTable();
        table.add("shamikh", "25");
        table.add("Rammah", "20");
        table.add("Salma", "16");
        HashTable table2 = new HashTable();
        table2.add("shamikh", "22");
        table2.add("Rammah", "45");
        table2.add("Salma", "66");

        System.out.println( table.get("shamikh"));
        System.out.println( table.get("Rammah"));

    }

}

package linked.list;

public class Library {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList();

        newList.insert(5);
        newList.insert(4);
        newList.insert(3);
        newList.insert(2);
        newList.insert(1);
        newList.insert(0);
        newList.insert("Shamikh");
        newList.insert("Hi");
        newList.append(11);
        newList.append(12);
    newList.insertBefore(5,"value befor 5");
        newList.insertAfter(2," value after 2");
        System.out.println(newList.toString());
        System.out.println(newList.includes(9));
        System.out.println(newList.includes(3));
        System.out.println(newList.includes("Hello"));
        System.out.println(newList.includes("im the value after 0"));
        System.out.println(newList.kth(2));
        System.out.println(newList.kth(5));
        System.out.println(newList.kth(20));


    }
}

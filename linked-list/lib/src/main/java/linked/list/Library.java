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
      //  System.out.println(newList.kth(3));

        LinkedList newList2 = new LinkedList();



        LinkedList newList3= new LinkedList();

        newList3.insert(5);
        newList3.insert(6);
        newList3.insert(9);
        newList3.insert(2);
        newList3.insert(2);
        System.out.println("first Linked List:");
        System.out.println(newList3.toString());
        newList2.insert(4);
        newList2.insert(3);
        newList2.insert(2);
        newList2.insert(1);
        newList2.insert(0);

        newList2.push(8);
        newList2.push(7);
        newList2.push(6);
        newList2.push(5);
        newList2.push(4);
        System.out.println("second Linked List:");
        System.out.println(newList2.toString());

        System.out.println("merge Linked List:");
        newList2.merge(newList3);
        System.out.println(newList2.toString());

    }

}

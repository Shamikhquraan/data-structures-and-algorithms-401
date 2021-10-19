package linked.list;

public class LinkedList<T> {
    Node<T> head = null;

    public void  insert (T value){ // add at the first of the linkedList
        Node<T> newNode = new Node<T> (value);
        newNode.next =head ;
        head=newNode;
    }

    public boolean includes(T value) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }


    @Override public String toString() {
        String output = "";
        Node<T> currentNode = head;
        while (currentNode != null) {

            output +=" { "+currentNode.value+" } --> ";

            currentNode = currentNode.next;
        }
        output += "NULL";
        return output;
    }
    public void append(T value) {
        Node<T> currentNode = head;
        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
        }else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
        }
        currentNode.next = newNode;
    }


    public void insertBefore(T value, T newVal) {
        if (head == null) {
            System.out.println("The value " + value + " is not exist!");

        } else if (head.value == value) {
            this.insert(newVal);

        }else  {

            Node<T> currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.value == value) {
                    Node<T> newNode = new Node<T>(newVal);
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }
                currentNode = currentNode.next;
            }
            System.out.println("The value " + value + " is not exist!");
        }
    }

    public void insertAfter(T value, T newVal) {
        if (head == null) {
            System.out.println("The value " + value + " is not exist!");
        }else {
            Node<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode.value == value) {
                    Node<T> newNode = new Node<T>(newVal);
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }
                currentNode = currentNode.next;
            }

            System.out.println("The value " + value + " is not exist!");
        }
    }
}
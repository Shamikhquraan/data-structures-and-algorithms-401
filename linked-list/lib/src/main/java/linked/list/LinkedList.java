package linked.list;

public class LinkedList<T> {
    Node head = null;

    public void  insert (T value){ // add at the first of the linkedList
        Node<T> newNode = new Node<T> (value);
        newNode.setNext(head);
        head=newNode;
    }

    public boolean includes(T value) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }


    @Override public String toString() {
        String output = "";
        Node<T> currentNode = head;
        while (currentNode != null) {

            output +=" { "+currentNode.value+" } --> ";

            currentNode = currentNode.getNext();
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
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
        }
        currentNode.setNext(newNode);
    }


    public void insertBefore(T value, T newVal) {
        if (head == null) {
            System.out.println("The value " + value + " is not exist!");

        } else if (head.value == value) {
            this.insert(newVal);

        }else  {

            Node<T> currentNode = head;

            while (currentNode.getNext() != null) {
                if (currentNode.getNext().value == value) {
                    Node<T> newNode = new Node<T>(newVal);
                    newNode.setNext(currentNode.getNext());
                    currentNode.setNext(newNode);
                    return;
                }
                currentNode = currentNode.getNext();
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
                    newNode.setNext(currentNode.getNext());
                    currentNode.setNext(newNode);
                    return;
                }
                currentNode = currentNode.getNext();
            }

            System.out.println("The value " + value + " is not exist!");
        }

    }


    public String kthFromEnd(int k){
        if (k == -1){
            return "number can't be higher than the length of the list";
        }else
        if (k == 0){
            return "K is negative number";
        }else{
            return " the elemnt is "+ k+ ".";
        }
    }
    public String kth(int k){
        int len = 0;
Node temp =head ;
while (temp!=null){
    temp= temp.getNext();
    len++;
}
if(len<k) return kthFromEnd(-1);
if (k<0)return kthFromEnd(0);
temp=head;
for (int i=1+1 ; i<len-k+1;i++){temp= temp.getNext();}
return kthFromEnd((Integer) temp.value);
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void merge(LinkedList q)
    {
        Node p_curr = head, q_curr = q.head;
        Node p_next, q_next;

        // While there are available positions in p;
        while (p_curr != null && q_curr != null) {

            // Save next pointers
            p_next = p_curr.next;
            q_next = q_curr.next;

            // make q_curr as next of p_curr
            q_curr.next = p_next; // change next pointer of q_curr
            p_curr.next = q_curr; // change next pointer of p_curr

            // update current pointers for next iteration
            p_curr = p_next;
            q_curr = q_next;
        }
        q.head = q_curr;
    }


}

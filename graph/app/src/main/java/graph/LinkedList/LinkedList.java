package graph.LinkedList;
public class LinkedList<T> {
    private Node head ;
    private int length ;

    public LinkedList(){
        this.head = null ;
        this.length = 0 ;
    }

    public void append(T data){
        Node<T> node = new Node<T>(data);
        if(head == null){
            head = node ;
            length = 1 ;
            return;
        }
        else {
            Node<T> currentHead = head ;
            while (currentHead.getNext() != null) {
                currentHead = currentHead.getNext();
            }
            currentHead.setNext(node);
            length++;
        }
    }

    public void insert(T data){
        Node<T> node = new Node<T>(data);
        if(head == null){
            head = node ;
            length = 1 ;
            return;
        }
        else {
            Node previousHead = this.head ;
            node.setNext(previousHead);
            this.head = node ;
            length++;
        }
    }

    public boolean includes(T data){
        if (this.head == null) return false ;
        Node node= new Node(data);
        Node currentHead = head;
        if(node.getData() == currentHead.getData()) {
            return true ;
        }
        while(currentHead.getNext() != null){
            currentHead = currentHead.getNext();
            if(node.getData() == currentHead.getData()) {
                return true ;
            }
        }
        return false ;
    }

    public String toString(){
        Node currentNode = head ;
        if(currentNode == null)
            return "empty";
        String output = "{ " + currentNode.getData().toString() + " } -> ";
        while (currentNode.getNext()!=null){
            currentNode = currentNode.getNext() ;
            output += "{ " + currentNode.getData().toString() + " } -> " ;
        }
        return output+"NULL";
    }

    public int getLength(){
        return length ;
    }
    public void insertBefore(T data , T newData){
        Node<T> node = new Node<T>(newData);
        if(head.getData() == data)
        {
            Node<T> node2 = new Node<T>(data);
            node2.setNext(head.getNext());
            head = node ;
            head.setNext(node2);
            length++;
            return;
        }
        else {
            Node<T> currentHead = head ;
            int loopSize = length-1 ;
            while (currentHead.getNext().getData() != data) {
                loopSize -- ;
                currentHead = currentHead.getNext();
                if (loopSize==0)
                    return;
            }
            Node node2 = currentHead.getNext() ;
            node.setNext(node2);
            currentHead.setNext(node);
            length++;
        }

    }

    public void insertAfter(T data , T newData) {
        Node<T> node = new Node<T>(newData);
        Node<T> currentHead = head ;
        while (currentHead.getData() != data) {
            currentHead = currentHead.getNext();
        }
        node.setNext(currentHead.getNext());
        currentHead.setNext(node);
        length++;
    }

    public T kthFromEnd(int data){
        Node<T> currentHead = this.head ;
        for(int i = 1 ; i < (this.length - data) && data > 0; i++ ){
            currentHead = currentHead.getNext();
        }
        return (this.length - data) < 1 || data < 0 ? (T)"Exception":currentHead.getData() ;
    }
}



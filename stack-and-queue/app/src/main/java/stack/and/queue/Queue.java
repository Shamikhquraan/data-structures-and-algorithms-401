package stack.and.queue;

public class Queue <T> {
    Node front;
    Node rear;
    int size=0;

    public void enqueue(T value){
    Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            size++;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;

    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node temp = front;
            front = front.next;
            temp.next = null;
            size--;
            return (T) temp.value;
        }
        return null;
    }

    public T peek(){
        if(!this.isEmpty()){
            return (T) front.value;
        }
        return null;
    }

    public boolean isEmpty(){
        boolean test =(size == 0);
        return test;
    }

    @Override
    public String toString() {
        StringBuilder queueString = new StringBuilder();
        Node currentNode = front;
        while(currentNode != null){
            queueString.append(currentNode.value);
            queueString.append(" -- ");
            currentNode = currentNode.next;
        }
        queueString.append("null");
        return queueString.toString();
    }
}
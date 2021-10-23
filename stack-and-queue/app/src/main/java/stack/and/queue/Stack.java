package stack.and.queue;

public class Stack <T> {
    Node top = null;
    int size =0;

    public void push(T value){
      Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop(){
       Node temp = top;
        if(!this.isEmpty()){
            top = top.next;
            temp.next = null;
            size--;
            return (T) temp.value;
        }
        return null;
    }

    public T peek(){
        if(!this.isEmpty()) {
            return (T) top.value;
        }else {
            return null;
        }
    }


    public boolean isEmpty(){
        boolean test =(size == 0);
        return test;
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();
        Node current = top;

        while(current != null){
            stackString.append(current.value);
            stackString.append("\n");
            current = current.next;
        }
        stackString.append("null");
        return stackString.toString();
    }
}
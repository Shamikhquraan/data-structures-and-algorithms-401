package graph.StackLinkedList;

public class StackLinkedList<T> {
    private Node<T> top ;
    public StackLinkedList(){
        this.top = null ;
    }
    public void push(T data){
        Node<T> newNode = new Node(data);
        if(this.top == null){
            this.top =newNode ;
            return;
        } else{
            Node previousTop = this.top ;
            newNode.setNext(previousTop);
            this.top = newNode ;
            return;
        }
    }

    public T pop(){
        if(this.top == null)
            return (T)"Exception";
        Node previousTop = this.top ;
        this.top = this.top.getNext() ;
        previousTop.setNext(null);
        return (T)previousTop.getData() ;
    }

    public T peek(){
        return this.top==null ? (T)"Exception":this.top.getData() ;
    }
    public Boolean isEmpty(){
        return this.top == null;
    }
    public String toString(){
        if (this.top == null)
            return "The stack is empty";
        Node<T> currentTop = this.top ;
        String output = "{"+currentTop.getData()+"} -> " ;
        while (currentTop.getNext()!=null){
            currentTop = currentTop.getNext() ;
            output+="{"+currentTop.getData()+"} -> " ;
        }
        return output+"NULL" ;
    }
}

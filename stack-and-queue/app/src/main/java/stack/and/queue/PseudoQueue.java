package stack.and.queue;

public class PseudoQueue<T> {
    private int size = 0;
    private Stack<T> firstStack;
    private Stack<T> secondStack;


    public PseudoQueue() {
        this.firstStack = new Stack<>();
        this.secondStack = new Stack<>();
    }

    public void enQueue(T value) {
        this.firstStack.push((Integer) value);
    }

    public T deQueue() {
        moveTheStackContentToAnotherOne(firstStack, secondStack);
        T returnedValue = secondStack.pop();
        moveTheStackContentToAnotherOne(secondStack, firstStack);
        return returnedValue;
    }

    public T peek() {
        moveTheStackContentToAnotherOne(firstStack, secondStack);
        T returnedValue = secondStack.peek();
        moveTheStackContentToAnotherOne(secondStack, firstStack);
        return returnedValue;
    }

    public int getSize() {
        return firstStack.size;
    }

    public void moveTheStackContentToAnotherOne(Stack giveStack, Stack takeStack) {

        while (giveStack.top != null)
            takeStack.push((Integer) giveStack.pop());
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();
        Node current = firstStack.top;
        if(current == null)
            stackString.append("null");

        while (current != null) {
            stackString.append(current.value);

            if(current.next != null)
                stackString.append(" --> ");
            current = current.next;
        }

        return stackString.toString();
    }
}
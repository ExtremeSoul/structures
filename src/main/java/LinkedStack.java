import java.util.EmptyStackException;

public class LinkedStack implements Stack<Double> {
    private Node top;

    @Override
    public void push(Double a) {
        Node newNode = new Node(a);

        newNode.under = top;
        top = newNode;
    }

    @Override
    public Double pop() {
        if(top == null) {
            throw new EmptyStackException();
        }

        double value = top.value;

        top = top.under;

        return value;
    }

    private static class Node {
        private double value;
        private Node under;

        private Node(double value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        if(top == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        Node current = top;
        do {
            result.append(current.value + "\n");
        /*    current = current.under;
        } while(current != null);*/
        } while((current = current.under) != null);

        return result.toString();
    }



}














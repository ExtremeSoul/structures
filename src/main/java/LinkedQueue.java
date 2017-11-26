public class LinkedQueue implements Queue<Double> {
    private LinkedList list = new LinkedList();

    @Override
    public void add(Double a) {
        list.add(a);
    }

    @Override
    public Double poll() {
        Double temp = list.get(0);
        list.remove(0);
        return temp;
    }

    @Override
    public boolean isEmpty() {
       \
    }
}

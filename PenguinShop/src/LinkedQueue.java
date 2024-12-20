public class LinkedQueue<T> implements Queue<T>{
    List<T> first;
    List<T> last;

    public LinkedQueue(T element){
        first = new List<T>(element);
        last = first;
    }

    @Override
    public void enqueue(T element) {
        last.add(element);
    }

    @Override
    public T dequeue() {
        if(first.getValue() == null)
            return null;
        if(first.getNext() == null){
            T temp = first.getValue();
            first.setValue(null);
            return temp;
        }

        T temp = first.getValue();
        first.setNext(first.getNext().getNext());
        first.setValue(first.getNext().getValue());

        return temp;
    }

    @Override
    public int size() {
        return first.getLength();
    }
}

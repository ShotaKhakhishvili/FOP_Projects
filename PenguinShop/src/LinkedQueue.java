public class LinkedQueue<T> implements Queue<T>{
    private List<T> first;
    private List<T> last;

    public LinkedQueue(T element){
        first = new List<T>(element);
        last = first;
    }

    @Override
    public void enqueue(T element) {
        if(first == null){
            first = last = new List<>(element);
        }else{
            last.add(element);
//            System.out.println(last.getValue() + " " + last.getNext().getValue());
//            last = last.getNext();
        }
    }

    @Override
    public T dequeue() {
        if(first == null)
            return null;
        if(first == last)
            last = null;

        T temp = first.getValue();
        first = first.getNext();
        return temp;
    }

    @Override
    public int size() {
        if(first == null)
            return 0;
        return first.getLength();
    }

    @Override
    public String toString() {
        return first.toString();
    }
}

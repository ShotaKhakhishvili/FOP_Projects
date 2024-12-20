public class LinkedStack<T> implements Stack<T>{
    private List<T> first;

    LinkedStack(T element){
        first = new List<T>(element);
    }

    @Override
    public int size() {
        return first.getLength();
    }


    @Override
    public T pop() {
        if(first == null)
            return null;

        T t = first.getValue();
        first = first.getNext();
        return t;
    }

    @Override
    public void push(T element) {
        first = new List<>(element, first);
    }

    @Override
    public String toString() {
        return first.toString();
    }
}

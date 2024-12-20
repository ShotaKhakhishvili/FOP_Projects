public class LinkedStack<T> implements Stack<T>{
    List<T> first;
    List<T> last;


    LinkedStack(T element){
        first = new List<T>(element);
        last = first;
    }

    @Override
    public int size() {
        return first.getLength();
    }


    @Override
    public T pop() {
        if(first.getValue() == null)
            return null;
        if(first.getNext() == null){
            T temp = first.getValue();
            first.setValue(null);
            return temp;
        }

        List<T> temp = first;
        while(temp.getNext().getNext() != null)
            temp = temp.getNext();

        T answer = last.getValue();
        last = temp;
        return answer;
    }

    @Override
    public void push(T element) {
        if(first.getNext() == null)
            first.add(element);

        last.add(element);
        last.setValue(element);
        last.setNext(null);
    }
}

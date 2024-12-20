public class List<T> implements DataStructure{
    private T value;
    private List<T> next;

    public List(){
        this(null,null);
    }

    public List(T element){
        this(element,null);
    }

    public List(T element, List<T> next){
        this.value = element;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<T> getNext() {
        return next;
    }

    public void setNext(List<T> next) {
        this.next = next;
    }

    public void add(T element){
        next = new List<>(this.value, next);
        this.value = element;
    }

    public int getLength(){
        int counter = 1;
        List<T> temp = this.next;

        while(temp != null){
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public void delete(){
        if(next != null)
            next = null;
        value = null;
    }

    public T last(){
        if(this.next == null)
            return this.value;

        return this.next.last();
    }

    @Override
    public String toString() {
        if(value == null)
            return "[]";

        String answer = "[" + this.value;
        for(List<T> temp = this.next; temp != null; temp = temp.next){
         answer += "," + temp.value;
        }
        return answer + "]";
    }

    @Override
    public int size() {
        return getLength();
    }

}

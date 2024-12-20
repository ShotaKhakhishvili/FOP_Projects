public interface Queue<T> extends DataStructure{

    void enqueue(T element);

    T dequeue();
}

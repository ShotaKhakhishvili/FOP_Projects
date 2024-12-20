public interface DataStructureConnector<T>{

    void addElement(List<T> list);

    boolean hasNextElement(List<T> list);

    void removeNextElement();
}

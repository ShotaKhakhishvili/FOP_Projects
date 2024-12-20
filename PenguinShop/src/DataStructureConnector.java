public interface DataStructureConnector<T>{
    void addElement(List<T> list);

    default boolean hasNextElement(List<T> list){
        return list.getValue() != null;
    }
}

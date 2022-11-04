public interface Queue<T> {
    public  boolean add(T e) throws IllegalStateException;
    public T pop();
    public T peek() throws EmptyQueueException;
}

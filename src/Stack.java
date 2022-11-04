public interface Stack<T> {
    public T peek();
    public T pop() throws EmptyStackException;
    public void push(T item);

}

public class QueueImpl<T> implements Queue<T> {
    int front = -1;
    int rear = -1;
    T[] arr;
    int size = 0;

    QueueImpl(int length) {
        arr = (T[]) new Object[length];
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T e) throws IllegalStateException {
        if (isEmpty()) {
            rear = 0;
            front = 0;
            arr[rear] = e;
            size++;
        } else if (isFull()) {
            throw new IllegalStateException(" It is full ");
        } else {
            rear++;
            arr[rear] = e;
            size++;
        }
        return true;
    }

    public void print() {
        for (int i = front; i < rear + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Nothing can be removed ");
        }

        T removed = arr[front];
        arr[front] = null;
        front++;
        size--;

        return removed;
    }

    @Override
    public T peek()  throws EmptyQueueException {
        if(isEmpty()){
           try{
               return arr[front];
           }catch (Exception e) {
               System.out.println("Can not");
           }

        }

        return arr[front];
    }
}
//public class StackImpl<T> implements Stack<T> {
//    int size = 0;
//    T[] arr;
//    DynamicIntegerArray arr1;
//
//
//    StackImpl(int length) {
//        arr = (T[]) new Object[length];
////        arr = new DynamicIntegerArray(length);
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public boolean isFull() throws IndexOutOfBoundsException {
//        if (size == arr.length) {
//            try {
//                return true;
//            } catch (Exception e) {
//                System.out.println("Can not");
//            }
//        }
//        return false;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    @Override
//    public T peek() {
//        return (T) arr[size - 1];
//    }
//
//    public void resize() {
//        if (size == arr.length) {
//            arr = (T[]) new Object[arr.length * 2];
//        }
//    }
//
//    @Override
//    public T pop() throws EmptyStackException {
//        T item = null;
//        if (isEmpty()) {
//            throw new EmptyStackException("Stack is empty");
//        } else {
//            item = (T) arr[size - 1];
//            arr[size - 1] = null;
//            size--;
//        }
//        return item;
//    }
//
//    @Override
//    public void push(T item) {
//        resize();
//        arr[size] = item;
//        size++;
//    }
//
//
//}






public class StackImpl<T> implements Stack<T> {
    int size = 0;
    DynamicIntegerArray arr;

    StackImpl(int length) {
        arr = new DynamicIntegerArray(length);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() throws IndexOutOfBoundsException {
        if (arr.size) {
            try {
                return true;
            } catch (Exception e) {
                System.out.println("Can not");
            }
        }
        return false;
    }

    public int size() {
        return arr.size;
    }

    public void print() {
        arr.print();
    }

    @Override
    public int peek() {
        return arr[arr.size - 1];
    }

    public void resize() {
        if (size == arr.length) {
            arr = (T[]) new Object[arr.length * 2];
        }
    }

    @Override
    public T pop() throws EmptyStackException {
        T item = null;
        if (isEmpty()) {
            throw new EmptyStackException("Stack is empty");
        } else {
            item = (T) arr[size - 1];
            arr[size - 1] = null;
            size--;
        }
        return item;
    }

    @Override
    public void push(T item) {
        resize();
        arr[size] = item;
        size++;
    }


}

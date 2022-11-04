import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) throws EmptyStackException, IndexOutOfBoundsException, EmptyQueueException {
      StackImpl<Integer> stack = new StackImpl<>(10);
      System.out.println("The initial size is " + stack.size());
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.print();
        System.out.println();
        System.out.println("Now the stack size is " +  stack.size());
        System.out.println("The popped element is " + stack.pop());
        System.out.println(stack.isEmpty());
        stack.print();
        System.out.println();
        System.out.println(stack.isFull());

        System.out.println("////////////////////////////////////////////////");
        QueueImpl<Integer> queue = new QueueImpl<>(9);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.size());
        queue.add(4);
        queue.add(9);
        queue.add(10);
        System.out.println(queue.size());
        queue.print();
        System.out.println();
        System.out.println(queue.isEmpty());
        queue.pop();
        System.out.println(queue.peek());



    }
}
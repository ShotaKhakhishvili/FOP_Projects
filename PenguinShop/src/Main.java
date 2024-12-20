import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
//        LinkedStack<Integer> stack = new LinkedStack<>(1);
//        stack.push(3);
//        stack.push(4);
//        stack.push(123);
//        System.out.println(stack.pop());
//        System.out.println(stack.toString());

        LinkedQueue<Integer> queue = new LinkedQueue<>(1);
        queue.enqueue(3);
        queue.enqueue(45);
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
//        List<Integer> list = new List<>(1, null);
//        list.add(3);
//        list.add(5);
//        list.add(67);
//        System.out.println(list.toString());
    }
}
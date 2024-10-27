package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

//        1. Add items in queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

//        2. Get from of the queue
        System.out.println("Front item of the queue" + queue.peek());

//        3. Remove item from queue
        queue.poll();
    }
}

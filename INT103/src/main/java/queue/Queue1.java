package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

    public static void main(String[] args) {
        // create queue
        Queue<Integer> q1 = new LinkedList<>();
        // like add() method in ArrayList
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        // print queue
        System.out.println(q1);
        // return the first element that we push in the queue
        System.out.println(q1.peek());
        System.out.println(q1);
        // remove the first element that we push in the queue
        System.out.println(q1.poll());
        System.out.println(q1);
        // remove the element that match in queue | return boolean, true if it matches and false otherwise
        System.out.println(q1.remove(3));
        System.out.println(q1.remove(1));
        System.out.println(q1);
    }
}

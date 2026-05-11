package JavaCollectonFramework;

import java.util.LinkedList;
import java.util.Queue;

public class queueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println("Removing Element:" + q.poll());
        System.out.println(q);
        //q.peek();
        System.out.println(q.peek());
    }
}

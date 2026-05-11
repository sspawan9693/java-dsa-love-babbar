package JavaCollectonFramework;

import java.util.Collections;
import java.util.LinkedList;

public class ToLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(15);
        linkedlist.add(40);
        linkedlist.add(30);
        linkedlist.add(24);
        linkedlist.add(30);
        System.out.println(linkedlist);

       // linkedlist.remove(2);
        //System.out.println(linkedlist);
        Collections.sort(linkedlist);
        System.out.println(linkedlist);
        System.out.println(linkedlist.indexOf(30));
        System.out.println(linkedlist.contains(5));
        System.out.println(linkedlist.lastIndexOf(30));

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(15);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println("Before: " + ll);
        System.out.println("polling:" + ll.poll());
        System.out.println("After:" + ll);

    }
}

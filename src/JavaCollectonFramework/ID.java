package JavaCollectonFramework;

import java.util.List;
import java.util.Stack;

public class ID {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();

        list.add(15);
        list.add(88);
        list.add(52);
        list.add(65);
        System.out.println(list);
        list.push(105);
        System.out.println(list);
         list.pop();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.search(105));
        System.out.println(list.empty());


    }
}

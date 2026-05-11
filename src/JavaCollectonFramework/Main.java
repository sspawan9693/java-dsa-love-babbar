package JavaCollectonFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List or Collection -> interface

        // ArrayList -> concrete class
       ArrayList<Integer> list = new ArrayList<>();


       // Add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //Remove The specific elment
        list.remove(0);
        System.out.println(list);

        //Add All
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list2.size());

        System.out.println("printing list2"+ list2);
        list2.clear();
        System.out.println(list2.size());

        // i want to traverse list using iterator

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
     System.out.println(newList);
     System.out.println(newList.isEmpty());

     ArrayList<Integer> marks = new ArrayList<>();
     marks.ensureCapacity(100);
     System.out.println(marks.isEmpty());
    }
}

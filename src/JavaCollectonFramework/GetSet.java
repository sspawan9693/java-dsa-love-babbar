import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GetSet {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(14);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println("Before Set: " + list);
        list.set(1,105);
        System.out.println("After set: " + list);
        System.out.println(list.contains(105));

        //toArray
        Object[] arr = list.toArray();
        for (Object obj: arr){
            System.out.println(obj);

        }
        System.out.println(list.contains(101));
        list.add(60);
        System.out.println("printing Entrie list: " + list);

        // Sort an Arraylist
        Collections.sort(list);
        System.out.println("printing Entire List: " +list);

      // List<Integer> newList = (List<Integer>)list.clone();
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        System.out.println(list.indexOf(14));
        System.out.println(list.indexOf(105));
    }
}
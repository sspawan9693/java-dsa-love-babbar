package JavaCollectonFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapbasics {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "united States");
        mapping.put("aus", "Austrila");
        System.out.println(mapping);

        Map<String, String> m = new HashMap<>();
        m.put("br", "brazil");
        System.out.println("Before: " + m);

        m.putAll(mapping);
        System.out.println("After:" + m);

        m.remove("en");
        System.out.println(m);

        System.out.println(m.get("br"));

        System.out.println(m.getOrDefault("usa","none"));

        System.out.println(m.containsKey("in"));

        System.out.println(m.containsValue("united States"));

        System.out.println(m);

        m.replace("in", "indonesia");
        System.out.println(m);



        Set<String> keyset = m.keySet();
        System.out.println(keyset);

        Collection<String> valueSet= m.values();
        System.out.println(valueSet);

        Set<Map.Entry<String,String>> entrySet = m.entrySet();
        System.out.println(entrySet);
    }
}

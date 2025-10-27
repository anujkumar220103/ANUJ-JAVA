import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapExample {
    public static void main(String[] args) {
        System.out.println("------------------------LinkedHashMap-------------------------");

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(21, "b");
        map.put(23, "c");
        map.put(141, "d");
        map.put(25, "e");
        
        //iteration -> in linkedHashMap iteration is done through 'after' as linkedHashMap internally user Doubly linkedList to keep same order
        map.forEach((Integer key, String val) -> System.out.println(key + " : " + val));
    



       System.out.println("------------------------normalhashmap-------------------------");

       Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"a");
        map2.put(21, "b");
        map2.put(23, "c");
        map2.put(141, "d");
        map2.put(25, "e");
        //iteration -> no order will be maintains
        map2.forEach((Integer keys, String vals)-> System.out.println(keys + " : " + vals));

}
}
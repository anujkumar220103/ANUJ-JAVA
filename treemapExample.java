import java.util.Map;
import java.util.TreeMap;

public class treemapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>((Integer a, Integer b) -> b - a);
        map.put(21,"a");
         map.put(11,"b");
          map.put(13,"c");
           map.put(5,"d");
            map.put(8,"e");

            map.forEach((Integer key, String val) -> System.out.println(key + ": " + val));


            System.out.println("------------------------------------------");

       Map<Integer, String> map2 = new TreeMap<>();
        map2.put(21,"a");
         map2.put(11,"b");
          map2.put(13,"c");
           map2.put(5,"d");
            map2.put(8,"e");

            map2.forEach((Integer key, String val) -> System.out.println(key + ": " + val));

    }
}

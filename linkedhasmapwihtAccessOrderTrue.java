import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhasmapwihtAccessOrderTrue {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new LinkedHashMap<>(16, 075F, true);
        map.put(1,"a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        //accessing some data
        map.get(2);
        map.get(3);

        map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));
        
    }
}


// if you wnat some access order the set accessOrder: true  
//in likedHashMap priority is set as   :      less freq used -------->high freq used
// so in above example we use 2 and 3 thats why it print in last
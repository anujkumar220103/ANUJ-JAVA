import java.util.*;

public class collectionss1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(8);
        values.add(2);
        values.add(5);
        values.add(4);

        System.out.println("max value : " + Collections.max(values));
        System.out.println("max value : " + Collections.min(values));
        Collections.sort(values);
        System.out.println("sorted");
        values.forEach(val -> System.out.println(val));
    }
}


//collections = is a utility class and provide sttic methods, which are used to operate on collections like sorting,swapping,searching,
//reverse , copy etc.
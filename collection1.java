import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*Collection is a part of java colleciton and its and interface, which expose various mathods which is implemented by vareious collection
 * classes like ArrayList, Stack, LinkList .
 */
public class collection1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(7);
        values.add(1);
        values.add(4);
        //size
        System.out.println("size :" + values.size());
        //isEmpty
        System.out.println("isempty:" + values.isEmpty());
        //contains
        System.out.println("contains:"+values.contains(6));
        //add
        values.add(3);
        System.out.println("added: "+ values.contains(3));
        //remove using index
        values.remove(3);
        System.out.println("removed using index:" + values.contains(9));
        //remove using object, removes the first occurance of the values 
        values.remove(Integer.valueOf(1));

                      //Stack
        
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(9);
        stackValues.add(60);
        //add all
        values.addAll(stackValues);
        System.out.println("addAll test using containsAll:"+ values.containsAll(stackValues));
        //conatainsAll
        values.remove(Integer.valueOf(21));
        System.out.println("containsAll after removing 1 element:"+ values.containsAll(stackValues));
        //removeAll
        values.removeAll(stackValues);
        System.out.println("removeAll:"+ values.contains(8));
        //clear
        values.clear();
        System.out.println("clear:"+ values.isEmpty());
        
    }
}

import java.util.*;
public class iterable {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		
		//using iterator
	   System.out.println("Iterating thee value using iterator method :");
		Iterator<Integer> valIterat = values.iterator();
		while(valIterat.hasNext()){
		    int val = valIterat.next();
		    System.out.println(val);
		    if(val == 3 ){
		        valIterat.remove();
		    }
		}
		
		System.out.println("iterate value using for each loop");
		for(int a : values){
		    System.out.println(a);
		}
		System.out.println("iterate value using for each loop using lambda expression");
		values.forEach(val-> System.out.println(val));
	}
}


import java.util.PriorityQueue;

public class MaxPQ {
    public static void main(String args[]){
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        //print all elemnts
        maxPQ.forEach(val -> System.out.println(val));

        //remove the top element form the pq and print
        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("remove from top :"+val);
        }
    }
}

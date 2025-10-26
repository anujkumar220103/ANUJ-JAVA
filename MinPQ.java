import java.util.PriorityQueue;

public class MinPQ {
    public static void main(String args[]){
        //min priority queue , used to solve problems of min heap.
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        //print the value
        minPQ.forEach(val -> System.out.println(val));

        //remove top from the pq and print 
        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("remove from the top :" + val);
        }
    }
}

import java.security.spec.ECFieldF2m;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

 //use of future and different method of future

public class future {
    public static void main(String args[]){
        ThreadPoolExecutor PoolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        
        Future<?> futureObj = PoolExecutor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("this is the task , which thread will execute");
            } catch (Exception e){
                System.out.println(e);
            }
        });

        System.out.println("is Done:" + futureObj.isDone());  // returns true if task is completed no matter how it compelted

        try{
            futureObj.get(2, TimeUnit.SECONDS);  // wait if required, for at most the given timeout period. otherwise throws 'timeoutexception'  if timeout period finished and task is not yet completed.
        } catch (Exception e){
            System.out.println("TimeoutException happend");
        }
        

        try{
            futureObj.get(); //wait if required , for the completion of the task.. after task completed, retrive the result if available -> you are waiting indefinitely
        }catch (Exception e){

        }

        System.out.println("is done: " + futureObj.isDone());
        System.out.println("is cancelled: " + futureObj.isCancelled());
    }
}

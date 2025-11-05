import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Callable {
public static void main(String[] args) {
    ThreadPoolExecutor PoolExecutor = new ThreadPoolExecutor(3,3,1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    //use case 1
    Future<?> futureObj1 = PoolExecutor.submit(()->{
        System.out.println("task 1 with runnable");
    });
    
    try{
        Object object = futureObj1.get();
        System.out.println(object == null);
    }catch(Exception e){
        System.out.println(e);
    }

    //Use case 2
    List<Integer> output = new ArrayList<>();
    Future<List<Integer>> futureObjec2 = PoolExecutor.submit(()->{
        output.add(100);
        System.out.println("task 2 with runnable and return object");
    },output);

    try {
        List<Integer> outputFromFutureObject2 = futureObjec2.get();
        System.out.println(outputFromFutureObject2.get(0));
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }

    // use case 3
    Future<List<Integer>> futureObject3 = PoolExecutor.submit(()->{
        System.out.println("task 3 with collable");
        List<Integer> listObj = new ArrayList<>();
        listObj.add(200);
        return listObj;
    });

    try {
        List<Integer> outputFromFutureObject3 = futureObject3.get();
        System.out.println(outputFromFutureObject3.get(0));
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
}
}
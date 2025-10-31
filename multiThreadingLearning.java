public class multiThreadingLearning {

public static class a implements Runnable{
    @Override
    public  void run(){
        System.out.println("code executed by thread:"  + Thread.currentThread().getName());
    }
}

public static void main(String[] args) {
    System.out.println("going inside this main: " + Thread.currentThread().getName());

    a runnableojb = new a();
    Thread thread = new Thread(runnableojb);
    thread.start();
    System.out.println("finish main mehtod: " + Thread.currentThread().getName());
}

}
 abstract class Car{

  public abstract void pressBreak();
    
}
    
public class Test{
  public static void main(String[] args) {
   Car audicarobj = new Car() {
    
    @Override
    public void pressBreak(){
      System.out.println("audi specific");
    }
   };
   audicarobj.pressBreak();
}
}
                                            //Reflection of contructor

/*  java reflection class ka contructor improt - these class provide you the faciliy
 to inspect and invoke the constructor of a class */
import java.lang.reflect.Constructor;   
import java.lang.reflect.InvocationTargetException;
/*- Ye class modifiers (like public, private, static, etc.) ko inspect aur string mein 
convert karne ke liye use hoti hai.  */
import java.lang.reflect.Modifier;

class Eagle{
    //private constructor
    private  Eagle() {  

    }

    public void fly(){
        System.out.println("fly");
    }
   }

public class Main {
    /*
    -InstantiationException: agar object create nahi ho paaye.
    - IllegalAccessException: agar access violation ho.
    - IllegalArgumentException: agar arguments galat ho.
    - InvocationTargetException: agar invoked constructor/method exception throw kare.
 */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // Eagle.class se Class object bnaya
        Class eagleClass = Eagle.class; 
        
        //to access private constructor too
        Constructor[] eagleConstructorList = eagleClass.getDeclaredConstructors(); // get both public and private consructor

        for(Constructor eagleConstructor : eagleConstructorList){
            System.out.println("Modifier:" + Modifier.toString(eagleConstructor.getModifiers()));

            /*- Ye line Java ke access control checks ko bypass karti hai.
            - Normally private constructor accessible nahi hota, lekin is line se aap usse use kar sakte hain.
            */
            eagleConstructor.setAccessible(true);
            Eagle eagleObject = (Eagle) eagleConstructor.newInstance(); // creating object throgh reflection
            eagleObject.fly();
        }
    }
}


// by using this we can access private constructor 
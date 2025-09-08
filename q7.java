// Write a program to count the number of vowels, consonants, digits, and special characters in a given string
import java.util.*;
public class q7 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int vowel = 0;
       int consonent = 0;
       int digit = 0;
       int ss = 0;
       System.out.print("Enter string: ");
       String a = sc.nextLine().toLowerCase();   // taking sting input
       for(int i=0;i<a.length();i++){
        char ch = a.charAt(i);
        if(ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o' ||ch == 'u'){
            vowel ++;
       }
    }

    for(int i=0;i<a.length();i++) {
        char ch = a.charAt(i);
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
                consonent++;
            }
        }

    for(int i=0;i<a.length();i++) {
        char ch = a.charAt(i);
            if(ch == '1' ||ch == '2' ||ch == '3'||ch == '4' ||ch == '5' || ch == '6' ||ch == '7' ||ch == '8'||ch == '9' ||ch == '0' ) {
                digit++;
            }
        }
    
        for(int i=0;i<a.length();i++) {
        char ch = a.charAt(i);
               if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                ss++;
            }
        }

       System.out.println("total vowel is :"  + vowel);
       System.out.println("total consonent is :"  + consonent);
       System.out.println("total digit is :"  + digit);
       System.out.println("total symbol is :"  + ss);
    }
}

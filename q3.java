
// Write a Java program to find the largest of three numbers using nested if-else.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.print("c :");
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.print("a is greater");
        } else if(b>c){
            System.out.print("b is greater");
        } else{
            System.out.print("c is greater");
        }
        sc.close();
    }
}


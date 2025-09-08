import java.util.*;
public class q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(int i=0;i<n;i++){
             a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
             if(a[i]>max){
                max = a[i];
             }
             if(a[i]<min){
                min = a[i];
             }
        }

        System.out.print("max value: " + max + " " + "min value:" + min);
    }
}

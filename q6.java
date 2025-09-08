//  Implement a program to sort an array of integers in ascending order using a loop.

import java.util.Arrays;

public class q6 {
        public static void main(String args[]) {
            int arr[] = {5,9,6,7,8,2,1,4,0};
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
        }
}
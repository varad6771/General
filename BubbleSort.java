import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void countSwaps(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap ;
        int ctr = 0;
        for(int i = 0; i < n-1; i++){
            swap = false;
            for (int j = 0; j < n-i-1; j++ ) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                    ctr++;
                }
            }
            if (swap == false) 
                break;                
        }

        System.out.println("Array is sorted in "+ctr+" swaps");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[n-1]);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}

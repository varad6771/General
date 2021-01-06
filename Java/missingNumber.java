import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class missingNumber {


    public static void missingNumbers(int[] arr, int[] brr) {
        // arr modified - brr original
        int count1,count2 , j = 0,k = 0, l = 0;

        int[] freqarr = new int [brr.length];
        int[] diff = new int [arr.length];

        boolean[] visited1 = new boolean[arr.length];
        Arrays.fill(visited1, false); 
        boolean[] visited2 = new boolean[brr.length];
        Arrays.fill(visited2, false); 
        Arrays.fill(freqarr,-1); 


        Arrays.sort(brr);
        Arrays.sort(arr);
        
        for (int i = 0; i < brr.length; i++) { 
            if (visited2[i] == true) 
                continue; 
            count2 = 1; 
            for (j = i + 1; j < brr.length; j++) { 
                if (brr[i] == brr[j]) { 
                    visited2[j] = true; 
                    count2++; 
                } 
            } 
            // System.out.println(brr[i] +" "+count2);
            freqarr[k] = count2;
            k++;
        }

        // for (int i = 0; i < freqarr.length; i++)  
        //     System.out.println(freqarr[i]);
        k  = 0;
        for (int i = 0; i < arr.length; i++) { 
            if (visited1[i] == true) 
                continue; 
            count1 = 1; 
            for (j = i + 1; j < arr.length; j++) { 
                if (arr[i] == arr[j]) { 
                    visited1[j] = true; 
                    count1++; 
                } 
            } 
            System.out.println(arr[i] +" "+count1);
            // System.out.println(freqarr[k]);
            // System.out.println(k);
            if ((freqarr[k]-count1) != 0  ) {
                diff[l] = arr[i];
                k++; l++;
            }
        } 
        System.out.println("arr 2");
        for (int item : freqarr) System.out.println(item);


        for (int value : diff) System.out.println(value);



   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }



        missingNumbers(arr, brr);
        // int[] result = missingNumbers(arr, brr);

        // for (int i = 0; i < result.length; i++) {
        //     System.out.println(result[i]);
        //     // bufferedWriter.write(String.valueOf(result[i]));

        //     // if (i != result.length - 1) {
        //     //     bufferedWriter.write(" ");
        //     // }
        // }

        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}

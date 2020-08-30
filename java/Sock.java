import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sock {

    static int oddPairs(int val){
        int pair = 0;
        while(val != 1 ){
            val = val - 2;
            pair++;
        }
        return pair;
    }

    static int getFreq(int [] arr, int min){
        int ctr = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]){
                ctr++; 
            } 
        }
        return ctr;
    }

    static int sockMerchant(int n, int[] arr) {
        int ctrv = 0, min = 0;
        int val = 0, pairs = 0;
        Map <Integer, Integer> data = new HashMap<Integer,Integer>();
        Arrays.sort(arr);


        for (int i = 0; i < n-1; i++ ) {
            min = arr[i];
            ctrv = getFreq(arr, min);
            data.put(min, ctrv);
        }
     

        for (Integer i : data.keySet()) {
            val = data.get(i);

            if (val % 2 == 0) {
                pairs += val/2;
            } else {
                pairs += oddPairs(val); 
            }
        }

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        sockMerchant(n, ar);
        // int result = sockMerchant(n, ar);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}

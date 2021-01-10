import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Diff {

    static void closestNumbers(int[] arr) {
        int m = 0, min = 0, minval = 0, absDif = 0, a = 0, ctr = 0;
        int len = arr.length;
        int[] retarr;
        int[] oparr;
        int size = 0;


        // for size of oparr 
        for (int i = 0; i < arr.length; i++)
            size += i;


        oparr = new int[size];
        retarr = new int[size];


        Arrays.sort(arr);

        // sort and find shortest abs dist adn add to arr
        for (int i = 0; i < arr.length - 1; i++) {
            a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                absDif = a - arr[j];

                if (ctr != size)
                    oparr[ctr] = Math.abs(absDif);
                ctr++;
            }
        }

        Arrays.sort(oparr);

        // reiterate and compare which matches the dist and add to retarr
        minval = oparr[0];
        for (int i = 0; i < oparr.length; i++) {
            if (oparr[i] == minval) {
                for (int k = 0; k < arr.length - 1; k++) {
                    a = arr[k];
                    for (int j = k + 1; j < arr.length; j++) {
                        absDif = a - arr[j];
                        if (minval == Math.abs(absDif)) {
                            retarr[m] = arr[k];
                            m++;
                            retarr[m] = arr[j];
                            m++;
                        }

                    }
                }
            }
        }


        // display
        for (int i = 0; i < retarr.length; i++)
            System.out.print(retarr[i] + " ");


        // return retarr;
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

        // int[] result = closestNumbers(arr);
        closestNumbers(arr);

        // for (int i = 0; i < result.length; i++) {
        //     // bufferedWriter.write(String.valueOf(result[i]));
        //     System.out.print(String.valueOf(result[i]));
        //     if (i != result.length - 1) {
        //         // bufferedWriter.write(" ");
        //         System.out.println(" ");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}

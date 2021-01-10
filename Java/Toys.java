import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Toys {


    static void maximumToys(int[] arr, int price) {
        int sum = 0;
        int n = arr.length;
        int ctr = 0;
        System.out.println(price);
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (sum <= price) {
                sum += arr[i];
                ctr++;
                System.out.println(arr[i] + " price " + sum);
            }
        }


        System.out.println(ctr + " " + sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        maximumToys(prices, k);
        // int result = maximumToys(prices, k);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}

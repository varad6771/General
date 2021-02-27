import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CloudJmp {

    static void jumpingOnClouds(int[] arr) {
        int i = 0, n = arr.length;
        List<Integer> path = new ArrayList<Integer>();
        while (i < n) {
            if (arr[i] != 1) {
                if (!path.contains(i))
                    path.add(i);

                i = i + 2;
            } else if (arr[i - 1] != 1) {
                if (!path.contains(i))
                    path.add(i - 1);

                i = (i - 1) + 2;
            }

            if (!path.contains(n - 1))
                path.add(n - 1);

        }

        System.out.println(path.size() - 1);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        jumpingOnClouds(c);
        // int result = jumpingOnClouds(c);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();
        // bufferedWriter.close();

        scanner.close();
    }
}

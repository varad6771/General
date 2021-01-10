import java.io.IOException;
import java.util.Scanner;

public class CntValleys {

    static void countingValleys(int n, String input) {
        int sl = 0, valley = 0;
        char step;
        for (int i = 0; i < n; i++) {
            step = input.charAt(i);
            if (step == 'U') {
                sl++;
                // System.out.println(sl);
            } else {
                sl--;
            }
            // System.out.println("step "+step+" "+sl);
            if (step == 'U' && sl == 0) {
                valley++;
                // System.out.println("valley "+valley +" "+ step);
            }

        }
        // System.out.println(valley);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        countingValleys(n, s);

        // int result = countingValleys(n, s);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}

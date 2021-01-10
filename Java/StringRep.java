import java.io.IOException;
import java.util.Scanner;

public class StringRep {

    static void repeatedString(String input, long n) {
        int len = input.length();
        long val = n % len;
        String text = null;
        long ctr = 0;
        long nmult = n / len;
        if (len == 1 && input.equals("a")) {
            ctr = n;
        } else {

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a')
                    ctr++;
            }

            ctr *= nmult;

            text += input.substring(0, Math.toIntExact(val));
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'a')
                    ctr++;
            }

        }


        System.out.println(ctr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        repeatedString(s, n);
        // long result = repeatedString(s, n);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}

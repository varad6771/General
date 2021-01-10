import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

    // Complete the extraLongFactorials function below.
    public static void extraLongFactorials(int n) {
        // System.out.println(n);
        // BigInteger no = new BigInteger();
        BigInteger fact = BigInteger.valueOf(n);
        BigInteger no = BigInteger.valueOf(n);
        // System.out.println("f "+fact);
        for (int i = n - 1; 1 <= i; i--) {
            fact = fact.multiply(no.subtract(BigInteger.valueOf(i)));
        }
        System.out.println("" + fact);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice {
    static String abc = "Varad";
    String pqr = new String("Varad");
    static Scanner scanner = new Scanner(System.in);
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println(abc.equals(new Practice().pqr) +" "+ (abc == new Practice().pqr) );

//        String neww = new Scanner(System.in).nextLine();
//
//        String b = neww.replace("7", "");
//        b = b.replace("56", "");
//        System.out.println("new = " + b);
//
//        BigInteger mul = BigInteger.valueOf(1);
//        char [] arr = neww.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            BigInteger num = BigInteger.valueOf(Integer.parseInt(arr[i]+""));
//            mul = mul.multiply(num);
//        }
//        System.out.println("mul = " + mul);

    }
}

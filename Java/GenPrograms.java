import java.util.Arrays;
import java.util.Scanner;

public class GenPrograms {

    public void anagram(String inp1, String inp2) {

        char[] op1 = inp1.toLowerCase().toCharArray();
        char[] op2 = inp2.toLowerCase().toCharArray();
        Arrays.sort(op1);
        Arrays.sort(op2);
        System.out.println(new String(op1).equals(new String(op2)));
    }

    public void sumDiag(int[][] arr, int n) {
        int sum = 0, sum1 = 0;
        for (int i = 0; i < n; i++) {
            if (i == i) {
                sum += arr[i][i]; // no need to take j loop anyway i==j hence might as well be i==i
                sum1 += arr[i][n - i - 1]; // n=3 hence other diag - starts at 3-0-1 and ends at 3-2-1
                System.out.println((n - i - 1));
            }
        }
        System.out.println("Math.abs(sum-sum1) = " + Math.abs(sum - sum1));
    }

    public static void main(String[] args) {
//        new GenPrograms().anagram("ate", "tea");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        new GenPrograms().sumDiag(arr, n);
    }
}
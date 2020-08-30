import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

	// calc list of sums
	// sort sums
	// return max

	public static int calcSum(int i, int j, int m, int n, int [][] arr){
		int sum = 0;
		while(i < m){
			while(j < m){
				sum += arr[i][j];
				j++;
			}
			i++;
		}
		
		return sum;
	}

    // Complete the hourglassSum function below.
    static void  hourglassSum(int[][] arr) {
    	int m = arr.length ,n = arr.length;
    	int val = 0;
    	for (int i = 0; i < m; i++){
    		val = calcSum(i, 0, m, n, arr);
    	}
    	// System.out.println(val);

    	// for (int i = 0; i < m; i++ ){
    	// 	for (int j = 0; j < n; j++){
    	// 		System.out.println(arr[i][j]);
    	// 	} 
    	// } 
    }

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        hourglassSum(arr);
        // int result = hourglassSum(arr);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}


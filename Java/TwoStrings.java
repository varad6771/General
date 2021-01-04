import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        HashMap<Integer, String> s1map = new HashMap<Integer, String>();
        HashMap<Integer, String> s2map = new HashMap<Integer, String>();
        
        char temp;
        for (int i = 0; i < s1.length(); i++) {
            temp = s1.charAt(i);
            s1map.put(i, temp+"");
        }

        for (int i = 0; i < s2.length(); i++ ) {
            temp = s2.charAt(i);
            s2map.put(i, temp+"");
        }

        // for (Map.Entry<Integer, String> entry : s2map.entrySet()) {
        //     System.out.println(entry.getValue() + " "+ entry.getKey());
        // }

        String val;
        boolean status = false;
        for (Map.Entry<Integer, String> entry : s1map.entrySet()) {
            val = entry.getValue();
            // System.out.println(val+" "+s2map.containsValue(val));
            if (s2map.containsValue(val)) {
                status  = true;
            }
        }

        if (status == true)
            return "Yes";
        return "No";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();
            // twoStrings(s1, s2);
            String result =  twoStrings(s1, s2);
            System.out.println(result);
            // bufferedWriter.write(result);
            // bufferedWriter.newLine();
        }

        // bufferedWriter.close();

        scanner.close();
    }
}

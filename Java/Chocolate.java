import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Chocolate {

    
    static int birthday(List<Integer> arr, int d, int m) {
        int n = arr.size() - m;
        int sum  = 0;
        int ctr = 0;
        int j = 0;
        for (int i = 0; i <= n; i++) {
            sum = 0;
            j = i;
            while(j < i+m) {
                sum += arr.get(j);
                j++;
            }
            if (sum == d) 
                ctr ++;
        }

        return ctr; 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        System.out.println(birthday(s, d, m));
        

        bufferedReader.close();
    }
}

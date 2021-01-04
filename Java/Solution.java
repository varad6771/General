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


public class Solution {

    public static int vals(int num) {
        int []arr = new int[2];
        int j = 0;
        int no = 0;
        int op = num;
        
        while (num > 0 && j < 2) {
            arr[j] = num % 10;
            num = num / 10;
            j++;
        }

        if (arr[0] > 5 )
            no = Integer.parseInt((arr[1]+1)+"0");
        else
            no = Integer.parseInt(arr[1]+"5");

        if ((no - op) < 3)
            return no;
        
        return op;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int num = 0, value = 0;
        List<Integer> fgrades = new ArrayList<Integer>();

        for(int i = 0; i < grades.size(); i++){
            num = grades.get(i);
            if (num >= 38 && num != 100) {
                value = vals(num);
                fgrades.add(value);
            } else {
                fgrades.add(num);
            }
        }

        return fgrades;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

        List<Integer> result = gradingStudents(grades);

        for (int i = 0; i < result.size() ;i++) {
            System.out.println(result.get(i));
        }

        // bufferedWriter.write(
        //     result.stream()
        //         .map(Object::toString)
        //         .collect(joining("\n"))
        //     + "\n"
        // );

        bufferedReader.close();
        // bufferedWriter.close();
    }
}

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


public class trial  {
	public static void getval(int[] arr){
		int n = arr.length - 2;
        int m = 3;
        String temp = null;
        int sum = 0;
        
        List<Integer> list = new ArrayList<Integer>();


        System.out.println("n "+n);



        for (int i = 0; i < n; i++ ) {
        	// System.out.println("i "+i);
            for (int j = i+1; j < i + 3; j++) {
                
            	if (i == 0) {
            		sum = arr[0]+arr[1];
            	}

                sum += arr[j];
                if (sum == m) {
                System.out.println("sum "+sum);
                	list.add(j);
                	temp = i+""+j;
                	System.out.println(temp);
                	System.out.println("added to list "+temp);
                }


            }

        }

	}


	public static void main(String[] args) {
		int[] arr  = {1,2,1,3,2};

		getval(arr);
	}
}
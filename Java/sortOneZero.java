import java.lang.*;
import java.util.*;
public class sortOneZero {
	public void sortArray(int[] arr){
		int pos = 0, temp = 0;
		for (int i=0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i] != arr[j] ) {
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}

		Arrays.stream(arr).forEach(e->System.out.print(e+" "));
	}

	public void anagram(String inp1, String inp2){

		char []op1 = inp1.toLowerCase().toCharArray();
		char []op2 = inp2.toLowerCase().toCharArray();
		Arrays.sort(op1);
		Arrays.sort(op2);
		System.out.println(new String(op1).equals(new String(op2)));
	}

	public static void main(String[] args){
		// int []arr = {1,0,0,1,1,1,0};
		// System.out.println("input");
		// Arrays.stream(arr).forEach(e->System.out.print(e+" "));
		// System.out.println();
		// System.out.println("output");
		// new sortOneZero().sortArray(arr);
		new sortOneZero().anagram("ate", "tea");
	}
}
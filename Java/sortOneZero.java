import java.lang.*;
import java.util.*;
public class sortOneZero {
	
	public void segregateSwap(int[] arr){
		int left = 0, right = arr.length - 1;
		while(left < right){
			while(arr[left] == 0 && left<right)
				left++;
			while(arr[right] == 1 && left<right)
				right--;

			if (left<right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		printArray(arr);
	}

	// simplest
	public void segregateSubstitution(int[] arr){
		int cnt = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == 0) 
				cnt++;
		}
		for (int i = 0; i < cnt-1; i++ ) 
			arr[i] = 0;
		for (int j = cnt; j < arr.length; j++ ) 
			arr[j] = 1;

		printArray(arr);
	}

	public void printArray(int [] arr){
		Arrays.stream(arr).forEach(e->System.out.print(e+" "));
	}
	
	public static void main(String[] args){
		int []arr = {1,0,0,1,1,1,0};
		System.out.println("input");
		new sortOneZero().printArray(arr);
		System.out.println();
		System.out.println("output");
		new sortOneZero().segregateSwap(arr);
		// new sortOneZero().segregateSubstitution(arr);
		
	}
		
}
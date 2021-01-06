class GFG { 
	
	static void findMissing(int[] brr, int[] arr, int n, int m) {
		int j;
		for (int k : brr) {
			for (j = 0; j < arr.length; j++)
				if (k == arr[j])
					break;

			if (j == m)
				System.out.print(k + " ");
		} 
	} 

	// Driver Code 
	public static void main(String[] args) { 
		int[] b = { 203, 204, 205 ,206 ,207, 208 ,203 ,204 ,205 ,206 ,204 };
		int[] a = {209 ,210 ,204 ,204 ,205 ,206 ,207 ,205 ,208 ,203 ,206 ,205 ,206 ,204, 204};
		
		int n = a.length; 
		int m = b.length; 
		
		findMissing(a, b, n, m); 
	} 
} 

// This code is contributed 
// by Anant Agarwal. 

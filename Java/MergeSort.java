class MergeSort {

	public void merge(int[] arr, int l, int m, int h){
		int n1 = m - l +1;
		int n2 = h - m;

		int[] left = new int [n1];
		int[] right = new int [n2];


		for (int i = 0; i < n1; i++ ) 
		 	left[i] = arr[l+i];
		
		for (int j = 0; j < n2; j++) 
			right[j] = arr[(m+1)+j];


		int i = 0, j = 0;
		int k = l;
		while(i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}


		// add rem to stack 
		while(i < n1){
			arr[k] = left[i];
			i++; k++;
		}

		while(j < n2){
			arr[k] = right[j];
			j++; k++; 
		}
	}

	public void sort(int[] arr, int l, int h){
		int m = 0;
		if (l < h) {
			m = (l+h)/2;

			sort(arr, l, m);
			// System.out.println("s1 "+l+" "+m);
			sort(arr, m+1, h);
			// System.out.println("s2 "+(m+1)+" "+h);

			// System.out.println("m1 "+l+" "+m+" "+h);
			merge(arr, l, m, h);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 }; 
        int n = arr.length;
		new Trial().sort(arr, 0, n-1);

		System.out.println("sorted");
		System.out.println();
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
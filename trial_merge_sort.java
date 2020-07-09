/* Java program for Merge Sort */
class MergeSort 
{ 
	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	void merge(int arr[], int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int Left[] = new int [n1]; 
		int Right[] = new int [n2]; 

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i) 
			Left[i] = arr[l + i]; 
		for (int j=0; j<n2; ++j) 
			Right[j] = arr[m + 1+ j]; 


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = l; 
		while (i < n1 && j < n2) { 
			if (Left[i] <= Right[j]) { 
				arr[k] = Left[i]; 
				i++; 
			} else { 
				arr[k] = Right[j]; 
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of Left[] if any */
		while (i < n1) { 
			arr[k] = Left[i]; 
			i++; 
			k++; 
		} 

		/* Copy remaining elements of Right[] if any */
		while (j < n2) { 
			arr[k] = Right[j]; 
			j++; 
			k++; 
		} 
	} 


} 

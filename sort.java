
public class sort {

	public void bubbleSortNormal(int [] arr){	
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i<n-1 ;i++ ) {
			for (int j=0 ;j <n-i-1 ;j++ ) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		display(arr);
	}

	public void bubbleSortOptimized(int [] arr){
		int n = arr.length;
		int temp = 0;
		boolean swap;
		for (int i = 0; i<n-1 ;i++ ) {
			swap = false;
			for (int j=0 ;j <n-i-1 ;j++ ) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if (swap == false) 
				break;
		}
		display(arr);
	}

	public void selectionSort(int [] arr){
		int n = arr.length;
		int min = 0;
		int temp = 0;
		for (int i=0; i<n-1; i++) {
			min = i;
			for (int j=i+1; j<n; j++ ) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		display(arr);
	}

	public void insertionSort(int [] arr){
		int n = arr.length;
		int key, j = 0;
		for (int i = 1; i< n ;i++ ) {
			key = arr[i];
			j = i-1;
			while(j >= 0 && arr[j] > key){
				System.out.println(" "+j+" "+key);
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		display(arr);
	}

	// TODO:- redo the merge part especially n1,n2
	public void merge_merge(int [] arr, int low, int mid, int high){
		System.out.println(low+" "+(mid)+" "+ high);
		int n1 = mid-low + 1;
		int n2 = high - mid;

		int [] left  = new int [n1];
		int [] right = new int [n2];

		for (int i=0; i<n1; i++ ) 
			left [i] = arr[low+i];
		for (int j=0; j<n2; j++)
			right [j] = arr[mid+1+j];
			
		int i = 0, j = 0, k = low;

		while(i<n1 && j<n2){
			if (left[i] <= right[i]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while(i < n1){
			arr[k] = left[i];
			i++;k++;
		}
		while(i < n1){
			arr[k] = right[j];
			j++;k++;
		}
	}
	public void merge_sort(int [] arr, int low, int high){
		int mid = 0;
		if (low < high) {
			mid = (low+high)/2;
			
			// System.out.println("L "+low+" "+mid);
			merge_sort(arr, low, mid);
			// System.out.println("R "+(mid+1)+" "+high);
			merge_sort(arr, mid+1, high);

			// System.out.println(low+" "+(mid)+" "+ high);
			merge_merge(arr, low, mid, high);
		}
	}


	public void display(int [] arr){
		for (int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// int [] arr = {2,5,10,1,3};
		int [] arr = {1,3,2,10,5,45,12};

		// Bubble sort
		// new sort().bubbleSortNormal(arr);
		// new sort().bubbleSortOptimized(arr);
		
		// Selection sort
		// new sort().selectionSort(arr);
		
		// Insertion sort
		// new sort().insertionSort(arr);

		// Merge sort
		new sort().merge_sort(arr, 0, arr.length-1);
	}

}
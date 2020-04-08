
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
		for (int i=0; i<n-1; i++ ) {
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

	public void display(int [] arr){
		for (int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// int [] arr = {2,5,10,1,3};
		int [] arr = {1,2,3,5,10};
		// new sort().bubbleSortNormal(arr);
		// new sort().bubbleSortOptimized(arr);
		// new sort().selectionSort(arr);
		new sort().insertionSort(arr);
	}

}
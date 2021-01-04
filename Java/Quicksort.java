public class Quicksort{
	public int partition(int[] arr, int low, int high){
		int i = low - 1;
		int pivot = arr[high];
		int temp = 0;

		for (int j = low; j < high; j++ ) {
			if (arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void sort(int[] arr, int low, int high){
		int pi = 0;
		if (low  < high) {
			System.out.println("low high "+low+" "+high);
			pi = partition(arr, low, high);
			System.out.println("low, pi-1 "+low+" "+(pi-1));
			sort(arr, low, pi-1);
			System.out.println("pi+1 high "+(pi+1)+" "+high);
			sort(arr, pi+1, high);
		}
	}


	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length - 1;
		
		new Quicksort().sort(arr, 0, n);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		
	}
}
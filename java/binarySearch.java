class binarySearch {
	
	public int search(int [] arr, int val){
		int high = arr.length -1;
		int low = 0;
		int mid = 0;
		for (int i=0; i < arr.length; i++ ) {
			mid = low + (high - low) / 2;
			if (arr[mid] > val)
				high = mid - 1;
			else if(arr[mid] < val)
				low = mid + 1;
			else 
				break;
		}
		return mid;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(new binarySearch().search(arr, 8));
	}
}
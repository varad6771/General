def partition(arr, low, high):
	pivot = arr[high]
	i = low - 1;
	for j in range(low, high):
		if arr[j] < pivot:
			i = i+1
			arr[i], arr[j] = arr[j], arr[i]

	arr[i+1], arr[high] = arr[high], arr[i+1]

	return i + 1


def sort(arr, low, high):
	if low < high:
		print("low, high ",low, high)
		pi = partition(arr, low, high)
		print("low, pi-1 ", low, pi-1)
		sort(arr, low, pi-1)
		print("pi+1, high ", pi+1, high)
		sort(arr, pi+1, high)


if __name__=="__main__": 
	arr = [10, 7, 8, 9, 1, 5] 
	sort(arr, 0, len(arr)-1)
	for i in range(len(arr)):
		print("%d"%arr[i])

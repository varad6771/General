def linear_search(arr,val):
	for i in range(len(arr)):
		if arr[i] is val:
			return i
	return -1

def binary_search(arr, val):
	low = 0;
	# high = arr[len(arr)-1]
	# print(len(arr)-1)
	high = len(arr)-1
	while low <= high:
		mid = low + (high-low) // 2;
		# print(mid)
		if arr[mid] > val:
			high = mid - 1
		elif arr[mid] < val:
			low = mid + 1
		else:
			return mid
	
	return -1


if __name__ == '__main__':
	arr = [1,2,4,5,6,9,16,23,44,89,232,577,666]
	val = 99	
	# op = linear_search(arr,val)
	op = binary_search(arr,val)
	print(op)
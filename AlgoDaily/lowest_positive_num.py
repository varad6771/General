def lowest_postive_num(arr):
	arr.sort()

	# using filter and lambda
	arr = list(filter(lambda x : x > -1, arr)) 
	# or  arr = [no for no in li if no >-1] -- list comprehension


	no = arr[0]
	while (no in arr):
		no += 1
	print(no)



if __name__ == '__main__':
	arr = list(map(int, input().rstrip().split()))
	lowest_postive_num(arr)
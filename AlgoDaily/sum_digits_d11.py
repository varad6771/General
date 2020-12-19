if __name__ == '__main__':
	val = int(input())
	while val > 9:
		data = list(map(int,str(val))) 
		val = sum (data)
	print(val)

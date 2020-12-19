#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the missingNumbers function below.
def missingNumbers(arr, brr):
	visited = -1;
	fr = []
	for i in range(0, len (brr)):
		count = 1
		for j in range(i+1, len (brr)):
			if brr[i] == brr[j]:
				count += 1
				fr[j] = visited

		if(fr[i] != visited):  
			fr[i] = count  
   
	for i in range(0, len(fr)):  	
		if(fr[i] != visited):  
				print("    " + str(arr[i]) + "    |    " + str(fr[i]));


if __name__ == '__main__':

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    m = int(input())

    brr = list(map(int, input().rstrip().split()))

    missingNumbers(arr, brr)
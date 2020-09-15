#!/bin/python3

import math
import os
import random
import re
import sys


def get_index(istring, idict):
	if istring in idict:
		
		



def match_strings(str1, str2):
	ctr = 0
	s2dict = dict()
	for i in range(len(str2)):
		s2dict[i] = str2[i]		

	# print(s2dict)
	for i in range(len(str1)):
		# print("str ",str1[i])
		if str1[i] in s2dict.values():
			ctr = ctr + 1

	if ctr == len(str1):
		return True
	else:
		return False

# Complete the sherlockAndAnagrams function below.
def sherlockAndAnagrams(inputs):
	idict = dict()
	odict = dict()
	val = tuple()
	k = 0
	tstr1 = ""
	length = len(inputs)

	# add string to dict
	for i in range(length):
		idict[i] = inputs[i]

	# for 1 value
	for i in range(length-1):
		for j in range(i+1, len(inputs)):
			if idict[i] is idict[j]:
				val = [i,j]
				odict[k] = val
				k = k+1

	# for 2 values
	for i in range(length-2):
		tstr = inputs[i:i+2]
		j = i+2
		for j in range(i+1, i+3):
			tstr1 += inputs[j] 
		
		# print(tstr, " ", tstr1)
		flag = match_strings(tstr, tstr1)
		tstr1 = ""
		if flag is True:
			odict[k] = [1,2]
			k = k + 1
	
	# for 3 values
	for i in range(length-3):
		tstr = inputs[i:i+3]
		j = i+2
		for j in range(i+1, i+4):
			tstr1 += inputs[j] 
		
		# print(tstr, " ", tstr1)
		flag = match_strings(tstr, tstr1)
		tstr1 = ""
		if flag is True:
			odict[k] = [1,2]
			k = k + 1
	
	print(odict)
	return len(odict)

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = sherlockAndAnagrams(s)
        print(result)
        # fptr.write(str(result) + '\n')

    # fptr.close()

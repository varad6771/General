#!/bin/python3

import math
import os
import random
import re
import sys


def encryption(istring):
	wlist = list()
	fstring = istring.replace(" " , "")
	sqrt = math.sqrt(len(fstring))
	rows = math.floor(sqrt)
	cols = math.ceil(sqrt)
	# print(sqrt," ", rows, " ", cols)
	matrix = list()
	k = 0
	for i  in range(rows):
		a = list()
		for j in range(cols):
			print(k, "", len(fstring))
			if k < len(fstring):
				a.append(fstring[k])
				k += 1
			else:
				a.append("")

		matrix.append(a)


	print(matrix)

	olist = list()
	ostr = ""

	i = 0
	j = 0
	for i in range(0, cols):
		for j in range(0, rows):
			ostr += matrix[j][i]
		olist.append(ostr)
		ostr = ""
	print(olist)

if __name__ == '__main__':
    s = input()
    encryption(s)

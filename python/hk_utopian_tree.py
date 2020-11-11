#!/bin/python3

import math
import os
import random
import re
import sys

def utopianTree(n):
	val = 1 
	if n == 0:
		return val
	else:
		for i in range(1,n+1):
			if i % 2 == 0:
				val = val + 1
			elif i % 2 == 1:
				val = 2 * val
	return val

if __name__ == '__main__':
    cases = int(input())

    for t_itr in range(cases):
        n = int(input())
        result = utopianTree(n)
        print(result)
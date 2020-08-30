#!/bin/python3

import math
import os
import random
import re
import sys


# def get_array(bval, arr):
#     arrlist = list()
#     arr.sort()

#     for i in range(len(arr)):
#         if not bval < arr[i]:
#             arrlist.append(arr[i])

#     return arrlist


# def get_cval(crr, a, b, oplist):
#     k = 0

#     while k < len(crr):
#         c = crr[k]
#         if not (b < a) and not (b < c):
#             tempstr = str(a)+"-"+str(b)+"-"+str(c)
#             oplist.append(tempstr)
#         k = k + 1


# def get_bval(brr, crr, a, oplist):
#     j = 0
#     while j < len(brr):
#         b = brr[j]
#         get_cval(crr, a, b, oplist)
#         j = j + 1

# optimized solution
def triplets(a, b, c):
    a = list(sorted(set(a)))
    b = list(sorted(set(b)))
    c = list(sorted(set(c)))
    
    ai = 0
    bi = 0
    ci = 0
    
    ans = 0
    
    while bi < len(b):
        while ai < len(a) and a[ai] <= b[bi]:
            print("a ",a[ai],"-",b[bi])
            ai += 1
            print("ai ", ai)
        
        while ci < len(c) and c[ci] <= b[bi]:
            print("c ",c[ci],"-",b[bi])
            ci += 1
        print("ci ", ci)


        ans += ai * ci
        bi += 1
    
    print(ans)
    return ans


if __name__ == '__main__':

    lenaLenbLenc = input().split()

    lena = int(lenaLenbLenc[0])

    lenb = int(lenaLenbLenc[1])

    lenc = int(lenaLenbLenc[2])

    arra = list(map(int, input().rstrip().split()))

    arrb = list(map(int, input().rstrip().split()))

    arrc = list(map(int, input().rstrip().split()))

    triplets(arra, arrb, arrc)

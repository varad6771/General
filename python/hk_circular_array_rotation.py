#!/bin/python3

import math
import os
import random
import re
import sys

# right shift - default of deque is right shift unless -ve val provided in rotations
def circularArrayRotation(arr, k, queries):
    iarr = deque(arr)
    iarr.rotate(k)

    oarr = list()
    for i in queries:
        oarr.append(iarr[i])
    return oarr

if __name__ == '__main__':
    nkq = input().split()

    n = int(nkq[0])
    k = int(nkq[1])
    q = int(nkq[2])

    arr = list(map(int, input().rstrip().split()))

    queries = []

    for _ in range(q):
        queries_item = int(input())
        queries.append(queries_item)
  
    circularArrayRotation(arr, k, queries)

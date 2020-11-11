#!/bin/python3

import math
import os
import random
import re
import sys
from collections import deque
# left shift - for using deque left must be converted  from right
# hence val is substracted from len - if val negative then left shift
def rotLeft(arr, rotations):
    alen = len(arr)
    # j = 0
    # while (j < rotations):
    #     temp = arr[0]
    #     for i in range(1, alen):
    #         arr[i-1] = arr[i]
    #     arr[alen-1] = temp
    #     j += 1
    # print(arr)
    alist = deque(arr)
    alist.rotate(alen-rotations)
    print(alist)
    
if __name__ == '__main__':

    # nd = input().split()
    # n = int(nd[0])
    d = int(input())
    # a = list(map(int, input().rstrip().split()))
    arr = [1,2,3,4,5]
    rotLeft(arr, d)


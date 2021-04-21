#!/bin/python3

import math


def encryption(istring):
    fstring = istring.replace(" ", "")
    sqrt = math.sqrt(len(fstring))
    rows = math.floor(sqrt)
    cols = math.ceil(sqrt)
    matrix = list()
    k = 0
    for i in range(rows):
        a = list()
        for j in range(cols):
            if k < len(fstring):
                a.append(fstring[k])
                k += 1
            else:
                a.append("0")
        matrix.append(a)

    i = 0
    j = 0
    while i < cols:
        while j < rows:
            print(j, " ", i, " ", matrix[j][i])
            j = j + 1
        i = i + 1


if __name__ == '__main__':
    s = input()
    encryption(s)

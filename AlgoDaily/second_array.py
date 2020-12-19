import math


# optimized
def second_array(arr):
    mult = math.prod(arr)
    olist = list()
    for no in arr:
        olist.append(mult // no)
    print(olist)


# brute force
def long_second_array(arr):
    olist = list()

    for i in range(len(arr)):
        val = arr[i]
        mult = 1
        for no in arr:
            if no != val:
                mult *= no
        olist.append(mult)
    print(olist)


if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))
    long_second_array(arr)

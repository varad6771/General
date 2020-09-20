def common_numbers(arr, brr):
    s1 = set()
    s2 = set()
    olist = list()
    for i in range(len(arr)):
        s1.add(arr[i])
    for i in range(len(brr)):
        s2.add(brr[i])

    s3 = s1.intersection(s2)
    for i in s3:
        olist.append(i)

    print (olist)

if __name__ == '__main__':

    n = int(input())
    arr = list(map(int, input().rstrip().split()))
    m = int(input())
    brr = list(map(int, input().rstrip().split()))
    common_numbers(arr, brr)

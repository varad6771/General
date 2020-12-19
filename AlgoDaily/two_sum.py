def two_sum(arr,k):
    data = dict()
    for no in arr:
        if (k-no) in data:
            print((k-no), no)
        data[no] = no
        

if __name__ == '__main__':
    k = int(input())
    arr = list(map(int, input().rstrip().split()))
    two_sum(arr, k)
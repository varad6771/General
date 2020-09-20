def fizz_buzz_func(arr):
    ostr = ""

    for val in arr:
        if val % 15 == 0:
            ostr += 'fizzbuzz'
        elif val % 5 == 0:
            ostr += 'buzz'
        elif val % 3 == 0:
            ostr += 'fizz'
        else:
            ostr += str(val)
    print (ostr)

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().rstrip().split()))
    fizz_buzz_func(arr)

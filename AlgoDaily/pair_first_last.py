def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

if __name__ == '__main__':
 	value = cons(3,4)
 	print(value)
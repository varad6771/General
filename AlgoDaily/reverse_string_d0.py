
def reverse_str(istring):
    dlist = list()
    ostr = ""
    for i in range(len(istring)):
        dlist.append(istring[i])
    
    for i in reversed(dlist): # default reverse function for list reversal - check if it works otherwise
        ostr = ostr + i


    # i = len(dlist)-1
    # while i >= 1:
        # ostr = ostr + dlist[i]
        # i = i - 1
    # ostr = ostr + dlist[0]
    # print(ostr)
    return ostr

if __name__ == '__main__':
        istring = input().strip()
        reverse_str(istring)

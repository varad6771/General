def character_rev(istr):
    tmplist = list()
    revtmplist = list()
    strlist = list()
    i = 0
    while i < len(istr):
        val = istr[i]
        if ( val >= 'a' and val <= 'z') or (val >= 'A' and val <= 'Z'):
            tmplist.append(val) 
            strlist.append('0')
        else:
            strlist.append(val)
        i = i + 1

    for i in reversed(tmplist): # default reverse function for list reversal - check if it works otherwise
        revtmplist.append(i)
    
    j = 0
    k = 0
    while k < len(istr):
        if strlist[k] == '0':
            strlist[k] = revtmplist[j]
            j = j + 1
        k = k + 1
    print(strlist)

if __name__ == "__main__":
    istr = input().strip()
    character_rev(istr)




# Notes
# if((ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z')): 
# use val >= ord(97) and val <= ord(122)  -- find out what ord means 

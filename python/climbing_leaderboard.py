#!/bin/python3


def add_element(val, olist):
    # if val not in olist:
    olist.append(val)

def climbing_leaderboard(ranked, player):
    olist = list()
    rlist = list()
    j = 2
    k = 0

    for i in range(len(ranked)):
        if ranked[i - 1] != ranked[i]:
            rlist.append(ranked[i])

    i = 0
    j = len(rlist) - 1
    while i < len(player):
        tempval = player[i]
        while j > 0:
            # print(j, " ", rlist[j], " ", rlist[j - 1], " ", tempval)
            if rlist[j] < tempval and rlist[j-1] > tempval:
                add_element(j+1, olist)
            elif tempval < rlist[len(rlist) - 1]:
                add_element(len(rlist) + 1, olist)
            elif tempval > rlist[0]:
                add_element(1, olist)
            elif  rlist[j] == tempval:
                add_element(j+1,olist)
            j = j - 1
        j = len(rlist) - 1
        i = i + 1

    print(olist)
    # print(rlist)
    # return olist    

if __name__ == '__main__':
    ranked_count = int(input().strip())
    ranked = list(map(int, input().rstrip().split()))
    player_count = int(input().strip())
    player = list(map(int, input().rstrip().split()))
    climbing_leaderboard(ranked, player)

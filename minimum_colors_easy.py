import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    n = lines[testcase * 2 + 1]
    a = lines[testcase * 2 + 2].split(" ")
    a = [int(x) for x in a]

    pastList = {}
    index = None
    for i in range(len(a)):
        if a[i] in pastList.keys():
            pastList[a[i]][1] = i
            
        else:
            pastList[a[i]] = [i, i]
    def calculateDif(x):
        return pastList[x][0] - pastList[x][1]
    orderedList = list(pastList.keys())
    orderedList.sort(key=calculateDif)
    
    for i in orderedList:
        if a[pastList[i][0]] == i and a[pastList[i][1]] == i:
            a[pastList[i][0]:pastList[i][1]] = [i for x in range(pastList[i][1] - pastList[i][0])]
    
    print(len(set(a)))


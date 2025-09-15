import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    f = lines[testcase * 1 + 1].split(" ")
    x = int(f[0])
    y = int(f[1])
    totalI = 0
    s = ""
    if x >= y:
        for i in range(y):
            s+= "01"
            s+= "10"
        for i in range(x-y):
            s+= "01"
    elif x < y:
        for i in range(x):
            s+= "10"
            s+= "01"
        for i in range(y-x):
            s+= "10"
    for i in range(len(s)):
        if i+1 < len(s) and s[i] != s[i+1]:
            totalI+=1

    print(totalI)
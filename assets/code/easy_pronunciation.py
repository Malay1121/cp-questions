import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    n = int(lines[testcase * 2 + 1])
    s = lines[testcase * 2 + 2]
    vowels = "aeiou"
    positions = []
    yes = True
    if len(s) <= 3:
        yes = True
        print("yes")
        continue
    
    for i, char in enumerate(s):
        if char in vowels:
            positions.append(i)
    
    if positions != []:
        
        if positions[0] >= 4:
            yes = False
        if (len(s) - 1) - positions[-1] >= 4:
            yes = False
    elif positions == []:
        if (len(s) >= 4):
            print("no")
            continue
    for i in range(len(positions) - 1):
        if (positions[i + 1] - positions[i] - 1 >= 4):
            yes = False
        
    if yes:
        print("yes")
    else:
        print("no")
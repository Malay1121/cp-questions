import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    a = lines[testcase * 5 + 2]
    b = list(lines[testcase * 5 + 4])
    c = list(lines[testcase * 5 + 5])
    word = a

    for i in range(len(c)):
        if c[i] == "D":
            word += b[i]
        else:
            word = b[i] + word
    print(word)
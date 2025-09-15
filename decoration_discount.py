import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    vasesString = lines[testcase * 2 + 2].split(" ")
    vases = [int(vase) for vase in vasesString]
    lowestPrice = None
    for vase in range(len(vases) - 1):
        price = vases[vase] + (vases[vase + 1] / 2)
        if (lowestPrice == None or lowestPrice > price):
            lowestPrice = price
    vases.sort()
    if (vases[0] + vases[1] < lowestPrice):
        lowestPrice = vases[0] + vases[1]
    print(int(lowestPrice))
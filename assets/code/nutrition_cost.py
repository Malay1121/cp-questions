import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    f = lines[testcase * 3 + 1].split(" ")
    a = [int(x) for x in lines[testcase * 3 + 2].split(" ")]
    b = [int(x) for x in lines[testcase * 3 + 3].split(" ")]
    c = int(f[1])
    n = int(f[0])
    max = 0
    dupe = {}
    for vit in range(n):
        if a[vit] not in dupe.keys():
            dupe[a[vit]] = b[vit]
        else:
            if dupe[a[vit]] > b[vit]:
                dupe[a[vit]] = b[vit]

    sorted_dict = sorted(dupe.items(), key=lambda item: item[1])
    sorted_dupe = sorted_dict.copy()

    for vit in sorted_dupe:
        y = 0
        for tempy in sorted_dict:
            y += tempy[1]
        calc = c * len(sorted_dict) - y
        if calc > max:
            max = calc
        sorted_dict.pop()
    print(max)

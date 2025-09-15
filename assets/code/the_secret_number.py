import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    n = int(lines[testcase * 1 + 1])
    final = []
    k = 0
    while True:
        k += 1
        d = 1 + 10 ** k
        if (d > n):
            break
        if (n % d == 0):
            final.append(n // d)
    final.sort()
    count = len(final)
    print(count)
    if count > 0:
        print(' '.join(map(str, final)))
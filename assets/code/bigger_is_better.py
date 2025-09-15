import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    f = lines[testcase * 2 + 1].split(" ")
    n = f[0]
    x = f[1]
    h = lines[testcase * 2 + 2].split(" ")
    h = [int(x) for x in h]
    h.sort(reverse=True)
    v = h.copy()
    minAttack = 0
    iterations = 0
    for health in v:

        if minAttack < health + int(x) * iterations:
            minAttack = int(x) * iterations + health
            h.pop(0)
        iterations += 1

    if (minAttack < v[0]):
        minAttack = v[0]
    finallist.append(minAttack)
for i in finallist:
    print("".join(map(str, str(i))))

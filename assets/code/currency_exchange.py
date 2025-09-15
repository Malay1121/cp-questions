import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    vasesString = lines[testcase + 1].split(" ")
    vases = [int(vase) for vase in vasesString]
    gold = vases[0]
    silver = vases[1]
    targetGold = vases[2]
    targetSilver = vases[3]


    if (gold == targetGold and silver == targetSilver):
        print("Yes")
    else:
        while gold != targetGold and silver != targetSilver:

            if gold > targetGold and silver < targetSilver:
                gold -= 1
                silver += 5
                if silver > targetSilver:
                    if gold - targetGold == silver - targetSilver:
                        print("Yes")
                    else:
                        print("No")
                    break
                else:
                    continue
            else:
                print("No")
                break

                
                
            if gold < targetGold and silver > targetSilver:
                gold += 1
                silver -= 5
                if gold > targetGold:
                    if silver - targetSilver == gold - targetGold:
                        print("Yes")
                    else:
                        print("No")
                    break
                else:
                    continue
            else:
                print("No")
                break

import sys
import math
input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
finallist = []
for testcase in range(testcases):
    f = [int(x) for x in lines[testcase + 1].split(" ")]
    N = f[0]
    A = f[1]
    B = f[2]
    C = f[3]
    D = f[4]

    max_total_coins = 0
    for k in range(N + 1):
        num_zeros = k
        num_ones = N - k

        coins_from_zeros = num_zeros * A
        coins_from_ones = num_ones * B
        coins_from_mixed_pairs = num_zeros * num_ones * max(C, D)

        current_total_coins = coins_from_zeros + coins_from_ones + coins_from_mixed_pairs
        
        max_total_coins = max(max_total_coins, current_total_coins)
    
    print(max_total_coins)

        
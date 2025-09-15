import sys

input_data = sys.stdin.read()
lines = input_data.splitlines()
testcases = int(lines[0])

for testcase in range(testcases):
    n = int(lines[testcase + 1])
    watermelons = n
    price = 0
    
    while watermelons > 0:
        x = 0
        while 3 ** (x + 1) <= watermelons:
            x += 1
        
        term_1 = 3 ** (x + 1)
        term_2 = x * (3 ** x // 3)
        
        watermelons -= 3 ** x
        price += term_1 + term_2

    print(price)

import sys

input_data = sys.stdin.read()
lines = input_data.splitlines()

testcases = int(lines[0])

for testcase in range(testcases):
    line_parts = lines[testcase + 1].split()
    n = int(line_parts[0])
    k = int(line_parts[1])

    ternary_digits = []
    temp_n = n
    while temp_n > 0:
        ternary_digits.append(temp_n % 3)
        temp_n //= 3
    
    min_deals = sum(ternary_digits)

    if min_deals > k:
        print(-1)
        continue

    current_cost = 0
    for i, digit in enumerate(ternary_digits):
        if digit > 0:
            if i == 0:
                cost_per_deal = 3
            else:
                cost_per_deal = pow(3, i + 1) + i * (pow(3, i) // 3)
            current_cost += digit * cost_per_deal

    extra_deals = k - min_deals
    
    for i in range(len(ternary_digits) - 1, 0, -1):
        if extra_deals == 0:
            break

        num_can_break = extra_deals // 2
        num_have = ternary_digits[i]
        num_to_break = min(num_have, num_can_break)
        
        if num_to_break > 0:
            cost_saving = pow(3, i - 1)
            current_cost -= num_to_break * cost_saving
            
            extra_deals -= num_to_break * 2

            ternary_digits[i] -= num_to_break
            ternary_digits[i-1] += num_to_break * 3
            
    print(current_cost)
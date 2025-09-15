import sys
import math

input_data = sys.stdin.read()

lines = input_data.splitlines()
testcases = int(lines[0])
current_line = 1 
for testcase_num in range(testcases):
    f = lines[current_line].split(" ")
    N = int(f[0])
    K = int(f[1])
    current_line += 1
    A = [int(x) for x in lines[current_line].split(" ")]
    current_line += 1

    first_idx = [N + 1] * (K + 1)
    last_idx = [0] * (K + 1)

    for i in range(N):
        val = A[i]
        pos = i + 1 
        first_idx[val] = min(first_idx[val], pos)
        last_idx[val] = max(last_idx[val], pos)

    dp_suffix = [[0, 0] for _ in range(K + 1)]

    dp_suffix[K][0] = 0
    dp_suffix[K][1] = 0

    for i in range(K - 1, 1, -1):
        cost1_0 = abs(first_idx[i+1] - first_idx[i]) + dp_suffix[i+1][0]
        cost2_0 = abs(last_idx[i+1] - first_idx[i]) + dp_suffix[i+1][1]
        dp_suffix[i][0] = min(cost1_0, cost2_0)

        cost1_1 = abs(first_idx[i+1] - last_idx[i]) + dp_suffix[i+1][0]
        cost2_1 = abs(last_idx[i+1] - last_idx[i]) + dp_suffix[i+1][1]
        dp_suffix[i][1] = min(cost1_1, cost2_1)

    cost_for_B1_at_p = [float('inf')] * (N + 1) 

    for i in range(N):
        if A[i] == 1:
            p = i + 1 
            if K == 1:
                cost_for_B1_at_p[p] = 0
            else:
                path_cost_from_p_to_f2 = abs(first_idx[2] - p) + dp_suffix[2][0]
                path_cost_from_p_to_l2 = abs(last_idx[2] - p) + dp_suffix[2][1]
                cost_for_B1_at_p[p] = min(path_cost_from_p_to_f2, path_cost_from_p_to_l2)
    
    min_term_left = [float('inf')] * (N + 1)
    current_min_left_offset = float('inf')
    for S in range(1, N + 1):
        if cost_for_B1_at_p[S] != float('inf'):
            current_min_left_offset = min(current_min_left_offset, cost_for_B1_at_p[S] - S)
        min_term_left[S] = current_min_left_offset + S

    min_term_right = [float('inf')] * (N + 1)
    current_min_right_offset = float('inf')
    for S in range(N, 0, -1):
        if cost_for_B1_at_p[S] != float('inf'):
            current_min_right_offset = min(current_min_right_offset, cost_for_B1_at_p[S] + S)
        min_term_right[S] = current_min_right_offset - S
    
    results = []
    for S in range(1, N + 1):
        ans_s = min(min_term_left[S], min_term_right[S])
        results.append(str(ans_s))
    print(" ".join(results))
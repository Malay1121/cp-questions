def solve():
    T = int(input())  # Read number of test cases
    for _ in range(T):
        N = int(input())  # Length of the restaurant name
        A = input()  # Competing restaurant's name
        
        # Attempt to find a valid name for Chef's restaurant
        # Step 1: Try to generate the smallest lexicographically larger string than A
        name = list(A)  # Convert to list for easy modification
        
        # Try to increment the name from the last character
        for i in range(N - 1, -1, -1):
            if name[i] != 'z':
                name[i] = chr(ord(name[i]) + 1)
                # Fill the rest with 'a' to ensure lexicographical correctness
                for j in range(i + 1, N):
                    name[j] = 'a'
                break
        
        # If we couldn't generate a valid name because A is "z...z", output -1
        if name == ['z'] * N:
            print(-1)
            continue
        
        # Step 2: Check if the reverse of the generated name is also larger
        name_str = ''.join(name)
        reversed_name_str = name_str[::-1]
        
        if name_str > A and reversed_name_str > A:
            print(name_str)
        else:
            print(-1)


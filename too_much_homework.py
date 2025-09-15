input = input()

splitted_input = input.split()
x = int(splitted_input[0])
y = int(splitted_input[1])

if x + y*10>= 100:
    print("YES")
else:
    print("NO")
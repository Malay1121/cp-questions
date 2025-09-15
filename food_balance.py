input = input()

splitted_input = input.split()
f1 = int(splitted_input[0])
p1 = int(splitted_input[1])
f2 = int(splitted_input[2])
p2 = int(splitted_input[3])

dif1 = abs(f1 - p1)
dif2 = abs(f2 - p2)
if dif1 == dif2:
    print("Both")
elif dif1 < dif2:
    print("First")
else:
    print("Second")
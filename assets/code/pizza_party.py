import math
input = input()

splitted_input = input.split()
a = int(splitted_input[0]) + 1
b = int(splitted_input[1])

slices = a * 4 + b * 3
pizzas = slices / 8
print(math.ceil(pizzas))
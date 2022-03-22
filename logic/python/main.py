a, b, c, d = 10, 1, 10, 30

# Displaying a, b, c
print(f'a = {a}')
print(f'b = {b}')
print(f'c = {c}')
print(f'd = {d}')

# using logical OR to verify
# two constraints
if a > b or c == d:
    print('One or both the conditions are true')
else:
    print('Both the' + ' conditions are false')

# Using logical NOT operator
print(f'!(a < b) = {not (a < b)}')
print(f'!(a > b) = {not (a > b)}')

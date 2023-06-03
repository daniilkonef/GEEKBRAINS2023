def get(x: int, y: int):
    return tuple([x + y, x - y, x / y])


x = 1
y = 2

result = get(x, y)
summa, diff, divide = get(x, y)

x1, x2 = 1, 4

print(result)
print(*result)
print(summa, diff, divide)

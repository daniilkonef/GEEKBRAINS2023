xyz: int = int(input("Введите трехзначное число: "))  # 123
z = xyz % 10  # 3
# print(z)
yz = xyz // 10  # 12
# print(yz)
y = yz % 10  # 2
# print(y)
x = xyz // 100
# print(x)

print(x+y+z)
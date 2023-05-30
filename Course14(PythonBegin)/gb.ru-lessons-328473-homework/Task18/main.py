# import random


N: int = int(input("Задайте, сколько нужно чисел в массиве?: "))
list_of_int = list()
X: int = 0

for i in range(N):
    # print(f"i={i}")
    list_of_int.append(int(input()))
    if i == N - 1:
        print(f"Теперь введите число, для которого нужно найти самое близкое число в массиве {list_of_int}: ")
        X = int(input())

# N: int = int(input("Задайте, сколько нужно чисел в массиве?: "))
# X: int = 5
# list_of_int = list(random.randint(1, 99) for i in range(N))

if X in list_of_int:
    print(f"X={X} успешно найден в массиве {list_of_int}")
elif X + 1 in list_of_int:
    print(f"Наиболее близким числом к {X} оказалось число X={X + 1} в массиве {list_of_int}")
elif X - 1 in list_of_int:
    print(f"Наиболее близким числом к {X} оказалось число X={X - 1} в массиве {list_of_int}")
else:
    min_list = list()
    for i in list_of_int:
        # print(f"abs(i-X)={abs(i-X)}")
        min_list.append(abs(i - X))
        # print(f"index {min_list.index(min(min_list))}")
        index = min_list.index(min(min_list))
    print(f"Наиболее близким числом к {X} оказалось число {list_of_int[index]} в массиве {list_of_int}")

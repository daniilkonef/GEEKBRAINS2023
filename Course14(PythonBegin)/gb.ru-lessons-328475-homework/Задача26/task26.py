# Задача 26:  Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
# *Пример:*
# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8

# def recursory(A=5) -> int:
#     if A == 0: return 0
#     else:
#         print(A)
#         recursory(A-1)

# recursory() # это невероятно!!! я впервые сходу написал рабочую рекурсивную функцию!!!!

# def recursory_v2(A, end):   # офигеть!!! я написал рекурсорную функцию принимающую два аргумента!! и восходящего типа!!!
#     if A > end:
#         return
#     else:
#         print(A)
#         recursory_v2(A+1, end)
#
# recursory_v2(5,12)

# def recursory(basis, power, answer=1) -> int:
#     if power == 0:
#         return answer
#     if power > 0:
#         answer = answer * basis
#         print(f"answer={answer}")
#         print(f"power={power}")
#         recursory(basis, power-1, answer)
#
#
# print( recursory(2,2) )
# # print( recursory(3,5) )


def mypower(base, exp) -> int:
    if exp == 0:
        return 1
    if exp == 1:
        return base
    if exp != 1:
        return base * mypower(base, exp - 1)


print(f"Мое_возведение={mypower(2, 3)}")
print(f"Мое_возведение={mypower(3, 3)}")
print(f"Мое_возведение={mypower(2, 8)}")




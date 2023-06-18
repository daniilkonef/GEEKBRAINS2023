# sp1 = ['1', '2', '3', '4', '5']
# sp2 = map(int, sp1)
# print(list(sp2))
#
# sp4 = [1, 2, 3, 4, 5]
# sp3 = map(lambda x: x * x, sp4)
# sp5 = list(sp3)
# print(sp5)
#
# print(list(filter(lambda x: x % 2 == 0, sp5)))
#
#
# def sqr(x):
#     return x * x
#
#
# sp6 = map(sqr, sp4)
# print("sp6=", list(sp6))
#
# sp7 = [x * x for x in range(1, 7)]
# print("sp7=", sp7)
#
# sp8 = [x * x for x in sp4]
# print("sp8=", sp8)
#
# sp9 = [x * x for x in range(1, 7) if x % 2 == 0]
# print("sp9=", sp9)
#
# res = map(lambda x: x * 2, "qwerty")  # так тоже можно
# sp10 = input().split()  # получу список если введу знаения через проблем в одноу строку
# sp11 = map(int, input().split())  # а тут все строковые элементы превратятся легко в числа
# sp12 = [int(i) for i in input().split()]

orbits = [(1, 3), (1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
# print((orbits[0]) == orbits[1])
lst_without = [i for i in orbits if i[0] != i[1]]
print(lst_without)
# print(orbits[1][0])
lst_sqr = [3.14 * x[0]*x[1] for x in lst_without]
print(lst_sqr)
max_sqr = max(lst_sqr)
print(lst_without[lst_sqr.index(max_sqr)])


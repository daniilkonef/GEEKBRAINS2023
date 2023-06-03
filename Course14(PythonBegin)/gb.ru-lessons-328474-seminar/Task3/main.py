import random

mylist = list(random.randint(1, 20) for i in range(10))
print(mylist)
print( len(mylist) )
print( set(mylist) )
print( len(set(mylist)) )

# x1, x2 = 1, "d"
# print(type(x1) )
# print(type(x2) )
print(f"Удалено {len(mylist) - len(set(mylist))}")
qwerty: int = int(input("Введите 6-значное число: "))  # 385916
y = qwerty % 10  # 6
qwert = qwerty//10  # 38591

t = qwert % 10  # 1
qwer = qwert//10  # 3859

r = qwer % 10  # 9
qwe = qwer // 10  # 385

e = qwe % 10  # 5
qw = qwe // 10  # 38

w = qw % 10  # 8
q = qw // 10  # 3

if (q+w+e)==(r+t+y): print("Ура! Это счастливый билет!")
else: print("Печаль! Это не счастливый билет!")
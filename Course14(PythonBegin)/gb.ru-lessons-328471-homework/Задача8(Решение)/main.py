horizontal_bars: int = 3  # плиток в горизонталь
vertical_bars: int = 2  # плиток в вертикаль
wanted_bars: int = 7  # плиток хотим отломить
total_bars: int = horizontal_bars * vertical_bars

if wanted_bars < total_bars:
    if wanted_bars % vertical_bars == 0: print(f"Можно отломить {wanted_bars} плитки;")
    elif wanted_bars % horizontal_bars == 0: print(f"Можно отломить {wanted_bars} плитки;")
    else: print(f"Нельзя так ломать шоколадку;")
if wanted_bars >= total_bars: print(f"Вы отобрали всю шоколадку;")

# 3x2   4 -> yes
# То есть количество кусочков должно быть кратно или длине или ширине шоколадки,
# и при этом не превышать количество плиток.
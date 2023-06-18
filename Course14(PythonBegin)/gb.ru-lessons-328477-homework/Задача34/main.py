# Задача 34: Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм. Поскольку разобраться в его кричалках не
# настолько просто, насколько легко он их придумывает, Вам стоит написать программу. Винни-Пух считает, что ритм есть,
# если число слогов (т.е. число гласных букв) в каждой фразе стихотворения одинаковое. Фраза может состоять из одного
# слова, а если во фразе имеется несколько слов, то они разделяются дефисами. Фразы отделяются друг от друга пробелами.
# Стихотворение  Винни-Пух вбивает в программу с клавиатуры. В ответе напишите “Парам пам-пам”,
# если с ритмом все в порядке и “Пам парам”, если с ритмом все не в порядке
#
# *Пример:*
# **Ввод:** пара-ра-рам рам-пам-папам па-ра-па-да // это 3 фразы, 2 фразы из 3 слов, 1 фраза изз 4 слов.
# **Вывод:** Парам пам-пам

def get_count_of_char_a_in_the(word: str) -> int:
    count = int(0)
    for char in word:
        # print(char)
        if str(char) == str("а"):
            count += 1
    return count


poetry = "пара-ра-рам рам-пам-папам па-ра-па-да"  # Поэзия https://translate.google.ru/?hl=ru&tab=TT&sl=en&tl=ru&text=poetry&op=translate
phrases = poetry.split()  # print(len(phrases)).
variety = list()  # разнообразие https://translate.google.ru/?hl=ru&tab=TT&sl=en&tl=ru&text=variety&op=translate

print("Анализ стиха Винни-Пуха:")
for index, phrase in enumerate(phrases, 1):
    print(f"Фраза {index}: {phrase}; содержит {get_count_of_char_a_in_the(phrase)} буквы а;")
    variety.append(get_count_of_char_a_in_the(phrase))
if len(set(variety)) > 1:
    print("Итог: Пам парам :-/")  # print("нет бита")
else:
    print("Итог: Парам пам-пам! :-)")  # print("есть бит")

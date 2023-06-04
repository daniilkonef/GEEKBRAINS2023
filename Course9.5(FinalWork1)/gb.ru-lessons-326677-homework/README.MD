
# Итоговая контрольная работа по основному блоку
> [!NOTE]
> Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк, длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.

[Источник задачи](https://gb.ru/lessons/326677/homework "https://gb.ru/lessons/326677/homework")
## Решение (программный код и комментарии)


### Задаю массив как вы и сказали на старте:
    array1 = list("либо задать на старте выполнения алгоритма".split())  
### Вывожу массив, чтобы посмотреть на него что там получилось:
    print(array1)   
### Создаю новый массив, в который положу результаты преобразований:
    array2 = list()     

### Запускаю цикл по каждому слову в массиве:
    for one_string in array1:      
        array2.append(one_string[0:3])  # беру каждое слово из массива и делаю ему срез от нуля до трех символов как сказано непонятном условии задачи и кладу в новый массив
### Вывожу новый он же второй массив чтобы посмотреть что получилось:
    print(array2)       


[Справка 1 ](https://texterra.ru/blog/ischerpyvayushchaya-shpargalka-po-sintaksisu-razmetki-markdown-na-zametku-avtoram-veb-razrabotchikam.html "https://texterra.ru/blog/ischerpyvayushchaya-shpargalka-po-sintaksisu-razmetki-markdown-na-zametku-avtoram-veb-razrabotchikam.html")

[Справка 2 ](https://learn.microsoft.com/ru-ru/contribute/how-to-write-links "https://learn.microsoft.com/ru-ru/contribute/how-to-write-links")

[Справка 3 ](https://ru.wikipedia.org/wiki/Markdown "https://ru.wikipedia.org/wiki/Markdown")
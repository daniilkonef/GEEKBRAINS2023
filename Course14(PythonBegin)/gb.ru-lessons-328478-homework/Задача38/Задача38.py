from core import find_record_in

database: str = "database.txt"


def show_all_contacts():
    memory = list()
    with (open(database, 'r', encoding="utf-8")) as db:
        for line in db:
            data = line.replace(";", " ")
            memory.append(line.strip())
            print(data, end="")
    # print()
    # print(len(memory))


def get_size_of_database():
    memory = list()
    with (open(database, 'r', encoding="utf-8")) as db:
        for line in db:
            memory.append(line.strip())
    print()
    # print(len(memory))
    return len(memory)


def get_virtual_database() -> list:
    memory = list()
    with (open(database, 'r', encoding="utf-8")) as db:
        for line in db:
            memory.append(line.strip())
    return memory


def search_record():
    pass


def add_new_contact():
    id_number = get_size_of_database() + 1

    firstname = input("Введите Имя: ")
    last_name = input("Введите Фамилию: ")
    patronymic = input("Введите Отчество: ")
    phone_number = input("Введите номер телефона: ")
    splitter = str(";")
    new_record = str(
        id_number) + splitter + firstname.strip() + splitter + last_name.strip() + splitter + patronymic.strip() + splitter + phone_number.strip()
    with open(database, "a", encoding="utf-8") as db:
        db.write(new_record + "\n")


# def show_all_records():
#     with open(database, 'r', encoding='utf-8') as f:
#         for line in f:
#             print(*line.strip().split(';'))


# def search_record(num_col, val):
#     with open(file_path, 'r', encoding='utf-8') as f:
#         for line in f:
#             lst = line.strip().split(';')
#             if lst[num_col - 1].lower() == val.lower():
#                 print(*lst)
#                 return
#     print(f'{val} не нашел')


# def add_contact(lst):
#     with open(file_path, 'a', encoding='utf-8') as f:
#         print(';'.join(lst), file=f)


def main():
    # print(get_virtual_database())

    print("ТЕЛЕФОННЫЙ СПРАВОЧНИК")
    print("Выберите действие: \n"
          "1 - Показать все контакты; \n"
          "2 - Найти контакт; \n"
          "3 - Добавить контакт: \n"
          "Введите цифру и нажмите Enter: ")

    user_selected_is = int(input())
    if user_selected_is == 1:
        show_all_contacts()

    if user_selected_is == 2:
        find_record_in(get_virtual_database(), str(input("Введите что ищем: ")))

    if user_selected_is == 3:
        add_new_contact()


main()

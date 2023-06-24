# database = ['1;Конев;Дан;Ник;+7984156584654',
#             '2;Ивано;Иван;Никол;+7968165215',
#             '3;Ингви;Джей;Мальмстин;+198652338',
#             '4;Брайян;Джонсон;ACDC;+198652338',
#             '5;Джо;Ди;Майо;+16916988484']
#
# 
# print(len(database))

def find_record_in(database, what_im_looking_for: str):
    for i in range(len(database)):
        one_record = database[i].split(";")
        id_number = (int(one_record[0]))
        last_name = (str(one_record[1]))
        first_name = (str(one_record[2]))
        patronymic = (str(one_record[3]))
        phone_num = (str(one_record[4]))

        if what_im_looking_for in one_record:
            # print(one_record)
            print(f"ID: {id_number}, \t Фамилия: {last_name}, \tИмя: {first_name}, \t Отчество: {patronymic}, \t\tТелефон: {phone_num};")


# find_record_in(database, "Конев")
# find_record_in(database, "Ивано")
# find_record_in(database, "Ингви")

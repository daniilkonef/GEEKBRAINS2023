DROP DATABASE IF EXISTS lesson_2;
CREATE DATABASE lesson_2; #создание базы данных
USE lesson_2; #обращаемся к созданной БД
DROP TABLE IF EXISTS films;
CREATE TABLE films (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    title VARCHAR(45) NOT NULL,
    title_eng VARCHAR(45) NOT NULL,
    year_movie YEAR NOT NULL,
    count_min INT NOT NULL,
    storyline TEXT);
INSERT INTO films (title, title_eng, year_movie, count_min, storyline)
VALUES 
('Игры разума', 'A Beautiful Mind', 2001, 135, 'От всемирной известности до греховных глубин — все это познал на своей шкуре Джон Форбс Нэш-младший. Математический гений, он на заре своей карьеры сделал титаническую работу в области теории игр, которая перевернула этот раздел математики и практически принесла ему международную известность. Однако буквально в то же время заносчивый и пользующийся успехом у женщин Нэш получает удар судьбы, который переворачивает уже его собственную жизнь.'),
('Форрест Гамп', 'Forrest Gump', 1994, 142, 'Сидя на автобусной остановке, Форрест Гамп — не очень умный, но добрый и открытый парень — рассказывает случайным встречным историю своей необыкновенной жизни. С самого малолетства парень страдал от заболевания ног, соседские мальчишки дразнили его, но в один прекрасный день Форрест открыл в себе невероятные способности к бегу. Подруга детства Дженни всегда его поддерживала и защищала, но вскоре дороги их разошлись.'),
('Иван Васильевич меняет профессию', 'Ivan Vasilievich', 1998, 128,'Инженер-изобретатель Тимофеев сконструировал машину времени, которая соединила его квартиру с далеким шестнадцатым веком - точнее, с палатами государя Ивана Грозного. Туда-то и попадают тезка царя пенсионер-общественник Иван Васильевич Бунша и квартирный вор Жорж Милославский. На их место в двадцатом веке «переселяется» великий государь. Поломка машины приводит ко множеству неожиданных и забавных событий...'),
('Назад в будущее', 'Back to the Future', 1985, 116, 'Подросток Марти с помощью машины времени, сооружённой его другом-профессором доком Брауном, попадает из 80-х в далекие 50-е. Там он встречается со своими будущими родителями, ещё подростками, и другом-профессором, совсем молодым.'),
('Криминальное чтиво', 'Pulp Fiction', 1994, 154, NULL);

-- жанры
DROP TABLE IF EXISTS genres;
CREATE TABLE genres (
	id SERIAL PRIMARY KEY, -- SERIAL = BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE
	name VARCHAR(100) NOT NULL
);

-- актеры
DROP TABLE IF EXISTS actors;
CREATE TABLE actors (
	id SERIAL PRIMARY KEY, -- SERIAL = BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE
	firstname VARCHAR(100) NOT NULL ,
	lastname VARCHAR(100) COMMENT 'Фамилия' -- COMMENT на случай, если имя неочевидное
);
-- переименование таблиц
RENAME TABLE films to movies;
-- добавление столбца
ALTER TABLE movies 
ADD COLUMN status_active VARCHAR(25);
-- удаление столбца
ALTER TABLE movies
DROP COLUMN status_active;
-- удаление таблицы
#DROP TABLE movies;
#TRUNCATE TABLE movies; -- очищение таблицы
-- добавляем столбец и дописываем информацию
ALTER TABLE movies
ADD COLUMN age_category CHAR(1);
-- присвоение фильмам категорий 
UPDATE movies SET age_category='П' WHERE id=1;
UPDATE movies SET age_category='Д' WHERE id=4;
UPDATE movies SET age_category='В' WHERE id=5;

SELECT 
id AS 'номер фильма',
title AS 'название фильма',
CASE age_category
WHEN 'П' THEN 'Подростковая'
WHEN 'Д' THEN 'Детская'
WHEN 'В' THEN 'Взрослая'
ELSE 'Не указана'
END
AS 'категория'
FROM movies;

-- изменение продолжительности фильмов 
UPDATE movies SET count_min = 88 WHERE id=2;
UPDATE movies SET count_min = 46 WHERE id=3;
UPDATE movies SET count_min = 34 WHERE id=4;

UPDATE movies SET count_min = 100 WHERE id=2;

SELECT 
id AS 'номер фильма',
title AS 'название фильма',
CASE 
WHEN count_min < 50 THEN 'короткометражный'
WHEN count_min BETWEEN 50 AND 100 THEN 'среднеметражный'
WHEN count_min > 100 THEN 'полнометражный'
ELSE 'не определено'
END
AS 'тип фильма'
FROM movies;

-- функция IF()
-- IF( condition, [value_if_true], [value_if_false] )

-- Если 100<200, то печатаем 'Да'; иначе - 'Нет'

SELECT IF(100<200, 'Да', 'Нет') AS Result;

SELECT 
	id AS 'Номер фильма',
	title AS 'Название фильма',
	count_min AS 'Продолжительность',
	IF (count_min < 50, 'Короткометражный фильм', 
		IF (count_min BETWEEN 50 AND 100, 'Среднеметражный фильм', 
			IF (count_min > 100, 'Полнометражный фильм', 'Не определено')  
			)
		) AS 'Тип'	
FROM movies;
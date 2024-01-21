DROP DATABASE IF EXISTS lesson_1;
CREATE DATABASE lesson_1; #создание базы данных
USE lesson_1; #обращаемся к созданной БД
CREATE TABLE students(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name_student VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    phone BIGINT UNSIGNED)
    ;
CREATE TABLE teachers(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name_teacher VARCHAR(45) NOT NULL,
    post VARCHAR(50) NOT NULL)
    ;
CREATE TABLE courses(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name_course VARCHAR(45) NOT NULL,
    name_teacher VARCHAR(45) NOT NULL,
    name_student VARCHAR(45) NOT NULL)
    ;
INSERT INTO students (name_student, email, phone)
VALUES 
('Миша', 'misha@mail.ru', 9876543221),
('Антон', 'anton@mail.ru', 9876543222),
('Маша', 'masha@mail.ru', 9876543223),
('Паша', 'pasha@mail.ru', 9876543224);	

INSERT INTO teachers (name_teacher, post)
VALUES 
('Иванов И.И.', 'Профессор'),
('Петров П.П.', 'Преподаватель'),
('Сидоров С.С.', 'Доцент');

INSERT INTO courses (name_course, name_teacher, name_student)
VALUES 
('БД', 'Иванов И.И.', 'Миша'),
('PHP', 'Петров П.П.', 'Антон'),
('Аналитика', 'Сидоров С.С.', 'Маша');

SELECT * FROM students, teachers, courses;
SELECT * FROM students WHERE name_student LIKE 'Антон';
SELECT name_student, email FROM students;
SELECT * FROM students WHERE name_student LIKE 'А%'; #вывести всех студентов с именем на букву А

DROP TABLE IF EXISTS workers;
CREATE TABLE workers (
    id INT  NOT NULL, 
    name_worker VARCHAR(45),
    dept VARCHAR(100) COMMENT 'Подразделение', -- COMMENT на случай, если имя неочевидное,
    salary INT,
    PRIMARY KEY(id)
);

INSERT INTO workers (id, name_worker, dept, salary)
VALUES 
(100, 'AndreyEx', 'Sales', 5000),
(200, 'Boris', 'IT', 5500),
(300, 'Anna', 'IT', 7000),
(400, 'Anton', 'Marketing', 9500),
(500, 'Dima', 'IT', 6000),
(501, 'Maxs', 'Accounting', NULL);

SELECT * FROM workers WHERE salary > 6000;
SELECT * FROM workers WHERE dept = 'IT';
SELECT * FROM workers WHERE dept != 'IT';
SELECT * FROM workers WHERE dept <> 'IT';
SELECT * FROM workers WHERE dept NOT LIKE 'IT';
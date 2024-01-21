DROP DATABASE IF EXISTS lesson4;
CREATE DATABASE lesson4;
USE lesson4;
DROP TABLE IF exists fruits;
CREATE TABLE fruits (
	id INT AUTO_INCREMENT PRIMARY KEY,
    names VARCHAR(55)
);

INSERT INTO fruits (names) VALUES ("apple"), ("banana"), ("lemon"), ("watermelon"), ("orange");
SELECT * FROM fruits;
CREATE TABLE fruits_backup_1 AS SELECT * FROM fruits; 
CREATE TABLE fruits_backup_2 AS SELECT * FROM fruits; 
SELECT * FROM fruits JOIN fruits_backup_1 ON fruits.names = fruits_backup_1.names;
SELECT * FROM fruits JOIN fruits_backup_1 ON fruits.names = fruits_backup_1.names ORDER BY fruits.names; -- сортировка по алфавиту получилась

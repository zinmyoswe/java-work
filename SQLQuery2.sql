CREATE DATABASE CRUD_News
GO

USE CRUD_News
go

CREATE TABLE News(
	id INT IDENTITY(1,1) PRIMARY KEY,
	title VARCHAR(200) NOT NULL,
	date DATETIME,
	description VARCHAR(1000)NOT NULL,
	detail TEXT NOT NULL,
	category varchar(100) not null,
	image text not null
)

select * from news
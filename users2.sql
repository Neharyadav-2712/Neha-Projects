use startersql;
create table users2
(
id int auto_increment primary key,
name varchar(50),
email varchar(50)
);

insert into users2(name, email) values
('Neha','Neha123@gmail.com'),('Swati','Swati123@gmail.com'),
('Naveen','Naveen123@gmail.com'),('Kaustubh','Swati123@gmail.com');

select * from users2;
-- drop table users2;





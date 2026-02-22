create database Nehu;
use nehu;
create table users
(
id int auto_increment primary key,
name varchar(50) not null,
email varchar(50) unique not null,
gender enum('Male','Female','Others'),
date_of_birth date,
salary int,
created_at timestamp default current_timestamp,
is_active boolean
);

rename table users to swati;
select * from swati;
rename table swati to users;
select name , id from users;
alter table users add column is_deactive boolean default false;
alter table users drop column is_deactive;
alter table users drop column is_active;
alter table users modify column name varchar(100);
alter table users modify column email varchar(50) after id;
select * from users;
alter table users modify column id int first;




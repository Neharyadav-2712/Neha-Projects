create database startersql;
use startersql;
create table users
(
id INT auto_increment primary key,
name varchar(50) not null,
email varchar(50) unique not null,
gender enum('Male', 'Female', 'Other'),
date_of_birth date,
salary Int,
created_at timestamp default current_timestamp,
is_active boolean
);
select * from users;
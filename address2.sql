-- use startersql;
-- create table address2
-- (
-- id int auto_increment primary key,
-- user_id int,
-- city varchar(50),
-- state varchar(50),
-- constraint for_user foreign key(user_id) references users2(id) on delete cascade
-- );

insert into address2(user_id, city, state) values
('1','Mysore','MH'),('2','Amravati','UP'),
('3','khamgaon','KA'),('4','Nagar','MP');

-- select * from address2;
 -- drop table address2;
 
 select * from address2;
 select * from  users2;
 
 select users2.name, address2.city
 from users2 
 inner join address2 on users2.id = address2.user_id;

 create table admin_users
 (
  id int auto_increment primary key,
  name varchar(50),
  email varchar(40),
  gender enum('Male','Female','Other'),
  date_of_birth date,
  salary int
 );
 
INSERT INTO admin_users (name, email, gender, date_of_birth, salary) VALUES
('Rahul Sharma', 'rahul@gmail.com', 'Male', '1995-06-15', 50000),
('Neha Patil', 'neha@gmail.com', 'Female', '1998-03-22', 45000),
('Amit Verma', 'amit@gmail.com', 'Male', '1992-11-05', 60000),
('Priya Singh', 'priya@gmail.com', 'Female', '1997-01-18', 48000),
('Alex Roy', 'alex@gmail.com', 'Other', '1994-09-30', 52000);

insert into users2 (id, name, email) values
('5', 'Neha Patil', 'neha@gmail.com');

select * from users2;
select * from admin_users;

select name from users2
union all
select name from admin_users;

select name, email from users2
union all
select name, email from admin_users;

-- drop table admin_users;

select name  from admin_users
union all
select email from users2
order by name;
  
select * from users2;
select * from admin_users;

alter table users2 
add column referred_by_id int;

update users2 set referred_by_id = 1 where id in(2,3);
update users2 set referred_by_id = 2 where id =4;
update users2 set referred_by_id = 4 where id in(1,5);

select 
a.id,
a.name as user_name,
b.name as referred_by
from users2 a
right join users2 b on a.referred_by_id = b.id;


select * from users2;

select
a.id,
a.name as user_name,
b.name as referred_by_name
from users2 a
left join users2 b on a.referred_by_id = b.id;







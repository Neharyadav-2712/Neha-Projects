use startersql;
drop table users1;
create table users1
(
id int auto_increment primary key,
name varchar(100) unique
);
insert into users1 (name) values ('neha'),('swati'),('kajal'),('piku'),('manu');
-- drop table address1;
use startersql;
create table address1
(
id int auto_increment primary key,
user_id int,
city varchar(100),
constraint fk_user Foreign key(user_id) references users1(id) on delete cascade
);
-- insert into address1 (city) values ('2','Mumabai'),('4','Delhi'),('3','Nagpur'),('1','Kolkata'),('5','Jaipur');
-- insert into address1 (city) values ('Mumabai'),('Delhi'),('Nagpur'),('Kolkata'),('Jaipur');
insert into address1 (user_id, city) values ('1','Mumabai'),('2','Delhi'),('3','Nagpur'),('4','Kolkata'),('5','Jaipur');
delete from users1 where id='5';

SELECT * FROM users1 WHERE id = 5;

select * from users1;
select * from address1;

select users1.name, address1.city
from users1
inner join address1 on users1.id = address1.user_id;


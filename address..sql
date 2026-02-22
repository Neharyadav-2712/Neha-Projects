create database startersql;
use startersql;
drop table if exists addresses;

create table addresses
(
id int auto_increment primary key,
user_id int,
street varchar(255),
city varchar(100),
state varchar(100),
pincode varchar(10),
constraint fk_user1 Foreign key(user_id) references users(id) on delete cascade
);

-- drop table addresses;
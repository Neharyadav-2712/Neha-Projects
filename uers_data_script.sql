-- use startersql;
-- alter table users modify column salary int after date_of_birth;
-- INSERT INTO users (name, email, gender, date_of_birth, salary) VALUES
-- ('Amit Sharma', 'amit.sharma@example.com', 'Male', '1990-05-12', 45000),
-- ('Neha Yadav', 'neha.yadav@example.com', 'Female', '1995-08-21', 52000),
-- ('Rohit Kumar', 'rohit.kumar@example.com', 'Male', '1988-11-03', 60000),
-- ('Priya Singh', 'priya.singh@example.com', 'Female', '1992-02-15', 48000),
-- ('Ananya Verma', 'ananya.verma@example.com', 'Female', '1998-07-19', 35000),
-- ('Suresh Patil', 'suresh.patil@example.com', 'Male', '1985-03-28', 75000),
-- ('Meera Joshi', 'meera.joshi@example.com', 'Female', '1993-12-10', 40000),
-- ('Arjun Mehta', 'arjun.mehta@example.com', 'Male', '1991-09-14', 55000),
-- ('Ritika Gupta', 'ritika.gupta@example.com', 'Female', '1997-01-25', 30000),
-- ('Karan Malhotra', 'karan.malhotra@example.com', 'Male', '1989-04-09', 65000),
-- ('Sneha Desai', 'sneha.desai@example.com', 'Female', '1996-06-17', 42000),
-- ('Vikram Nair', 'vikram.nair@example.com', 'Male', '1987-10-30', 70000),
-- ('Pooja Bhatia', 'pooja.bhatia@example.com', 'Female', '1994-03-11', 39000),
-- ('Manish Dubey', 'manish.dubey@example.com', 'Male', '1990-12-05', 58000),
-- ('Simran Kaur', 'simran.kaur@example.com', 'Female', '1999-08-08', 32000);

-- select * from users;
-- select count(*) from users;
-- select sum(salary) as total_sum from users;
-- select min(salary) as Min_salary, max(salary) as Max_salary from users;
-- select avg(salary) as total_avg from users;

-- select max(salary) from users
-- where salary < (select max(salary) from users
-- ); 

 -- select * from users;

-- select gender, min(salary) as min_salary, max(salary) as max_salary from users group by gender;

-- select gender, sum(salary) as sum from users group by gender;

-- select gender, avg(salary) as avg from users group by gender;

-- select gender, count(*) from users group by gender;

-- select name, length(name) as name_length from users;

-- select name, lower(name) as lower_case from users;

-- select name, upper(name) as upper_case from users;

-- SELECT 
--     COUNT(*) AS total_employees,
--     SUM(salary) AS total_salary,
--     AVG(salary) AS average_salary,
--     MIN(salary) AS lowest_salary,
--     MAX(salary) AS highest_salary
-- FROM users;

-- select concat(upper(name),'2712') as lowercase_concat from users;

-- select concat(lower(name),'<',email,'>') as uers_concar from users;

-- select now() as Time;

-- select year(now()) as year from users;
-- select * from users;

-- select id, mod(id,2) as reminder,
-- if(mod(id,2)=0, 'Even', 'Odd') as number_type from users;

-- select name, gender, if(gender='female', 'yes','No') as is_female from users;
 -- select * from users;                

-- update users set salary = '45.000.50' where id='1';
-- select salary, round(salary) as round_salary from users;










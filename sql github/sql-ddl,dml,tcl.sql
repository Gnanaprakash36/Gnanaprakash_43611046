show databases;
use gnana;
create database gnana_3;
create database gnana;
use gnana;
create table student(regno int,name char(25),mobileno int);
ALTER TABLE student RENAME COLUMN mobileno TO marks;
use gnana;
SELECT * FROM student;
use gnana;
show tables from gnana;
insert into student(regno,name,marks)
values
(101,'gopal',78),
(102,'varma',78),
(103,'bharath',89);

delete from student where regno=101;
select * from student order by regno asc;

alter table student add email varchar(25);

alter table student add scountry varchar(25) default 'india';

UPDATE student
SET email = 'test@example.com'
WHERE email IS NULL;

update student
set email= case name
when 'gopal' then 'gopal@gmail.com'
end
where name in('gopal');

SAVEPOINT sp1;

CREATE TABLE Worker (
	WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	FIRST_NAME CHAR(25),
	LAST_NAME CHAR(25),
	SALARY INT(15),
	JOINING_DATE DATETIME,
	DEPARTMENT CHAR(25)
);

INSERT INTO Worker 
	(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
		(001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');
        
show tables;

select * from worker;
start transaction;

SAVEPOINT sp2;

delete from worker where worker_id=006;

rollback to sp1;

insert into worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) values(06, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account');

select * from worker;

rollback to sp2;

savepoint sp3;

delete from worker where worker_id=009;

savepoint sp4;

select * from worker;

commit;


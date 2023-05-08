drop database if exists hotel_management_system;
create DATABASE if not exists hotel_management_system;
use hotel_management_system;

create table if not exists customers(
cust_id int PRIMARY KEY not null,
cust_name varchar(30),
cust_city varchar(30),
cust_roomno int,
checkin_time datetime
);
desc customers;
insert into customers values(1, 'Kunal', 'Mumbai', 100, '2023-05-03 12:00:00');
insert into customers values(2, 'Kyle', 'Berlin', 102, '2023-03-04 10:00:00');
insert into customers values(3, 'Kulpreet', 'Seattle', 201, '2023-04-06 11:00:00');
insert into customers values(4, 'Kevin', 'Tokyo', 202, '2022-06-01 11:30:00');


select * from customers

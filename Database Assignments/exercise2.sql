--1
select distinct city from customers;
select count(DISTINCT city) from Customers;

--2
select min(quantity) as "least_quantity", max(quantity) as "highest_quantity" from OrderDetails;

--3
select sum(quantity) as 'total_quantity', avg(quantity) as 'average_quantity' from OrderDetails;

--4
select productname from products limit 4, 11;

--5
select * from suppliers where suppliername like '_A%';

--6
select * from cuatomer where location not in ('USA', 'Canada');

--7
select * from orders a, order_details b where a.orderdate between '2020-01-01' and '2021-12-31'and a.orderid=b.orderid order by b.orderid desc;

--8
select city, count(*) as 'count' from Customers group by city;

--9
select * from Employees where firstname not in ('Sanjay', 'Sonia');

--10
create table SupplierDetail as select * from Suppliers;

--11
delete from Customers where country='Venezuela'
select * from Customers;
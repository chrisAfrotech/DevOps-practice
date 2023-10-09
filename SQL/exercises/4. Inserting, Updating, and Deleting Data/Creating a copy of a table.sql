-- Creating a copy of a table
-- create table orders_archived as 
-- select * from orders

-- NB: when using this technics to create a new table mysql will ignore to recreate and copy pk(primary key) and ai(auto increment)
-- to your new table. so that you have to add it manually.

-- If you truncate the table it'll remove all the data in this table 
-- Asume that we want to retreive only a part of the table we are suppose to use subquerries 

-- insert into orders_archived -- we dont have to precise the column values here because we will add the entire table 
-- select * -- This is the subquerry
-- from orders
-- where order_date < '2019-01-01'

-- Exercise 
-- create a copy of the invoices table and add it in the new table call invoices archived
-- (In this table give also the name of clients so that join it with clients table)
-- (copy invoices that only have payments date that mentioned)
 
 use sql_invoicing;
create table invoices_archived  as
 select 
	i.invoice_id,
    i.number,
    c.name as client,
    i.invoice_date,
    i.invoice_total,
    i.payment_total,
    i.payment_date,
    i.due_date
 from invoices i
 join clients c
 using(client_id)
 where i.payment_date  IS NOT NULL
 
 -- NB: if we execute this querry more time we will get and error because we already have this table created
 
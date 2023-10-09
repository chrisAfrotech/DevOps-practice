-- sorted data with order by class
-- Always sort data by column name
-- SQL gives the possibility to sort data from another selected value 
-- exercise 
--  in orders items, 
-- select all items with id=2
-- and sort by total price in desc order

select *, (unit_price*quantity) as "total price"
from order_items
where order_id = 2 
order by "total price" desc  
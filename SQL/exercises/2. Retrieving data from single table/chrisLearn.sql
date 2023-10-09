USE sql_store;

-- exercise 1 
-- to return all products 
-- name
-- unit price
-- new price (unit price * 1.1)  

select 
	name,
	unit_price,
    unit_price * 1.1 as "new price"

from products


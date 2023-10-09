-- Outer join

-- writing only "JOIN" means is a "inner join"
-- writing "LEFT or RIGHT join" means you're using the OUTER join
-- writing "INNER" or "OUTER" is optional in the syntax

-- "LEFT join" return the column of the left table wether the condition is true or not
-- "RIGHT join" return the column of the right table wether the condition is true or not 

-- EXERCISE
-- querry that joins product_table with order_items table
-- and give the prod_id, name. quantity

select p.product_id, p.name, oi.quantity
from products p
left join order_items oi
	on p.product_id = oi.product_id

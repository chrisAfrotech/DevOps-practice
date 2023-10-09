-- implicit join 

-- NB: if you forget the where clause in the implicit join it will make a cross join
-- is better to use the explicit join
-- Explicit JOin syntaxe
select *
from orders o
join customers c
	on o.customer_id = c.customer_id

-- Implicit join syntax
select * 
from orders o
	customers c
where o.customer_id = c.customer_id

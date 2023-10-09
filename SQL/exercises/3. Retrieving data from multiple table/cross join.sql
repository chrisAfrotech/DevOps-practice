-- cross join 
-- it combine all the value of both tables each other

-- explicit syntax
select 
	c.first_name as customer,
    p.name as product
from customers c 
cross join products p 
order by c.fisrt_name

-- implicit syntax
select 
	c.first_name as customer,
    p.name as product
from customers c, products p 

order by c.fisrt_name
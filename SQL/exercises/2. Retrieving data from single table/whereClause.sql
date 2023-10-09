-- where clause
-- in sql date must be place in quote value '1990-01-01   '

-- Eecrcise 
-- get the orders placed this year

select *
from orders
where order_date >= "2019-01-01"  

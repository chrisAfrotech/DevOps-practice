-- or and not operators
-- exercise 
-- from the order_items table, get the items 
-- for order #6
-- where the total price is greater thean 30

select *
from order_items
where order_id = 6 and unit_price*quantity >= 30 

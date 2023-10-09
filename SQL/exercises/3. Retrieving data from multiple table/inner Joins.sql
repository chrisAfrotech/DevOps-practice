-- retrieving data from multiple table
-- inner joins

-- exercise
-- from orders items table 
-- write a request by joining this table with products table to have
-- orderId ,productId, quantity and the unit-price and use alisas to simplify the code
use sql_store;

select order_id, o.product_id, quantity, p.unit_price
from order_items o
join products p
	on o.product_id = p.product_id
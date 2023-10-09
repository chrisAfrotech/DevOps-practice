-- Joining accros databases
-- as database admin we have can have the possibility to join accross table
-- NB: normally we don't have to have same table in dif database
-- you have to call the external table to join in your querry to make sure that you will retreive it

-- eg:
use sql_inventory;

select *
from sql_store.order_items 
join products p
	on o.product_id = p.product_id


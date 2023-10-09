-- natural joins
-- it's not recommend because it produse bad result
use sql_store;

select 
	o.order_id , 
    c.first_name
from orders o 
natural join customers c
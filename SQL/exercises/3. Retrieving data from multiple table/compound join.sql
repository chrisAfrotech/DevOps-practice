-- COmpound join
-- nb: composite primary key is when table have more than one primary key
use sql_store;

select *
from order_items oi
join order_item_notes oin
	on oi.order_id = oin.order_id
    and oi.product_id = oin.product_id



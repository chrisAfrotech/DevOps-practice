-- is null operator
-- null is an absence of values

-- exercise:
-- get the orders that are not shipped yet

select *
from orders
where shipper_id is null
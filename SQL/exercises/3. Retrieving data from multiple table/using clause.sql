-- using clause 
-- use when we have both the same "ON" condition value in the two sides
-- eg: join customer
-- 		on c.cust = o.cust
-- 		 = using (cust)

-- exercise 
-- Querry to select the payements form payment table
use sql_invoicing;

select 
	p.date,
    c.name as client,
    p.amount,
    pm.name as payment_method 
from payments p
left join payment_methods pm
	on p.payment_method = pm.payment_method_id
left join clients c
	using(client_id)




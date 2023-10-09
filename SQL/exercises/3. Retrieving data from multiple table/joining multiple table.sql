-- MUltiple table joining

-- exercise
-- Querry on the payements table 
-- join with payements method and give th clients id information

use sql_invoicing;

select 
    p.invoice_id,
    p.date,
    p.amount,
    c.name,
    pm.name
from payments p
join clients c
	on p.client_id = c.client_id
join payment_methods pm
	on p.payment_method = pm.payment_method_id

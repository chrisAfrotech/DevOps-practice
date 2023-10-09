-- outer join on multiple tables
-- as best practice don't use both left and right join in the same syntax
-- just use left join

-- exercise

select o.order_id,
		o.order_date,
        c.first_name as customer,
        s.name as shipper,
        os.name as status
from orders o 
left join customers c 
	on o.customer_id = c.customer_id
left join shippers s
	on o.shipper_id = s.shipper_id
left join order_statuses os
	on o.status = os.order_status_id
    
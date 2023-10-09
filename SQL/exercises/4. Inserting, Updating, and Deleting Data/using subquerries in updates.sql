-- using subquerries in updates

-- use sql_invoices;

-- update invoices
-- set 
--     payment_date = due_date 
-- where client_id = 
-- 	(select client_id
--     from clients
--     where name = 'Vinte')

-- Exercise: 
	-- back to SQL_store db  
    -- update a comments for orders for customers who has more than 3000points
    
use sql_store;

update orders 
set comments="Gold customer"
where customer_id in 
	(select customer_id
	from customers
	where points > 3000)
    
    -- NB:Here we use the in operator because the select statement return more than one value  

	
--  Updating data in multiple rows

-- update invoices
-- set 
-- 	payment_total = invoice_total * 0.5,
--     payment_date = due_date
-- where client_id = 3
 
-- Exercise: Give a SQL statement to
	-- Give any custommers born before 1990
    -- 50 extra points  
use sql_store;

update customers
set points = points + 50
where birth_date < "1990-01-01"

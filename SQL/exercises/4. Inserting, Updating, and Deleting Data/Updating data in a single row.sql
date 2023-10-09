-- Updating data in a single row 

update invoices
set payment_total = 10, payment_date = '2019-03-01'
where invoice_id = 8

-- NB: if the total column value is set to a certain default value, we can also add the keyword "default" so that the value will be set to default
	-- we can also affect column name to another
-- eg:  set payment_date = due_date
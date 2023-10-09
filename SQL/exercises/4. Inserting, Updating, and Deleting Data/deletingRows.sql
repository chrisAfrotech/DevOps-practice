-- Deleting rows 
use sql_invoicing;

Delete from `invoices` 
where client_id = 
	(select * from `clients`where name = 'Myworks');


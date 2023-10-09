--   Insert multiple value in a table 

-- insert into shippers (name)
-- values ('shipper1'),
-- 		('shipper2'),
--         ('shipper3')
    
-- Exercise: insert 3 rows in the products table
use sql_store;

insert into products (name, quantity_in_stock, unit_price)
values ('peanuts', 5, 3.69),
		('Spaghetti', 9, 99.5),
        ('reaktor', 75, 36.8)
        
-- NB: If the table doesn't have default values you have and obligation to enter values if you are using default notation
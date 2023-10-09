 -- inserting hierachical rows
--  NB: To get ID the items of the last insert elements
 
 -- Insert INTO orders (customer_id, order_date, status)
--  values(1, '2019-01-02', 1);
--  
--  Select last_insert_id()
use sql_store;
Insert INTO orders (customer_id, order_date, status)
values(1, '2019-01-02', 1);
 
 Insert into order_items
 values
		(last_insert_id(), 1, 1, 2.95),
        (last_insert_id(), 2, 1, 3.95)
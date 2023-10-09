-- linmit class
-- it must always come at the end of the querry
-- limit(x, y): 
	-- x=number of values to skip, 
	-- y=number of values to take
    
-- exercise
-- get the top three loyal customers whixh are cust that have more  points than everyone

select * 
from customers
order by points desc
limit 3
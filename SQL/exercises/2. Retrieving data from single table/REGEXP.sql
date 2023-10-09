-- REGEXP
-- it's very powerful to manipulate strings

-- |: to represent multiple params
-- ^: reprensent the biginning
-- $: represent the end
-- []: represent specific caracter place before of after caracter
-- [a-h]: string that have caracter in this interval (a.b.c.d.e.f.g.h)

-- nb: attention aux espaces sql est sensible a la casse

-- exercise
-- Get the customers whose
	-- first names are ELKA or AMBUR
	-- last names end with EY or ON
	-- last names start with MY or contains SE 
	-- last names contain B folowed by R or uninstall

-- select * 
-- from customers
-- where first_name regexp 'elka|ambur'

-- select * 
-- from customers
-- where last_name regexp 'ey$|on$'

-- select * 
-- from customers
-- where last_name regexp '^MY|[SE]' 

select * 
from customers
where last_name regexp 'br|bu' 


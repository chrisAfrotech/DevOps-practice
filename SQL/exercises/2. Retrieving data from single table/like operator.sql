-- like operator

-- it's use to indicate the caracter with what we want to play with caracter around
-- '%' to represent any number of caracter
-- _ to represent a single caracter

-- exercise
-- Get custommers  whose
-- adresses contain TRAIL or AVENUE
-- phone numbers and with 9

-- Adresses contain trail or avenue
-- select * 
-- from customers
-- where address like "%trail%" or address like "%avenue%"

-- phone don't end with 9
select * 
from customers
where phone  not like '%9'


-- in operator

-- use the in operator instead of the or operator to combine multiple string value comparaison
-- exercise
-- return products with 
-- Quantity in stock equal to 49, 38, 72

select *
from products 
where quantity_in_stock in (49, 38, 72)

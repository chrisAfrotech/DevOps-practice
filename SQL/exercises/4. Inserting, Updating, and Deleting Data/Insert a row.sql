-- Inserting a Row

-- we can use this syntax when we want to specify defalut and null value
insert into customers
values (Default,
 'John',
 'Smith',
 '1990-01-02',
 Null,
 'address',
 'city',
 'CA',
 Default
 )
 
 -- we can use this pther syntax when we don't want to speify defalut value
 insert into customers
 (
 first_name,
 last_name,
 city,
 State,
 address,
 birthdate
 )
values (
 'John',
 'Smith',
 '1990-01-02',
 'address',
 'city',
 'CA',
 )
 
 -- With this syntax we don't have to care about the order of values 
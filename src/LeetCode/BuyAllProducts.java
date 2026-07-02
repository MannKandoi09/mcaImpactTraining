package LeetCode;
/*
# Write your MySQL query statement below
select customer_id
from Customer
group by customer_id
Having COUNT(DISTINCT product_key) = (
select count(*)
from Product
);

 */
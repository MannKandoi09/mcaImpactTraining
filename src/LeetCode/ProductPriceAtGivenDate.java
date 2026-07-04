package LeetCode;

/*
select product_id, 10 as price
from Products
Group by product_id
having min(change_date) > "2019-08-16"

union

select p.product_id, p.new_price as price
from Products p
join(
                select product_id, max(change_date) as change_date
from Products
where change_date <= "2019-08-16"
group by product_id
)t
on p.product_id = t.product_id
and p.change_date = t.change_date;

 */
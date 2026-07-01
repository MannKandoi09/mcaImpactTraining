package LeetCode;
/*
# Write your MySQL query statement below
select
d.name AS Department,
e.name AS Employee,
e.salary AS Salary
FROM(
                SELECT *,
                DENSE_RANK() OVER(
PARTITION BY departmentId
ORDER BY salary desc
        )AS rnk
FROM Employee
)e
JOIN Department d
on e.departmentId = d.id
where rnk <= 3;

 */
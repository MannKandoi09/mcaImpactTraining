package Day16;

/*

SELECT seller_id
FROM Sales
GROUP BY seller_id
HAVING SUM(price) = (
SELECT MAX(total_sales)
FROM(
        SELECT SUM(price) AS total_sales
from Sales
GROUP BY seller_id
    )AS t
);

 */
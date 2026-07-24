package LeetCode;

public class DeleteDuplicateEmails {
    /*
    # Write your MySQL query statement below
    delete from Person
    where id  not in(
            SELECT id
    FROM(
            select MIN(id) as id
    from Person
    group by email
    ) t

);


     */

}

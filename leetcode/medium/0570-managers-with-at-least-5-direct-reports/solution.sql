-- Write your PostgreSQL query statement below
SELECT name
FROM Employee
WHERE id IN (
    SELECT e1.managerId
    FROM Employee e1
    LEFT JOIN Employee e2
    ON e1.managerId = e2.id
    GROUP BY e1.managerId
    HAVING COUNT(e1.managerId) >= 5
);
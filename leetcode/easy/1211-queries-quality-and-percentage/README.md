# Queries Quality and Percentage

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Queries`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| query_name  | varchar |
| result      | varchar |
| position    | int     |
| rating      | int     |
+-------------+---------+
This table may have duplicate rows.
This table contains information collected from some queries on a database.
The position column has a value from 1 to 500.
The rating column has a value from 1 to 5. Query with rating less than 3 is a poor query.

```

 

We define query `quality` as:

The average of the ratio between query rating and its position.

We also define `poor query percentage` as:

The percentage of all queries with rating less than 3.

Write a solution to find each `query_name`, the `quality` and `poor_query_percentage`.

Both `quality` and `poor_query_percentage` should be  **rounded to 2 decimal places**.

When rounding to two decimal places, values exactly halfway between two possible results are rounded away from zero. For example, 0.125 is rounded to 0.13.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Queries table:
+------------+-------------------+----------+--------+
| query_name | result            | position | rating |
+------------+-------------------+----------+--------+
| Dog        | Golden Retriever  | 1        | 5      |
| Dog        | German Shepherd   | 2        | 5      |
| Dog        | Mule              | 200      | 1      |
| Cat        | Shirazi           | 5        | 2      |
| Cat        | Siamese           | 3        | 3      |
| Cat        | Sphynx            | 7        | 4      |
+------------+-------------------+----------+--------+
Output: 
+------------+---------+-----------------------+
| query_name | quality | poor_query_percentage |
+------------+---------+-----------------------+
| Dog        | 2.50    | 33.33                 |
| Cat        | 0.66    | 33.33                 |
+------------+---------+-----------------------+
Explanation: 
Dog queries quality is ((5 / 1) + (5 / 2) + (1 / 200)) / 3 = 2.50
Dog queries poor_ query_percentage is (1 / 3) * 100 = 33.33

Cat queries quality equals ((2 / 5) + (3 / 3) + (4 / 7)) / 3 = 0.66
Cat queries poor_ query_percentage is (1 / 3) * 100 = 33.33

```

## Solution

**Language:** SQL  
**Runtime:** 270 ms (beats 21.49%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-11-20T18:27:57.328Z  

```sql
-- Write your PostgreSQL query statement below
SELECT query_name,
       ROUND(SUM(quality)::numeric / COUNT(*), 2) AS quality,
       ROUND(SUM(is_poor)::numeric * 100 / COUNT(*), 2) AS poor_query_percentage
FROM (
    SELECT query_name,
           rating::numeric / position AS quality,
           CASE WHEN rating < 3 THEN 1 ELSE 0 END AS is_poor
    FROM Queries
) AS new
GROUP BY query_name;
```

---

[View on LeetCode](https://leetcode.com/problems/queries-quality-and-percentage/)
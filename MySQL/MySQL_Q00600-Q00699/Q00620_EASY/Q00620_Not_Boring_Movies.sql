# Write your MySQL query statement below
SELECT id, movie, description, rating from Cinema
WHERE id%2 <> 0 AND description <> 'boring'
ORDER BY rating DESC;
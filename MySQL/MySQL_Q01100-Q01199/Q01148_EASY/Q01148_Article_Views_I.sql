# Write your MySQL query statement below
SELECT author_id as id FROM Views
WHERE viewer_id = author_id
GROUP BY author_id
ORDER BY author_Id;
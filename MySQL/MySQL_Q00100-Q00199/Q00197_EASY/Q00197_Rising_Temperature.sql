# Write your MySQL query statement below
SELECT W1.id 
FROM Weather W1, Weather W2
WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1 AND W1.temperature > W2.temperature
GROUP BY W1.id;
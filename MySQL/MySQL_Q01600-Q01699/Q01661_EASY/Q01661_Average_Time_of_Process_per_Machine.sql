# Write your MySQL query statement below
SELECT M1.machine_id as machine_id, ROUND(AVG(M1.timestamp - M2.timestamp), 3) as processing_time 
FROM Activity M1, Activity M2
WHERE M1.activity_type = 'end' AND M2.activity_type = 'start' AND M1.machine_id = M2.machine_id AND M1.process_id = M2.process_id
GROUP by M1.machine_id
# Write your MySQL query statement below
SELECT Employee.name, Bonus.bonus from Employee
LEFT JOIN Bonus ON (Bonus.empId = Employee.empId)
WHERE Bonus.bonus < 1000 OR Bonus.bonus IS NULL;
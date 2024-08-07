# Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.
## Question: Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.
## Answer
```sql
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_Department IN Employees.Department%TYPE,
    p_BonusPercentage IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercentage / 100)
    WHERE Department = p_Department;
    
    COMMIT;
END UpdateEmployeeBonus;
/
```
# Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.
## Question1: Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.
 ## Answer
```sql
BEGIN
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE CustomerID IN (
        SELECT CustomerID
        FROM Customers
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, DOB) / 12) > 60
    );
    COMMIT;
END;
/
```
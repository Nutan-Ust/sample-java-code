.LOGON myserver/myuser,my_password;

SELECT * FROM Employees WHERE Department = 'HR';

IF ERRORCODE <> 0 THEN .EXIT ERRORCODE;

INSERT INTO Employees (EmployeeID, Name, Dept) VALUES (1, 'John Doe', 'HR');
DELETE FROM Employees WHERE EmployeeID = 5;

.RUN FILE my_script.btq;

SELECT * FROM Employees;

.LOGOFF;
.QUIT;

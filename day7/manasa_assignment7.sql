REATE TABLE employees (
  employeeID SERIAL PRIMARY KEY,
  employeeName VARCHAR(100),
  title VARCHAR(50),
  city VARCHAR(50),
  country VARCHAR(50),
  reportsTo INT,
  FOREIGN KEY (reportsTo) REFERENCES employees(employeeID)
);

SELECT * FROM employees;

CREATE TABLE orders (
  orderID INT PRIMARY KEY,
  customerID VARCHAR(50) NOT NULL,
  employeeID INT NOT NULL,
  orderDate DATE,
  requiredDate DATE,
  shippedDate DATE,
  shipperID INT NOT NULL,
  freight double precision,
  FOREIGN KEY (customerID) REFERENCE

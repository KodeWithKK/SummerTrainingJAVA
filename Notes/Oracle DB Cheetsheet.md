# Oracle Database Cheat Sheet

## Table of Contents

1. [Installation](#installation)
2. [Basic SQL Commands](#basic-sql-commands)
3. [Data Types](#data-types)
4. [DDL Commands](#ddl-(data-definition-language)-commands)
5. [DML Commands](#dml-(data-manipulation-language)-commands)
6. [Querying Data](#querying-data)
7. [Joins](#joins)
8. [Indexes](#indexes)
9. [Transactions](#transactions)
10. [PL/SQL](#plsql)
11. [Backup and Recovery](#backup-and-recovery)
12. [User Management](#user-management)
13. [Performance Tuning](#performance-tuning)

## Installation

### Oracle Database Express Edition (XE)

- Download from [Oracle website](https://www.oracle.com/database/technologies/xe-downloads.html)
- Follow installation instructions

## Basic SQL Commands

```sql
-- Connect to the database
CONNECT username/password;

-- Create a new user
CREATE USER username IDENTIFIED BY password;

-- Grant privileges to a user
GRANT privilege_name TO username;

-- Display tables
SELECT table_name FROM user_tables;

-- Describe a table
DESCRIBE table_name;

-- Drop a table
DROP TABLE table_name;
```

## Data Types

* **Numeric Types:**

  - NUMBER
  - INTEGER
  - FLOAT

* **Character Types:**

  - CHAR(size)
  - VARCHAR2(size)
  - CLOB

* **Date and Time Types:**

  - DATE
  - TIMESTAMP

* **Boolean Type:**

  - BOOLEAN

## DDL (Data Definition Language) Commands

```sql
-- Create a table
CREATE TABLE table_name (
  column1 datatype,
  column2 datatype,
  ...
);

-- Modify a table
ALTER TABLE table_name
ADD column_name datatype;

-- Drop a column
ALTER TABLE table_name
DROP COLUMN column_name;

-- Rename a table
ALTER TABLE old_table_name
RENAME TO new_table_name;

```

## DML (Data Manipulation Language) Commands

```sql
-- Insert data into a table
INSERT INTO table_name (column1, column2, ...)
VALUES (value1, value2, ...);

-- Update data in a table
UPDATE table_name
SET column1 = value1, column2 = value2
WHERE condition;

-- Delete data from a table
DELETE FROM table_name
WHERE condition;

```

## Querying Data

```sql
-- Select all columns from a table
SELECT * FROM table_name;

-- Select specific columns
SELECT column1, column2 FROM table_name;

-- Filter rows with a condition
SELECT * FROM table_name
WHERE condition;

-- Order results
SELECT * FROM table_name
ORDER BY column_name ASC/DESC;

```

## Joins
```sql
-- Inner Join
SELECT *
FROM table1
INNER JOIN table2 ON table1.column_name = table2.column_name;

-- Left Join
SELECT *
FROM table1
LEFT JOIN table2 ON table1.column_name = table2.column_name;

-- Right Join
SELECT *
FROM table1
RIGHT JOIN table2 ON table1.column_name = table2.column_name;
```

## Indexes
```sql
-- Create an index
CREATE INDEX index_name
ON table_name (column_name);

-- Drop an index
DROP INDEX index_name;
```

## Transactions
```sql
-- Start a transaction
START TRANSACTION;

-- Commit changes
COMMIT;

-- Rollback changes
ROLLBACK;
```

## PL/SQL
```sql
-- Create a stored procedure
CREATE PROCEDURE procedure_name
AS
BEGIN
  -- SQL statements
END;

-- Execute a stored procedure
EXEC procedure_name;

-- Create a function
CREATE FUNCTION function_name
RETURN datatype
AS
BEGIN
  -- SQL statements
END;

-- Execute a function
SELECT function_name() FROM dual;
```

## Backup and Recovery

- Use Oracle RMAN for backup and recovery. Refer to official documentation for details.

## User Management
```sql
-- Create a user
CREATE USER username IDENTIFIED BY password;

-- Grant privileges
GRANT privilege_name TO username;

-- Revoke privileges
REVOKE privilege_name FROM username;

```

## Performance Tuning

- Use Oracle Enterprise Manager (OEM) for performance monitoring.
Analyze and optimize SQL queries using Explain Plan.

- Use Oracle Enterprise Manager (OEM) for performance monitoring.
Analyze and optimize SQL queries using Explain Plan.
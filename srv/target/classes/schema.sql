DROP VIEW IF EXISTS BookService_AuthorSrv;
DROP VIEW IF EXISTS BookService_BookSrv;
DROP VIEW IF EXISTS CatalogService_Books;
DROP VIEW IF EXISTS EmployeeService_DeptSrv;
DROP VIEW IF EXISTS EmployeeService_EmployeeSrv;

DROP TABLE IF EXISTS my_Authors;
DROP TABLE IF EXISTS my_Books;
DROP TABLE IF EXISTS my_Dept;
DROP TABLE IF EXISTS my_Employee;
DROP TABLE IF EXISTS my_bookshop_Books;

CREATE TABLE my_Authors (
  ID INTEGER NOT NULL,
  name NVARCHAR(5000),
  PRIMARY KEY(ID)
);

CREATE TABLE my_Books (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  stock INTEGER,
  author_ID INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE my_Dept (
  ID INTEGER NOT NULL,
  name NVARCHAR(5000),
  creation_date DATE,
  PRIMARY KEY(ID)
);

CREATE TABLE my_Employee (
  ID INTEGER NOT NULL,
  name NVARCHAR(5000),
  salary INTEGER,
  dept_ID INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Books (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  stock INTEGER,
  PRIMARY KEY(ID)
);

CREATE VIEW BookService_AuthorSrv AS SELECT
  Authors_0.ID,
  Authors_0.name
FROM my_Authors AS Authors_0;

CREATE VIEW BookService_BookSrv AS SELECT
  Books_0.ID,
  Books_0.title,
  Books_0.stock,
  Books_0.author_ID
FROM my_Books AS Books_0;

CREATE VIEW CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.title,
  Books_0.stock
FROM my_bookshop_Books AS Books_0;

CREATE VIEW EmployeeService_DeptSrv AS SELECT
  Dept_0.ID,
  Dept_0.name,
  Dept_0.creation_date
FROM my_Dept AS Dept_0;

CREATE VIEW EmployeeService_EmployeeSrv AS SELECT
  Employee_0.ID,
  Employee_0.name,
  Employee_0.salary,
  Employee_0.dept_ID
FROM my_Employee AS Employee_0;


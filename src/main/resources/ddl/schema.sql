CREATE SCHEMA gymapp;

CREATE TABLE employee
(
    Employee_Id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    First_Name VARCHAR(45) NOT NULL,
    Last_Name VARCHAR(45) NOT NULL,
    Employee_Number VARCHAR(45) NOT NULL,
    Phone_Number VARCHAR(45)
);

CREATE TABLE member
(
    Member_Id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    First_Name VARCHAR(45) NOT NULL,
    Last_Name VARCHAR(45) NOT NULL,
    Phone_Number VARCHAR(45)
);
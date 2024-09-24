
-- Enable these 2 lines for the very first run, then you must disable on subsequent runs
DROP SCHEMA IF EXISTS CUTOMER;
CREATE SCHEMA CUSTOMER;

SET SCHEMA CUSTOMER;

--  Dropping the transactions table first, because it has a Foreign constraint on Customers table
DROP TABLE IF EXISTS TRANSACTIONS;

DROP TABLE IF EXISTS REWARDPOINTS;

CREATE TABLE CUSTOMER.REWARDPOINTS (
    CUTOMER_Id INT PRIMARY KEY
    MONTH INT
    YEAR INT
    POINTS INT);

INSERT INTO CUSTOMER.REWARDPOINTS VALUES (101, 1, 2024, 5);
INSERT INTO CUSTOMER.REWARDPOINTS VALUES (102, 2, 2024, 6);


CREATE TABLE CUTOMER.TRANSACTIONS (
    customer_id integer,
    transaction_id integer identity unique not null,
    transaction_date date not null,
    transaction_amount decimal (10,2) not null,
    foreign key (customer_id) references CUSTOMERS.REWARDPOINTS(customer_id),
    primary key (transaction_id));


INSERT INTO CUTOMER.TRANSACTIONS (customer_id, transaction_id, transaction_date, transaction_amount)
VALUES (2,1111, '2020-01-01', '234.23');

INSERT INTO CUSTOMER.TRANSACTIONS (customer_id, transaction_id, transaction_date, transaction_amount)
VALUES (2, 2222, '2020-01-02', '104.52');

INSERT INTO CUTOMER.TRANSACTIONS (customer_id, transaction_id, transaction_date, transaction_amount)
VALUES (1, 3333, '2020-01-20', '23.03');

INSERT INTO CUTOMER.TRANSACTIONS (customer_id, transaction_id, transaction_date, transaction_amount)
VALUES (1, 4444, '2020-01-21', '34.13');
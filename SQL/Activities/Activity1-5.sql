REM   Script: Session 01
REM   Activity1-5

select * from books;

select from books;

select * from books;

select * from books;

select * from tables;

show table


show tables


select * from salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13); 


    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13); 


    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 


    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select * from salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, salesman_city FROM salesman;

select * from salesman;

Alter Table salesman add grade int;

update table salesman set grade=100;

update table salesman set grade=100;

select * from salesman;

update table salesman set grade=100;

select * from salesman;

UPDATE salesman SET grade=100;

select * from salesman;

update salesman set grade=200 where salesman_city='Rome';

select * from salesman;

update salesman set grade=300 where salesman_name='James Hoog';

select * from salesman;

update salesman set salesman_name='Pierre' where salesman_name='McLyon';

select * from salesman;


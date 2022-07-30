CREATE TABLE member(
	id		number(10) PRIMARY KEY,
	name	varchar2(600)
);

SELECT * FROM MEMBER;

CREATE SEQUENCE member_seq
START WITH 1
INCREMENT BY 1;

INSERT INTO MEMBER values (member_seq.nextval, 'spring');


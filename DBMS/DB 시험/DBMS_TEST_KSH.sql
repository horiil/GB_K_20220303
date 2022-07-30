--���� 1. hr ������ EMPLOYEES ���̺��  ������ �÷��� �����͸� ���� (���̺� ����)EMPLOYEES_NEW ���̺��� �����ϴ� SQL���� �ۼ��Ͻÿ�.
CREATE TABLE EMPLOYEES_NEW AS 
SELECT * FROM EMPLOYEES;

SELECT * FROM EMPLOYEES_NEW;


--���� 2. hr ������ DEPARTMENTS ���̺��  ������ �÷��� �����͸� ����(���̺� ����) DEPARTMENTS_NEW ���̺��� �����ϴ� SQL���� �ۼ��Ͻÿ�.
CREATE TABLE DEPARTMENTS_NEW AS
SELECT * FROM DEPARTMENTS;

SELECT * FROM DEPARTMENTS_NEW;

 
--���� 3. EMPLOYEES_NEW ���̺� �������� ������ ������Ÿ���� USER_NAME �÷�(���� ���̴� ����)�� �߰��Ͻÿ�.
ALTER TABLE EMPLOYEES_NEW ADD (USER_NAME VARCHAR2(10));


--���� 4. EMPLOYEES_NEW ���̺� EMPLOYEE_ID �÷��� Primary Key ��������(���������̸� ����)�� �߰��Ѵ�.
ALTER TABLE EMPLOYEES_NEW ADD CONSTRAINT PK PRIMARY KEY (EMPLOYEE_ID);


--���� 5. DEPARTMENTS_NEW ���̺� DEPARTMENT_ID �÷��� Primary Key ��������(���������̸� ����)�� �߰��Ѵ�.
ALTER TABLE DEPARTMENTS_NEW ADD CONSTRAINT PK2 PRIMARY KEY (DEPARTMENT_ID); 


--���� 6. EMPLOYEES_NEW ���̺��� DEPARTMENT_ID �÷��� DEPARTMENTS_NEW ���̺� DEPARTMENT_ID �÷��� EMPLOYEES_NEW ���̺��� �ڽ� ���̺�, 
--       DEPARTMENTS_NEW ���̺� �� �θ� ���̺�� Foreign Key ���� ����(���������̸� ����)�� �߰��Ѵ�.
ALTER TABLE EMPLOYEES_NEW 
ADD CONSTRAINT FK FOREIGN KEY (DEPARTMENT_ID)
REFERENCES DEPARTMENTS_NEW (DEPARTMENT_ID);


-- ���� 7. EMPLOYEES_NEW ���̺�� DEPARTMENTS_NEW ���̺��� ����Ͽ� DEPARTMENT_ID = 60�� ����� 
--		  EMPLOYEE_ID , FIRST_NAME , DEPARTMENT_ID, DEPARTMENT_NAME�� ������������ ��ȸ �Ͻÿ�.
SELECT en.EMPLOYEE_ID , en.FIRST_NAME , en.DEPARTMENT_ID , dn.DEPARTMENT_NAME 
FROM EMPLOYEES_NEW en 
LEFT OUTER JOIN DEPARTMENTS_NEW dn ON en.DEPARTMENT_ID = dn.DEPARTMENT_ID
WHERE en.DEPARTMENT_ID = 60
ORDER BY dn.DEPARTMENT_NAME ASC;

-- ���� 8. EMPLOYEES_NEW ���̺��� DEPARTMENT_ID�� 100�� ������� �޿�(SALARY) ����� ���Ͽ���.
SELECT AVG(SALARY)  
FROM EMPLOYEES_NEW en 
WHERE DEPARTMENT_ID = 100;


-- ���� 9. EMPLOYEES_NEW ���̺��� ���� �Ͻÿ�.
DROP TABLE EMPLOYEES_NEW;


-- ���� 10. DEPARTMENTS_NEW ���̺��� ���� �Ͻÿ�.
DROP TABLE DEPARTMENTS_NEW;


-- ���� 11. EMPLOYEES ���̺�� DEPARTMENTS ���̺��� ����Ͽ� 
-- ��Sales�� �μ��̸��� ���� ������ �̸�(FIRST_NAME), �޿�(SALARY), �μ��̸�(DEPARTMENT_NAME)�� ��ȸ�Ͻÿ�.
-- ��, �޿��� 100�� �μ��� ��պ��� ���� �޴� ���� ������ ��µǾ�� �Ѵ�.(�� 16��)
SELECT e.FIRST_NAME , e.SALARY , d.DEPARTMENT_NAME
FROM EMPLOYEES e 
LEFT OUTER JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE d.DEPARTMENT_NAME = 'Sales'
AND e.SALARY < (SELECT AVG(e2.SALARY)  FROM EMPLOYEES e2 WHERE e2.DEPARTMENT_ID = 100);


-- ���� 12.EMPLOYEES ���̺�� DEPARTMENTS���̺��� ����Ͽ�, Ŀ�̼�(COMMISSION_PCT)�� �޴� 
-- ����� �̸�(FIRST_NAME), ����(JOB_ID), �μ���ȣ(DEPARTMENT_ID),�μ���(DEPARTMENT_NAME)�� ����϶�.(�� 35��)
SELECT e.FIRST_NAME , e.JOB_ID , e.DEPARTMENT_ID , d.DEPARTMENT_NAME 
FROM EMPLOYEES e 
LEFT OUTER JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
WHERE e.COMMISSION_PCT IS NOT NULL;


-- ���� 13. EMPLOYEES ���̺��� �����ȣ��(EMPLOYEE_ID) 123�� ����� 
-- ����(JOB_ID)�� ���� , �����ȣ(EMPLOYEE_ID)�� 192�� ����� �޿�(SALARY)���� ���� ����� 
-- �����ȣ(EMPLOYEE_ID),�̸�(FIRST_NAME),����(JOB_ID),�޿�(SALARY)�� ����϶�.(�� 5��)
SELECT e.EMPLOYEE_ID , e.FIRST_NAME , e.JOB_ID , e.SALARY 
FROM EMPLOYEES e 
WHERE JOB_ID = (SELECT JOB_ID FROM EMPLOYEES e2 WHERE EMPLOYEE_ID = 123)
AND SALARY > (SELECT SALARY  FROM EMPLOYEES e3 WHERE EMPLOYEE_ID = 192);


-- ���� 14. �л� ������ ���� ���� ������ ������Ű�� STUDENT ���̺��� �����Ͽ���.
/*(����(�÷��� ����) :

���̵�(����-����3�ڸ�,Primary Key), 

�̸�(����-���� ���� 10�ڸ�,Not Null), 

��ȭ��ȣ(����-����11�ڸ�,Not Null), 

�ּ�(����-���� ���� 100�ڸ�), 

�����(����-����1�ڸ�)

)*/
CREATE TABLE STUDENT(
	���̵�	NUMBER(3)		UNIQUE NOT NULL,
	�̸�		VARCHAR2(10) 	NOT NULL,
	��ȭ��ȣ	NUMBER(11)		NOT NULL,
	�ּ�		VARCHAR2(100),
	�����	NUMBER(1)
);

SELECT *
FROM STUDENT ;


--���� 15. STUDENT ���̺��� �̸� �÷��� UNIQUE INDEX�� ���� �ϼ���.
CREATE UNIQUE INDEX UNI ON STUDENT(�̸�);


-- ���� 16. STUDENT ���̺� ������ ������ 10���� �Է��Ͽ���.

INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('1',	'���',		'01012345678', '�ּ�1', 	'4');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('2', 	'����',		'11012345678', '�ּ�2', 	'3');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('3', 	'��',		'21012345678', '�ּ�3', 	'2');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('4', 	'����',		'31012345678', '�ּ�4',	'9');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('5', 	'Ǫ��',		'41012345678', '�ּ�5',	'3');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('6', 	'����', 		'51012345678', '�ּ�6',	'1');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('7', 	'¡¡��', 	'61012345678', '�ּ�7',	'3');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('8', 	'������', 	'71012345678', '�ּ�8',	'2');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('9', 	'��ī��', 	'81012345678', '�ּ�9', 	'7');
INSERT INTO STUDENT (���̵�, �̸�, ��ȭ��ȣ, �ּ�, �����)
	VALUES ('10',	'����', 		'91012345678', '�ּ�10', 	'3');

SELECT *
FROM STUDENT s ;


-- ���� 17. STUDENT ���̺��� �̸� �÷��� UNIQUE INDEX�� ���� �ϼ���.
DROP INDEX UNI;










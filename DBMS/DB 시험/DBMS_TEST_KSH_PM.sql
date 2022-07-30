--���� 1. ���� ���ǿ� �´� ���̺��� ���� �Ͻÿ�.

-- ���̺� ����1
CREATE TABLE TB_TEAM(
	TEAM_ID		NUMBER(10)		PRIMARY KEY,
	LOCAL_NAME	VARCHAR2(10)	NOT NULL,
	TEAM_NAME	VARCHAR2(10) 	NOT NULL,
	CAL			VARCHAR2(15), 
	HOMEPAGE 	VARCHAR2(60) 
);

--���̺� ���� Ȯ��
SELECT * FROM TB_TEAM ;

-- ������ ���� Ȯ��
CREATE SEQUENCE seq_team_no
INCREMENT BY 1
START WITH 1
MAXVALUE 10
MINVALUE 1
CYCLE
cache 2;
--DROP SEQUENCE seq_team_no;


-- ���̺� ����2
CREATE TABLE TB_PLAYER(
	PLAYER_NUM		NUMBER(10)		PRIMARY KEY,
	PLAYER_NAME		VARCHAR2(10)	NOT NULL,
	PLYAER_POSITION	VARCHAR2(10),
	PLYAER_HEIGHT	NUMBER(3), 
	TEAM_ID 		NUMBER(10) 
);
--���̺� ���� Ȯ��
SELECT * FROM TB_PLAYER;

-- FK ����
/* 
 * TB_TEAM ���̺��� �� ���̵� ���ǵǾ� �ִ� ������,
-- TB_PLAYER ���̺��� �� ���̵� ���� �� �� �ִ�.(FK, ���� �ɼ� ���� ����)
 */
ALTER TABLE TB_PLAYER
ADD CONSTRAINT FK FOREIGN KEY (TEAM_ID)
REFERENCES TB_TEAM (TEAM_ID)
ON DELETE CASCADE;

--ALTER TABLE TB_PLAYER DROP CONSTRAINT FK;


-- ���� 2. TB_TEAM ������ �� 2�� �Է�
INSERT INTO TB_TEAM (TEAM_ID, LOCAL_NAME, TEAM_NAME, CAL, HOMEPAGE)
	VALUES (seq_team_no.nextval,	'Seoul',	'FC_Seoul', '031-0012-0034', 'http://www.FC_Seoul.co.kr/');
INSERT INTO TB_TEAM (TEAM_ID, LOCAL_NAME, TEAM_NAME, CAL, HOMEPAGE)
	VALUES (seq_team_no.nextval,	'Seoul2',	'FC_Seoul2', '031-0034-0056', 'http://www.FC_Seoul2.co.kr/');

SELECT * FROM TB_TEAM ;
--DELETE FROM TB_TEAM ;

-- ���� 3. TB_PLAYER ���̺� ������ ���� 10�� �Է�
-- ��1
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('1', 'PLAYER1', 'GK', '180', '1');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('2', 'PLAYER2', 'Defenders', '180', '1');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('3', 'PLAYER3', 'CB', '170', '1');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('4', 'PLAYER4', 'DM', '173', '1');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('5', 'PLAYER5', 'AM', '175', '1');

-- ��2
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('6', 'PLAYER1', 'GK', '176', '2');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('7', 'PLAYER2', 'Defenders', '177', '2');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('8', 'PLAYER3', 'CB', '171', '2');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('9', 'PLAYER4', 'DM', '180', '2');
INSERT INTO TB_PLAYER (PLAYER_NUM, PLAYER_NAME, PLYAER_POSITION, PLYAER_HEIGHT, TEAM_ID)
	VALUES ('10', 'PLAYER5', 'AM', '183', '2');
-- Ȯ��
SELECT * FROM TB_PLAYER ;
--DELETE FROM TB_PLAYER;

-- ���� 4. ���� ��ȣ, ���� �̸�, ������, ����, �� ��, Ȩ������ ��ȸ
SELECT t.PLAYER_NUM , t.PLAYER_NAME , t.PLYAER_POSITION , t.PLYAER_HEIGHT , tt.TEAM_NAME , tt.HOMEPAGE 
FROM TB_PLAYER t
LEFT OUTER JOIN TB_TEAM tt ON t.TEAM_ID = tt.TEAM_ID
ORDER BY t.PLAYER_NUM ASC;



-- ���� 5. TB_TEAM, TB_PLAYER ���̺� ����
DROP TABLE TB_PLAYER ;
DROP TABLE TB_TEAM ;

-- ���� 6.  ������ ��ƼƼ ���赵�� ���� �ܷ�Ű(Foreign key)�� ���ؼ� �����϶�
/*
 * LOCATIONS ���̺��� COUNTRIES�� COUNTRY_ID�� �����ϰ� �ְ�, 
 * COUNTRIES ���̺��� REGIONS�� REGION_ID�� �����ϰ� �ֵ�.
 */


-- ���� 6-1. LOCATIONS ���̺� COUNTRIES ���̺��� �θ� �ڽ� ����?
/*
 * COUNTRIES ���̺��� �θ� ���̺�
 * LOCATIONS ���̺��� �ڽ� ���̺�
 */


--6-2. COUNTRIES ���̺�� REGIONS ���̺��� �θ� �ڽ� ����?
/*
 * REGIONS ���̺��� �θ� ���̺�
 * COUNTRIES ���̺��� �ڽ� ���̺�
 */


--6-3. �ܷ�Ű ���� �ɼ� ON DELETE CASCADE �� ���ؼ� �����Ͻÿ�
/*
 * �θ� ���̺��� �ش� �����͸� ������Ʈ(����)�ǰų� �����ɶ� �����ϰ� �ִ� ���̺��� �ִٸ� �ش� ���� ���̺����� ������ ������ ���� ���� ����ȴ�.
 */


--6-4. �ܷ�Ű ���� �ɼ� ON DELETE SET NULL �� ���ؼ� �����Ͻÿ�
/*
 * �θ� ���̺��� �����͸� ������Ʈ �Ǵ� �����ÿ� �ܷ�Ű ������ ���ִ� ��� ���� NULL������ ����˴ϴ�.
 */


--���� 7. ���� ����� ����� �� �ִ� view�� ���� �Ͻÿ�
-- 20�� �μ� ����� EMPLOYEE_ID, FIRST_NAME �� LAST_NAME�� ���� ��ȸ, DEPARTMENT_ID, HIRE_DATE, DEPARTMENT_NAME�� ��ȸ�ؼ� view�� �����Ͽ���.
CREATE VIEW view_v("emp_id", "name", "department_id", "hire_date", "dept_name") AS 
	SELECT e.EMPLOYEE_ID  ,e.LAST_NAME  , d.DEPARTMENT_ID , e.HIRE_DATE ,d.DEPARTMENT_NAME 
	FROM EMPLOYEES e 
	LEFT OUTER JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
	WHERE e.DEPARTMENT_ID = 20;

--DROP VIEW view_v;

SELECT *
FROM view_v;















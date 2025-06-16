-- �Ϲݻ���� ������ sql ���� �޸���

-- �� �����ϰ� alt+c�� ����

create table emp(
	num number(5) primary key, -- num �ʵ� ���� 5�� Ÿ��, �⺻Ű
 	name varchar2(16) not null, -- name �ʵ� ���� 16�� Ÿ��, nn
 	dept varchar2(16),			-- dept �ʵ� ���� 16�� Ÿ��
 	score number(7,2)			-- score �ʵ� ���� 7���� �Ҽ��� 2�� ǥ��
);
-- emp ���̺� ����

drop table emp;					-- table ������


create sequence emp_seq increment by 1 start with 1 nocache nocycle; -- �ڵ� ��ȣ ����

drop sequence emp_seq; -- �ڵ���ȣ ������ü ����

insert into emp(num, name, dept, score)
values (emp_seq.nextval, '�̸�1', '�μ�1', 75.3);
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '�̸�2', '�μ�2', 85.3);
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '�̸�3', '�μ�3', 95.3);
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '�̸�4', '�μ�4', 55.3);
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '�̸�5', '�μ�5', 65.3);
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '�̸�6', '�μ�6', 78.3); -- ���̳����� 6�� �Է�

select * from emp; --�Է°�� ����






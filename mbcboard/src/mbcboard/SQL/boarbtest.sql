
------------------------------member ���̺� �θ�� �����ϱ�-----------------------------

create table member(
	mno number(5) not null,
	bwriter nvarchar2(10) not null, 
	id nvarchar2(10) primary key, -- board ���̺� bwriter�� fk�� ���� �����Ҳ��� -> Ÿ�԰� ���ڼ����� ���������
	pw nvarchar2(10) not null,
	regidate date default sysdate not null -- default : ��¥�� �ۼ����ص� ���α׷��� �˾Ƽ� �ִ´�.
);

-- ������ ��ü�� board �������� �̹� �Ѱ��� �����ϴ� board_seq�� ���� ����ϰڴ�.

drop table member; -- ������ ����

-- �θ� ���̵����� �Է�
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '������', 'phj', '0702');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '�ּ���', 'csb', '1205');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '�ֿ���', 'cyj', '0913');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '�ֹ���', 'cbg', '0313');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '������', 'kth', '0205');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '�޴�ī��', 'hn', '0814');

select * from member;

---------------------------member�� �ڽ� board �ܷ�Ű ���� �ʼ�--------------------------

drop table board;
drop sequence board_seq;

create table board(
	bno number(5) primary key,
	btitle nvarchar2(30) not null,
	bcontent nvarchar2(1000) not null,
	bwriter nvarchar2(10) not null,
	bdate date not null
);

create sequence board_seq increment by 1 start with 1 nocycle nocache;

alter table board add constraint board_member_fk foreign key (bwriter) references member(id);
-- ���� ���̺��� ����� �ڽ� ���̺��, ����� id��(�θ�) ������ bwriter��(�ڽ�) ���輳��(�ܷ�Ű)
-- ORA-02267: column type incompatible with referenced column type -> �̹� �ڽ� ���̺� ���� �־ �׷� -> pk�� fk�� �ٿ��� ��
-- pk�� fk�� Ȯ���ϰ� ���� -> �ڽ� ���̺� ���̵����͸� �����ϰ� �����غ���
-- ���忡 ���̵����͸� �־�� �Ʒ� ������
-- ORA-02291: integrity constraint (BOARDTEST.BOARD_MEMBER_FK) violated - parent key not found
-- �θ� ���̺� �������̶�� ���� ���� -> ���忡 �������� id�� phj�� ����


delete from board; -- ���Ǿ��� ������� ������ �� ���� -> �Ŀ� �ܷ�Ű �ٽ� ����

insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '������~', '����� ��Ͻô��İ� ����߽��ϴ�', 'phj', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�ȳ��ϼ���~', '����� ��Ͻô��İ� ����߽��ϴ�', 'csb', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����մϴ�~', '����� ��Ͻô��İ� ����߽��ϴ�', 'cyj', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����߾��~', '����� ��Ͻô��İ� ����߽��ϴ�', 'cbg', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, 'ȭ�����ؿ�~', '����� ��Ͻô��İ� ����߽��ϴ�', 'kth', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�氩���ϴ�~', '����� ��Ͻô��İ� ����߽��ϴ�', 'hn', sysdate);

select * from board;

------------------------------------------------------------------------------------
-- ���� : 2���� ���̺��� �����Ͽ� ���� �����´�.

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id= 'phj';


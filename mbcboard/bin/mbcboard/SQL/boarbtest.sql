
------------------------------member 테이블 부모로 생성하기-----------------------------

create table member(
	mno number(5) not null,
	bwriter nvarchar2(10) not null, 
	id nvarchar2(10) primary key, -- board 테이블에 bwriter와 fk로 관계 설정할꺼임 -> 타입과 글자수까지 맞춰줘야함
	pw nvarchar2(10) not null,
	regidate date default sysdate not null -- default : 날짜를 작성안해도 프로그램이 알아서 넣는다.
);

-- 시퀀스 객체는 board 시퀀스로 이미 한개가 존재하니 board_seq를 같이 사용하겠다.

drop table member; -- 실행은 안함

-- 부모 더미데이터 입력
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '박희진', 'phj', '0702');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '최수빈', 'csb', '1205');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '최연준', 'cyj', '0913');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '최범규', 'cbg', '0313');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '강태현', 'kth', '0205');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '휴닝카이', 'hn', '0814');

select * from member;

---------------------------member의 자식 board 외래키 생성 필수--------------------------

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
-- 보드 테이블은 멤버의 자식 테이블로, 멤버의 id와(부모) 보드의 bwriter의(자식) 관계설정(외래키)
-- ORA-02267: column type incompatible with referenced column type -> 이미 자식 테이블에 값이 있어서 그럼 -> pk와 fk를 붙여야 함
-- pk와 fk를 확인하고 연결 -> 자식 테이블에 더미데이터를 삭제하고 실행해보자
-- 보드에 더미데이터를 넣어보니 아래 에러뜸
-- ORA-02291: integrity constraint (BOARDTEST.BOARD_MEMBER_FK) violated - parent key not found
-- 부모 테이블에 박희진이라는 값이 없음 -> 보드에 박희진을 id인 phj로 변경


delete from board; -- 조건없이 보드안의 데이터 싹 삭제 -> 후에 외래키 다시 실행

insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '덥내요~', '무더운데 등교하시느냐고 고생했습니다', 'phj', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '무더운데 등교하시느냐고 고생했습니다', 'csb', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다~', '무더운데 등교하시느냐고 고생했습니다', 'cyj', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고했어요~', '무더운데 등교하시느냐고 고생했습니다', 'cbg', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅해요~', '무더운데 등교하시느냐고 고생했습니다', 'kth', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다~', '무더운데 등교하시느냐고 고생했습니다', 'hn', sysdate);

select * from board;

------------------------------------------------------------------------------------
-- 조인 : 2개의 테이블을 연결하여 값을 가져온다.

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id= 'phj';


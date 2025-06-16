-- BOARD를 쓸수있는 DB 계정을 만들자
create user boardtest identified by boardtest;
grant resource, connect to boardtest;

alter user boardtest default tablespace users;
alter user boardtest temporary tablespace temp; -- 가상테이블?
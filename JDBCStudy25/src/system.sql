-- ������ �������ϰ� alt+c
create user jdbctest identified by jdbctest; -- ����� ���� ����
grant resource, connect to jdbctest; -- ���� ���Ѱ� �Ϲݻ���� ���� ����

alter user jdbctest default tablespace users; -- ���̺� �����̽�(db)�� users ������ ����
alter user jdbctest temporary tablespace temp; -- �ӽÿ� db�� temp ������ ����


-- ���̺���� 
create table member(
  id number primary key,
  username varchar2(15),
  password varchar2(15),
  name varchar2(15),
  email varchar2(30),
  phone varchar2(15),
  createDate timestamp
);


-- ������ ����, ���߿� ȸ������â���� ȸ������ ���ϸ� ȸ������ ����
create sequence member_seq
  start with 1
  increment BY 1
  maxvalue 10000;
-- 테이블생성 
create table member(
  id number primary key,
  username varchar2(15),
  password varchar2(15),
  name varchar2(15),
  email varchar2(30),
  phone varchar2(15),
  createDate timestamp
);


-- 시퀀스 생성, 나중에 회원가입창에서 회원가입 안하면 회원가입 실패
create sequence member_seq
  start with 1
  increment BY 1
  maxvalue 10000;
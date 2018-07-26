create schema if not exists cms;

drop table if exists cms.users;

create table cms.users (
   user_id integer,
   user_name varchar2(100),
   user_birthday date,
   user_active boolean
);


CREATE SEQUENCE	 IF NOT EXISTS userIdSequence START WITH 10;

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (14, 'Mark', '1998-02-05', true);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (22, 'Роман', '1996-12-02', false);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (25, 'Алексей', '1994-11-05', true);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (17, 'July', '2001-11-10', false);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (25, 'Арсений', '1992-12-05', true);
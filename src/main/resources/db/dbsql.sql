create table user_info(
		id int auto_increment primary key,
		uname varchar(25) ,
		unumber int
);
create table course_info(
		id int auto_increment primary key,
		caddress varchar(25) ,
		cname varchar(25)
);
create table course_user_info(
		id int auto_increment primary key,
		uid int,
		cid int
);
insert into user_info values(0,'小明',1001);
insert into user_info values(0,'小红',1002);
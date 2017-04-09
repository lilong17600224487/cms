create database cms default character set utf8;
use cms;
create table text(
			id int(10)primary key not null auto_increment,
			title varchar(50),
			url  varchar(50),
			textdetail text(65535),
			creattime datetime
			);
insert into text values(1,"第一个标题","images/cjdyszafq6qrhz9i.jpg","我是详细内容","2017-5-8 18:59:59");
insert into text values(2,"第二个标题","images/wt5xxk0pagnfrp1r.jpg","我是详细内容","2017-5-8 19:59:59");
-- 创建数据库
CREATE DATABASE IF NOT EXISTS hello_mall DEFAULT CHARSET utf8;

-- 测试数据开始

USE hello_mall;

CREATE TABLE booktype(
	id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	typename VARCHAR(50) NOT NULL COMMENT '图书类型名称',
	bookdesc VARCHAR(200) COMMENT '类型描述'
)ENGINE=INNODB DEFAULT CHARSET utf8;
CREATE TABLE bookinfo(
	id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	btid INT NOT NULL COMMENT '关联图书类型主键',
	bookname VARCHAR(50) NOT NULL COMMENT '图书名',
	bookdesc VARCHAR(200) COMMENT '图书简介'
)ENGINE=INNODB DEFAULT CHARSET utf8;

-- 约束
ALTER TABLE bookinfo
	ADD CONSTRAINT FK_BOOKINFO_BOOKTYPE_ID FOREIGN KEY(btid) REFERENCES booktype(id) ON DELETE CASCADE; -- 级联删除，删除主表数据会自动删除关联的字表数据

INSERT INTO booktype(typename,bookdesc) VALUES('文学类','文学知识...'),('编程类','编程知识...'),('漫画','二次元....');
INSERT INTO bookinfo(btid,bookname,bookdesc) VALUES(1,'骆驼祥子','这是骆驼祥子'),(1,'老人与海','这是老人与海'),(2,'java入门到放弃','这是java入门到放弃系列'),(2,'python入门','人工智能噢.'),(3,'海贼王','我就是海贼王');

-- 测试数据结束



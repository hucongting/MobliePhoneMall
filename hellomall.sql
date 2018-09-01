/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.7.17-log : Database - hello_mall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hello_mall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hello_mall`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL COMMENT '绑定用户id',
  `recv_name` varchar(20) NOT NULL COMMENT '用户名',
  `recv_province` char(6) NOT NULL COMMENT '省份',
  `recv_city` char(6) NOT NULL COMMENT '城市',
  `recv_area` char(6) NOT NULL COMMENT '区/县',
  `recv_address` varchar(50) NOT NULL COMMENT '详细地址',
  `recv_district` varchar(50) NOT NULL COMMENT '省市县',
  `recv_phone` varchar(16) NOT NULL COMMENT '收货电话',
  `recv_zip` char(6) DEFAULT NULL COMMENT '邮政编码',
  `tag` varchar(8) DEFAULT NULL COMMENT '选择地址',
  `is_default` int(11) DEFAULT NULL COMMENT '默认地址',
  `created_user` varchar(20) DEFAULT NULL COMMENT '创建',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间 ',
  `modified_user` varchar(20) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `FK_ADDRESS_USERID` (`uid`),
  CONSTRAINT `FK_ADDRESS_USERID` FOREIGN KEY (`uid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

/*Table structure for table `bookinfo` */

DROP TABLE IF EXISTS `bookinfo`;

CREATE TABLE `bookinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `btid` int(11) NOT NULL COMMENT '关联图书类型主键',
  `bookname` varchar(50) NOT NULL COMMENT '图书名',
  `bookdesc` varchar(200) DEFAULT NULL COMMENT '图书简介',
  PRIMARY KEY (`id`),
  KEY `FK_BOOKINFO_BOOKTYPE_ID` (`btid`),
  CONSTRAINT `FK_BOOKINFO_BOOKTYPE_ID` FOREIGN KEY (`btid`) REFERENCES `booktype` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `bookinfo` */

insert  into `bookinfo`(`id`,`btid`,`bookname`,`bookdesc`) values 
(1,1,'骆驼祥子','这是骆驼祥子'),
(2,1,'老人与海','这是老人与海'),
(3,2,'java入门到放弃','这是java入门到放弃系列'),
(4,2,'python入门','人工智能噢.'),
(5,3,'海贼王','我就是海贼王');

/*Table structure for table `booktype` */

DROP TABLE IF EXISTS `booktype`;

CREATE TABLE `booktype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `typename` varchar(50) NOT NULL COMMENT '图书类型名称',
  `bookdesc` varchar(200) DEFAULT NULL COMMENT '类型描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `booktype` */

insert  into `booktype`(`id`,`typename`,`bookdesc`) values 
(1,'文学类','文学知识...'),
(2,'编程类','编程知识...'),
(3,'漫画','二次元....');

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` int(11) NOT NULL COMMENT '用户id',
  `product_id` int(11) NOT NULL COMMENT '商品id',
  `content` varchar(500) NOT NULL COMMENT '内容评论',
  `score` int(11) NOT NULL COMMENT '评分字段',
  `img` varchar(200) DEFAULT NULL COMMENT '评论图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `order_detail` */

DROP TABLE IF EXISTS `order_detail`;

CREATE TABLE `order_detail` (
  `detail_id` varchar(32) NOT NULL COMMENT '主键',
  `order_id` varchar(32) NOT NULL COMMENT '关联订单的外键',
  `product_id` varchar(32) NOT NULL COMMENT '关联商品的外键',
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '当前价格,单位分',
  `product_quantity` int(11) NOT NULL COMMENT '数量',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '小图',
  `created_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`detail_id`),
  KEY `FK_DETAIL_MASTER_ID` (`order_id`),
  CONSTRAINT `FK_DETAIL_MASTER_ID` FOREIGN KEY (`order_id`) REFERENCES `order_master` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_detail` */

/*Table structure for table `order_master` */

DROP TABLE IF EXISTS `order_master`;

CREATE TABLE `order_master` (
  `order_id` varchar(32) NOT NULL COMMENT '主键',
  `buyer_name` varchar(32) NOT NULL COMMENT '买家名字',
  `buyer_phone` varchar(32) NOT NULL COMMENT '买家电话',
  `buyer_address` varchar(128) NOT NULL COMMENT '买家地址',
  `buyer_userid` varchar(64) NOT NULL COMMENT '买家userid',
  `order_amount` decimal(8,2) NOT NULL COMMENT '订单总金额',
  `order_status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '订单状态, 默认为新下单',
  `pay_status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '支付状态, 默认未支付',
  `created_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_master` */

/*Table structure for table `product_brand` */

DROP TABLE IF EXISTS `product_brand`;

CREATE TABLE `product_brand` (
  `brand_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `category_id` int(11) NOT NULL COMMENT '关联类型的类目编号',
  `brand_name` varchar(64) NOT NULL COMMENT '品牌名字',
  `brandtype_id` int(11) NOT NULL COMMENT '品牌编号',
  `created_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`brand_id`),
  KEY `FK_BRAND_CATEGORY_ID` (`category_id`),
  CONSTRAINT `FK_BRAND_CATEGORY_ID` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_brand` */

/*Table structure for table `product_category` */

DROP TABLE IF EXISTS `product_category`;

CREATE TABLE `product_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `category_name` varchar(64) NOT NULL COMMENT '类目名字',
  `created_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_category` */

/*Table structure for table `product_info` */

DROP TABLE IF EXISTS `product_info`;

CREATE TABLE `product_info` (
  `product_id` varchar(32) NOT NULL COMMENT '主键',
  `brandtype_id` int(11) NOT NULL COMMENT '关联品牌的品牌编号',
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '单价',
  `product_stock` int(11) NOT NULL COMMENT '库存',
  `product_description` varchar(64) DEFAULT NULL COMMENT '描述',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '主图片',
  `product_status` tinyint(3) DEFAULT '0' COMMENT '商品状态,0正常1下架',
  `created_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`product_id`),
  KEY `FK_INFOBRAND_ID` (`brandtype_id`),
  CONSTRAINT `FK_INFOBRAND_ID` FOREIGN KEY (`brandtype_id`) REFERENCES `product_brand` (`brand_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_info` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` char(32) NOT NULL COMMENT '密码',
  `gender` int(11) DEFAULT NULL COMMENT '性别',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `uuid` char(36) DEFAULT NULL COMMENT '加密',
  `created_user` varchar(50) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

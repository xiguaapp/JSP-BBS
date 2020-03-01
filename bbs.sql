/*
SQLyog Ultimate v8.32 
MySQL - 5.5.36 : Database - bbs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bbs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bbs`;

/*Table structure for table `bbsreplys` */

DROP TABLE IF EXISTS `bbsreplys`;

CREATE TABLE `bbsreplys` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rtid` int(11) NOT NULL,
  `ruid` int(11) NOT NULL,
  `rinfo` varchar(500) NOT NULL,
  `rtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`rid`),
  KEY `FK_bbsreplys` (`rtid`),
  KEY `FK_bbsreplys_ruid` (`ruid`),
  CONSTRAINT `FK_bbsreplys_ruid` FOREIGN KEY (`ruid`) REFERENCES `bbsusers` (`uid`),
  CONSTRAINT `FK_bbsreplys` FOREIGN KEY (`rtid`) REFERENCES `bbstopics` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `bbsreplys` */

insert  into `bbsreplys`(`rid`,`rtid`,`ruid`,`rinfo`,`rtime`) values (1,2,3,'是傻逼','2020-02-29 23:13:57'),(2,2,3,'真的是傻逼','2020-02-29 23:29:12'),(3,2,3,'傻逼吗','2020-02-29 23:30:47'),(4,2,3,'傻逼吗1','2020-02-29 23:31:44'),(5,2,3,'傻逼吗12','2020-02-29 23:32:14'),(6,2,3,'傻逼啊','2020-02-29 23:33:15'),(7,2,3,'真傻比','2020-02-29 23:35:52'),(8,2,3,'是傻逼啊','2020-02-29 23:35:57'),(9,2,3,'大声道','2020-02-29 23:36:19'),(10,3,3,'龙王傻逼','2020-02-29 23:36:29'),(11,4,3,'傻逼龙王','2020-02-29 23:37:17');

/*Table structure for table `bbstopics` */

DROP TABLE IF EXISTS `bbstopics`;

CREATE TABLE `bbstopics` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tuid` int(11) NOT NULL,
  `ttitle` varchar(50) NOT NULL,
  `tinfo` varchar(500) NOT NULL,
  `ttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tid`),
  KEY `FK_bbstopics` (`tuid`),
  CONSTRAINT `FK_bbstopics` FOREIGN KEY (`tuid`) REFERENCES `bbsusers` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `bbstopics` */

insert  into `bbstopics`(`tid`,`tuid`,`ttitle`,`tinfo`,`ttime`) values (1,3,'龙王傻逼','龙王傻逼','2020-02-29 17:37:08'),(2,3,'龙王傻逼2121','121212','2020-02-29 18:03:38'),(3,3,'龙王傻逼2121啊','1212','2020-02-29 18:10:41'),(4,3,'傻逼龙王','傻逼龙王','2020-02-29 23:37:11');

/*Table structure for table `bbsusers` */

DROP TABLE IF EXISTS `bbsusers`;

CREATE TABLE `bbsusers` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `upassword` varchar(20) NOT NULL,
  `uemail` varchar(50) DEFAULT NULL,
  `usex` bit(1) DEFAULT NULL,
  `uregdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `bbsusers` */

insert  into `bbsusers`(`uid`,`uname`,`upassword`,`uemail`,`usex`,`uregdate`) values (1,'make','123456','123456@qq.com','','2020-02-28 17:28:56'),(2,'tom','123456','222222@qq.com','','2020-02-28 17:29:13'),(3,'xiguaapp','1234','1125698980@qq.com','\0','2020-02-29 16:41:59');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

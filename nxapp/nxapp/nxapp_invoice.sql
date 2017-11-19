CREATE DATABASE  IF NOT EXISTS `nxapp` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `nxapp`;
-- MySQL dump 10.13  Distrib 5.6.19, for Win32 (x86)
--
-- Host: localhost    Database: nxapp
-- ------------------------------------------------------
-- Server version	5.6.20-enterprise-commercial-advanced

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `invoiceid` varchar(45) NOT NULL,
  `cust_name` varchar(450) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `billadd` varchar(450) DEFAULT NULL,
  `shipingadd` varchar(450) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(450) DEFAULT NULL,
  `term` varchar(45) DEFAULT NULL,
  `paymetho` varchar(45) DEFAULT NULL,
  `icode` varchar(45) DEFAULT NULL,
  `iname` varchar(45) DEFAULT NULL,
  `qty` varchar(45) DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `amount` decimal(16,2) DEFAULT NULL,
  `tax` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `amtpaid` decimal(16,2) DEFAULT '0.00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES ('INV-00002','vaishali jain','2016-06-16','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CASH','5','product 2','2000','box','400',800000.00,'null','800000.0',0,10000.00),('INV-00003','vaishali jain','2016-06-16','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CASH','4','product 1','122','each','112',13664.00,'null','13664.0',0,13000.00),('INV-00004','vaishali jain','2016-06-16','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','30','CASH','4','product 1','12','each','122',1464.00,'null','1464.0',1,2928.00),('INV-00005','vaishali jain','2016-06-16','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CASH','4','product 1','122','each','12222',1491084.00,'null','1491084.0',0,0.00),('INV-00006','vaishali jain','2016-06-16','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CASH','4','product 1','121','each','121',14641.00,'null','14641.0',1,14641.00),('INV-00007','babu','2016-06-18','mjw jkhk khgjk jkg kjgjk 311001','mjw jkhk khgjk jkg 311001 kjgjk','bk','bk','30','CASH','5','product 2','100','box','200',20000.00,'null','20000.0',0,0.00),('INV-00008','vaishali jain','2016-06-24','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CHEQUE','4','product 1','2','each','1541',3082.00,'null','3082.0',0,0.00),('INV-00008','vaishali jain','2016-06-24','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CHEQUE','4','product 1','14','each','400',5600.00,'null','5600.0',0,0.00),('INV-00001','vaishali jain','2016-07-01','love garden main road bhil raj inDIA 311001','love garden main road bhil raj 311001 inDIA','8829946791','bdsksdflaf','15','CHEQUE','4','product 1','15','each','400',6000.00,'null','6000.0',0,20000.00),('INV-00009','saloni','2016-06-29','azad nagar','azad nagar','9461178415','salonipareek@GMAIL.COM','60','CHEQUE','6','product 3','4','bag','20000',80000.00,'null','80000.0',0,0.00),('INV-00010','vaishali jain','2016-07-26','4/138 hansmukhi balaji street, manikya nagar  bhilwara raj bhil raj india 311001','4/138 hansmukhi balaji street, manikya nagar  bhilwara raj bhil raj 311001 india','9829292690','jainvaishali385@gmail.com','15','CHEQUE','4','product 5','2','each','250000',500000.00,'null','500000.0',0,0.00),('INV-00011','vaishali jain','2016-08-15','4/138 hansmukhi balaji street, manikya nagar  bhilwara raj bhil raj india 311001','4/138 hansmukhi balaji street, manikya nagar  bhilwara raj bhil raj 311001 india','9829292690','jainvaishali385@gmail.com','15','CASH','4','product 5','2','each','1000',2000.00,'null','2000.0',0,0.00),('INV-00012','babu','2016-09-03','manikya ngr','manikya ngr','239586','ghghjg','15','CASH','','product 6','5','','8000',40000.00,'null','40000.0',0,5000.00),('INV-00013','vaishali jain','2016-09-04','4/138 hansmukhi balaji street, manikya nagar  bhilwara raj bhil raj india 311001','4/138 hansmukhi balaji street, manikya nagar  bhilwara raj bhil raj 311001 india','9829292690','jainvaishali385@gmail.com','15','null','4','product 5','2','each','22',44.00,'null','44.0',1,44.00),('INV-00014','shalini','2016-09-21','88-A subhash nagar bhilwara bhilwara rajasthan india 311001','88-A subhash nagar bhilwara bhilwara rajasthan','9982423232','shalini@gmail.com','30','CHEQUE','7','dell laptop','2','per','50000',100000.00,'null','100000.0',0,0.00),('INV-00014','shalini','2016-09-21','88-A subhash nagar bhilwara bhilwara rajasthan india 311001','88-A subhash nagar bhilwara bhilwara rajasthan','9982423232','shalini@gmail.com','30','CHEQUE','4','product 5','2','each','500',1000.00,'null','1000.0',0,0.00),('INV-00015','shalini','2016-09-12','88-A subhash nagar bhilwara bhilwara rajasthan india 311001','88-A subhash nagar bhilwara bhilwara rajasthan','9982423232','shalini@gmail.com','30','CHEQUE','4','product 5','5','each','500',2500.00,'null','2500.0',0,0.00);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-04 15:48:11

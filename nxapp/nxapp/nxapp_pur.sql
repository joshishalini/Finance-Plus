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
-- Table structure for table `pur`
--

DROP TABLE IF EXISTS `pur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pur` (
  `purid` varchar(45) NOT NULL DEFAULT '',
  `supp_name` varchar(250) DEFAULT NULL,
  `idate` varchar(45) DEFAULT NULL,
  `billadd` varchar(450) DEFAULT NULL,
  `shipingadd` varchar(450) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `term` varchar(45) DEFAULT NULL,
  `paymetho` varchar(45) DEFAULT NULL,
  `icode` varchar(45) DEFAULT NULL,
  `iname` varchar(45) DEFAULT NULL,
  `qty` varchar(45) DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `tax` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `amtpaid` decimal(16,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pur`
--

LOCK TABLES `pur` WRITE;
/*!40000 ALTER TABLE `pur` DISABLE KEYS */;
INSERT INTO `pur` VALUES ('PUR-00001','vaishali jain','2016-07-18','rk colony love gardn road bhil raj. india 311001','rk colony love gardn road bhil raj. india 311001','8963589635','sgjhdlkjg,d','15','CASH','4','product 1','12','each','15','180.0','null','180.0',0,0.00),('PUR-00002','vaishali jain','2016-07-18','rk colony love gardn road bhil raj. india 311001','rk colony love gardn road bhil raj. india 311001','8963589635','sgjhdlkjg,d','15','CASH','4','product 1','12','each','15','180.0','null','180.0',1,0.00),('PUR-00003','vaishali jain','2016-07-18','rk colony love gardn road bhil raj. india 311001','rk colony love gardn road bhil raj. india 311001','8963589635','sgjhdlkjg,d','15','CASH','4','product 1','12','each','15','180.0','null','180.0',0,0.00),('PUR-00003','vaishali jain','2016-07-18','rk colony love gardn road bhil raj. india 311001','rk colony love gardn road bhil raj. india 311001','8963589635','sgjhdlkjg,d','15','CASH','4','product 1','1','each','124','124.0','null','124.0',0,0.00),('PUR-00004','babu','2016-07-26','manikya ngr','bhilwara raj','236395','xyz@gmail.com','15','CHEQUE','4','product 5','3','each','2500000','7500000.0','null','7500000.0',0,0.00);
/*!40000 ALTER TABLE `pur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-04 15:48:12

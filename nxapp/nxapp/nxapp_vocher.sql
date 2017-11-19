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
-- Table structure for table `vocher`
--

DROP TABLE IF EXISTS `vocher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vocher` (
  `idvocher` varchar(45) NOT NULL,
  `date` date DEFAULT NULL,
  `ledgrcode` int(11) DEFAULT NULL,
  `dis` varchar(250) DEFAULT NULL,
  `dr` decimal(16,2) DEFAULT NULL,
  `cr` decimal(16,2) DEFAULT NULL,
  `accno` int(11) DEFAULT NULL,
  `accname` varchar(45) DEFAULT NULL,
  `cname` varchar(45) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `rate` decimal(16,2) DEFAULT NULL,
  `acopen` varchar(45) DEFAULT NULL,
  `acclosing` varchar(45) DEFAULT NULL,
  `calnu` int(11) DEFAULT NULL,
  `perticulers` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vocher`
--

LOCK TABLES `vocher` WRITE;
/*!40000 ALTER TABLE `vocher` DISABLE KEYS */;
INSERT INTO `vocher` VALUES ('PUR-00001','2016-07-18',15,'Expenses',180.00,0.00,1501,'Purchase','vaishali jain',12,15.00,'0','0',0,'product 1'),('PUR-00001','2016-07-18',13,'Current Laibilities',0.00,180.00,1301,'Sundary Creditors','vaishali jain',12,15.00,'0','0',0,'product 1'),('PUR-00002','2016-07-18',15,'Expenses',180.00,0.00,1501,'Purchase','vaishali jain',12,15.00,'0','0',0,'product 1'),('PUR-00002','2016-07-18',13,'Current Laibilities',0.00,180.00,1301,'Sundary Creditors','vaishali jain',12,15.00,'0','0',0,'product 1'),('PUR-00003','2016-07-18',15,'Expenses',180.00,0.00,1501,'Purchase','vaishali jain',12,15.00,'0','0',0,'product 1'),('PUR-00003','2016-07-18',13,'Current Laibilities',0.00,180.00,1301,'Sundary Creditors','vaishali jain',12,15.00,'0','0',0,'product 1'),('PUR-00003','2016-07-18',15,'Expenses',124.00,0.00,1501,'Purchase','vaishali jain',1,124.00,'0','0',0,'product 1'),('PUR-00003','2016-07-18',13,'Current Laibilities',0.00,124.00,1301,'Sundary Creditors','vaishali jain',1,124.00,'0','0',0,'product 1'),('14','2016-07-22',4,'Fixed assets',0.00,5555.00,14,'Buildings and Improvements','Buildings and Improvements',0,0.00,'0','0',0,'fsdf'),('25','2016-07-29',13,'Current liabilities',0.00,2500.00,25,'Input VAT 14%','Input VAT 14%',0,0.00,'0','0',0,'ewrwer'),('25','2016-07-29',13,'Current liabilities',2500.00,0.00,25,'Input VAT 14%','Input VAT 14%',0,0.00,'0','0',0,'ewrwer'),('25','2016-07-22',13,'Current liabilities',0.00,250000.00,25,'Input VAT 14%','Input VAT 14%',0,0.00,'0','0',0,'TESITNG'),('25','2016-07-22',13,'Current liabilities',250000.00,0.00,25,'Input VAT 14%','Input VAT 14%',0,0.00,'0','0',0,'TESITNG'),('PUR-00004','2016-07-26',15,'Expenses',7500000.00,0.00,1501,'Purchase','babu',3,2500000.00,'0','0',0,'product 5'),('PUR-00004','2016-07-26',13,'Current Laibilities',0.00,7500000.00,1301,'Sundary Creditors','babu',3,2500000.00,'0','0',0,'product 5'),('INV-00011','2016-08-15',17,'Income',0.00,2000.00,1701,'Sales','vaishali jain',2,1000.00,'0','0',0,'product 5'),('INV-00002','2016-08-16',14,'Current Assets',0.00,0.00,1401,'Sundary Debitors','vaishali jain',0,0.00,'0','0',0,'INV-00002 Payment'),('INV-00002','2016-08-16',14,'Current Assets',0.00,0.00,1402,'CURRENT A/C WITH BANK','vaishali jain',0,0.00,'0','0',0,'INV-00002 Payment'),('INV-00012','2016-09-03',17,'Income',0.00,40000.00,1701,'Sales','babu',5,8000.00,'0','0',0,'product 6'),('INV-00013','2016-09-04',17,'Income',0.00,44.00,1701,'Sales','vaishali jain',2,22.00,'0','0',0,'product 5'),('INV-00003','2016-09-14',14,'Current Assets',0.00,13000.00,1401,'Sundary Debitors','vaishali jain',0,0.00,'0','0',0,'INV-00003 Payment'),('INV-00003','2016-09-14',14,'Current Assets',13000.00,0.00,1401,'CASH IN HAND','vaishali jain',0,0.00,'0','0',0,'INV-00003 Payment'),('INV-00006','2016-09-14',14,'Current Assets',0.00,14641.00,1401,'Sundary Debitors','vaishali jain',0,0.00,'0','0',0,'INV-00006 Payment'),('INV-00006','2016-09-14',14,'Current Assets',14641.00,0.00,1401,'CASH IN HAND','vaishali jain',0,0.00,'0','0',0,'INV-00006 Payment'),('INV-00014','2016-09-21',17,'Income',0.00,100000.00,1701,'Sales','shalini',2,50000.00,'0','0',0,'dell laptop'),('INV-00014','2016-09-21',14,'Current Assets',100000.00,0.00,1401,'Sundary Debitors','shalini',2,50000.00,'0','0',0,'dell laptop'),('INV-00014','2016-09-21',17,'Income',0.00,1000.00,1701,'Sales','shalini',2,500.00,'0','0',0,'product 5'),('INV-00014','2016-09-21',14,'Current Assets',1000.00,0.00,1401,'Sundary Debitors','shalini',2,500.00,'0','0',0,'product 5'),('15','2016-09-05',4,'Fixed assets',0.00,6532.00,15,'Furniture and Equipment','Furniture and Equipment',0,0.00,'0','0',0,'sss'),('INV-00013','2016-09-05',14,'Current Assets',0.00,44.00,1401,'Sundary Debitors','vaishali jain',0,0.00,'0','0',0,'INV-00013 Payment'),('INV-00013','2016-09-05',14,'Current Assets',44.00,0.00,1401,'CASH IN HAND','vaishali jain',0,0.00,'0','0',0,'INV-00013 Payment'),('INV-00012','2016-09-05',14,'Current Assets',0.00,5000.00,1401,'Sundary Debitors','babu',0,0.00,'0','0',0,'INV-00012 Payment'),('INV-00012','2016-09-05',14,'Current Assets',5000.00,0.00,1401,'CASH IN HAND','babu',0,0.00,'0','0',0,'INV-00012 Payment'),('INV-00015','2016-09-12',17,'Income',0.00,2500.00,1701,'Sales','shalini',5,500.00,'0','0',0,'product 5'),('INV-00015','2016-09-12',14,'Current Assets',2500.00,0.00,1401,'Sundary Debitors','shalini',5,500.00,'0','0',0,'product 5');
/*!40000 ALTER TABLE `vocher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-04 15:48:10

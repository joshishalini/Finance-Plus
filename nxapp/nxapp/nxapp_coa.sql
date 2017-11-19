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
-- Table structure for table `coa`
--

DROP TABLE IF EXISTS `coa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coa` (
  `idcoa` int(11) NOT NULL AUTO_INCREMENT,
  `ctype` varchar(45) DEFAULT NULL,
  `lname` varchar(125) DEFAULT NULL,
  `des` varchar(45) DEFAULT NULL,
  `isuba` int(11) DEFAULT NULL,
  `dtaxcode` varchar(45) DEFAULT NULL,
  `bal` varchar(45) DEFAULT NULL,
  `asof` date DEFAULT NULL,
  PRIMARY KEY (`idcoa`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coa`
--

LOCK TABLES `coa` WRITE;
/*!40000 ALTER TABLE `coa` DISABLE KEYS */;
INSERT INTO `coa` VALUES (2,'Accounts receivable (Debtors)','Accounts Receivable (Debtors)','',0,'','0','2016-03-31'),(3,'Current assets','Deferred Krishi Kalyan Cess Input Credit','',0,'','0','2016-03-31'),(4,'Current assets','Deferred Service Tax Input Credit','',0,'','0','2016-03-31'),(5,'Current assets','Deferred VAT Input Credit','',0,'','0','2016-03-31'),(6,'Current assets','Inventory Asset','',0,'','0','2016-03-31'),(7,'Current assets','Krishi Kalyan Cess Refund','',0,'','0','2016-03-31'),(8,'Current assets','Prepaid Insurance','',0,'','0','2016-03-31'),(9,'Current assets','Service Tax Refund','',0,'','0','2016-03-31'),(10,'Current assets','TDS Receivable','',0,'','0','2016-03-31'),(11,'Current assets','Uncategorised Asset','',0,'','0','2016-03-31'),(12,'Current assets','Undeposited Funds','',0,'','0','2016-03-31'),(13,'Fixed assets','Accumulated Depreciation','',0,'','0','2016-03-31'),(14,'Fixed assets','Buildings and Improvements','',0,'','0','2016-03-31'),(15,'Fixed assets','Furniture and Equipment','',0,'','0','2016-03-31'),(16,'Fixed assets','Land','',0,'','0','2016-03-31'),(17,'Fixed assets','Leasehold Improvements','',0,'','0','2016-03-31'),(18,'Fixed assets','Vehicles','',0,'','0','2016-03-31'),(19,'Current liabilities','CST Payable','',0,'','0','2016-03-31'),(20,'Current liabilities','CST Suspense','',0,'','0','2016-03-31'),(21,'Current liabilities','Input Krishi Kalyan Cess','',0,'','0','2016-03-31'),(22,'Current liabilities','Input Krishi Kalyan Cess RCM','',0,'','0','2016-03-31'),(23,'Current liabilities','Input Service Tax','',0,'','0','2016-03-31'),(24,'Current liabilities','Input Service Tax RCM','',0,'','0','2016-03-31'),(25,'Current liabilities','Input VAT 14%','',0,'','0','2016-03-31'),(26,'Current liabilities','Input VAT 4%','',0,'','0','2016-03-31'),(27,'Current liabilities','Input VAT 5%','',0,'','0','2016-03-31'),(28,'Current liabilities','Krishi Kalyan Cess Payable','',0,'','0','2016-03-31'),(29,'Current liabilities','Krishi Kalyan Cess Suspense','',0,'','0','2016-03-31'),(30,'Current liabilities','Output CST 2%','',0,'','0','2016-03-31'),(31,'Current liabilities','Output Krishi Kalyan Cess','',0,'','0','2016-03-31'),(32,'Current liabilities','Output Krishi Kalyan Cess RCM','',0,'','0','2016-03-31'),(33,'Current liabilities','Output Service Tax','',0,'','0','2016-03-31'),(34,'Current liabilities','Output Service Tax RCM','',0,'','0','2016-03-31'),(35,'Current liabilities','Output VAT 14%','',0,'','0','2016-03-31'),(36,'Current liabilities','Output VAT 4%','',0,'','0','2016-03-31'),(37,'Current liabilities','Output VAT 5%','',0,'','0','2016-03-31'),(38,'Current liabilities','Service Tax Payable','',0,'','0','2016-03-31'),(39,'Current liabilities','Service Tax Suspense','',0,'','0','2016-03-31'),(40,'Current liabilities','Swachh Bharat Cess Payable','',0,'','0','2016-03-31'),(41,'Current liabilities','Swachh Bharat Cess Suspense','',0,'','0','2016-03-31'),(42,'Current liabilities','TDS Payable','',0,'','0','2016-03-31'),(43,'Current liabilities','VAT Payable','',0,'','0','2016-03-31'),(44,'Current liabilities','VAT Suspense','',0,'','0','2016-03-31'),(45,'Equity','Opening Balance Equity','',0,'','0','2016-03-31'),(46,'Equity','Retained Earnings','',0,'','0','2016-03-31'),(47,'Income','Billable Expense Income','',0,'','0','2016-03-31'),(48,'Income','Discounts given','',0,'','0','2016-03-31'),(49,'Income','Sales','',0,'','0','2016-03-31'),(50,'Income','Sales Discounts','',0,'','0','2016-03-31'),(51,'Income','Sales of Product Income','',0,'','0','2016-03-31'),(52,'Income','Services','',0,'','0','2016-03-31'),(53,'Income','Unapplied Cash Payment Income','',0,'','0','2016-03-31'),(54,'Income','Uncategorised Income','',0,'','0','2016-03-31'),(55,'Cost of Goods Sold','Cost of sales','',0,'','0','2016-03-31'),(56,'Cost of Goods Sold','Merchant Account Fees','',0,'','0','2016-03-31'),(57,'Cost of Goods Sold','Subcontracted Services','',0,'','0','2016-03-31'),(58,'Expenses','Business Licenses and Permits','',0,'','0','2016-03-31'),(59,'Expenses','Charitable Contributions','',0,'','0','2016-03-31'),(60,'Expenses','Computer and Internet Expenses','',0,'','0','2016-03-31'),(61,'Expenses','Continuing Education','',0,'','0','2016-03-31'),(62,'Expenses','Depreciation Expense','',0,'','0','2016-03-31'),(63,'Expenses','Dues and Subscriptions','',0,'','0','2016-03-31'),(64,'Expenses','Equipment rental','',0,'','0','2016-03-31'),(65,'Expenses','Housekeeping Charges','',0,'','0','2016-03-31'),(66,'Expenses','Insurance Expense','',0,'','0','2016-03-31'),(67,'Expenses','Insurance Expense-General Liability Insurance','',0,'','0','2016-03-31'),(68,'Expenses','Insurance Expense-Health Insurance','',0,'','0','2016-03-31'),(69,'Expenses','Insurance Expense-Life and Disability Insurance','',0,'','0','2016-03-31'),(70,'Expenses','Insurance Expense-Professional Liability','',0,'','0','2016-03-31'),(71,'Expenses','Interest expense','',0,'','0','2016-03-31'),(72,'Expenses','Meals and entertainment','',0,'','0','2016-03-31'),(73,'Expenses','Office Supplies','',0,'','0','2016-03-31'),(74,'Expenses','Postage and Delivery','',0,'','0','2016-03-31'),(75,'Expenses','Printing and Reproduction','',0,'','0','2016-03-31'),(76,'Expenses','Professional Fees','',0,'','0','2016-03-31'),(77,'Expenses','Purchases','',0,'','0','2016-03-31'),(78,'Expenses','Rent Expense','',0,'','0','2016-03-31'),(79,'Expenses','Repair and maintenance','',0,'','0','2016-03-31'),(80,'Expenses','Swachh Bharat Cess Expense','',0,'','0','2016-03-31'),(81,'Expenses','Taxes - Property','',0,'','0','2016-03-31'),(82,'Expenses','Telephone Expense','',0,'','0','2016-03-31'),(83,'Expenses','Travel Expense','',0,'','0','2016-03-31'),(84,'Expenses','Uncategorised Expense','',0,'','0','2016-03-31'),(85,'Expenses','Utilities','',0,'','0','2016-03-31'),(86,'Other Income','Finance Charge Income','',0,'','0','2016-03-31'),(87,'Other Income','Insurance Proceeds Received','',0,'','0','2016-03-31'),(88,'Other Income','Interest income','',0,'','0','2016-03-31'),(89,'Other Income','Proceeds from Sale of Assets','',0,'','0','2016-03-31'),(90,'Other Expense','Advertising and Promotion','',0,'','0','2016-03-31'),(91,'Other Expense','Ask My Accountant','',0,'','0','2016-03-31'),(92,'Other Expense','Bank Service Charges','',0,'','0','2016-03-31'),(93,'Other Expense','Miscellaneous Expense','',0,'','0','2016-03-31'),(94,'Other Expense','Political Contributions','',0,'','0','2016-03-31'),(95,'Other Expense','Tax write-off','',0,'','0','2016-03-31'),(96,'Other Expense','Vehicle Expenses','',0,'','0','2016-03-31');
/*!40000 ALTER TABLE `coa` ENABLE KEYS */;
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

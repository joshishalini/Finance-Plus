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
-- Table structure for table `cust`
--

DROP TABLE IF EXISTS `cust`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cust` (
  `idcust` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(450) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phno` varchar(45) DEFAULT NULL,
  `aline1` varchar(45) DEFAULT NULL,
  `aline2` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `pin` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `sline1` varchar(45) DEFAULT NULL,
  `sline2` varchar(45) DEFAULT NULL,
  `scity` varchar(45) DEFAULT NULL,
  `sstate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcust`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cust`
--

LOCK TABLES `cust` WRITE;
/*!40000 ALTER TABLE `cust` DISABLE KEYS */;
INSERT INTO `cust` VALUES (1,'shalini joshi','shalinijoshi1996@gmail.com','01482264432','88-A subhash nagar','bhilwara','bhilwara','rajasthan','india','311001','9982423232','88-A subhash nagar','bhilwara','bhilwara','rajasthan'),(2,'simran sharma','sim.sharma@gmail.com','01482345655','aazad nagar','bhilwara','bhilwara','rah','india','311001','98874235665','aaazad nagar','bhilwara','bhilwara','raj'),(3,'saloni pareek','khttu@gmail.com','561245','pur road','main road','bhilwara','raj','india','311001','421354532','pur road','main road','bhilwara','raj'),(4,'vaishali','jainn@gmail.com','7853145','near shree guest ','house','bhilwara','raj','india','311001','67564324','near shree guest ','house','bhilwara','raj'),(5,'vandana','ahdjsy@ghbnms.com','8965325632','rc vyas','near shivaji','bhilwara','raj','india','311001','865325632','rc vyas','near shivaji','bhilwara','raj'),(6,'shalini joshi','shalinijoshi1996@gmail.com','01482264432','88-A subhash nagar','bhilwara','bhilwara','rajasthan','india','311001','9982423232','','','','');
/*!40000 ALTER TABLE `cust` ENABLE KEYS */;
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

-- MySQL dump 10.13  Distrib 5.6.21, for Win32 (x86)
--
-- Host: localhost    Database: futsal
-- ------------------------------------------------------
-- Server version	5.6.21

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
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookings` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tglmain` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `mulai` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `berakhir` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `hp` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `kota` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tempat` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
INSERT INTO `bookings` VALUES (1,'s','s','s','s','s','s','s','s','2015-02-19 05:38:02','2015-02-19 05:38:02',NULL),(2,'sdf','sdf','vswrg','vfbewr','sfw','rgwrg','wrgw','sfvs','2015-02-19 06:31:42','2015-02-19 06:31:42',NULL),(3,'Muhammad','12/06/2015','06.00','07.00','083898360398','Synthetis','Jakarta Timur','Barokah','2015-02-19 17:36:16','2015-02-19 17:36:16',NULL),(4,'eth','234','56456','34534534','353453654645','dgtgt','fg','sfg','0000-00-00 00:00:00','0000-00-00 00:00:00',NULL),(5,'eth','234','56456','34534534','353453654645','dgtgt','Jakarta','sfg','0000-00-00 00:00:00','0000-00-00 00:00:00',NULL),(6,'Saami','12/03/2015','07.00','09.00','083898360398','Plur','Jakarta Timur','ITFutsal','0000-00-00 00:00:00','0000-00-00 00:00:00',NULL),(7,'hdhdh','64344','hsyd','bdhxu','649464','hdyxhx','hshs','hxhxh','0000-00-00 00:00:00','0000-00-00 00:00:00',NULL),(8,'sdfdsf','23425','345345','234','234234','adfaf','dfsdfsdf','sdf','0000-00-00 00:00:00','0000-00-00 00:00:00',NULL),(9,'Januar','01/01/2015','08.00','09.00','02199876543','Plur','Jakarta Selatan','TheFutsal','0000-00-00 00:00:00','0000-00-00 00:00:00','muhammad160696@gmail.com'),(10,'adas','afdfA','dfsdf','fwdf','fwsdfdf','wrfwf','rw','sf','2015-02-20 00:12:49','2015-02-20 00:12:49',NULL),(11,'Ahmad','19/02/2015','17.00','18.00','081398653232','synthetis','jakarta timur','KitFutsal','0000-00-00 00:00:00','0000-00-00 00:00:00','ahmad@yahoo.com'),(12,'asd','234','234','234','27327','ffr','asdasd','asd','0000-00-00 00:00:00','0000-00-00 00:00:00','efefgergerg'),(13,'sfgfsg','45345','32434','234234','234245','sdfsdgsd','sdf','swrfwrf','0000-00-00 00:00:00','0000-00-00 00:00:00','fsdfsdf'),(14,'df','12312134','134','234234','083898360398','234sdf','asd','sad','0000-00-00 00:00:00','0000-00-00 00:00:00','sadasd'),(15,'sfgsfg','23423','23234','234234','083898360398','sdfsdf','sdf','sdfgsg','0000-00-00 00:00:00','0000-00-00 00:00:00','sdfsdfsdf'),(16,'hdfbd','64645434','6464','67','083898360398','gxgx','hshs','hdhd','0000-00-00 00:00:00','0000-00-00 00:00:00','hcyx'),(17,'gshshs','6434','573734','676767','083898360398','gdgh','hshs','gdgdh','0000-00-00 00:00:00','0000-00-00 00:00:00','hsydys'),(18,'hdhf','643737','668','8338','646867','hdhdh','hshs','hdhd','0000-00-00 00:00:00','0000-00-00 00:00:00','hdydyd');
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `migrations`
--

DROP TABLE IF EXISTS `migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `migrations` (
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `migrations`
--

LOCK TABLES `migrations` WRITE;
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` VALUES ('2015_02_19_104531_create_booking_table',1);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-25 12:30:37

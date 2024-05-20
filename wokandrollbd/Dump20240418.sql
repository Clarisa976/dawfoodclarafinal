-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: wokandroll
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `detalletickets`
--

LOCK TABLES `detalletickets` WRITE;
/*!40000 ALTER TABLE `detalletickets` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalletickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Sushi',10.00,'IVA_DIEZ',50,1),(2,'Ramen',8.00,'IVA_DIEZ',50,2),(3,'Dim Sum',7.00,'IVA_DIEZ',50,3),(4,'Pho',9.00,'IVA_DIEZ',50,4),(5,'Pad Thai',9.50,'IVA_DIEZ',50,5),(6,'Cerveza',3.00,'IVA_VEINTIUNO',100,6),(7,'Sake',15.00,'IVA_VEINTIUNO',100,7),(8,'Té verde',2.50,'IVA_VEINTIUNO',100,8),(9,'Soju',13.00,'IVA_VEINTIUNO',100,9),(10,'Bubble Tea',4.50,'IVA_VEINTIUNO',100,10),(11,'Mochi',4.00,'IVA_DIEZ',30,11),(12,'Tarta de queso japonesa',4.50,'IVA_DIEZ',30,12),(13,'Bolas de sésamo',4.00,'IVA_DIEZ',30,13),(14,'Tangyuan',4.50,'IVA_DIEZ',30,14),(15,'Helado de té verde',3.50,'IVA_DIEZ',30,15);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (1,1,'TRANS001','2024-03-23','12:15:05',23.50),(2,2,'TRANS002','2024-03-24','12:15:05',20.00),(3,3,'TRANS003','2024-03-24','12:25:05',30.00),(4,4,'TRANS004','2024-03-25','12:05:05',25.00),(5,5,'TRANS005','2024-03-25','12:15:05',28.50);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tiposproductos`
--

LOCK TABLES `tiposproductos` WRITE;
/*!40000 ALTER TABLE `tiposproductos` DISABLE KEYS */;
INSERT INTO `tiposproductos` VALUES (1,'Sushi','COMIDAS'),(2,'Ramen','COMIDAS'),(3,'Dim Sum','COMIDAS'),(4,'Pho','COMIDAS'),(5,'Pad Thai','COMIDAS'),(6,'Cerveza','BEBIDAS'),(7,'Sake','BEBIDAS'),(8,'Té verde','BEBIDAS'),(9,'Soju','BEBIDAS'),(10,'Bubble Tea','BEBIDAS'),(11,'Mochi','POSTRES'),(12,'Tarta de queso japonesa','POSTRES'),(13,'Bolas de sésamo','POSTRES'),(14,'Tangyuan','POSTRES'),(15,'Helado de té verde','POSTRES');
/*!40000 ALTER TABLE `tiposproductos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tpv`
--

LOCK TABLES `tpv` WRITE;
/*!40000 ALTER TABLE `tpv` DISABLE KEYS */;
INSERT INTO `tpv` VALUES (1,'Ab*+34','Calle falsa, 123','2024-03-23','12:15:05');
/*!40000 ALTER TABLE `tpv` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-18 19:21:22

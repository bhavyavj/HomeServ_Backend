-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)

--

-- Host: localhost    Database: finalproject

-- ------------------------------------------------------

-- Server version	8.0.28



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

-- Table structure for table `purchase`

--



DROP TABLE IF EXISTS `purchase`;

/*!40101 SET @saved_cs_client     = @@character_set_client */;

/*!50503 SET character_set_client = utf8mb4 */;

CREATE TABLE `purchase` (

  `id` int NOT NULL AUTO_INCREMENT,

  `sub_id` int DEFAULT NULL,

  `user_userid` bigint DEFAULT NULL,

  PRIMARY KEY (`id`),

  KEY `FKj1fx2iji1qswt3b80t6p7h7h7` (`sub_id`),

  KEY `FKt48nght3j7xq4p4dsiocj35jk` (`user_userid`),

  CONSTRAINT `FKj1fx2iji1qswt3b80t6p7h7h7` FOREIGN KEY (`sub_id`) REFERENCES `sub_services` (`id`),

  CONSTRAINT `FKt48nght3j7xq4p4dsiocj35jk` FOREIGN KEY (`user_userid`) REFERENCES `users` (`userid`)

) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET character_set_client = @saved_cs_client */;



--

-- Dumping data for table `purchase`

--



LOCK TABLES `purchase` WRITE;

/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;

INSERT INTO `purchase` VALUES (1,1,1),(8,5,1);

/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;

UNLOCK TABLES;



--

-- Table structure for table `sub_services`

--



DROP TABLE IF EXISTS `sub_services`;

/*!40101 SET @saved_cs_client     = @@character_set_client */;

/*!50503 SET character_set_client = utf8mb4 */;

CREATE TABLE `sub_services` (

  `id` int NOT NULL AUTO_INCREMENT,

  `category` varchar(255) DEFAULT NULL,

  `cost` int NOT NULL,

  `service` varchar(255) DEFAULT NULL,

  `subservice` varchar(255) DEFAULT NULL,

  PRIMARY KEY (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET character_set_client = @saved_cs_client */;



--

-- Dumping data for table `sub_services`

--



LOCK TABLES `sub_services` WRITE;

/*!40000 ALTER TABLE `sub_services` DISABLE KEYS */;

INSERT INTO `sub_services` VALUES (1,'Personal',100,'SalonForM','Haircut'),(2,'Home',2000,'Acservice','Cleaning'),(3,'Personal',200,'SalonforW','Waxing'),(4,'Personal',200,'MassageforMen','Massage'),(5,'Home',200,'AppliancesRepair','Refrigerator'),(6,'Home',200,'CleaningandPest','PestControl'),(7,'Home',200,'RepairsandPainting','Plumbers'),(8,'Home',200,'RepairsandPainting','Electrician'),(9,'Home',200,'RepairsandPainting','Carpenters'),(10,'Home',1000,'CleaningandPest','SofaandCarpetClean');

/*!40000 ALTER TABLE `sub_services` ENABLE KEYS */;

UNLOCK TABLES;



--

-- Table structure for table `users`

--



DROP TABLE IF EXISTS `users`;

/*!40101 SET @saved_cs_client     = @@character_set_client */;

/*!50503 SET character_set_client = utf8mb4 */;

CREATE TABLE `users` (

  `userid` bigint NOT NULL AUTO_INCREMENT,

  `address` varchar(255) DEFAULT NULL,

  `email` varchar(255) DEFAULT NULL,

  `fullname` varchar(255) DEFAULT NULL,

  `password` varchar(255) DEFAULT NULL,

  PRIMARY KEY (`userid`),

  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`)

) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET character_set_client = @saved_cs_client */;



--

-- Dumping data for table `users`

--



LOCK TABLES `users` WRITE;

/*!40000 ALTER TABLE `users` DISABLE KEYS */;

INSERT INTO `users` VALUES (1,'IIITB ','Abhay@gmail.com','Abhay','password'),(3,'IIITB 1','Abhay2@gmail.com','Abhay 2','password2'),(4,'iiitb','rishu@gmail.com','rishu','rishu'),(15,'iiitb','rishab','rishab','rishab');

/*!40000 ALTER TABLE `users` ENABLE KEYS */;

UNLOCK TABLES;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;

/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;

/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


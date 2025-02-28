-- MySQL dump 10.13  Distrib 9.2.0, for macos15 (arm64)
--
-- Host: localhost    Database: CRSPROGRAM
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Course_Details`
--

DROP TABLE IF EXISTS `Course_Details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Course_Details` (
  `CourseID` varchar(20) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `CreditHours` int NOT NULL,
  `Department` varchar(255) NOT NULL,
  `prerequisites` varchar(255) DEFAULT NULL,
  `MaxEnrollmentCapacity` int NOT NULL,
  PRIMARY KEY (`CourseID`),
  CONSTRAINT `course_details_chk_1` CHECK ((`CreditHours` > 0)),
  CONSTRAINT `course_details_chk_2` CHECK ((`MaxEnrollmentCapacity` > 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Course_Details`
--

LOCK TABLES `Course_Details` WRITE;
/*!40000 ALTER TABLE `Course_Details` DISABLE KEYS */;
INSERT INTO `Course_Details` VALUES ('C100','Computer Science',4,'Information technolagy','Pass The AL\'s',200);
/*!40000 ALTER TABLE `Course_Details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Enrollment`
--

DROP TABLE IF EXISTS `Enrollment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Enrollment` (
  `StudentID` varchar(10) NOT NULL,
  `CourseID` varchar(10) NOT NULL,
  `Semester` varchar(20) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  PRIMARY KEY (`StudentID`,`CourseID`,`Semester`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Enrollment`
--

LOCK TABLES `Enrollment` WRITE;
/*!40000 ALTER TABLE `Enrollment` DISABLE KEYS */;
INSERT INTO `Enrollment` VALUES ('1000','C100','Spring-2025','A');
/*!40000 ALTER TABLE `Enrollment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Faculty_Details`
--

DROP TABLE IF EXISTS `Faculty_Details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Faculty_Details` (
  `FacultyID` int NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Contact` varchar(20) NOT NULL,
  PRIMARY KEY (`FacultyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Faculty_Details`
--

LOCK TABLES `Faculty_Details` WRITE;
/*!40000 ALTER TABLE `Faculty_Details` DISABLE KEYS */;
INSERT INTO `Faculty_Details` VALUES (1111,'Mr.Iwan Senarath','Information Technolgy','07765231445');
/*!40000 ALTER TABLE `Faculty_Details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Student_Details`
--

DROP TABLE IF EXISTS `Student_Details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Student_Details` (
  `StudentID` varchar(20) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `ProgramOfStudy` varchar(255) NOT NULL,
  `Year` int NOT NULL,
  `Contact` varchar(20) NOT NULL,
  PRIMARY KEY (`StudentID`),
  CONSTRAINT `student_details_chk_1` CHECK ((`Year` > 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Student_Details`
--

LOCK TABLES `Student_Details` WRITE;
/*!40000 ALTER TABLE `Student_Details` DISABLE KEYS */;
INSERT INTO `Student_Details` VALUES ('1000','Ravindu','2003-09-01','Computer Science',1,'0741129660');
/*!40000 ALTER TABLE `Student_Details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (5,'Admin','Admin123',3),(6,'Faculty','Faculty123',2),(7,'Ravindu','Ravindu123',1);
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

-- Dump completed on 2025-02-28 23:15:46

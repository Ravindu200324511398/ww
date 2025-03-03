-- MySQL dump 10.13  Distrib 9.2.0, for macos15 (arm64)
--
-- Host: localhost    Database: crsprogram
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
INSERT INTO `Course_Details` VALUES ('C100','Data Structures',3,'Computer Sci',NULL,100),('C101','Database Management',4,'Computer Sci','C100',80),('C102','Operating Systems',3,'Computer Sci','C100',89),('C200','Calculus I',3,'Mathematics',NULL,120),('C201','Linear Algebra',3,'Mathematics','C200',100);
/*!40000 ALTER TABLE `Course_Details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollment`
--

DROP TABLE IF EXISTS `enrollment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollment` (
  `StudentID` varchar(10) NOT NULL,
  `CourseID` varchar(10) NOT NULL,
  `Semester` varchar(10) DEFAULT NULL,
  `Grade` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`StudentID`,`CourseID`),
  UNIQUE KEY `StudentID` (`StudentID`,`CourseID`,`Semester`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollment`
--

LOCK TABLES `enrollment` WRITE;
/*!40000 ALTER TABLE `enrollment` DISABLE KEYS */;
INSERT INTO `enrollment` VALUES ('S1000','C100','Fall2024','A'),('S1000','C102',NULL,NULL),('S1001','C200','Fall2024','B+'),('S1002','C101','Spring2024','A-'),('S1003','C100','Spring2024','B'),('S1004','C201','Fall2024','C+');
/*!40000 ALTER TABLE `enrollment` ENABLE KEYS */;
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
INSERT INTO `Faculty_Details` VALUES (101,'Dr. Alan Turing','Computer Science','1234567890'),(102,'Prof. Marie Curie','Mathematics','2345678901'),(103,'Dr. Richard Feynman','Physics','3456789012'),(104,'Prof. Ada Lovelace','Computer Science','4567890123'),(105,'Dr. Carl Gauss','Mathematics','5678901234');
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
INSERT INTO `Student_Details` VALUES ('S1001','Jane Smith','2002-08-21','Mathematics',3,'8765432109'),('S1004','David Kim','2003-06-28','Mathematics',1,'5432109876');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin123',3),(2,'jdoe','pass123',1),(3,'jsmith','pass456',1),(4,'alex_b','pass789',1),(5,'maria_l','pass999',2);
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

-- Dump completed on 2025-03-03  8:46:51

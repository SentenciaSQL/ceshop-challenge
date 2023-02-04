-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.25-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for ceshop_db
DROP DATABASE IF EXISTS `ceshop_db`;
CREATE DATABASE IF NOT EXISTS `ceshop_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `ceshop_db`;

-- Dumping structure for table ceshop_db.course
DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `total_questions` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table ceshop_db.course: ~5 rows (approximately)
DELETE FROM `course`;
INSERT INTO `course` (`id`, `name`, `total_questions`) VALUES
	(1, 'Python Advanced', 20),
	(2, 'Python Django from Novice to Expert', 25),
	(3, 'Problem solving skills', 70),
	(4, 'Angular 15 advance course', 30),
	(5, 'Flutter Web', 55);

-- Dumping structure for table ceshop_db.progress
DROP TABLE IF EXISTS `progress`;
CREATE TABLE IF NOT EXISTS `progress` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `completed_questions` int(11) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsyhehp7u3ky9phqokro91ih4v` (`course_id`),
  KEY `FKe7ddmavui4eo4h2cxvu8ql72r` (`student_id`),
  CONSTRAINT `FKe7ddmavui4eo4h2cxvu8ql72r` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  CONSTRAINT `FKsyhehp7u3ky9phqokro91ih4v` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table ceshop_db.progress: ~3 rows (approximately)
DELETE FROM `progress`;
INSERT INTO `progress` (`id`, `completed_questions`, `course_id`, `student_id`) VALUES
	(1, 13, 1, 1),
	(2, 20, 2, 3),
	(3, 55, 3, 2),
	(5, 52, 5, 1);

-- Dumping structure for table ceshop_db.student
DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table ceshop_db.student: ~4 rows (approximately)
DELETE FROM `student`;
INSERT INTO `student` (`id`, `first_name`, `last_name`) VALUES
	(1, 'Andres', 'Frias'),
	(2, 'Sammy', 'Sossa'),
	(3, 'Daniel', 'Estevez'),
	(4, 'Santiago', 'Aponte');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

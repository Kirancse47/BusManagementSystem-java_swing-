-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 27, 2020 at 07:48 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_details`
--

DROP TABLE IF EXISTS `admin_details`;
CREATE TABLE IF NOT EXISTS `admin_details` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_details`
--

INSERT INTO `admin_details` (`id`, `name`, `username`, `password`) VALUES
(1, 'Kiran Bari', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `assign_bus`
--

DROP TABLE IF EXISTS `assign_bus`;
CREATE TABLE IF NOT EXISTS `assign_bus` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `assign_date` varchar(20) DEFAULT NULL,
  `employee_name` varchar(20) DEFAULT NULL,
  `bus_no` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assign_bus`
--

INSERT INTO `assign_bus` (`id`, `assign_date`, `employee_name`, `bus_no`) VALUES
(2, '02-11-2019', 'Kiran Bari', 'WB-123'),
(3, '02-11-2019', 'Sagar Panda', 'WB-123'),
(4, '02-11-2019', 'Arijit Ghosh', 'WB-124');

-- --------------------------------------------------------

--
-- Table structure for table `bus_book`
--

DROP TABLE IF EXISTS `bus_book`;
CREATE TABLE IF NOT EXISTS `bus_book` (
  `booking_id` int(5) NOT NULL AUTO_INCREMENT,
  `booking_user` varchar(50) NOT NULL,
  `booking_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `journey_date` varchar(50) NOT NULL,
  `bus_no` varchar(50) NOT NULL,
  `seat` varchar(50) NOT NULL,
  `paid` varchar(50) NOT NULL,
  `id_no` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_book`
--

INSERT INTO `bus_book` (`booking_id`, `booking_user`, `booking_time`, `journey_date`, `bus_no`, `seat`, `paid`, `id_no`, `first_name`, `last_name`) VALUES
(1, 'kirancse', '2019-11-12 14:43:44', '05-11-2019', 'WB-126', '11', '500', '77272511', 'Kiran', 'Bari'),
(2, 'admin', '2019-11-12 15:14:01', '04-11-2019', 'WB-125', '2', '200', '465496464', 'Raja', 'Bari'),
(3, 'admin', '2019-11-12 16:09:20', '06-11-2019', 'WB-127', '5', '50', '6545646', 'Arijit', 'Ghosh'),
(4, 'admin', '2019-11-12 21:34:17', '02-11-2019', 'WB-124', '25', '70', '6546', 'King', 'Khan'),
(5, 'admin', '2019-11-12 21:49:16', '05-11-2019', 'WB-126', '2', '500', '2587685', 'Raja', 'Pal'),
(6, 'admin', '2019-11-12 22:27:11', '04-11-2019', 'WB-125', '1', '200', '69565', 'kabir', 'khan'),
(7, 'admin', '2019-11-12 22:30:30', '05-11-2019', 'WB-126', '2', '500', '568', 'gajni', 'khan'),
(8, 'admin', '2019-11-13 16:09:04', '06-11-2019', 'WB-127', '0', '50', '75785', 'kiran', 'bari'),
(9, 'kirancse', '2019-11-13 16:21:03', '04-11-2019', 'WB-125', '5', '200', '547667', 'raja', 'bari'),
(10, 'kirancse', '2019-11-13 16:36:20', '04-11-2019', 'WB-125', '5', '200', '5245', 'Vivek', 'pal'),
(11, 'kirancse', '2019-11-13 16:40:55', '05-11-2019', 'WB-126', '3', '500', '387668', 'Ayan', 'Sardar'),
(12, 'kirancse', '2019-11-13 17:16:24', '05-11-2019', 'WB-126', '5', '500', '65546', 'jamal', 'mallic'),
(13, 'admin', '2019-11-13 17:22:22', '04-11-2019', 'WB-125', '5', '200', '85875', 'king', 'khan'),
(14, 'kirancse', '2019-11-13 17:50:19', '06-11-2019', 'WB-127', '2', '50', '9647', 'Milon', 'Bari'),
(15, 'admin', '2019-11-13 17:52:39', '02-11-2019', 'WB-124', '9', '70', '5345456', 'palash', 'bari'),
(16, 'kirancse', '2019-11-14 11:34:10', '04-11-2019', 'WB-125', '7', '200', '6865', 'surya', 'hazra'),
(17, 'kirancse', '2019-11-14 13:19:39', '05-11-2019', 'WB-126', '8', '500', '25875', 'dipta', 'misra'),
(18, 'kirancse', '2019-11-15 06:09:39', '19-11-2019', 'WB-125', '8', '800', '644654', 'kaushik', 'ghosh'),
(19, 'kirancse', '2019-11-15 06:32:55', '17-11-2019', 'WB-124', '55', '70', '646496', 'kiran', 'ba'),
(20, 'kirancse', '2019-11-20 13:08:57', '17-11-2019', 'WB-124', '15', '70', '654656464', 'ayan', 'lkefhe');

-- --------------------------------------------------------

--
-- Table structure for table `bus_details`
--

DROP TABLE IF EXISTS `bus_details`;
CREATE TABLE IF NOT EXISTS `bus_details` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `bus_no` varchar(20) DEFAULT NULL,
  `movement` varchar(20) DEFAULT NULL,
  `bus_source` varchar(20) DEFAULT NULL,
  `bus_dest` varchar(20) DEFAULT NULL,
  `depart_date` varchar(20) DEFAULT NULL,
  `depart_time` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `total_seat` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_details`
--

INSERT INTO `bus_details` (`id`, `bus_no`, `movement`, `bus_source`, `bus_dest`, `depart_date`, `depart_time`, `price`, `total_seat`) VALUES
(3, 'WB-124', 'UP', 'BWN', 'BHP', '17-11-2019', '10:30 AM', '70', '30'),
(4, 'WB-125', 'UP', 'COB', 'KOL', '19-11-2019', '07:15 AM', '800', '142'),
(5, 'WB-126', 'DOWN', 'DGP', 'COB', '16-12-2019', '6:30 AM', '500', '120'),
(2, 'WB-127', 'DOWN', 'BWN', 'DPG', '16-11-2019', '09:20 AM', '50', '100');

-- --------------------------------------------------------

--
-- Table structure for table `emp_details`
--

DROP TABLE IF EXISTS `emp_details`;
CREATE TABLE IF NOT EXISTS `emp_details` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `co` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `bank_name` varchar(20) DEFAULT NULL,
  `account_no` varchar(20) DEFAULT NULL,
  `ifsc_code` varchar(20) DEFAULT NULL,
  `date_joining` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_details`
--

INSERT INTO `emp_details` (`id`, `name`, `co`, `mobile`, `email`, `aadhar`, `salary`, `address`, `bank_name`, `account_no`, `ifsc_code`, `date_joining`) VALUES
(1, 'Kiran Bari', 'Tapan Bari', '8391811628', 'kiranmath4497', '228977272511', '150000', 'Nabagram,Mosidpur,Galsi,WB,713428', 'BOI', '24578958455665223', 'BOI54446', '10-10-2019'),
(3, 'Sagar Panda', 'Joydev Panda', '8569784515', 'pandasa@gmail.com', '2598685245587585', '12000', 'arambag,bangai,hooghly,7236845', 'SBI', '33658974522', 'SBI78985', '14-11-2019'),
(4, 'Arijit Ghosh', 'Monoj Ghosh', '845798695', 'arijit@gmail.com', '695469646746747', '140000', 'durgapur,w.b,715485', 'BOB', '5415464364', 'BOB1574656', '22-10-2019');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
CREATE TABLE IF NOT EXISTS `user_details` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `emailid` varchar(20) DEFAULT NULL,
  `mobileno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`id`, `firstname`, `lastname`, `username`, `password`, `emailid`, `mobileno`) VALUES
(6, 'Sagar', 'Panda', 'cgec', 'cse', 'pandasa@gmail.com', '8569412378'),
(9, 'Kiran', 'Bari', 'kirancse', 'cse47', 'kirancse47@gmail.com', '8617689738');

-- --------------------------------------------------------

--
-- Table structure for table `user_report`
--

DROP TABLE IF EXISTS `user_report`;
CREATE TABLE IF NOT EXISTS `user_report` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `mobile_no` varchar(20) NOT NULL,
  `problem` varchar(200) NOT NULL,
  `solution` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_report`
--

INSERT INTO `user_report` (`id`, `username`, `name`, `mobile_no`, `problem`, `solution`) VALUES
(2, 'kirancse', 'Kiran bari', '52472155', 'saldfjsaofhasffffdfkmsdf', 'hi'),
(3, 'kirancse', 'debu', '6548646', 'hi kiran', 'by'),
(5, 'sdaf', 'fdh', '52', 'fgchfdhd', 'fdghd');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

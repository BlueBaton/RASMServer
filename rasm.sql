-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2015 at 10:31 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rasm`
--

-- --------------------------------------------------------

--
-- Table structure for table `applies`
--

CREATE TABLE IF NOT EXISTS `applies` (
  `coup_name` varchar(10) NOT NULL,
  `phone_no` int(10) NOT NULL,
  `coup_count` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
  `bill_no` int(10) NOT NULL,
  `tot_price` float(8,2) NOT NULL,
  `coup_name` varchar(10) NOT NULL,
  `hd_address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE IF NOT EXISTS `cashier` (
  `cashier_id` varchar(10) NOT NULL,
  `cashier_name` varchar(20) NOT NULL,
  `cashier_password` varchar(20) NOT NULL,
  `phone_no` int(10) NOT NULL,
  `cashier_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `coupons`
--

CREATE TABLE IF NOT EXISTS `coupons` (
  `coup_name` varchar(10) NOT NULL,
  `discount_percent` int(3) NOT NULL,
  `description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `phone_no` int(10) NOT NULL,
  `customer_name` varchar(20) NOT NULL,
  `customer_emailid` varchar(50) NOT NULL,
  `anniversary` date NOT NULL,
  `date_of_birth` date NOT NULL,
  `reception` int(1) NOT NULL,
  `service` int(1) NOT NULL,
  `food_quality` int(1) NOT NULL,
  `ambience` int(1) NOT NULL,
  `overall_feedback` text NOT NULL,
  `city` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `end_user`
--

CREATE TABLE IF NOT EXISTS `end_user` (
  `phone_no` int(10) NOT NULL,
  `table_no` int(2) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `generates`
--

CREATE TABLE IF NOT EXISTS `generates` (
  `bill_no` int(10) NOT NULL,
  `phone_no` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
  `m_id` varchar(20) NOT NULL,
  `m_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `manages`
--

CREATE TABLE IF NOT EXISTS `manages` (
  `bill_no` int(10) NOT NULL,
  `phone_no` int(10) NOT NULL,
  `coup_name` varchar(10) NOT NULL,
  `table_no` int(2) NOT NULL,
  `item_id` varchar(10) NOT NULL,
  `cashier_id` varchar(10) NOT NULL,
  `m_id` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `item_id` varchar(10) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `item_price` float(6,2) NOT NULL,
  `v_nv` varchar(10) NOT NULL,
  `course` varchar(20) NOT NULL,
  `course_category` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE IF NOT EXISTS `order` (
  `table_no` int(2) NOT NULL DEFAULT '0',
  `item_id` varchar(10) NOT NULL,
  `quantity` int(2) NOT NULL,
  `customization_description` text NOT NULL,
  `packing` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `order_places`
--

CREATE TABLE IF NOT EXISTS `order_places` (
  `table_no` int(2) NOT NULL,
  `item_id` varchar(10) NOT NULL,
  `phone_no` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `reads`
--

CREATE TABLE IF NOT EXISTS `reads` (
  `phone_no` int(10) NOT NULL,
  `item_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applies`
--
ALTER TABLE `applies`
 ADD PRIMARY KEY (`coup_name`,`phone_no`,`coup_count`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
 ADD PRIMARY KEY (`bill_no`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
 ADD PRIMARY KEY (`cashier_id`);

--
-- Indexes for table `coupons`
--
ALTER TABLE `coupons`
 ADD PRIMARY KEY (`coup_name`);

--
-- Indexes for table `end_user`
--
ALTER TABLE `end_user`
 ADD PRIMARY KEY (`phone_no`);

--
-- Indexes for table `generates`
--
ALTER TABLE `generates`
 ADD PRIMARY KEY (`bill_no`,`phone_no`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
 ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `manages`
--
ALTER TABLE `manages`
 ADD PRIMARY KEY (`bill_no`,`phone_no`,`coup_name`,`table_no`,`item_id`,`cashier_id`,`m_id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
 ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
 ADD PRIMARY KEY (`table_no`,`item_id`);

--
-- Indexes for table `order_places`
--
ALTER TABLE `order_places`
 ADD PRIMARY KEY (`table_no`,`item_id`,`phone_no`);

--
-- Indexes for table `reads`
--
ALTER TABLE `reads`
 ADD PRIMARY KEY (`phone_no`,`item_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

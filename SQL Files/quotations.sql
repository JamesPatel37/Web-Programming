-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 14, 2015 at 11:33 PM
-- Server version: 5.5.40-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cs320stu72`
--

-- --------------------------------------------------------

--
-- Table structure for table `quotations`
--

CREATE TABLE IF NOT EXISTS `quotations` (
  `id` int(25) NOT NULL AUTO_INCREMENT,
  `quotation` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `quotations`
--

INSERT INTO `quotations` (`id`, `quotation`, `author`) VALUES
(2, 'Stay foolish', 'steve job'),
(3, 'Work hard Play Hard', 'James'),
(5, 'Be the Change you want to see in the world', 'Mahatma Gandhiji'),
(10, 'The man who has no imagination has no wings.', 'Muhammad Ali '),
(11, 'Don''t be afraid your life will end. Be afraid that it will never begin.', 'Grace Hansen'),
(12, 'In the middle of difficulty lies opportunity.', 'Albert Einstein'),
(13, 'The simple act of paying attention can take you a long way.', 'Keanu Reeves'),
(14, 'The most beautiful people I''ve known are those who have known trials, have known struggles, have known loss, and have found their way out of the depths.', 'Elisabeth Kübler-Ross ');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2021 at 04:51 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.3.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `workers`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `contact` int(15) NOT NULL,
  `city` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `username`, `password`, `email`, `contact`, `city`) VALUES
(1, 'arushi', 'arushi', 'arushi', 456784567, 'delhi'),
(3, 'arushi', 'arushi', 'arushi', 908987908, 'delhi'),
(4, 'arushimittal', '12345', 'arushimittal500@gmail.com', 789765786, 'delhi'),
(8, 'Arushii_123', '123456', 'arushi@gmai.com', 890876897, 'delhi');

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `work_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `age` varchar(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `contact` int(11) NOT NULL,
  `place` varchar(30) NOT NULL,
  `field` varchar(30) NOT NULL,
  `labour` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`work_id`, `name`, `age`, `email`, `contact`, `place`, `field`, `labour`) VALUES
(1, 'Ramesh Garg', '28', 'Rameshgarg68@gmail.com', 2147483647, 'Delhi', 'Carpenter', 653546),
(2, 'Suresh Goel', '37', 'Suresh@gmail.com', 2147483647, 'Delhi', 'Carpenter', 678547),
(3, 'Ram Sharma', '46', 'Ram56Shrama@gmail.com', 2147483647, 'Delhi', 'Carpenter', 986566),
(4, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Delhi', 'Carpenter', 457543),
(5, 'Harjinder Singh', '42', 'Harjinder@gmail.com', 2147483647, 'Ambala', 'Carpenter', 653546),
(6, 'Abhinav Goel', '37', 'Abhinavgoel@gmail.com', 2147483647, 'Ambala', 'Carpenter', 986566),
(7, 'Virat Garg', '40', 'Viratgarg@gmail.com', 2147483647, 'Ambala', 'Carpenter', 678547),
(8, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Ambala', 'Carpenter', 457543),
(9, 'Ramesh Garg', '28', 'Rameshgarg68@gmail.com', 2147483647, 'Delhi', 'Electrician', 653546),
(10, 'Suresh Goel', '37', 'Suresh@gmail.com', 2147483647, 'Delhi', 'Electrician', 678547),
(11, 'Ram Sharma', '46', 'Ram56Shrama@gmail.com', 2147483647, 'Delhi', 'Electrician', 986566),
(12, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Delhi', 'Electrician', 457543),
(13, 'Ramesh Garg', '28', 'Rameshgarg68@gmail.com', 2147483647, 'Ambala', 'Painter', 653546),
(14, 'Suresh Goel', '37', 'Suresh@gmail.com', 2147483647, 'Ambala', 'Painter', 678547),
(15, 'Ram Sharma', '46', 'Ram56Shrama@gmail.com', 2147483647, 'Ambala', 'Painter', 986566),
(16, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Ambala', 'Painter', 457543),
(17, 'Ramesh Garg', '28', 'Rameshgarg68@gmail.com', 2147483647, 'Delhi', 'Plumber', 653546),
(18, 'Suresh Goel', '37', 'Suresh@gmail.com', 2147483647, 'Delhi', 'Plumber', 678547),
(19, 'Ram Sharma', '46', 'Ram56Shrama@gmail.com', 2147483647, 'Delhi', 'Plumber', 986566),
(20, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Delhi', 'Plumber', 457543),
(21, 'Ramesh Garg', '28', 'Rameshgarg68@gmail.com', 2147483647, 'Delhi', 'Electrician', 653546),
(22, 'Suresh Goel', '37', 'Suresh@gmail.com', 2147483647, 'Delhi', 'Electrician', 678547),
(23, 'Ram Sharma', '46', 'Ram56Shrama@gmail.com', 2147483647, 'Delhi', 'Electrician', 986566),
(24, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Delhi', 'Electrician', 457543),
(25, 'Ramesh Garg', '28', 'Rameshgarg68@gmail.com', 2147483647, 'Agra', 'House Keeping', 653546),
(26, 'Suresh Goel', '37', 'Suresh@gmail.com', 2147483647, 'Agra', 'House Keeping', 678547),
(27, 'Ram Sharma', '46', 'Ram56Shrama@gmail.com', 2147483647, 'Agra', 'House Keeping', 986566),
(28, 'Adarsh Bansal', '34', 'Adarsh598@gmail.com', 2147483647, 'Agra', 'House keeping', 457543),
(29, 'Seema Garg', '36', 'Seemagarg@gmail.com', 2147483647, 'Delhi', 'Beautician', 653546),
(30, 'Yukta Nangia', '25', 'Yuktanangia@gmail.com', 2147483647, 'Delhi', 'Beautician', 678547),
(31, 'Riya Sharma', '27', 'Riyasharma34@gmail.com', 2147483647, 'Delhi', 'Beautician', 986566),
(32, 'Ananya Gupta', '32', 'Ananyagupta12@gmail.com', 2147483647, 'Delhi', 'Beautician', 457543);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `details`
--
ALTER TABLE `details`
  ADD PRIMARY KEY (`work_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `details`
--
ALTER TABLE `details`
  MODIFY `work_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2022 at 08:55 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_gudang`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_barang`
--

CREATE TABLE `t_barang` (
  `idBarang` varchar(5) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_barang`
--

INSERT INTO `t_barang` (`idBarang`, `nama`, `stok`) VALUES
('B0001', 'LCD 14\"', 6),
('B0002', 'LCD 20\"', 10),
('B0003', 'Mouse PS2 ', 10),
('B0004', 'Mouse USB ', 35),
('B0005', 'Keyboard USB', 15),
('B0006', 'Mouse Wireless', 10),
('B0007', 'HDD Seagate 1 TB', 5),
('B0008', 'Kabel Printer ', 20),
('B0009', 'Printer Epson L3130', 2),
('B0011', 'PC Core i5', 8),
('B0012', 'Stavolt', 10);

-- --------------------------------------------------------

--
-- Table structure for table `t_keluar`
--

CREATE TABLE `t_keluar` (
  `idKeluar` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `idBarang` varchar(5) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `t_masuk`
--

CREATE TABLE `t_masuk` (
  `idMasuk` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `idBarang` varchar(5) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_masuk`
--

INSERT INTO `t_masuk` (`idMasuk`, `tanggal`, `idBarang`, `jumlah`) VALUES
(1, '2021-12-18', 'B0004', 15),
(2, '2021-12-18', 'B0006', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_barang`
--
ALTER TABLE `t_barang`
  ADD PRIMARY KEY (`idBarang`);

--
-- Indexes for table `t_keluar`
--
ALTER TABLE `t_keluar`
  ADD PRIMARY KEY (`idKeluar`),
  ADD KEY `t_keluar_ibfk_1` (`idBarang`);

--
-- Indexes for table `t_masuk`
--
ALTER TABLE `t_masuk`
  ADD PRIMARY KEY (`idMasuk`),
  ADD KEY `t_masuk_ibfk_1` (`idBarang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_keluar`
--
ALTER TABLE `t_keluar`
  MODIFY `idKeluar` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `t_masuk`
--
ALTER TABLE `t_masuk`
  MODIFY `idMasuk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_keluar`
--
ALTER TABLE `t_keluar`
  ADD CONSTRAINT `t_keluar_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `t_barang` (`idBarang`);

--
-- Constraints for table `t_masuk`
--
ALTER TABLE `t_masuk`
  ADD CONSTRAINT `t_masuk_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `t_barang` (`idBarang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

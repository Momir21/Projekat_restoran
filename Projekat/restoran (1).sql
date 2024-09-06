-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 06, 2024 at 02:00 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restoran`
--

-- --------------------------------------------------------

--
-- Table structure for table `jelo`
--

CREATE TABLE `jelo` (
  `id` int(11) NOT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `kategorija` varchar(255) DEFAULT NULL,
  `cena` double DEFAULT NULL,
  `opis` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jelo`
--

INSERT INTO `jelo` (`id`, `naziv`, `kategorija`, `cena`, `opis`) VALUES
(1, 'Pohovani kackavalj', 'predilo', 690, 'Kockasti komadici kackavalja uvaljani u brasno, jaja i prezle. Przeni u vrelom ulju sve dok spoljasn'),
(2, 'Tatarski biftek', 'predilo', 2400, 'Sirovo parce juneceg bifteka sitno iseckano i pomesano sa zacinima: so, biber, seckani lik i kiseli '),
(3, 'Grilovani losos sa limunom', 'glavno jelo', 3399, 'Fileti lososa pripremljeni na rostilju zacinjeni solju, biberom, maslinovim uljem isvezim sokom limuna. Preporucena porcja je 200g po osobi.'),
(4, 'Teleci medaljon u sosu od pecuraka', 'glavno jelo', 2989, 'Socni komadici mesa se kratko peku u tiganju da bi zadrzali socnost. Nakon pecenja se prelivaju soso'),
(5, 'Cokoladni lava kolac ', 'desert', 1255, 'Kolač se priprema od tamne čokolade, maslaca, jaja, šećera i brašna, a peče se kratko na visokoj temeraturi. Preporucena porcija je 250g po osobi.'),
(6, 'Panna cotta sa vocnim prelivom ', 'desert', 1599, 'Panna cotta je kremasti italijanski desert napravljen od slatke pavlake, mleka, šećera, i želatina. '),
(7, NULL, NULL, 0, NULL),
(8, NULL, NULL, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `narudzbina`
--

CREATE TABLE `narudzbina` (
  `id` int(11) NOT NULL,
  `jelo_id` int(11) DEFAULT NULL,
  `pice_id` int(11) DEFAULT NULL,
  `kolicina_jela` int(11) NOT NULL,
  `kolicina_pica` int(11) NOT NULL,
  `ukupan_iznos` double DEFAULT NULL,
  `status` enum('na cekanju','u pripremi','dostavljeno') NOT NULL,
  `status_narudzbine` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `narudzbina`
--

INSERT INTO `narudzbina` (`id`, `jelo_id`, `pice_id`, `kolicina_jela`, `kolicina_pica`, `ukupan_iznos`, `status`, `status_narudzbine`) VALUES
(1, 1, 1, 1, 1, 850, 'na cekanju', NULL),
(2, 2, 5, 2, 3, 6300, 'u pripremi', NULL),
(3, 3, 4, 2, 2, 7398, 'dostavljeno', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pice`
--

CREATE TABLE `pice` (
  `id` int(11) NOT NULL,
  `naziv` varchar(255) NOT NULL,
  `tip` varchar(255) DEFAULT NULL,
  `cena` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pice`
--

INSERT INTO `pice` (`id`, `naziv`, `tip`, `cena`) VALUES
(1, 'Turska kafa', 'topli napitak', 160),
(2, 'Caj', 'topli napitak', 100),
(3, 'Gazirana voda', 'bezalkoholno', 120),
(4, 'Coca-cola', 'bezalkoholno', 300),
(5, 'Jameson', 'alkoholno', 500),
(6, 'Zajecarsko pivo', 'alkoholno', 150);

-- --------------------------------------------------------

--
-- Table structure for table `rezervacija`
--

CREATE TABLE `rezervacija` (
  `id` int(11) NOT NULL,
  `datum` datetime(6) DEFAULT NULL,
  `vreme` time NOT NULL,
  `broj_osoba` int(11) NOT NULL,
  `kontakt_info` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rezervacija`
--

INSERT INTO `rezervacija` (`id`, `datum`, `vreme`, `broj_osoba`, `kontakt_info`) VALUES
(1, '2024-09-01 00:00:00.000000', '21:00:00', 2, '063168596'),
(2, '2024-11-13 00:00:00.000000', '18:00:00', 4, '064258466');

-- --------------------------------------------------------

--
-- Table structure for table `zaliha`
--

CREATE TABLE `zaliha` (
  `id` bigint(20) NOT NULL,
  `naziv` varchar(255) NOT NULL,
  `kolicina` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `zaliha`
--

INSERT INTO `zaliha` (`id`, `naziv`, `kolicina`) VALUES
(1, 'Jameson', 100),
(2, 'Coca-cola', 50);

-- --------------------------------------------------------

--
-- Table structure for table `zalihe`
--

CREATE TABLE `zalihe` (
  `id` int(11) NOT NULL,
  `kolicina` int(11) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jelo`
--
ALTER TABLE `jelo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `narudzbina`
--
ALTER TABLE `narudzbina`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfh83r2i5qc04l59q33qlecpx9` (`jelo_id`),
  ADD KEY `FKhtd95w6gxbgsneqf7fkn5cgn2` (`pice_id`);

--
-- Indexes for table `pice`
--
ALTER TABLE `pice`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rezervacija`
--
ALTER TABLE `rezervacija`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `zaliha`
--
ALTER TABLE `zaliha`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `zalihe`
--
ALTER TABLE `zalihe`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jelo`
--
ALTER TABLE `jelo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `narudzbina`
--
ALTER TABLE `narudzbina`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pice`
--
ALTER TABLE `pice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `rezervacija`
--
ALTER TABLE `rezervacija`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `zaliha`
--
ALTER TABLE `zaliha`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `zalihe`
--
ALTER TABLE `zalihe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `narudzbina`
--
ALTER TABLE `narudzbina`
  ADD CONSTRAINT `FKfh83r2i5qc04l59q33qlecpx9` FOREIGN KEY (`jelo_id`) REFERENCES `jelo` (`id`),
  ADD CONSTRAINT `FKhtd95w6gxbgsneqf7fkn5cgn2` FOREIGN KEY (`pice_id`) REFERENCES `pice` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

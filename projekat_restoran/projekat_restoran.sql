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
-- Database: `projekat_restoran`
--

-- --------------------------------------------------------

--
-- Table structure for table `jelo`
--

CREATE TABLE `jelo` (
  `id` int(11) NOT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `cena` int(100) NOT NULL,
  `opis` varchar(255) DEFAULT NULL,
  `kategorija` enum('predilo','glavno jelo','desert') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jelo`
--

INSERT INTO `jelo` (`id`, `ime`, `cena`, `opis`, `kategorija`) VALUES
(1, 'Pohovani kackavalj', 690, 'Kockasti komadici kackavalja uvaljani u brasno, jaja i prezle. Preporucena porcija je 150g po osobi.', 'predilo'),
(2, 'Grilovani losos sa limunom', 3400, 'Fileti lososa pripremljeni na rostilju zacinjeni solju, biberom, maslinovim uljem isvezim sokom limu', 'glavno jelo'),
(3, 'Cokoladni lava kolac ', 1200, 'Kolač se priprema od tamne čokolade, maslaca, jaja, šećera i brašna, a peče se kratko na visokoj tem', 'desert');

-- --------------------------------------------------------

--
-- Table structure for table `narudzbina`
--

CREATE TABLE `narudzbina` (
  `id` int(100) NOT NULL,
  `broj_porcija` int(100) NOT NULL,
  `broj_pica` int(100) NOT NULL,
  `cena` int(100) NOT NULL,
  `status` enum('u pripremi','na cekanju','dostavljena') NOT NULL,
  `jelo_id` int(100) NOT NULL,
  `pice_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `narudzbina`
--

INSERT INTO `narudzbina` (`id`, `broj_porcija`, `broj_pica`, `cena`, `status`, `jelo_id`, `pice_id`) VALUES
(1, 2, 4, 7300, 'na cekanju', 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `pice`
--

CREATE TABLE `pice` (
  `id` int(100) NOT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `cena` int(100) NOT NULL,
  `tip` enum('topli napitak','bezalkoholno','alkoholno') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pice`
--

INSERT INTO `pice` (`id`, `ime`, `cena`, `tip`) VALUES
(1, 'Turksa kafa', 150, 'topli napitak'),
(2, 'Coca-cola', 250, 'bezalkoholno'),
(3, 'Jameson', 330, 'alkoholno');

-- --------------------------------------------------------

--
-- Table structure for table `rezervacija`
--

CREATE TABLE `rezervacija` (
  `id` int(100) NOT NULL,
  `datum` date NOT NULL,
  `vreme` time NOT NULL,
  `broj_osoba` int(100) NOT NULL,
  `kontakt` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rezervacija`
--

INSERT INTO `rezervacija` (`id`, `datum`, `vreme`, `broj_osoba`, `kontakt`) VALUES
(1, '2024-09-03', '21:00:00', 4, 62866566),
(2, '2024-09-28', '22:00:00', 6, 603403499);

-- --------------------------------------------------------

--
-- Table structure for table `zalihe`
--

CREATE TABLE `zalihe` (
  `id` int(100) NOT NULL,
  `pice_id` int(100) NOT NULL,
  `kolicina` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `zalihe`
--

INSERT INTO `zalihe` (`id`, `pice_id`, `kolicina`) VALUES
(1, 2, 50),
(2, 3, 30);

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
  ADD KEY `fk_jelo` (`jelo_id`),
  ADD KEY `fk_pice` (`pice_id`);

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
-- Indexes for table `zalihe`
--
ALTER TABLE `zalihe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pice_id` (`pice_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jelo`
--
ALTER TABLE `jelo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `narudzbina`
--
ALTER TABLE `narudzbina`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pice`
--
ALTER TABLE `pice`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rezervacija`
--
ALTER TABLE `rezervacija`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `zalihe`
--
ALTER TABLE `zalihe`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `narudzbina`
--
ALTER TABLE `narudzbina`
  ADD CONSTRAINT `fk_jelo` FOREIGN KEY (`jelo_id`) REFERENCES `jelo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_pice` FOREIGN KEY (`pice_id`) REFERENCES `pice` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `zalihe`
--
ALTER TABLE `zalihe`
  ADD CONSTRAINT `pice_id` FOREIGN KEY (`pice_id`) REFERENCES `pice` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

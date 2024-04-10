-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Apr 05, 2024 alle 18:31
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinema`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `film`
--

CREATE TABLE `film` (
  `id` int(11) NOT NULL,
  `titolo` varchar(20) NOT NULL,
  `durata` varchar(10) NOT NULL,
  `locandina` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `film`
--

INSERT INTO `film` (`id`, `titolo`, `durata`, `locandina`) VALUES
(1, 'Il padrino', '175', 'il_padrino.jpg'),
(2, 'Forrest Gump', '142', 'forrest_gump.jpg'),
(3, 'Pulp Fiction', '154', 'pulp_fiction.jpg'),
(4, 'Il Signore degli Ane', '201', 'il_signore_degli_anelli.jpg');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `film`
--
ALTER TABLE `film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

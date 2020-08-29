-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.4-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.6093
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para tutoria
CREATE DATABASE IF NOT EXISTS `tutoria` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tutoria`;

-- Volcando estructura para tabla tutoria.estudiante
CREATE TABLE IF NOT EXISTS `estudiante` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `cedula` varchar(25) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `direccion` varchar(230) NOT NULL,
  `quintil` int(11) NOT NULL,
  `asignatura` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tutoria.estudiante: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` (`codigo`, `nombre`, `apellido`, `edad`, `cedula`, `genero`, `direccion`, `quintil`, `asignatura`) VALUES
	(20, 'PELADO', 'CONEXION', 20, '02', 'Femenino', 'HAHAH', 1, 'Programacion,'),
	(1, 'test', 'tes', 1, '1', 'Masculino', 'test', 5, 'Ingles,Electrónica,Estructura DD,Programacion,'),
	(2, 'as', 'as', 20, '10', 'Masculino', 'asd', 2, 'Ingles,');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

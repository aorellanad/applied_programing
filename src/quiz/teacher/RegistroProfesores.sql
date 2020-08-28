-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.4-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para ejemplo
CREATE DATABASE IF NOT EXISTS `ejemplo` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ejemplo`;

-- Volcando estructura para tabla ejemplo.datos
CREATE TABLE IF NOT EXISTS `datos` (
  `id` int(11) DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `registro` int(11) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `idioma` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla ejemplo.datos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `datos` DISABLE KEYS */;
INSERT INTO `datos` (`id`, `nombres`, `apellidos`, `edad`, `registro`, `genero`, `idioma`) VALUES
	(456, 'Byron', 'punina', 19, 1, 'Masculino', 'Ingles,'),
	(135, 'Keyko', 'Garces', 18, 2, 'Femenino', 'Frances,Italiano,'),
	(123, 'Josue', 'Montesdeoca', 18, 3, 'Masculino', 'Ingles,Mandarin,');
/*!40000 ALTER TABLE `datos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

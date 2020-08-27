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


-- Volcando estructura de base de datos para taller
CREATE DATABASE IF NOT EXISTS `taller` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `taller`;

-- Volcando estructura para tabla taller.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `IDproducto` int(11) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla taller.producto: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`IDproducto`, `descripcion`, `stock`, `precio`) VALUES
	(23, 'estampado torta', 5, 15),
	(234, 'pantalones verdes', 45, 25),
	(123, 'estampado loog UPS', 200, 10),
	(44, 'chaleco azul', 500, 85),
	(1, 'zapatos', 520, 153),
	(2, 'zapatos blancos', 200, 258),
	(3, 'zapatos rojos', 200, 270);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

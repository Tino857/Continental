-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 01:48:43
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelcontinental`
--
CREATE DATABASE IF NOT EXISTS `hotelcontinental` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hotelcontinental`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `cantidadPersonas` int(11) NOT NULL,
  `precio` double NOT NULL,
  `cantidadCamas` int(11) NOT NULL,
  `tipoCama` int(11) NOT NULL,
  `tipoCategoria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `cantidadPersonas`, `precio`, `cantidadCamas`, `tipoCama`, `tipoCategoria`) VALUES
(1, 1, 23500, 1, 1, 'Individual'),
(2, 1, 27350, 1, 2, 'Individual Grande'),
(3, 2, 29000, 2, 1, 'Doble'),
(4, 2, 31570, 2, 2, 'Doble grande'),
(5, 2, 31570, 1, 3, 'Matrimonial'),
(6, 2, 37635, 1, 4, 'Matrimonial Grande'),
(7, 2, 41500, 1, 5, 'Matrimonial Premium'),
(8, 4, 45000, 2, 3, 'Doble Matrimonial'),
(9, 4, 48350, 2, 4, 'Doble Matrimonial Grande'),
(10, 4, 52570, 2, 5, 'Doble Matrimonial Premium');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `habilitada` tinyint(1) NOT NULL,
  `idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `numero`, `piso`, `estado`, `habilitada`, `idCategoria`) VALUES
(1, 1, 1, 1, 1, 1),
(2, 2, 1, 1, 1, 1),
(3, 11, 2, 1, 1, 1),
(4, 12, 2, 1, 1, 1),
(5, 21, 3, 1, 1, 2),
(6, 22, 3, 1, 1, 2),
(7, 31, 4, 1, 1, 2),
(8, 32, 4, 1, 1, 2),
(9, 41, 5, 1, 1, 3),
(10, 42, 5, 1, 1, 3),
(11, 51, 6, 1, 1, 3),
(12, 52, 6, 1, 1, 3),
(13, 61, 7, 1, 1, 4),
(14, 62, 7, 1, 1, 4),
(15, 71, 8, 1, 1, 4),
(16, 72, 8, 1, 1, 4),
(17, 81, 9, 1, 1, 5),
(18, 82, 9, 1, 1, 5),
(19, 91, 10, 1, 1, 5),
(20, 92, 10, 1, 1, 5),
(21, 101, 11, 1, 1, 6),
(22, 102, 11, 1, 1, 6),
(23, 111, 12, 1, 1, 6),
(24, 112, 12, 1, 1, 6),
(25, 121, 13, 1, 1, 7),
(26, 122, 13, 1, 1, 7),
(27, 131, 14, 1, 1, 7),
(28, 132, 14, 1, 1, 7),
(29, 141, 15, 1, 1, 8),
(30, 142, 15, 1, 1, 8),
(31, 151, 16, 1, 1, 8),
(32, 152, 16, 1, 1, 8),
(33, 161, 17, 1, 1, 9),
(34, 162, 17, 1, 1, 9),
(35, 171, 18, 1, 1, 9),
(36, 172, 18, 1, 1, 9),
(37, 181, 19, 1, 1, 10),
(38, 182, 19, 1, 1, 10),
(39, 191, 20, 1, 1, 10),
(40, 192, 20, 1, 1, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `domicilio` varchar(150) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `dni`, `apellido`, `nombre`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(1, 35623588, 'Lopez', 'Juan Pablo', 'Colon 1015', 'juan.pablo.lopez@gmail.com', '2625406156', 1),
(2, 33835999, 'Lopez', 'Abel Omar', 'Belgrano 7583', 'abel.omar.lopez@gmail.com', '1164740288', 1),
(3, 42473263, 'Peralta', 'Valentino', 'Calle 35 numero 4943', 'valen85.p@gmail.com', '1167370961', 1),
(4, 37854612, 'Rodriguez', 'Laura', 'Rivadavia 123', 'laura.rodriguez@example.org', '1234567890', 1),
(5, 56984123, 'Perez', 'Jose', 'Belgrano 456', 'jose.perez@test.org', '987654321', 1),
(6, 47856321, 'Lopez', 'Ana', 'Sarmiento 789', 'ana.lopez@example.com', '9871234567', 1),
(7, 32547896, 'Gutierrez', 'Pedro', 'Mitre 234', 'pedro.gutierrez@test.com', '7890123456', 1),
(8, 45623178, 'Sanchez', 'Luis', 'Urquiza 567', 'luis.sanchez@example.org', '1234567891', 1),
(9, 69874123, 'Fernandez', 'Silvia', 'Alvear 890', 'silvia.fernandez@test.org', '7890123457', 1),
(10, 53789412, 'Lopez', 'Carlos', 'Belgrano 123', 'carlos.lopez@example.com', '4567891235', 1),
(11, 21457896, 'Perez', 'Marta', 'San Martin 456', 'marta.perez@test.com', '9876543211', 1),
(12, 64523789, 'Rodriguez', 'Carlos', 'Rivadavia 789', 'carlos.rodriguez@example.org', '1234567892', 1),
(13, 48563249, 'Lopez', 'Maria', 'Belgrano 567', 'maria.lopez@example.org', '5278163091', 1),
(14, 36547891, 'Gonzalez', 'Sofia', 'Belgrano 234', 'sofia.gonzalez@test.org', '987654345', 1),
(15, 54238716, 'Lopez', 'Eduardo', 'San Martin 567', 'eduardo.lopez@example.com', '9871234568', 1),
(16, 25874136, 'Fernandez', 'Maria', 'Urquiza 890', 'maria.fernandez@test.com', '7890123458', 1),
(17, 48563214, 'Gutierrez', 'Luis', 'Alvear 123', 'luis.gutierrez@example.org', '4567891236', 1),
(18, 69874532, 'Sanchez', 'Ana', 'Belgrano 456', 'ana.sanchez@test.org', '9876543212', 1),
(19, 32548796, 'Martinez', 'Pedro', 'San Martin 789', 'pedro.martinez@example.com', '1234567893', 1),
(20, 69874152, 'Rodriguez', 'Luis', 'Rivadavia 234', 'luis.rodriguez@test.com', '9871234345', 1),
(21, 48596321, 'Gonzalez', 'Maria', 'Libertad 456', 'maria.gonzalez@example.com', '4567891234', 1),
(22, 56478213, 'Martinez', 'Carlos', 'San Martin 789', 'carlos.martinez@test.com', '9876543210', 1),
(23, 38082942, 'Cocco', 'Antonella', 'Colon 1000', 'antonella.cocco@gmail.com', '2995090675', 1),
(24, 39423588, 'Lopez', 'Valentin', 'Ejercito de los Andes 591', 'valentin.lopez@gmail.com', '2625513731', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `dias` int(11) NOT NULL,
  `monto` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `cantidadPersonas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHabitacion`, `idHuesped`, `fechaInicio`, `fechaFin`, `dias`, `monto`, `estado`, `cantidadPersonas`) VALUES
(1, 25, 1, '2023-11-17', '2023-11-20', 3, 124500, 1, 2),
(2, 32, 17, '2023-12-23', '2023-12-30', 7, 315000, 1, 4),
(3, 27, 4, '2024-02-09', '2024-02-14', 5, 207500, 1, 2),
(4, 9, 9, '2023-11-07', '2023-11-11', 4, 116000, 1, 2),
(5, 28, 24, '2023-12-07', '2023-12-11', 4, 166000, 1, 2),
(6, 10, 11, '2023-12-28', '2024-01-02', 5, 145000, 1, 1),
(7, 37, 22, '2023-11-13', '2023-11-19', 6, 315420, 1, 2),
(8, 18, 21, '2023-11-13', '2023-11-19', 6, 189420, 1, 2),
(9, 35, 5, '2023-11-25', '2023-11-28', 3, 145050, 1, 3),
(10, 12, 1, '2023-11-08', '2023-11-18', 10, 290000, 1, 1),
(11, 3, 1, '2023-11-18', '2023-11-21', 3, 70500, 1, 1),
(12, 28, 2, '2023-11-10', '2023-11-12', 2, 83000, 1, 2),
(13, 21, 2, '2023-11-12', '2023-11-16', 4, 150540, 1, 2),
(14, 19, 2, '2023-11-17', '2023-11-21', 4, 126280, 1, 2),
(15, 3, 3, '2023-12-18', '2023-12-24', 6, 141000, 1, 1),
(16, 27, 3, '2023-12-24', '2023-12-26', 2, 83000, 1, 1),
(17, 5, 3, '2023-12-26', '2023-12-30', 4, 109400, 1, 1),
(18, 28, 3, '2023-12-30', '2023-12-31', 1, 41500, 1, 1),
(19, 25, 1, '2023-12-01', '2023-12-05', 4, 166000, 1, 1),
(20, 25, 1, '2023-12-09', '2023-12-12', 3, 124500, 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`),
  ADD UNIQUE KEY `tipoCategoria` (`tipoCategoria`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD UNIQUE KEY `numero` (`numero`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `celular` (`celular`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

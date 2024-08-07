-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-08-2024 a las 21:24:09
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_de_cobros_escolares`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `matricula` varchar(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `primerApell` varchar(30) NOT NULL,
  `segundoApell` varchar(30) DEFAULT NULL,
  `direccion` varchar(255) NOT NULL,
  `nivel_educativo` varchar(5) DEFAULT NULL,
  `periodo_escolar` varchar(10) DEFAULT NULL,
  `grado_y_grupo` varchar(5) DEFAULT NULL,
  `tutor` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`matricula`, `nombre`, `primerApell`, `segundoApell`, `direccion`, `nivel_educativo`, `periodo_escolar`, `grado_y_grupo`, `tutor`) VALUES
('MTC0000001', 'Juan', 'Pérez', 'García', 'Calle 123, Tijuana', 'NE001', 'PE2022', 'GG007', 'TU001'),
('MTC0000002', 'María', 'López', 'Ramírez', 'Calle 124, Tijuana', 'NE001', 'PE2023', 'GG001', 'TU002'),
('MTC0000003', 'Carlos', 'Rodríguez', 'Martínez', 'Calle 125, Tijuana', 'NE002', 'PE2023', 'GG002', 'TU003'),
('MTC0000004', 'Sofía', 'Gómez', 'Hernández', 'Calle 126, Tijuana', 'NE002', 'PE2023', 'GG002', 'TU004'),
('MTC0000005', 'Ana', 'Hernández', 'Sánchez', 'Calle 127, Tijuana', 'NE003', 'PE2023', 'GG003', 'TU005'),
('MTC0000006', 'Luis', 'Sánchez', 'García', 'Calle 128, Tijuana', 'NE003', 'PE2023', 'GG003', 'TU006'),
('MTC0000007', 'Diego', 'García', 'Pérez', 'Calle 129, Tijuana', 'NE001', 'PE2023', 'GG004', 'TU007'),
('MTC0000008', 'Valeria', 'Torres', 'López', 'Calle 130, Tijuana', 'NE001', 'PE2023', 'GG004', 'TU008'),
('MTC0000009', 'Mateo', 'Morales', 'Vega', 'Calle 131, Tijuana', 'NE002', 'PE2023', 'GG005', 'TU009'),
('MTC0000010', 'Lucía', 'Jiménez', 'Núñez', 'Calle 132, Tijuana', 'NE002', 'PE2023', 'GG005', 'TU010'),
('MTC0000011', 'Pablo', 'Mendoza', 'Ortega', 'Calle 133, Tijuana', 'NE003', 'PE2023', 'GG006', 'TU011'),
('MTC0000012', 'Camila', 'Castillo', 'Ramos', 'Calle 134, Tijuana', 'NE003', 'PE2023', 'GG006', 'TU012'),
('MTC0000013', 'Andrés', 'Ríos', 'Romero', 'Calle 135, Tijuana', 'NE001', 'PE2022', 'GG013', 'TU013'),
('MTC0000014', 'Elena', 'Ortiz', 'Flores', 'Calle 136, Tijuana', 'NE001', 'PE2022', 'GG013', 'TU014'),
('MTC0000015', 'Marcos', 'Vargas', 'Chávez', 'Calle 137, Tijuana', 'NE002', 'PE2022', 'GG014', 'TU015'),
('MTC0000016', 'Adriana', 'Rojas', 'Suárez', 'Calle 138, Tijuana', 'NE002', 'PE2022', 'GG014', 'TU016'),
('MTC0000017', 'Roberto', 'Soto', 'Martínez', 'Calle 147, Tijuana', 'NE001', 'PE2021', 'GG007', 'TU025'),
('MTC0000018', 'Laura', 'Medina', 'Luna', 'Calle 148, Tijuana', 'NE001', 'PE2021', 'GG007', 'TU026'),
('MTC0000019', 'Víctor', 'Gutiérrez', 'Benítez', 'Calle 149, Tijuana', 'NE002', 'PE2021', 'GG008', 'TU027'),
('MTC0000020', 'Silvia', 'Pacheco', 'Cruz', 'Calle 150, Tijuana', 'NE002', 'PE2021', 'GG008', 'TU028'),
('MTC0000021', 'Francisco', 'Hidalgo', 'Campos', 'Calle 151, Tijuana', 'NE003', 'PE2021', 'GG009', 'TU029'),
('MTC0000022', 'Claudia', 'Cabrera', 'Ríos', 'Calle 152, Tijuana', 'NE003', 'PE2021', 'GG009', 'TU030'),
('MTC0000023', 'Héctor', 'Silva', 'Alvarado', 'Calle 153, Tijuana', 'NE001', 'PE2021', 'GG010', 'TU031'),
('MTC0000024', 'Alicia', 'Méndez', 'Soto', 'Calle 154, Tijuana', 'NE001', 'PE2021', 'GG010', 'TU032'),
('MTC0000025', 'Felipe', 'Ponce', 'Delgado', 'Calle 155, Tijuana', 'NE002', 'PE2021', 'GG011', 'TU033'),
('MTC0000026', 'Mónica', 'Barrios', 'Guerra', 'Calle 156, Tijuana', 'NE002', 'PE2021', 'GG011', 'TU034'),
('MTC0000027', 'Santiago', 'Muñoz', 'Ibarra', 'Calle 157, Tijuana', 'NE003', 'PE2021', 'GG012', 'TU035'),
('MTC0000028', 'Verónica', 'Figueroa', 'Nava', 'Calle 158, Tijuana', 'NE003', 'PE2021', 'GG012', 'TU036'),
('MTC0000029', 'Oscar', 'Escobar', 'Bravo', 'Calle 159, Tijuana', 'NE001', 'PE2020', 'GG001', 'TU037'),
('MTC0000030', 'Ariana', 'Gallegos', 'Oliva', 'Calle 160, Tijuana', 'NE001', 'PE2020', 'GG001', 'TU038'),
('MTC0000031', 'Cristian', 'Montes', 'Paredes', 'Calle 161, Tijuana', 'NE002', 'PE2020', 'GG002', 'TU039'),
('MTC0000032', 'Daniela', 'Varela', 'Serrano', 'Calle 162, Tijuana', 'NE002', 'PE2020', 'GG002', 'TU040'),
('MTC0000033', 'José', 'Noriega', 'Rosales', 'Calle 163, Tijuana', 'NE003', 'PE2020', 'GG003', 'TU041'),
('MTC0000034', 'Paula', 'Villanueva', 'Esquivel', 'Calle 164, Tijuana', 'NE003', 'PE2020', 'GG003', 'TU042'),
('MTC0000035', 'Luis', 'Arce', 'Quintero', 'Calle 165, Tijuana', 'NE001', 'PE2020', 'GG004', 'TU043'),
('MTC0000036', 'Natalia', 'Peralta', 'Sosa', 'Calle 166, Tijuana', 'NE001', 'PE2020', 'GG004', 'TU044'),
('MTC0000037', 'Ángel', 'Tapia', 'Cuevas', 'Calle 167, Tijuana', 'NE002', 'PE2020', 'GG005', 'TU045'),
('MTC0000038', 'Mariana', 'Cárdenas', 'Rocha', 'Calle 168, Tijuana', 'NE002', 'PE2020', 'GG005', 'TU046'),
('MTC0000039', 'Ernesto', 'Nava', 'Quintana', 'Calle 169, Tijuana', 'NE003', 'PE2020', 'GG006', 'TU047'),
('MTC0000040', 'Viviana', 'León', 'Sandoval', 'Calle 170, Tijuana', 'NE003', 'PE2020', 'GG006', 'TU048'),
('MTC0000041', 'Rosa', 'Zamora', 'Galván', 'Calle 194, Tijuana', 'NE003', 'PE2022', 'GG013', 'TU072'),
('MTC0000042', 'Sebastián', 'Campos', 'Bravo', 'Calle 195, Tijuana', 'NE003', 'PE2022', 'GG013', 'TU073'),
('MTC0000043', 'Elisa', 'Urbina', 'Tapia', 'Calle 196, Tijuana', 'NE001', 'PE2022', 'GG014', 'TU074'),
('MTC0000044', 'Mario', 'Bravo', 'Neri', 'Calle 197, Tijuana', 'NE001', 'PE2022', 'GG014', 'TU075'),
('MTC0000045', 'Irene', 'Tapia', 'Reynoso', 'Calle 206, Tijuana', 'NE003', 'PE2021', 'GG007', 'TU084'),
('MTC0000046', 'Alberto', 'Ramón', 'Galarza', 'Calle 207, Tijuana', 'NE003', 'PE2021', 'GG007', 'TU085'),
('MTC0000047', 'Olivia', 'Escamilla', 'Piña', 'Calle 208, Tijuana', 'NE001', 'PE2021', 'GG008', 'TU086'),
('MTC0000048', 'Iván', 'Rosas', 'Zavala', 'Calle 209, Tijuana', 'NE001', 'PE2021', 'GG008', 'TU087'),
('MTC0000049', 'Ximena', 'Benítez', 'Escoto', 'Calle 210, Tijuana', 'NE002', 'PE2021', 'GG009', 'TU088'),
('MTC0000050', 'Jorge', 'Delgado', 'Arrieta', 'Calle 211, Tijuana', 'NE002', 'PE2021', 'GG009', 'TU089'),
('MTC0000051', 'Flor', 'Zaragoza', 'Marín', 'Calle 212, Tijuana', 'NE003', 'PE2021', 'GG010', 'TU090'),
('MTC0000052', 'Alejandro', 'Ramírez', 'Hinojosa', 'Calle 213, Tijuana', 'NE003', 'PE2021', 'GG010', 'TU091'),
('MTC0000053', 'Rocío', 'Luna', 'Ortiz', 'Calle 214, Tijuana', 'NE001', 'PE2021', 'GG011', 'TU092'),
('MTC0000054', 'Edgar', 'Naranjo', 'Cervantes', 'Calle 215, Tijuana', 'NE001', 'PE2021', 'GG011', 'TU093'),
('MTC0000055', 'Gabriela', 'Villanueva', 'Santiago', 'Calle 216, Tijuana', 'NE002', 'PE2021', 'GG012', 'TU094'),
('MTC0000056', 'Álvaro', 'Serrano', 'Vega', 'Calle 217, Tijuana', 'NE002', 'PE2021', 'GG012', 'TU095'),
('MTC0000057', 'Victoria', 'Hurtado', 'Sandoval', 'Calle 218, Tijuana', 'NE003', 'PE2020', 'GG001', 'TU096'),
('MTC0000058', 'Tomás', 'Álvarez', 'Cisneros', 'Calle 219, Tijuana', 'NE003', 'PE2020', 'GG001', 'TU097'),
('MTC0000059', 'Pilar', 'Hernández', 'Munguía', 'Calle 220, Tijuana', 'NE001', 'PE2020', 'GG002', 'TU098'),
('MTC0000060', 'Julián', 'Nieves', 'Zavala', 'Calle 221, Tijuana', 'NE001', 'PE2020', 'GG002', 'TU099'),
('MTC0000061', 'Patricia', 'Beltrán', 'Magaña', 'Calle 222, Tijuana', 'NE002', 'PE2020', 'GG003', 'TU100'),
('MTC0000062', 'Jesus', 'Aragon', 'Lopez', 'Sevilla Residencial', 'NE002', 'PE2023', 'GG010', 'TU101');

--
-- Disparadores `alumno`
--
DELIMITER $$
CREATE TRIGGER `autoinc_matricula` BEFORE INSERT ON `alumno` FOR EACH ROW BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);
    -- Obtener el siguiente valor de la secuencia
    INSERT INTO matricula_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();
    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 7, '0');
    -- Asignar el ID formateado con el prefijo 'MTC' a la nueva fila
    SET NEW.matricula = CONCAT('MTC', formatted_id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos_especiales`
--

CREATE TABLE `eventos_especiales` (
  `id` int(11) NOT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL,
  `fecha` date NOT NULL,
  `lugar` varchar(50) NOT NULL,
  `horario` varchar(20) NOT NULL,
  `descripcion` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `eventos_especiales`
--

INSERT INTO `eventos_especiales` (`id`, `motivo_de_pago`, `fecha`, `lugar`, `horario`, `descripcion`) VALUES
(1, 'MP066', '2024-10-15', 'Auditorio Escolar', '18:00-20:00', 'Festival de Otoño'),
(2, 'MP067', '2024-12-20', 'Patio Central', '17:00-19:00', 'Posada Navideña'),
(3, 'MP068', '2025-02-14', 'Gimnasio', '19:00-21:00', 'Baile de San Valentín'),
(4, 'MP069', '2025-05-10', 'Jardín Escolar', '10:00-13:00', 'Celebración del Día de las Madres'),
(5, 'MP070', '2025-06-30', 'Auditorio Escolar', '18:00-20:00', 'Ceremonia de Graduación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `folio_seq`
--

CREATE TABLE `folio_seq` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `folio_seq`
--

INSERT INTO `folio_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),
(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),
(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),
(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),
(51),
(52),
(53),
(54),
(55),
(56),
(57),
(58),
(59),
(60),
(61),
(62),
(63),
(64),
(65),
(66),
(67),
(68),
(69),
(70),
(71),
(72),
(73),
(74),
(75),
(76),
(77),
(78),
(79),
(80),
(81),
(82),
(83),
(84),
(85),
(86),
(87),
(88),
(89),
(90),
(91),
(92),
(93),
(94),
(95),
(96),
(97),
(98),
(99),
(100),
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ggcofigo_seq`
--

CREATE TABLE `ggcofigo_seq` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ggcofigo_seq`
--

INSERT INTO `ggcofigo_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado_y_grupo`
--

CREATE TABLE `grado_y_grupo` (
  `codigo` varchar(5) NOT NULL,
  `grado` varchar(5) DEFAULT NULL,
  `grupo` varchar(5) DEFAULT NULL,
  `periodo_escolar` varchar(10) DEFAULT NULL,
  `nivel_educativo` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `grado_y_grupo`
--

INSERT INTO `grado_y_grupo` (`codigo`, `grado`, `grupo`, `periodo_escolar`, `nivel_educativo`) VALUES
('GG001', '1', 'A', 'PE2020', 'NE001'),
('GG002', '2', 'A', 'PE2020', 'NE001'),
('GG003', '3', 'A', 'PE2020', 'NE001'),
('GG004', '1', 'A', 'PE2021', 'NE001'),
('GG005', '2', 'A', 'PE2021', 'NE001'),
('GG006', '3', 'A', 'PE2021', 'NE001'),
('GG007', '1', 'A', 'PE2022', 'NE001'),
('GG008', '2', 'A', 'PE2022', 'NE001'),
('GG009', '3', 'A', 'PE2022', 'NE001'),
('GG010', '1', 'A', 'PE2023', 'NE002'),
('GG011', '2', 'A', 'PE2023', 'NE002'),
('GG012', '3', 'A', 'PE2023', 'NE002'),
('GG013', '1', 'A', 'PE2023', 'NE002'),
('GG014', '2', 'A', 'PE2023', 'NE002'),
('GG015', '3', 'A', 'PE2023', 'NE002');

--
-- Disparadores `grado_y_grupo`
--
DELIMITER $$
CREATE TRIGGER `autoinc_codigoGG` BEFORE INSERT ON `grado_y_grupo` FOR EACH ROW BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);
    -- Obtener el siguiente valor de la secuencia
    INSERT INTO ggcofigo_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();
    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 3, '0');
    -- Asignar el ID formateado con el prefijo 'GG' a la nueva fila
    SET NEW.codigo = CONCAT('GG', formatted_id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `id` int(11) NOT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL,
  `proximo_pago` date NOT NULL,
  `fecha_pago` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`id`, `motivo_de_pago`, `proximo_pago`, `fecha_pago`) VALUES
(1, 'MP001', '2020-08-01', '2021-08-01'),
(2, 'MP002', '2020-08-01', '2021-08-01'),
(3, 'MP003', '2020-08-01', '2021-08-01'),
(4, 'MP004', '2021-08-01', '2022-08-01'),
(5, 'MP005', '2021-08-01', '2022-08-01'),
(6, 'MP006', '2021-08-01', '2022-08-01'),
(7, 'MP007', '2022-08-01', '2023-08-01'),
(8, 'MP008', '2022-08-01', '2023-08-01'),
(9, 'MP009', '2022-08-01', '2023-08-01'),
(10, 'MP010', '2023-08-01', '2024-08-01'),
(11, 'MP011', '2023-08-01', '2024-08-01'),
(12, 'MP012', '2023-08-01', '2024-08-01'),
(13, 'MP013', '2024-08-01', '2025-08-01'),
(14, 'MP014', '2024-08-01', '2025-08-01'),
(15, 'MP015', '2024-08-01', '2025-08-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimiento`
--

CREATE TABLE `mantenimiento` (
  `id` int(11) NOT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL,
  `fecha_pago` date NOT NULL,
  `proximo_pago` date NOT NULL,
  `concepto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mantenimiento`
--

INSERT INTO `mantenimiento` (`id`, `motivo_de_pago`, `fecha_pago`, `proximo_pago`, `concepto`) VALUES
(1, 'MP061', '2020-08-15', '2021-08-15', 'Mantenimiento anual 2020'),
(2, 'MP062', '2021-08-15', '2022-08-15', 'Mantenimiento anual 2021'),
(3, 'MP063', '2022-08-15', '2023-08-15', 'Mantenimiento anual 2022'),
(4, 'MP064', '2023-08-15', '2024-08-15', 'Mantenimiento anual 2023'),
(5, 'MP065', '2024-08-15', '2025-08-15', 'Mantenimiento anual 2024');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula_seq`
--

CREATE TABLE `matricula_seq` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `matricula_seq`
--

INSERT INTO `matricula_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),
(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),
(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),
(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),
(51),
(52),
(53),
(54),
(55),
(56),
(57),
(58),
(59),
(60),
(61),
(62);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensualidad`
--

CREATE TABLE `mensualidad` (
  `id` int(11) NOT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL,
  `mes_pagado` varchar(10) NOT NULL,
  `proximo_pago` date NOT NULL,
  `fecha_pago` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mensualidad`
--

INSERT INTO `mensualidad` (`id`, `motivo_de_pago`, `mes_pagado`, `proximo_pago`, `fecha_pago`) VALUES
(1, 'MP016', 'Agosto', '2020-08-01', '2020-08-31'),
(2, 'MP017', 'Agosto', '2020-08-01', '2020-08-31'),
(3, 'MP018', 'Agosto', '2020-08-01', '2020-08-31'),
(4, 'MP019', 'Agosto', '2021-08-01', '2021-08-31'),
(5, 'MP020', 'Agosto', '2021-08-01', '2021-08-31'),
(6, 'MP021', 'Agosto', '2021-08-01', '2021-08-31'),
(7, 'MP022', 'Agosto', '2022-08-01', '2022-08-31'),
(8, 'MP023', 'Agosto', '2022-08-01', '2022-08-31'),
(9, 'MP024', 'Agosto', '2022-08-01', '2022-08-31'),
(10, 'MP025', 'Agosto', '2023-08-01', '2023-08-31'),
(11, 'MP026', 'Agosto', '2023-08-01', '2023-08-31'),
(12, 'MP027', 'Agosto', '2023-08-01', '2023-08-31'),
(13, 'MP028', 'Agosto', '2024-08-01', '2024-08-31'),
(14, 'MP029', 'Agosto', '2024-08-01', '2024-08-31'),
(15, 'MP030', 'Agosto', '2024-08-01', '2024-08-31'),
(16, 'MP016', 'Septiembre', '2020-09-01', '2020-09-30'),
(17, 'MP017', 'Septiembre', '2020-09-01', '2020-09-30'),
(18, 'MP018', 'Septiembre', '2020-09-01', '2020-09-30'),
(19, 'MP019', 'Septiembre', '2021-09-01', '2021-09-30'),
(20, 'MP020', 'Septiembre', '2021-09-01', '2021-09-30'),
(21, 'MP021', 'Septiembre', '2021-09-01', '2021-09-30'),
(22, 'MP022', 'Septiembre', '2022-09-01', '2022-09-30'),
(23, 'MP023', 'Septiembre', '2022-09-01', '2022-09-30'),
(24, 'MP024', 'Septiembre', '2022-09-01', '2022-09-30'),
(25, 'MP025', 'Septiembre', '2023-09-01', '2023-09-30'),
(26, 'MP026', 'Septiembre', '2023-09-01', '2023-09-30'),
(27, 'MP027', 'Septiembre', '2023-09-01', '2023-09-30'),
(28, 'MP028', 'Septiembre', '2024-09-01', '2024-09-30'),
(29, 'MP029', 'Septiembre', '2024-09-01', '2024-09-30'),
(30, 'MP030', 'Septiembre', '2024-09-01', '2024-09-30'),
(31, 'MP016', 'Octubre', '2020-10-01', '2020-10-31'),
(32, 'MP017', 'Octubre', '2020-10-01', '2020-10-31'),
(33, 'MP018', 'Octubre', '2020-10-01', '2020-10-31'),
(34, 'MP019', 'Octubre', '2021-10-01', '2021-10-31'),
(35, 'MP020', 'Octubre', '2021-10-01', '2021-10-31'),
(36, 'MP021', 'Octubre', '2021-10-01', '2021-10-31'),
(37, 'MP022', 'Octubre', '2022-10-01', '2022-10-31'),
(38, 'MP023', 'Octubre', '2022-10-01', '2022-10-31'),
(39, 'MP024', 'Octubre', '2022-10-01', '2022-10-31'),
(40, 'MP025', 'Octubre', '2023-10-01', '2023-10-31'),
(41, 'MP026', 'Octubre', '2023-10-01', '2023-10-31'),
(42, 'MP027', 'Octubre', '2023-10-01', '2023-10-31'),
(43, 'MP028', 'Octubre', '2024-10-01', '2024-10-31'),
(44, 'MP029', 'Octubre', '2024-10-01', '2024-10-31'),
(45, 'MP030', 'Octubre', '2024-10-01', '2024-10-31'),
(46, 'MP016', 'Noviembre', '2020-11-01', '2020-11-30'),
(47, 'MP017', 'Noviembre', '2020-11-01', '2020-11-30'),
(48, 'MP018', 'Noviembre', '2020-11-01', '2020-11-30'),
(49, 'MP019', 'Noviembre', '2021-11-01', '2021-11-30'),
(50, 'MP020', 'Noviembre', '2021-11-01', '2021-11-30'),
(51, 'MP021', 'Noviembre', '2021-11-01', '2021-11-30'),
(52, 'MP022', 'Noviembre', '2022-11-01', '2022-11-30'),
(53, 'MP023', 'Noviembre', '2022-11-01', '2022-11-30'),
(54, 'MP024', 'Noviembre', '2022-11-01', '2022-11-30'),
(55, 'MP025', 'Noviembre', '2023-11-01', '2023-11-30'),
(56, 'MP026', 'Noviembre', '2023-11-01', '2023-11-30'),
(57, 'MP027', 'Noviembre', '2023-11-01', '2023-11-30'),
(58, 'MP028', 'Noviembre', '2024-11-01', '2024-11-30'),
(59, 'MP029', 'Noviembre', '2024-11-01', '2024-11-30'),
(60, 'MP030', 'Noviembre', '2024-11-01', '2024-11-30'),
(61, 'MP016', 'Diciembre', '2020-12-01', '2020-12-31'),
(62, 'MP017', 'Diciembre', '2020-12-01', '2020-12-31'),
(63, 'MP018', 'Diciembre', '2020-12-01', '2020-12-31'),
(64, 'MP019', 'Diciembre', '2021-12-01', '2021-12-31'),
(65, 'MP020', 'Diciembre', '2021-12-01', '2021-12-31'),
(66, 'MP021', 'Diciembre', '2021-12-01', '2021-12-31'),
(67, 'MP022', 'Diciembre', '2022-12-01', '2022-12-31'),
(68, 'MP023', 'Diciembre', '2022-12-01', '2022-12-31'),
(69, 'MP024', 'Diciembre', '2022-12-01', '2022-12-31'),
(70, 'MP025', 'Diciembre', '2023-12-01', '2023-12-31'),
(71, 'MP026', 'Diciembre', '2023-12-01', '2023-12-31'),
(72, 'MP027', 'Diciembre', '2023-12-01', '2023-12-31'),
(73, 'MP028', 'Diciembre', '2024-12-01', '2024-12-31'),
(74, 'MP029', 'Diciembre', '2024-12-01', '2024-12-31'),
(75, 'MP030', 'Diciembre', '2024-12-01', '2024-12-31'),
(76, 'MP019', 'Enero', '2021-01-01', '2021-01-31'),
(77, 'MP020', 'Enero', '2021-01-01', '2021-01-31'),
(78, 'MP021', 'Enero', '2021-01-01', '2021-01-31'),
(79, 'MP022', 'Enero', '2022-01-01', '2022-01-31'),
(80, 'MP023', 'Enero', '2022-01-01', '2022-01-31'),
(81, 'MP024', 'Enero', '2022-01-01', '2022-01-31'),
(82, 'MP025', 'Enero', '2023-01-01', '2023-01-31'),
(83, 'MP026', 'Enero', '2023-01-01', '2023-01-31'),
(84, 'MP027', 'Enero', '2023-01-01', '2023-01-31'),
(85, 'MP028', 'Enero', '2024-01-01', '2024-01-31'),
(86, 'MP029', 'Enero', '2024-01-01', '2024-01-31'),
(87, 'MP030', 'Enero', '2024-01-01', '2024-01-31'),
(88, 'MP019', 'Febrero', '2021-02-01', '0000-00-00'),
(89, 'MP020', 'Febrero', '2021-02-01', '0000-00-00'),
(90, 'MP021', 'Febrero', '2021-02-01', '0000-00-00'),
(91, 'MP022', 'Febrero', '2022-02-01', '0000-00-00'),
(92, 'MP023', 'Febrero', '2022-02-01', '0000-00-00'),
(93, 'MP024', 'Febrero', '2022-02-01', '0000-00-00'),
(94, 'MP025', 'Febrero', '2023-02-01', '0000-00-00'),
(95, 'MP026', 'Febrero', '2023-02-01', '0000-00-00'),
(96, 'MP027', 'Febrero', '2023-02-01', '0000-00-00'),
(97, 'MP028', 'Febrero', '2024-02-01', '2024-02-29'),
(98, 'MP029', 'Febrero', '2024-02-01', '2024-02-29'),
(99, 'MP030', 'Febrero', '2024-02-01', '2024-02-29'),
(100, 'MP019', 'Marzo', '2021-03-01', '2021-03-31'),
(101, 'MP020', 'Marzo', '2021-03-01', '2021-03-31'),
(102, 'MP021', 'Marzo', '2021-03-01', '2021-03-31'),
(103, 'MP022', 'Marzo', '2022-03-01', '2022-03-31'),
(104, 'MP023', 'Marzo', '2022-03-01', '2022-03-31'),
(105, 'MP024', 'Marzo', '2022-03-01', '2022-03-31'),
(106, 'MP025', 'Marzo', '2023-03-01', '2023-03-31'),
(107, 'MP026', 'Marzo', '2023-03-01', '2023-03-31'),
(108, 'MP027', 'Marzo', '2023-03-01', '2023-03-31'),
(109, 'MP028', 'Marzo', '2024-03-01', '2024-03-31'),
(110, 'MP029', 'Marzo', '2024-03-01', '2024-03-31'),
(111, 'MP030', 'Marzo', '2024-03-01', '2024-03-31'),
(112, 'MP019', 'Abril', '2021-04-01', '2021-04-30'),
(113, 'MP020', 'Abril', '2021-04-01', '2021-04-30'),
(114, 'MP021', 'Abril', '2021-04-01', '2021-04-30'),
(115, 'MP022', 'Abril', '2022-04-01', '2022-04-30'),
(116, 'MP023', 'Abril', '2022-04-01', '2022-04-30'),
(117, 'MP024', 'Abril', '2022-04-01', '2022-04-30'),
(118, 'MP025', 'Abril', '2023-04-01', '2023-04-30'),
(119, 'MP026', 'Abril', '2023-04-01', '2023-04-30'),
(120, 'MP027', 'Abril', '2023-04-01', '2023-04-30'),
(121, 'MP028', 'Abril', '2024-04-01', '2024-04-30'),
(122, 'MP029', 'Abril', '2024-04-01', '2024-04-30'),
(123, 'MP030', 'Abril', '2024-04-01', '2024-04-30'),
(124, 'MP019', 'Mayo', '2021-05-01', '2021-05-31'),
(125, 'MP020', 'Mayo', '2021-05-01', '2021-05-31'),
(126, 'MP021', 'Mayo', '2021-05-01', '2021-05-31'),
(127, 'MP022', 'Mayo', '2022-05-01', '2022-05-31'),
(128, 'MP023', 'Mayo', '2022-05-01', '2022-05-31'),
(129, 'MP024', 'Mayo', '2022-05-01', '2022-05-31'),
(130, 'MP025', 'Mayo', '2023-05-01', '2023-05-31'),
(131, 'MP026', 'Mayo', '2023-05-01', '2023-05-31'),
(132, 'MP027', 'Mayo', '2023-05-01', '2023-05-31'),
(133, 'MP028', 'Mayo', '2024-05-01', '2024-05-31'),
(134, 'MP029', 'Mayo', '2024-05-01', '2024-05-31'),
(135, 'MP030', 'Mayo', '2024-05-01', '2024-05-31');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `motivo_de_pago`
--

CREATE TABLE `motivo_de_pago` (
  `codigo` varchar(5) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `periodo_escolar` varchar(10) DEFAULT NULL,
  `Nivel_educativo` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `motivo_de_pago`
--

INSERT INTO `motivo_de_pago` (`codigo`, `nombre`, `precio`, `periodo_escolar`, `Nivel_educativo`) VALUES
('MP001', 'Inscripción Preescolar 2020', 850.00, 'PE2020', 'NE001'),
('MP002', 'Inscripción Primaria 2020', 1050.00, 'PE2020', 'NE002'),
('MP003', 'Inscripción Secundaria 2020', 1250.00, 'PE2020', 'NE003'),
('MP004', 'Inscripción Preescolar 2021', 850.00, 'PE2021', 'NE001'),
('MP005', 'Inscripción Primaria 2021', 1050.00, 'PE2021', 'NE002'),
('MP006', 'Inscripción Secundaria 2021', 1250.00, 'PE2021', 'NE003'),
('MP007', 'Inscripción Preescolar 2022', 850.00, 'PE2022', 'NE001'),
('MP008', 'Inscripción Primaria 2022', 1050.00, 'PE2022', 'NE002'),
('MP009', 'Inscripción Secundaria 2022', 1250.00, 'PE2022', 'NE003'),
('MP010', 'Inscripción Preescolar 2023', 850.00, 'PE2023', 'NE001'),
('MP011', 'Inscripción Primaria 2023', 1050.00, 'PE2023', 'NE002'),
('MP012', 'Inscripción Secundaria 2023', 1250.00, 'PE2023', 'NE003'),
('MP013', 'Inscripción Preescolar 2024', 850.00, 'PE2024', 'NE001'),
('MP014', 'Inscripción Primaria 2024', 1050.00, 'PE2024', 'NE002'),
('MP015', 'Inscripción Secundaria 2024', 1250.00, 'PE2024', 'NE003'),
('MP016', 'Mensualidad Preescolar 2020', 420.00, 'PE2020', 'NE001'),
('MP017', 'Mensualidad Primaria 2020', 520.00, 'PE2020', 'NE002'),
('MP018', 'Mensualidad Secundaria 2020', 620.00, 'PE2020', 'NE003'),
('MP019', 'Mensualidad Preescolar 2021', 420.00, 'PE2021', 'NE001'),
('MP020', 'Mensualidad Primaria 2021', 520.00, 'PE2021', 'NE002'),
('MP021', 'Mensualidad Secundaria 2021', 620.00, 'PE2021', 'NE003'),
('MP022', 'Mensualidad Preescolar 2022', 420.00, 'PE2022', 'NE001'),
('MP023', 'Mensualidad Primaria 2022', 520.00, 'PE2022', 'NE002'),
('MP024', 'Mensualidad Secundaria 2022', 620.00, 'PE2022', 'NE003'),
('MP025', 'Mensualidad Preescolar 2023', 420.00, 'PE2023', 'NE001'),
('MP026', 'Mensualidad Primaria 2023', 520.00, 'PE2023', 'NE002'),
('MP027', 'Mensualidad Secundaria 2023', 620.00, 'PE2023', 'NE003'),
('MP028', 'Mensualidad Preescolar 2024', 420.00, 'PE2024', 'NE001'),
('MP029', 'Mensualidad Primaria 2024', 520.00, 'PE2024', 'NE002'),
('MP030', 'Mensualidad Secundaria 2024', 620.00, 'PE2024', 'NE003'),
('MP031', 'Uniforme Preescolar 2020', 270.00, 'PE2020', 'NE001'),
('MP032', 'Uniforme Primaria 2020', 320.00, 'PE2020', 'NE002'),
('MP033', 'Uniforme Secundaria 2020', 370.00, 'PE2020', 'NE003'),
('MP034', 'Uniforme Preescolar 2021', 270.00, 'PE2021', 'NE001'),
('MP035', 'Uniforme Primaria 2021', 320.00, 'PE2021', 'NE002'),
('MP036', 'Uniforme Secundaria 2021', 370.00, 'PE2021', 'NE003'),
('MP037', 'Uniforme Preescolar 2022', 270.00, 'PE2022', 'NE001'),
('MP038', 'Uniforme Primaria 2022', 320.00, 'PE2022', 'NE002'),
('MP039', 'Uniforme Secundaria 2022', 370.00, 'PE2022', 'NE003'),
('MP040', 'Uniforme Preescolar 2023', 270.00, 'PE2023', 'NE001'),
('MP041', 'Uniforme Primaria 2023', 320.00, 'PE2023', 'NE002'),
('MP042', 'Uniforme Secundaria 2023', 370.00, 'PE2023', 'NE003'),
('MP043', 'Uniforme Preescolar 2024', 270.00, 'PE2024', 'NE001'),
('MP044', 'Uniforme Primaria 2024', 320.00, 'PE2024', 'NE002'),
('MP045', 'Uniforme Secundaria 2024', 370.00, 'PE2024', 'NE003'),
('MP046', 'Papelería Preescolar 2020', 170.00, 'PE2020', 'NE001'),
('MP047', 'Papelería Primaria 2020', 220.00, 'PE2020', 'NE002'),
('MP048', 'Papelería Secundaria 2020', 270.00, 'PE2020', 'NE003'),
('MP049', 'Papelería Preescolar 2021', 170.00, 'PE2021', 'NE001'),
('MP050', 'Papelería Primaria 2021', 220.00, 'PE2021', 'NE002'),
('MP051', 'Papelería Secundaria 2021', 270.00, 'PE2021', 'NE003'),
('MP052', 'Papelería Preescolar 2022', 170.00, 'PE2022', 'NE001'),
('MP053', 'Papelería Primaria 2022', 220.00, 'PE2022', 'NE002'),
('MP054', 'Papelería Secundaria 2022', 270.00, 'PE2022', 'NE003'),
('MP055', 'Papelería Preescolar 2023', 170.00, 'PE2023', 'NE001'),
('MP056', 'Papelería Primaria 2023', 220.00, 'PE2023', 'NE002'),
('MP057', 'Papelería Secundaria 2023', 270.00, 'PE2023', 'NE003'),
('MP058', 'Papelería Preescolar 2024', 170.00, 'PE2024', 'NE001'),
('MP059', 'Papelería Primaria 2024', 220.00, 'PE2024', 'NE002'),
('MP060', 'Papelería Secundaria 2024', 270.00, 'PE2024', 'NE003'),
('MP061', 'Mantenimiento 2020', 120.00, 'PE2020', NULL),
('MP062', 'Mantenimiento 2021', 120.00, 'PE2021', NULL),
('MP063', 'Mantenimiento 2022', 120.00, 'PE2022', NULL),
('MP064', 'Mantenimiento 2023', 120.00, 'PE2023', NULL),
('MP065', 'Mantenimiento 2024', 120.00, 'PE2024', NULL),
('MP066', 'Evento Especial 2020', 170.00, 'PE2020', NULL),
('MP067', 'Evento Especial 2021', 170.00, 'PE2021', NULL),
('MP068', 'Evento Especial 2022', 170.00, 'PE2022', NULL),
('MP069', 'Evento Especial 2023', 170.00, 'PE2023', NULL),
('MP070', 'Evento Especial 2024', 170.00, 'PE2024', NULL);

--
-- Disparadores `motivo_de_pago`
--
DELIMITER $$
CREATE TRIGGER `autoinc_codigoMP` BEFORE INSERT ON `motivo_de_pago` FOR EACH ROW BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);
    -- Obtener el siguiente valor de la secuencia
    INSERT INTO mpcodigo_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();
    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 3, '0');
    -- Asignar el ID formateado con el prefijo 'MP' a la nueva fila
    SET NEW.codigo = CONCAT('MP', formatted_id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mpcodigo_seq`
--

CREATE TABLE `mpcodigo_seq` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mpcodigo_seq`
--

INSERT INTO `mpcodigo_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),
(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),
(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),
(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),
(51),
(52),
(53),
(54),
(55),
(56),
(57),
(58),
(59),
(60),
(61),
(62),
(63),
(64),
(65),
(66),
(67),
(68),
(69),
(70);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `necodigo_seq`
--

CREATE TABLE `necodigo_seq` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `necodigo_seq`
--

INSERT INTO `necodigo_seq` (`id`) VALUES
(1),
(2),
(3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel_educativo`
--

CREATE TABLE `nivel_educativo` (
  `codigo` varchar(5) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `costo_base` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `nivel_educativo`
--

INSERT INTO `nivel_educativo` (`codigo`, `nombre`, `costo_base`) VALUES
('NE001', 'Preescolar', 4000.00),
('NE002', 'Primaria', 5000.00),
('NE003', 'Secundaria', 6000.00);

--
-- Disparadores `nivel_educativo`
--
DELIMITER $$
CREATE TRIGGER `autoinc_codigoNE` BEFORE INSERT ON `nivel_educativo` FOR EACH ROW BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);
    -- Obtener el siguiente valor de la secuencia
    INSERT INTO necodigo_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();
    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 3, '0');
    -- Asignar el ID formateado con el prefijo 'NE' a la nueva fila
    SET NEW.codigo = CONCAT('NE', formatted_id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `num_tel`
--

CREATE TABLE `num_tel` (
  `id` int(11) NOT NULL,
  `tutor` varchar(10) DEFAULT NULL,
  `numTel` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `num_tel`
--

INSERT INTO `num_tel` (`id`, `tutor`, `numTel`) VALUES
(1, 'TU001', '663-301-6320'),
(2, 'TU002', '664-507-5470'),
(3, 'TU003', '667-122-2645'),
(4, 'TU004', '665-444-3321'),
(5, 'TU005', '662-123-7890'),
(6, 'TU006', '668-987-6543'),
(7, 'TU007', '669-321-1234'),
(8, 'TU008', '662-456-7891'),
(9, 'TU009', '663-987-6542'),
(10, 'TU010', '664-555-1234'),
(11, 'TU011', '667-876-5432'),
(12, 'TU012', '665-234-5678'),
(13, 'TU013', '669-345-6789'),
(14, 'TU014', '668-234-5671'),
(15, 'TU015', '663-123-4567'),
(16, 'TU016', '664-789-1234'),
(17, 'TU017', '665-456-7890'),
(18, 'TU018', '669-555-6789'),
(19, 'TU019', '667-234-5678'),
(20, 'TU020', '662-345-6789'),
(21, 'TU021', '664-234-5678'),
(22, 'TU022', '669-876-5432'),
(23, 'TU023', '668-123-4567'),
(24, 'TU024', '663-345-6789'),
(25, 'TU025', '665-555-1234'),
(26, 'TU026', '662-234-5678'),
(27, 'TU027', '667-345-6789'),
(28, 'TU028', '664-789-1234'),
(29, 'TU029', '668-456-7890'),
(30, 'TU030', '669-234-5678'),
(31, 'TU031', '665-789-1234'),
(32, 'TU032', '662-555-6789'),
(33, 'TU033', '664-345-6789'),
(34, 'TU034', '663-789-1234'),
(35, 'TU035', '668-234-5678'),
(36, 'TU036', '669-345-6789'),
(37, 'TU037', '665-234-5678'),
(38, 'TU038', '662-345-6789'),
(39, 'TU039', '664-234-5678'),
(40, 'TU040', '667-789-1234'),
(41, 'TU041', '668-555-1234'),
(42, 'TU042', '663-234-5678'),
(43, 'TU043', '664-345-6789'),
(44, 'TU044', '669-234-5678'),
(45, 'TU045', '667-234-5678'),
(46, 'TU046', '665-345-6789'),
(47, 'TU047', '662-789-1234'),
(48, 'TU048', '669-555-6789'),
(49, 'TU049', '668-234-5678'),
(50, 'TU050', '664-234-5678'),
(51, 'TU051', '667-555-1234'),
(52, 'TU052', '662-234-5678'),
(53, 'TU053', '665-345-6789'),
(54, 'TU054', '664-789-1234'),
(55, 'TU055', '669-345-6789'),
(56, 'TU056', '663-234-5678'),
(57, 'TU057', '668-789-1234'),
(58, 'TU058', '662-555-6789'),
(59, 'TU059', '664-345-6789'),
(60, 'TU060', '665-234-5678'),
(61, 'TU061', '669-234-5678'),
(62, 'TU062', '662-345-6789'),
(63, 'TU063', '668-234-5678'),
(64, 'TU064', '667-789-1234'),
(65, 'TU065', '663-555-6789'),
(66, 'TU066', '664-234-5678'),
(67, 'TU067', '669-789-1234'),
(68, 'TU068', '668-555-6789'),
(69, 'TU069', '662-234-5678'),
(70, 'TU070', '665-789-1234'),
(71, 'TU071', '663-345-6789'),
(72, 'TU072', '667-234-5678'),
(73, 'TU073', '664-555-6789'),
(74, 'TU074', '668-234-5678'),
(75, 'TU075', '669-345-6789'),
(76, 'TU076', '662-789-1234'),
(77, 'TU077', '665-234-5678'),
(78, 'TU078', '667-345-6789'),
(79, 'TU079', '663-789-1234'),
(80, 'TU080', '664-234-5678'),
(81, 'TU081', '668-789-1234'),
(82, 'TU082', '665-555-6789'),
(83, 'TU083', '669-234-5678'),
(84, 'TU084', '662-345-6789'),
(85, 'TU085', '667-234-5678'),
(86, 'TU086', '664-345-6789'),
(87, 'TU087', '668-234-5678'),
(88, 'TU088', '663-234-5678'),
(89, 'TU089', '669-789-1234'),
(90, 'TU090', '665-345-6789'),
(91, 'TU091', '662-789-1234'),
(92, 'TU092', '667-555-6789'),
(93, 'TU093', '668-345-6789'),
(94, 'TU094', '663-789-1234'),
(95, 'TU095', '664-234-5678'),
(96, 'TU096', '665-234-5678'),
(97, 'TU097', '669-234-5678'),
(98, 'TU098', '662-555-6789'),
(99, 'TU099', '668-789-1234'),
(100, 'TU100', '667-234-5678'),
(101, 'TU001', '663-301-6321'),
(102, 'TU002', '664-507-5471'),
(103, 'TU003', '667-122-2646'),
(104, 'TU004', '665-444-3322'),
(105, 'TU005', '662-123-7891'),
(106, 'TU006', '668-987-6544'),
(107, 'TU007', '669-321-1235'),
(108, 'TU008', '662-456-7892'),
(109, 'TU009', '663-987-6543'),
(110, 'TU010', '664-555-1235'),
(111, 'TU011', '667-876-5433'),
(112, 'TU012', '665-234-5679'),
(113, 'TU013', '669-345-6790'),
(114, 'TU014', '668-234-5672'),
(115, 'TU015', '663-123-4568'),
(116, 'TU016', '664-789-1235'),
(117, 'TU017', '665-456-7891'),
(118, 'TU018', '669-555-6790'),
(119, 'TU019', '667-234-5679'),
(120, 'TU020', '662-345-6790'),
(121, 'TU021', '664-234-5679'),
(122, 'TU022', '669-876-5433'),
(123, 'TU023', '668-123-4568'),
(124, 'TU024', '663-345-6790'),
(125, 'TU025', '665-555-1235'),
(126, 'TU026', '662-234-5679'),
(127, 'TU027', '667-345-6790'),
(128, 'TU028', '664-789-1235'),
(129, 'TU029', '668-456-7891'),
(130, 'TU030', '669-234-5679'),
(131, 'TU031', '665-789-1235'),
(132, 'TU032', '662-555-6790'),
(133, 'TU033', '664-345-6790'),
(134, 'TU034', '663-789-1235'),
(135, 'TU035', '668-234-5679'),
(136, 'TU036', '669-345-6790'),
(137, 'TU037', '665-234-5679'),
(138, 'TU038', '662-345-6790'),
(139, 'TU039', '664-234-5679'),
(140, 'TU040', '667-789-1235'),
(141, 'TU041', '668-555-1235'),
(142, 'TU042', '663-234-5679'),
(143, 'TU043', '664-345-6790'),
(144, 'TU044', '669-234-5679'),
(145, 'TU045', '667-234-5679'),
(146, 'TU046', '665-345-6790'),
(147, 'TU047', '662-789-1235'),
(148, 'TU048', '669-555-6790'),
(149, 'TU049', '668-234-5679'),
(150, 'TU050', '664-234-5679'),
(151, 'TU051', '667-555-1235'),
(152, 'TU052', '662-234-5679'),
(153, 'TU053', '665-345-6790'),
(154, 'TU054', '664-789-1235'),
(155, 'TU055', '669-345-6790'),
(156, 'TU056', '663-234-5679'),
(157, 'TU057', '668-789-1235'),
(158, 'TU058', '662-555-6790'),
(159, 'TU059', '664-345-6790'),
(160, 'TU060', '665-234-5679'),
(161, 'TU061', '669-234-5679'),
(162, 'TU062', '662-345-6790'),
(163, 'TU063', '668-234-5679'),
(164, 'TU064', '667-789-1235'),
(165, 'TU065', '663-555-6790'),
(166, 'TU066', '664-234-5679'),
(167, 'TU067', '669-789-1235'),
(168, 'TU068', '668-555-6790'),
(169, 'TU069', '662-234-5679'),
(170, 'TU070', '665-789-1235'),
(171, 'TU071', '663-345-6790'),
(172, 'TU072', '667-234-5679'),
(173, 'TU073', '664-555-6790'),
(174, 'TU074', '668-234-5679'),
(175, 'TU075', '669-345-6790'),
(176, 'TU076', '662-789-1235'),
(177, 'TU077', '665-234-5679'),
(178, 'TU078', '667-345-6790'),
(179, 'TU079', '663-789-1235'),
(180, 'TU080', '664-234-5679'),
(181, 'TU081', '668-789-1235'),
(182, 'TU082', '665-555-6790'),
(183, 'TU083', '669-234-5679'),
(184, 'TU084', '662-345-6790'),
(185, 'TU085', '667-234-5679'),
(186, 'TU086', '664-345-6790'),
(187, 'TU087', '668-234-5679'),
(188, 'TU088', '663-234-5679'),
(189, 'TU089', '669-789-1235'),
(190, 'TU090', '665-345-6790'),
(191, 'TU091', '662-789-1235'),
(192, 'TU092', '667-555-6790'),
(193, 'TU093', '668-345-6790'),
(194, 'TU094', '663-789-1235'),
(195, 'TU095', '664-234-5679'),
(196, 'TU096', '665-234-5679'),
(197, 'TU097', '669-234-5679'),
(198, 'TU098', '662-555-6790'),
(199, 'TU099', '668-789-1235'),
(200, 'TU100', '667-234-5679'),
(201, 'TU101', '6633016320');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `numero` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  `iva` decimal(10,2) NOT NULL,
  `monto_total` decimal(10,2) NOT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `alumno` varchar(10) DEFAULT NULL,
  `gradoAlumno` varchar(5) DEFAULT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pago`
--

INSERT INTO `pago` (`numero`, `fecha`, `subtotal`, `iva`, `monto_total`, `estado`, `alumno`, `gradoAlumno`, `motivo_de_pago`) VALUES
(29, '2020-08-01', 850.00, 136.00, 986.00, 'Pagado', 'MTC0000001', 'GG001', 'MP001'),
(30, '2020-08-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(31, '2020-09-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(32, '2020-10-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(33, '2020-11-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(34, '2020-12-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(35, '2021-01-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(36, '2021-02-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(37, '2021-03-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(38, '2021-04-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(39, '2021-05-01', 420.00, 67.20, 487.20, 'pagado', 'MTC0000001', 'GG001', 'MP016'),
(40, '2021-08-01', 850.00, 136.00, 986.00, 'Pagado', 'MTC0000001', 'GG008', 'MP004'),
(41, '2020-08-01', 1050.00, 168.00, 1218.00, 'Pagado', 'MTC0000002', 'GG001', 'MP001'),
(42, '2021-08-01', 1050.00, 168.00, 1218.00, 'Pagado', 'MTC0000002', 'GG008', 'MP001'),
(43, '2020-08-01', 1250.00, 200.00, 1450.00, 'Pagado', 'MTC0000003', 'GG001', 'MP001'),
(44, '2021-08-01', 1250.00, 200.00, 1450.00, 'Pagado', 'MTC0000003', 'GG008', 'MP001'),
(45, '2024-08-01', 170.00, 27.20, 197.20, 'Pagado', 'MTC0000003', 'GG008', 'MP066'),
(46, '2024-08-01', 170.00, 27.20, 197.20, 'Pagado', 'MTC0000002', 'GG008', 'MP066'),
(47, '2024-08-01', 170.00, 27.20, 197.20, 'Pagado', 'MTC0000001', 'GG008', 'MP066'),
(48, '2024-08-06', 1050.00, 168.00, 1218.00, 'Pendiente', 'MTC0000062', NULL, 'MP002'),
(49, '2024-08-06', 270.00, 43.20, 313.20, 'Pendiente', 'MTC0000001', NULL, 'MP060'),
(50, '2024-08-06', 170.00, 27.20, 197.20, 'Pagado', 'MTC0000001', NULL, 'MP046');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `papeleria`
--

CREATE TABLE `papeleria` (
  `id` int(11) NOT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL,
  `nombre_pack` varchar(30) NOT NULL,
  `descripcion` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `papeleria`
--

INSERT INTO `papeleria` (`id`, `motivo_de_pago`, `nombre_pack`, `descripcion`) VALUES
(1, 'MP046', 'Pack Preescolar 2020', 'Cuadernos, crayones, tijeras infantiles, pegamento, plastilina'),
(2, 'MP047', 'Pack Primaria 2020', 'Cuadernos, lápices, colores, regla, compás, diccionario básico'),
(3, 'MP048', 'Pack Secundaria 2020', 'Cuadernos, bolígrafos, calculadora científica, juego de geometría'),
(4, 'MP049', 'Pack Preescolar 2021', 'Cuadernos, crayones, tijeras infantiles, pegamento, plastilina'),
(5, 'MP050', 'Pack Primaria 2021', 'Cuadernos, lápices, colores, regla, compás, diccionario básico'),
(6, 'MP051', 'Pack Secundaria 2021', 'Cuadernos, bolígrafos, calculadora científica, juego de geometría'),
(7, 'MP052', 'Pack Preescolar 2022', 'Cuadernos, crayones, tijeras infantiles, pegamento, plastilina'),
(8, 'MP053', 'Pack Primaria 2022', 'Cuadernos, lápices, colores, regla, compás, diccionario básico'),
(9, 'MP054', 'Pack Secundaria 2022', 'Cuadernos, bolígrafos, calculadora científica, juego de geometría'),
(10, 'MP055', 'Pack Preescolar 2023', 'Cuadernos, crayones, tijeras infantiles, pegamento, plastilina'),
(11, 'MP056', 'Pack Primaria 2023', 'Cuadernos, lápices, colores, regla, compás, diccionario básico'),
(12, 'MP057', 'Pack Secundaria 2023', 'Cuadernos, bolígrafos, calculadora científica, juego de geometría'),
(13, 'MP058', 'Pack Preescolar 2024', 'Cuadernos, crayones, tijeras infantiles, pegamento, plastilina'),
(14, 'MP059', 'Pack Primaria 2024', 'Cuadernos, lápices, colores, regla, compás, diccionario básico'),
(15, 'MP060', 'Pack Secundaria 2024', 'Cuadernos, bolígrafos, calculadora científica, juego de geometría');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodo_escolar`
--

CREATE TABLE `periodo_escolar` (
  `codigo` varchar(10) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_final` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `periodo_escolar`
--

INSERT INTO `periodo_escolar` (`codigo`, `fecha_inicio`, `fecha_final`) VALUES
('PE2020', '2020-08-01', '2021-07-31'),
('PE2021', '2021-08-01', '2022-07-31'),
('PE2022', '2023-08-01', '2024-07-31'),
('PE2023', '2023-08-01', '2024-07-31'),
('PE2024', '2024-08-01', '2025-07-31');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_uniforme`
--

CREATE TABLE `tipo_de_uniforme` (
  `codigo` varchar(5) NOT NULL,
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_de_uniforme`
--

INSERT INTO `tipo_de_uniforme` (`codigo`, `nombre`) VALUES
('TU001', 'Diario'),
('TU002', 'Deportivo');

--
-- Disparadores `tipo_de_uniforme`
--
DELIMITER $$
CREATE TRIGGER `autoinc_codigoTU` BEFORE INSERT ON `tipo_de_uniforme` FOR EACH ROW BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);
    -- Obtener el siguiente valor de la secuencia
    INSERT INTO tucodigo_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();
    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 3, '0');
    -- Asignar el ID formateado con el prefijo 'TU' a la nueva fila
    SET NEW.codigo = CONCAT('TU', formatted_id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tucodigo_seq`
--

CREATE TABLE `tucodigo_seq` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tucodigo_seq`
--

INSERT INTO `tucodigo_seq` (`id`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tutor`
--

CREATE TABLE `tutor` (
  `folio` varchar(10) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `primerApell` varchar(30) NOT NULL,
  `segundoApell` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tutor`
--

INSERT INTO `tutor` (`folio`, `nombre`, `primerApell`, `segundoApell`) VALUES
('TU001', 'Pedro', 'Pérez', 'Rodríguez'),
('TU002', 'Ana', 'López', 'Martínez'),
('TU003', 'Luis', 'Rodríguez', 'Gómez'),
('TU004', 'María', 'Gómez', 'Hernández'),
('TU005', 'Juan', 'Hernández', 'Sánchez'),
('TU006', 'Carlos', 'Sánchez', 'García'),
('TU007', 'Sofía', 'García', 'Pérez'),
('TU008', 'Jorge', 'Torres', 'López'),
('TU009', 'Fernanda', 'Morales', 'Vega'),
('TU010', 'Ricardo', 'Jiménez', 'Núñez'),
('TU011', 'Valeria', 'Mendoza', 'Ortega'),
('TU012', 'Mateo', 'Castillo', 'Ramos'),
('TU013', 'Lucía', 'Ríos', 'Romero'),
('TU014', 'Diego', 'Ortiz', 'Flores'),
('TU015', 'Julia', 'Vargas', 'Chávez'),
('TU016', 'Daniel', 'Rojas', 'Suárez'),
('TU017', 'Emma', 'Fernández', 'Mora'),
('TU018', 'Miguel', 'Ramírez', 'Navarro'),
('TU019', 'Gabriela', 'Domínguez', 'García'),
('TU020', 'Pablo', 'Ruiz', 'Herrera'),
('TU021', 'Camila', 'Aguilar', 'Peña'),
('TU022', 'Andrés', 'Salazar', 'Ríos'),
('TU023', 'Elena', 'Reyes', 'Guerrero'),
('TU024', 'Marcos', 'Navarrete', 'Espinoza'),
('TU025', 'Adriana', 'Soto', 'Martínez'),
('TU026', 'Julio', 'Medina', 'Luna'),
('TU027', 'Isabel', 'Gutiérrez', 'Benítez'),
('TU028', 'Raúl', 'Pacheco', 'Cruz'),
('TU029', 'Sandra', 'Hidalgo', 'Campos'),
('TU030', 'Manuel', 'Cabrera', 'Ríos'),
('TU031', 'Patricia', 'Silva', 'Alvarado'),
('TU032', 'Eduardo', 'Méndez', 'Soto'),
('TU033', 'Teresa', 'Ponce', 'Delgado'),
('TU034', 'Roberto', 'Barrios', 'Guerra'),
('TU035', 'Laura', 'Muñoz', 'Ibarra'),
('TU036', 'Víctor', 'Figueroa', 'Nava'),
('TU037', 'Silvia', 'Escobar', 'Bravo'),
('TU038', 'Francisco', 'Gallegos', 'Oliva'),
('TU039', 'Claudia', 'Montes', 'Paredes'),
('TU040', 'Héctor', 'Varela', 'Serrano'),
('TU041', 'Alicia', 'Noriega', 'Rosales'),
('TU042', 'Felipe', 'Villanueva', 'Esquivel'),
('TU043', 'Mónica', 'Arce', 'Quintero'),
('TU044', 'Santiago', 'Peralta', 'Sosa'),
('TU045', 'Verónica', 'Tapia', 'Cuevas'),
('TU046', 'Oscar', 'Cárdenas', 'Rocha'),
('TU047', 'Ariana', 'Nava', 'Quintana'),
('TU048', 'Cristian', 'León', 'Sandoval'),
('TU049', 'Daniela', 'Mora', 'Palacios'),
('TU050', 'José', 'Fuentes', 'Aguirre'),
('TU051', 'Paula', 'Rivas', 'Bautista'),
('TU052', 'Luis', 'Correa', 'Cortés'),
('TU053', 'Natalia', 'Carrillo', 'Reyes'),
('TU054', 'Ángel', 'Lara', 'Paredes'),
('TU055', 'Mariana', 'Rivera', 'Sánchez'),
('TU056', 'Ernesto', 'Núñez', 'Acosta'),
('TU057', 'Viviana', 'Olvera', 'López'),
('TU058', 'Tomás', 'Barrera', 'Maldonado'),
('TU059', 'Estefanía', 'Salgado', 'Padilla'),
('TU060', 'Rafael', 'Delgado', 'Santana'),
('TU061', 'Carla', 'Ávila', 'Vega'),
('TU062', 'Emanuel', 'Lozano', 'Castillo'),
('TU063', 'Andrea', 'Cervantes', 'Guzmán'),
('TU064', 'Gerardo', 'Valdez', 'Lemus'),
('TU065', 'Karina', 'Solano', 'Salinas'),
('TU066', 'René', 'González', 'Cordero'),
('TU067', 'Brenda', 'Flores', 'Montoya'),
('TU068', 'Damián', 'Arriaga', 'Lugo'),
('TU069', 'Lorena', 'Guerra', 'Cano'),
('TU070', 'Rubén', 'Palma', 'Medina'),
('TU071', 'Miriam', 'Pineda', 'Castro'),
('TU072', 'Ramiro', 'Zamora', 'Galván'),
('TU073', 'Ángela', 'Campos', 'Bravo'),
('TU074', 'Esteban', 'Urbina', 'Tapia'),
('TU075', 'Regina', 'Bravo', 'Neri'),
('TU076', 'Guillermo', 'Quiroz', 'Saldaña'),
('TU077', 'Diana', 'Suárez', 'Mendoza'),
('TU078', 'Javier', 'Cruz', 'Villaseñor'),
('TU079', 'Liliana', 'Cuevas', 'Armenta'),
('TU080', 'Joaquín', 'Gálvez', 'Escobedo'),
('TU081', 'Rosa', 'Venegas', 'Valencia'),
('TU082', 'Sebastián', 'Ortíz', 'Mejía'),
('TU083', 'Elisa', 'Cisneros', 'Valle'),
('TU084', 'Mario', 'Tapia', 'Reynoso'),
('TU085', 'Adela', 'Ramón', 'Galarza'),
('TU086', 'Kevin', 'Escamilla', 'Piña'),
('TU087', 'Paulina', 'Rosas', 'Zavala'),
('TU088', 'Humberto', 'Benítez', 'Escoto'),
('TU089', 'Sara', 'Vargas', 'Barraza'),
('TU090', 'Martín', 'Sierra', 'Miranda'),
('TU091', 'Noelia', 'Luján', 'Franco'),
('TU092', 'Fabián', 'Osorio', 'Solís'),
('TU093', 'Irene', 'Pérez', 'Ramírez'),
('TU094', 'Alberto', 'Ledesma', 'Durán'),
('TU095', 'Olivia', 'Moreno', 'Zapata'),
('TU096', 'Iván', 'Paredes', 'Tovar'),
('TU097', 'Ximena', 'Salinas', 'Murillo'),
('TU098', 'Gustavo', 'Hernández', 'Molina'),
('TU099', 'Yolanda', 'Cruz', 'Sánchez'),
('TU100', 'Antonio', 'Márquez', 'Rangel'),
('TU101', 'Angel', 'Aragon', 'Payan');

--
-- Disparadores `tutor`
--
DELIMITER $$
CREATE TRIGGER `autoinc_folio` BEFORE INSERT ON `tutor` FOR EACH ROW BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);
    -- Obtener el siguiente valor de la secuencia
    INSERT INTO folio_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();
    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 3, '0');
    -- Asignar el ID formateado con el prefijo 'TU' a la nueva fila
    SET NEW.folio = CONCAT('TU', formatted_id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `uniformes`
--

CREATE TABLE `uniformes` (
  `id` int(11) NOT NULL,
  `motivo_de_pago` varchar(5) DEFAULT NULL,
  `talla` varchar(10) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `tipo_de_uniforme` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `uniformes`
--

INSERT INTO `uniformes` (`id`, `motivo_de_pago`, `talla`, `descripcion`, `tipo_de_uniforme`) VALUES
(1, 'MP031', 'S', 'Uniforme diario preescolar talla pequeña 2020', 'TU001'),
(2, 'MP031', 'M', 'Uniforme diario preescolar talla mediana 2020', 'TU001'),
(3, 'MP031', 'G', 'Uniforme diario preescolar talla grande 2020', 'TU001'),
(4, 'MP032', 'S', 'Uniforme diario primaria talla pequeña 2020', 'TU001'),
(5, 'MP032', 'M', 'Uniforme diario primaria talla mediana 2020', 'TU001'),
(6, 'MP032', 'G', 'Uniforme diario primaria talla grande 2020', 'TU001'),
(7, 'MP033', 'S', 'Uniforme diario secundaria talla pequeña 2020', 'TU001'),
(8, 'MP033', 'M', 'Uniforme diario secundaria talla mediana 2020', 'TU001'),
(9, 'MP033', 'G', 'Uniforme diario secundaria talla grande 2020', 'TU001'),
(10, 'MP034', 'S', 'Uniforme diario preescolar talla pequeña 2021', 'TU001'),
(11, 'MP034', 'M', 'Uniforme diario preescolar talla mediana 2021', 'TU001'),
(12, 'MP034', 'G', 'Uniforme diario preescolar talla grande 2021', 'TU001'),
(13, 'MP035', 'S', 'Uniforme diario primaria talla pequeña 2021', 'TU001'),
(14, 'MP035', 'M', 'Uniforme diario primaria talla mediana 2021', 'TU001'),
(15, 'MP035', 'G', 'Uniforme diario primaria talla grande 2021', 'TU001'),
(16, 'MP036', 'S', 'Uniforme diario secundaria talla pequeña 2021', 'TU001'),
(17, 'MP036', 'M', 'Uniforme diario secundaria talla mediana 2021', 'TU001'),
(18, 'MP036', 'G', 'Uniforme diario secundaria talla grande 2021', 'TU001'),
(19, 'MP037', 'S', 'Uniforme diario preescolar talla pequeña 2022', 'TU001'),
(20, 'MP037', 'M', 'Uniforme diario preescolar talla mediana 2022', 'TU001'),
(21, 'MP037', 'G', 'Uniforme diario preescolar talla grande 2022', 'TU001'),
(22, 'MP038', 'S', 'Uniforme diario primaria talla pequeña 2022', 'TU001'),
(23, 'MP038', 'M', 'Uniforme diario primaria talla mediana 2022', 'TU001'),
(24, 'MP038', 'G', 'Uniforme diario primaria talla grande 2022', 'TU001'),
(25, 'MP039', 'S', 'Uniforme diario secundaria talla pequeña 2022', 'TU001'),
(26, 'MP039', 'M', 'Uniforme diario secundaria talla mediana 2022', 'TU001'),
(27, 'MP039', 'G', 'Uniforme diario secundaria talla grande 2022', 'TU001'),
(28, 'MP040', 'S', 'Uniforme diario preescolar talla pequeña 2023', 'TU001'),
(29, 'MP040', 'M', 'Uniforme diario preescolar talla mediana 2023', 'TU001'),
(30, 'MP040', 'G', 'Uniforme diario preescolar talla grande 2023', 'TU001'),
(31, 'MP041', 'S', 'Uniforme diario primaria talla pequeña 2023', 'TU001'),
(32, 'MP041', 'M', 'Uniforme diario primaria talla mediana 2023', 'TU001'),
(33, 'MP041', 'G', 'Uniforme diario primaria talla grande 2023', 'TU001'),
(34, 'MP042', 'S', 'Uniforme diario secundaria talla pequeña 2023', 'TU001'),
(35, 'MP042', 'M', 'Uniforme diario secundaria talla mediana 2023', 'TU001'),
(36, 'MP042', 'G', 'Uniforme diario secundaria talla grande 2023', 'TU001'),
(37, 'MP043', 'S', 'Uniforme diario preescolar talla pequeña 2024', 'TU001'),
(38, 'MP043', 'M', 'Uniforme diario preescolar talla mediana 2024', 'TU001'),
(39, 'MP043', 'G', 'Uniforme diario preescolar talla grande 2024', 'TU001'),
(40, 'MP044', 'S', 'Uniforme diario primaria talla pequeña 2024', 'TU001'),
(41, 'MP044', 'M', 'Uniforme diario primaria talla mediana 2024', 'TU001'),
(42, 'MP044', 'G', 'Uniforme diario primaria talla grande 2024', 'TU001'),
(43, 'MP045', 'S', 'Uniforme diario secundaria talla pequena 2024', 'TU001'),
(44, 'MP045', 'M', 'Uniforme diario secundaria talla mediana 2024', 'TU001'),
(45, 'MP045', 'G', 'Uniforme diario secundaria talla grande 2024', 'TU001');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`matricula`),
  ADD KEY `tutor` (`tutor`),
  ADD KEY `nivel_educativo` (`nivel_educativo`),
  ADD KEY `periodo_escolar` (`periodo_escolar`),
  ADD KEY `grado_y_grupo` (`grado_y_grupo`);

--
-- Indices de la tabla `eventos_especiales`
--
ALTER TABLE `eventos_especiales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`);

--
-- Indices de la tabla `folio_seq`
--
ALTER TABLE `folio_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ggcofigo_seq`
--
ALTER TABLE `ggcofigo_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `grado_y_grupo`
--
ALTER TABLE `grado_y_grupo`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `periodo_escolar` (`periodo_escolar`),
  ADD KEY `nivel_educativo` (`nivel_educativo`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`);

--
-- Indices de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`);

--
-- Indices de la tabla `matricula_seq`
--
ALTER TABLE `matricula_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mensualidad`
--
ALTER TABLE `mensualidad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`);

--
-- Indices de la tabla `motivo_de_pago`
--
ALTER TABLE `motivo_de_pago`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `periodo_escolar` (`periodo_escolar`),
  ADD KEY `Nivel_educativo` (`Nivel_educativo`);

--
-- Indices de la tabla `mpcodigo_seq`
--
ALTER TABLE `mpcodigo_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `necodigo_seq`
--
ALTER TABLE `necodigo_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `nivel_educativo`
--
ALTER TABLE `nivel_educativo`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `num_tel`
--
ALTER TABLE `num_tel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tutor` (`tutor`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `gradoAlumno` (`gradoAlumno`),
  ADD KEY `alumno` (`alumno`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`);

--
-- Indices de la tabla `papeleria`
--
ALTER TABLE `papeleria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`);

--
-- Indices de la tabla `periodo_escolar`
--
ALTER TABLE `periodo_escolar`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tipo_de_uniforme`
--
ALTER TABLE `tipo_de_uniforme`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tucodigo_seq`
--
ALTER TABLE `tucodigo_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tutor`
--
ALTER TABLE `tutor`
  ADD PRIMARY KEY (`folio`);

--
-- Indices de la tabla `uniformes`
--
ALTER TABLE `uniformes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `motivo_de_pago` (`motivo_de_pago`),
  ADD KEY `tipo_de_uniforme` (`tipo_de_uniforme`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `eventos_especiales`
--
ALTER TABLE `eventos_especiales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `folio_seq`
--
ALTER TABLE `folio_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de la tabla `ggcofigo_seq`
--
ALTER TABLE `ggcofigo_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `matricula_seq`
--
ALTER TABLE `matricula_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT de la tabla `mensualidad`
--
ALTER TABLE `mensualidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=136;

--
-- AUTO_INCREMENT de la tabla `mpcodigo_seq`
--
ALTER TABLE `mpcodigo_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;

--
-- AUTO_INCREMENT de la tabla `necodigo_seq`
--
ALTER TABLE `necodigo_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `num_tel`
--
ALTER TABLE `num_tel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=202;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `papeleria`
--
ALTER TABLE `papeleria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `tucodigo_seq`
--
ALTER TABLE `tucodigo_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `uniformes`
--
ALTER TABLE `uniformes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`tutor`) REFERENCES `tutor` (`folio`),
  ADD CONSTRAINT `alumno_ibfk_2` FOREIGN KEY (`nivel_educativo`) REFERENCES `nivel_educativo` (`codigo`),
  ADD CONSTRAINT `alumno_ibfk_3` FOREIGN KEY (`periodo_escolar`) REFERENCES `periodo_escolar` (`codigo`),
  ADD CONSTRAINT `alumno_ibfk_4` FOREIGN KEY (`grado_y_grupo`) REFERENCES `grado_y_grupo` (`codigo`);

--
-- Filtros para la tabla `eventos_especiales`
--
ALTER TABLE `eventos_especiales`
  ADD CONSTRAINT `eventos_especiales_ibfk_1` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`);

--
-- Filtros para la tabla `grado_y_grupo`
--
ALTER TABLE `grado_y_grupo`
  ADD CONSTRAINT `grado_y_grupo_ibfk_1` FOREIGN KEY (`periodo_escolar`) REFERENCES `periodo_escolar` (`codigo`),
  ADD CONSTRAINT `grado_y_grupo_ibfk_2` FOREIGN KEY (`nivel_educativo`) REFERENCES `nivel_educativo` (`codigo`);

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`);

--
-- Filtros para la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD CONSTRAINT `mantenimiento_ibfk_1` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`);

--
-- Filtros para la tabla `mensualidad`
--
ALTER TABLE `mensualidad`
  ADD CONSTRAINT `mensualidad_ibfk_1` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`);

--
-- Filtros para la tabla `motivo_de_pago`
--
ALTER TABLE `motivo_de_pago`
  ADD CONSTRAINT `motivo_de_pago_ibfk_1` FOREIGN KEY (`periodo_escolar`) REFERENCES `periodo_escolar` (`codigo`),
  ADD CONSTRAINT `motivo_de_pago_ibfk_2` FOREIGN KEY (`Nivel_educativo`) REFERENCES `nivel_educativo` (`codigo`);

--
-- Filtros para la tabla `num_tel`
--
ALTER TABLE `num_tel`
  ADD CONSTRAINT `num_tel_ibfk_1` FOREIGN KEY (`tutor`) REFERENCES `tutor` (`folio`);

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`gradoAlumno`) REFERENCES `grado_y_grupo` (`codigo`),
  ADD CONSTRAINT `pago_ibfk_2` FOREIGN KEY (`alumno`) REFERENCES `alumno` (`matricula`),
  ADD CONSTRAINT `pago_ibfk_3` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`);

--
-- Filtros para la tabla `papeleria`
--
ALTER TABLE `papeleria`
  ADD CONSTRAINT `papeleria_ibfk_1` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`);

--
-- Filtros para la tabla `uniformes`
--
ALTER TABLE `uniformes`
  ADD CONSTRAINT `uniformes_ibfk_1` FOREIGN KEY (`motivo_de_pago`) REFERENCES `motivo_de_pago` (`codigo`),
  ADD CONSTRAINT `uniformes_ibfk_2` FOREIGN KEY (`tipo_de_uniforme`) REFERENCES `tipo_de_uniforme` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

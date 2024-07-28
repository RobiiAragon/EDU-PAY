-- Active: 1721413128424@@127.0.0.1@3306
CREATE DATABASE IF NOT EXISTS Sistema_de_cobros_escolares;
use Sistema_de_cobros_escolares;
-- Crear la tabla para manejar la secuencia
CREATE TABLE matricula_seq (
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id)
);

-- Insertar un valor inicial en la secuencia
INSERT INTO matricula_seq (id) VALUES (0);

-- Tabla NIVEL_EDUCATIVO
CREATE TABLE NIVEL_EDUCATIVO (
    codigo VARCHAR(5) PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    costo_base DECIMAL(10,2) NOT NULL
);

-- Tabla PERIODO_ESCOLAR
CREATE TABLE PERIODO_ESCOLAR (
    codigo VARCHAR(10) PRIMARY KEY,
    fecha_inicio DATE NOT NULL,
    fecha_final DATE NOT NULL
);

-- Tabla GRADO_Y_GRUPO
CREATE TABLE GRADO_Y_GRUPO (
    codigo VARCHAR(5) PRIMARY KEY,
    grado VARCHAR(5),
    grupo VARCHAR(5),
    periodo_escolar VARCHAR(10),
    FOREIGN KEY (periodo_escolar) REFERENCES PERIODO_ESCOLAR(codigo)
);

-- Tabla TUTOR
CREATE TABLE TUTOR (
    folio VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(60) NOT NULL,
    primerApell VARCHAR(30) NOT NULL,
    segundoApell VARCHAR(30)
);

-- Tabla ALUMNO
CREATE TABLE ALUMNO (
    matricula VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    primerApell VARCHAR(30) NOT NULL,
    segundoApell VARCHAR(30),
    direccion VARCHAR(100) NOT NULL,
    nivel_educativo VARCHAR(5),
    periodo_escolar VARCHAR(10),
    grado_y_grupo VARCHAR(5),
    tutor VARCHAR(10),
    FOREIGN KEY (TUTOR) REFERENCES TUTOR(folio),
    FOREIGN KEY (nivel_educativo) REFERENCES NIVEL_EDUCATIVO(codigo),
    FOREIGN KEY (periodo_escolar) REFERENCES PERIODO_ESCOLAR(codigo),
    FOREIGN KEY (grado_y_grupo) REFERENCES GRADO_Y_GRUPO(codigo)
);

-- Crear el trigger para autoincrementar la matricula
DELIMITER //

CREATE TRIGGER autoinc_matricula
BEFORE INSERT ON ALUMNO
FOR EACH ROW
BEGIN
    DECLARE next_id INT;
    DECLARE formatted_id VARCHAR(7);

    -- Obtener el siguiente valor de la secuencia
    INSERT INTO matricula_seq () VALUES ();
    SET next_id = LAST_INSERT_ID();

    -- Formatear el ID con ceros a la izquierda
    SET formatted_id = LPAD(next_id, 7, '0');

    -- Asignar el ID formateado con el prefijo 'MTC' a la nueva fila
    SET NEW.matricula = CONCAT('MTC', formatted_id);
END;
//
DELIMITER ;



-- Tabla MOTIVO_DE_PAGO
CREATE TABLE MOTIVO_DE_PAGO (
    codigo VARCHAR(5) PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);

-- Tabla PAGO
CREATE TABLE PAGO (
    numero INT PRIMARY KEY,
    fecha DATE NOT NULL,
    subtotal DECIMAL(10,2) NOT NULL,
    iva DECIMAL(10,2) NOT NULL,
    monto_total DECIMAL(10,2) NOT NULL,
    estado VARCHAR(20),
    alumno VARCHAR(10),
    motivo_de_pago VARCHAR(5),
    FOREIGN KEY (alumno) REFERENCES ALUMNO(matricula),
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo)
);

-- Tabla EVENTOS_ESPECIALES
CREATE TABLE EVENTOS_ESPECIALES (
    motivo_de_pago VARCHAR(5) PRIMARY KEY,
    fecha DATE NOT NULL,
    lugar VARCHAR(50) NOT NULL,
    horario VARCHAR(20) NOT NULL,
    descripcion VARCHAR(80),
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo)
);

-- Tabla PAPELERIA
CREATE TABLE PAPELERIA (
    motivo_de_pago VARCHAR(5) PRIMARY KEY,
    nombre_pack VARCHAR(30) NOT NULL,
    descripcion VARCHAR(80),
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo)
);

-- Tabla INSCRIPCION
CREATE TABLE INSCRIPCION (
    motivo_de_pago VARCHAR(5) PRIMARY KEY,
    proximo_pago DATE NOT NULL,
    fecha_pago DATE NOT NULL,
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo)
);

-- Tabla MENSUALIDAD
CREATE TABLE MENSUALIDAD (
    motivo_de_pago VARCHAR(5) PRIMARY KEY,
    mes_pagado VARCHAR(10) NOT NULL,
    proximo_pago DATE NOT NULL,
    fecha_pago DATE NOT NULL,
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo)
);

-- Tabla MANTENIMIENTO
CREATE TABLE MANTENIMIENTO (
    motivo_de_pago VARCHAR(5) PRIMARY KEY,
    fecha_pago DATE NOT NULL,
    proximo_pago DATE NOT NULL,
    concepto VARCHAR(50) NOT NULL,
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo)
);

-- Tabla TIPO_DE_UNIFORME
CREATE TABLE TIPO_DE_UNIFORME (
    codigo VARCHAR(5) PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL
);

-- Tabla UNIFORMES
CREATE TABLE UNIFORMES (
    motivo_de_pago VARCHAR(5) PRIMARY KEY,
    talla VARCHAR(10) NOT NULL,
    tipo_de_uniforme VARCHAR(5),
    descripcion VARCHAR(80),
    FOREIGN KEY (motivo_de_pago) REFERENCES MOTIVO_DE_PAGO(codigo),
    FOREIGN KEY (tipo_de_uniforme) REFERENCES TIPO_DE_UNIFORME(codigo)
);

-- Tabla NUM_TEL
CREATE TABLE NUM_TEL (
    tutor VARCHAR(10),
    numero VARCHAR(15),
    numTel VARCHAR(15),
    PRIMARY KEY (tutor, numero),
    FOREIGN KEY (tutor) REFERENCES TUTOR(folio)
);
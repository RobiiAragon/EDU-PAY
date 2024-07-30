-- Inserts para NIVEL_EDUCATIVO
INSERT INTO NIVEL_EDUCATIVO (codigo, nombre, costo_base) VALUES
('NE001', 'Preescolar', 4000.00),
('NE002', 'Primaria', 5000.00),
('NE003', 'Secundaria', 6000.00);

-- Inserts para PERIODO_ESCOLAR
INSERT INTO PERIODO_ESCOLAR (codigo, fecha_inicio, fecha_final) VALUES
('PE2023', '2023-08-01', '2024-07-31'),
('PE2024', '2024-08-01', '2025-07-31');

-- Inserts para GRADO_Y_GRUPO
INSERT INTO GRADO_Y_GRUPO (codigo, grado, grupo, periodo_escolar) VALUES
('GG001', '1', 'A', 'PE2023'),
('GG002', '2', 'A', 'PE2023'),
('GG003', '3', 'A', 'PE2023'),
('GG004', '1', 'A', 'PE2024'),
('GG005', '2', 'A', 'PE2024'),
('GG006', '3', 'A', 'PE2024');

-- Inserts para TUTOR
INSERT INTO TUTOR (folio, nombre, primerApell, segundoApell) VALUES
('TU001', 'Pedro', 'Pérez', 'Rodríguez'),
('TU002', 'Ana', 'López', 'Martínez'),
('TU003', 'Luis', 'Rodríguez', 'Gómez');

-- Inserts para ALUMNO
INSERT INTO ALUMNO (matricula, nombre, primerApell, segundoApell, direccion, tutor, nivel_educativo, periodo_escolar, grado_y_grupo) VALUES
('MTC0000001', 'Juan', 'Pérez', 'García', 'Calle 123, Tijuana', 'TU001', 'NE001', 'PE2023', 'GG001'),
('MTC0000002', 'María', 'López', 'Sánchez', 'Avenida 456, Tijuana', 'TU002', 'NE002', 'PE2023', 'GG004'),
('MTC0000003', 'Carlos', 'Rodríguez', 'Martínez', 'Plaza 789, Tijuana', 'TU003', 'NE003', 'PE2023', 'GG005');


-- Inserts para MOTIVO_DE_PAGO
INSERT INTO MOTIVO_DE_PAGO (codigo, nombre, precio) VALUES
('MP001', 'Inscripción Preescolar', 800.00),
('MP002', 'Inscripción Primaria', 1000.00),
('MP003', 'Inscripción Secundaria', 1200.00),
('MP004', 'Mensualidad Preescolar', 400.00),
('MP005', 'Mensualidad Primaria', 500.00),
('MP006', 'Mensualidad Secundaria', 600.00),
('MP007', 'Uniforme Preescolar', 250.00),
('MP008', 'Uniforme Primaria', 300.00),
('MP009', 'Uniforme Secundaria', 350.00),
('MP010', 'Papelería Preescolar', 150.00),
('MP011', 'Papelería Primaria', 200.00),
('MP012', 'Papelería Secundaria', 250.00),
('MP013', 'Evento Especial', 150.00),
('MP014', 'Mantenimiento', 100.00);

-- Inserts para PAGO
INSERT INTO PAGO (numero, fecha, subtotal, iva, monto_total, estado, alumno, motivo_de_pago) VALUES
(1, '2023-08-01', 800.00, 128.00, 928.00, 'Pagado', 'MTC0000002', 'MP001'),
(2, '2023-09-01', 400.00, 64.00, 464.00, 'Pagado', 'MTC0000002', 'MP004'),
(3, '2023-08-01', 1000.00, 160.00, 1160.00, 'Pagado', 'MTC0000003', 'MP002'),
(4, '2023-09-01', 500.00, 80.00, 580.00, 'Pagado', 'MTC0000003', 'MP005'),
(5, '2023-08-01', 1200.00, 192.00, 1392.00, 'Pagado', 'MTC0000001', 'MP003'),
(6, '2023-09-01', 600.00, 96.00, 696.00, 'Pagado', 'MTC0000001', 'MP006');

-- Inserts para EVENTOS_ESPECIALES
INSERT INTO EVENTOS_ESPECIALES (motivo_de_pago, fecha, lugar, horario, descripcion) VALUES
('MP013', '2023-12-15', 'Auditorio Escolar', '18:00-20:00', 'Festival Navideño');

-- Inserts para PAPELERIA
INSERT INTO PAPELERIA (motivo_de_pago, nombre_pack, descripcion) VALUES
('MP010', 'Pack Preescolar', 'Cuadernos, crayones, tijeras infantiles'),
('MP011', 'Pack Primaria', 'Cuadernos, lápices, colores'),
('MP012', 'Pack Secundaria', 'Cuadernos, bolígrafos, calculadora');

-- Inserts para INSCRIPCION
INSERT INTO INSCRIPCION (motivo_de_pago, proximo_pago, fecha_pago) VALUES
('MP001', '2024-08-01', '2023-08-01'),
('MP002', '2024-08-01', '2023-08-01'),
('MP003', '2024-08-01', '2023-08-01');

-- Inserts para MENSUALIDAD
INSERT INTO MENSUALIDAD (motivo_de_pago, mes_pagado, proximo_pago, fecha_pago) VALUES
('MP004', 'Septiembre', '2023-10-01', '2023-09-01'),
('MP005', 'Septiembre', '2023-10-01', '2023-09-01'),
('MP006', 'Septiembre', '2023-10-01', '2023-09-01');

-- Inserts para MANTENIMIENTO
INSERT INTO MANTENIMIENTO (motivo_de_pago, fecha_pago, proximo_pago, concepto) VALUES
('MP014', '2023-08-15', '2024-08-15', 'Mantenimiento anual');

-- Inserts para TIPO_DE_UNIFORME
INSERT INTO TIPO_DE_UNIFORME (codigo, nombre) VALUES
('TU001', 'Diario'),
('TU002', 'Deportivo');

-- Inserts para UNIFORMES
INSERT INTO UNIFORMES (motivo_de_pago, talla, tipo_de_uniforme, descripcion) VALUES
('MP007', 'S', 'TU001', 'Uniforme diario preescolar talla pequeña'),
('MP008', 'M', 'TU001', 'Uniforme diario primaria talla mediana'),
('MP009', 'L', 'TU001', 'Uniforme diario secundaria talla grande');

-- Inserts para NUM_TEL
INSERT INTO NUM_TEL (tutor, numTel) VALUES
('TU001', '555-1234'),
('TU002', '555-5678'),
('TU003', '555-9012');
use sistema_de_cobros_escolares;

SELECT * FROM pago where alumno = 'MTC0000001' and motivo_de_pago BETWEEN 'MP016' AND 'MP030';


SELECT * FROM `alumno`;

SELECT * FROM `tutor` where folio = 'TU109';

SELECT numero, fecha, subtotal, iva, monto_total, estado, alumno, motivo_de_pago
FROM `pago` where alumno = 'MTC0000070';

SELECT numero, fecha, subtotal, iva, monto_total, estado, alumno, motivo_de_pago
FROM `pago` where motivo_de_pago >= 'MP016' and motivo_de_pago <= 'MP030' and alumno = 'MTC0000001';

SELECT numero, fecha, subtotal, iva, monto_total, estado, alumno, motivo_de_pago
FROM `pago` where motivo_de_pago = 'MP046' and alumno = 'MTC0000070';

-- Active: 1721413128424@@127.0.0.1@3306@sistema_de_cobros_escolares
/*1. Datos de un alumno en un periodo escolar
a. Periodo escolar
b. Fecha de inicio
c. Fecha final
d. Matricula del alumno
e. Nombre del alumno
f. Grado
g. Nivel
h. Nombre de los tutores
i. Dirección
*/
SELECT 
    pe.codigo AS 'Periodo escolar',/*'*/
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio',                                                                          /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final',                                                                               /*'*/
    a.matricula AS 'Matrícula del alumno',                                                                                                  /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel',
    GROUP_CONCAT(CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) SEPARATOR ', ') AS 'Nombre de los tutores',          /*'*/
    a.direccion AS 'Dirección'
FROM ALUMNO a
INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo
INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
LEFT JOIN TUTOR t ON a.tutor = t.folio
WHERE pe.codigo = 'PE2022' AND a.matricula = 'MTC0000001';


/*2.Grupos en los que ha estado un alumno
a. Matricula del alumno
b. Nombre del alumno
c. Fecha de inicio del periodo escolar
d. Fecha final del periodo escolar
e. Grado
f. Nivel
*/
SELECT 
    a.matricula AS 'Matrícula del alumno',                                                                                                                   /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                                            /*'*/
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE',                                                                  /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE',                                                            /*'*/
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel'
FROM ALUMNO a
INNER JOIN PAGO p ON a.matricula = p.alumno
INNER JOIN GRADO_Y_GRUPO gg ON p.gradoAlumno = gg.codigo
INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON gg.nivel_educativo = ne.codigo
WHERE a.matricula = 'MTC0000002' AND motivo_de_pago = 'MP001';

/*3. Números de teléfono de un tutor
a. Nombre del tutor
b. Nombre del alumno
c. Número de teléfono
*/
SELECT 
    CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) AS 'Nombre del tutor',                                            /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/
    nt.numTel AS 'Número de teléfono'                                                                                                       /*'*/
FROM TUTOR t
INNER JOIN ALUMNO a ON t.folio = a.tutor
INNER JOIN NUM_TEL nt ON t.folio = nt.tutor
WHERE t.folio = 'TU001';

/*4. Inscripciones pagadas de un alumno
a. Matricula del alumno
b. Nombre del alumno
c. Fecha de inicio del periodo escolar
d. Fecha final del periodo escolar
e. Fecha de pago
f. Grado
g. Nivel
*/
SELECT 
    a.matricula AS 'Matrícula del alumno',                                                                                                  /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE',                                                           /*'*/
    DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago',                                                                                    /*'*/
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel'
FROM PAGO p
INNER JOIN ALUMNO a ON p.alumno = a.matricula
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
INNER JOIN PERIODO_ESCOLAR pe ON mp.periodo_escolar = pe.codigo
INNER JOIN GRADO_Y_GRUPO gg ON p.gradoAlumno = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
WHERE a.matricula = 'MTC0000001' AND mp.nombre LIKE 'Inscripción%';

/*5. Mensualidades pagadas de un alumno en un periodo escolar
a. Matricula del alumno
b. Nombre del alumno
c. Fecha de inicio del periodo escolar
d. Fecha final del periodo escolar
e. Grado
f. Nivel
g. Mes pagado
h. Fecha de pago
*/ 
SELECT 
    a.matricula AS 'Matrícula del alumno',                                                                                                  /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE',                                                           /*'*/
    DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago',                                                                                     /*'*/
    gg.grado AS 'Grado',    
    ne.nombre AS 'Nivel',
    m.mes_pagado AS 'Mes pagado'                                                                                                           /*'*/
FROM PAGO p
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
INNER JOIN ALUMNO a ON p.alumno = a.matricula
INNER JOIN PERIODO_ESCOLAR pe ON mp.periodo_escolar = pe.codigo
INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON mp.nivel_educativo = ne.codigo
INNER JOIN MENSUALIDAD m ON mp.codigo = m.motivo_de_pago
WHERE a.matricula = 'MTC0000001' AND pe.codigo = 'PE2020' AND p.motivo_de_pago = 'MP016' ORDER BY a.matricula limit 12;

/*6. Pagos realizados por un evento especial
a. Nombre del evento
b. Fecha del evento
c. Costo del evento
d. Fecha del pago
e. Matricula del alumno
f. Nombre del alumno
g. Grupo
h. Grado
i. Nivel

*/
SELECT 
    ee.descripcion AS 'Nombre del evento',                                                                                                  /*'*/
    DATE_FORMAT(ee.fecha, '%d/%m/%Y') AS 'Fecha del evento',                                                                                /*'*/
    mp.precio AS 'Costo del evento',                                                                                                        /*'*/
    DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha del pago',                                                                                   /*'*/
    a.matricula AS 'Matrícula del alumno',                                                                                                  /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/
    gg.grupo AS 'Grupo',
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel'
FROM PAGO p
INNER JOIN ALUMNO a ON p.alumno = a.matricula
INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
INNER JOIN EVENTOS_ESPECIALES ee ON mp.codigo = ee.motivo_de_pago
WHERE ee.motivo_de_pago = 'MP066';

/*7. Costo del mantenimiento por periodo escolar
a. Fecha de inicio del periodo escolar
b. Fecha final del periodo escolar
c. Concepto del mantenimiento
d. Costo 
*/
SELECT 
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio del periodo escolar',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final del periodo escolar',                                                           /*'*/
    m.concepto AS 'Concepto del mantenimiento',                                                                                             /*'*/
    mp.precio AS 'Costo'
FROM MANTENIMIENTO m
INNER JOIN MOTIVO_DE_PAGO mp ON m.motivo_de_pago = mp.codigo
INNER JOIN PERIODO_ESCOLAR pe ON m.fecha_pago BETWEEN pe.fecha_inicio AND pe.fecha_final
WHERE pe.codigo = 'PE2022';
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
LEFT JOIN TUTOR t ON a.matricula = t.alumno
WHERE pe.codigo = :periodo_escolar AND a.matricula = :matricula
GROUP BY a.matricula;

/*2.Grupos en los que ha estado un alumno
a. Matricula del alumno
b. Nombre del alumno
c. Fecha de inicio del periodo escolar
d. Fecha final del periodo escolar
e. Grado
f. Nivel
*/
SELECT 
    a.matricula AS 'Matrícula del alumno',                                                                                                  /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/                        
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE',                                                    /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE',                                                           /*'*/
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel'
FROM ALUMNO a
INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo
INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
WHERE a.matricula = :matricula;

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
INNER JOIN ALUMNO a ON t.alumno = a.matricula
INNER JOIN NUM_TEL nt ON t.folio = nt.tutor
WHERE t.folio = :folio_tutor;

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
INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo
INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
WHERE a.matricula = :matricula AND mp.nombre LIKE 'Inscripción%';

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
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio del periodo escolar',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final del periodo escolar',                                                           /*'*/
    gg.grado AS 'Grado',    
    ne.nombre AS 'Nivel',
    m.mes_pagado AS 'Mes pagado',                                                                                                           /*'*/
    DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago'                                                                                     /*'*/
FROM PAGO p
INNER JOIN ALUMNO a ON p.alumno = a.matricula
INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo
INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
INNER JOIN MENSUALIDAD m ON mp.codigo = m.motivo_de_pago
WHERE a.matricula = :matricula AND pe.codigo = :periodo_escolar AND mp.nombre LIKE 'Mensualidad%';

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
WHERE ee.motivo_de_pago = :motivo_de_pago;

/*7. Costos del mantenimiento por periodo escolar
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
WHERE pe.codigo = :periodo_escolar;

/*8. Lista de precios de los paquetes de útiles escolares (papelería) para un
periodo y nivel escolar.
a. Fecha de inicio del periodo escolar
b. Fecha final del periodo escolar
c. Nivel escolar
d. Grado
e. Descripción del paquete de útiles
f. Costo

*/
SELECT 
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio del periodo escolar',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final del periodo escolar',                                                           /*'*/
    ne.nombre AS 'Nivel escolar',                                                                                                           /*'*/
    gg.grado AS 'Grado',
    p.descripcion AS 'Descripción del paquete de útiles',                                                                                   /*'*/
    mp.precio AS 'Costo'
FROM PAPELERIA p
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON mp.nombre LIKE CONCAT('%', ne.nombre, '%')
INNER JOIN GRADO_Y_GRUPO gg ON gg.periodo_escolar = :periodo_escolar
INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo
WHERE pe.codigo = :periodo_escolar AND ne.codigo = :nivel_educativo;
/* 9. Lista de precios de los uniformes para un para un periodo y nivel escolar.
a. Fecha de inicio del periodo escolar
b. Fecha final del periodo escolar
c. Nivel escolar
d. Grado
e. Descripción del uniforme
f. Tipo de uniforme
g. Costo del uniforme
*/
SELECT 
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio del periodo escolar',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final del periodo escolar',                                                           /*'*/
    ne.nombre AS 'Nivel escolar',                                                                                                           /*'*/
    gg.grado AS 'Grado',
    u.descripcion AS 'Descripción del uniforme',                                                                                            /*'*/
    tu.nombre AS 'Tipo de uniforme',                                                                                                        /*'*/
    mp.precio AS 'Costo del uniforme'                                                                                                       /*'*/
FROM UNIFORMES u
INNER JOIN MOTIVO_DE_PAGO mp ON u.motivo_de_pago = mp.codigo
INNER JOIN TIPO_DE_UNIFORME tu ON u.tipo_de_uniforme = tu.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON mp.nombre LIKE CONCAT('%', ne.nombre, '%')
INNER JOIN GRADO_Y_GRUPO gg ON gg.periodo_escolar = :periodo_escolar
INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo
WHERE pe.codigo = :periodo_escolar AND ne.codigo = :nivel_educativo;


/* 10. Total de pagos realizados para un nivel educativo en un periodo escolar
a. Fecha de inicio del periodo escolar
b. Fecha final del periodo escolar
c. Nivel escolar
d. Total de pagos
*/
SELECT 
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio del periodo escolar',                                                      /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final del periodo escolar',                                                           /*'*/
    ne.nombre AS 'Nivel escolar',                                                                                                           /*'*/
    SUM(p.monto_total) AS 'Total de pagos'                                                                                                  /*'*/
FROM PAGO p
INNER JOIN ALUMNO a ON p.alumno = a.matricula
INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo
INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo
WHERE pe.codigo = :periodo_escolar AND ne.codigo = :nivel_educativo
GROUP BY pe.codigo, ne.codigo;
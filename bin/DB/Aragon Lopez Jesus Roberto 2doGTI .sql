use sistema_de_cobros_escolares;

-- consulta de alumno
SELECT * FROM `alumno`;

-- consulta registro tutor
SELECT a.matricula as matricula,
CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS Nombre_del_alumno,
CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) AS Nombre_del_tutor,
nt.numTel AS Numero_de_telefono
FROM `alumno` a
INNER JOIN `tutor` t ON a.tutor = t.folio
INNER JOIN `num_tel` nt ON t.folio = nt.`tutor`
WHERE a.matricula = 'MTC0000070';



-- consulta pago de `inscripcion` de un alumno
SELECT numero, fecha, subtotal, iva, monto_total, estado, alumno,
mp.nombre AS motivo_de_pago
FROM `pago` p
INNER JOIN `motivo_de_pago` mp ON p.motivo_de_pago = mp.codigo
WHERE alumno = 'MTC0000070';



--consulta mensualidades
SELECT numero, fecha, subtotal, iva, monto_total, estado, alumno, mp.nombre AS motivo_de_pago
FROM `pago` p
INNER JOIN `motivo_de_pago` mp ON p.motivo_de_pago = mp.codigo
where motivo_de_pago = 'MP030' and alumno = 'MTC0000070';


--consulta pago papeleria
SELECT numero, fecha, subtotal, iva, monto_total, estado,
CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS Nombre_del_alumno, 
mp.nombre AS motivo_de_pago
FROM `pago` p
INNER JOIN `motivo_de_pago` mp ON p.motivo_de_pago = mp.codigo
INNER JOIN `alumno` a ON p.alumno = a.matricula
where motivo_de_pago = 'MP073' and alumno = 'MTC0000070';

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
    pe.codigo AS 'Periodo escolar',                                                 /*'*/
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio',                                                                          /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final',                                                                               /*'*/
    a.matricula AS 'Matrícula del alumno',                                                                                                  /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno',                                           /*'*/
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel',
    GROUP_CONCAT(CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, ''))) AS 'Nombre de los tutores',          /*'*/
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
WHERE a.matricula = 'MTC0000003' AND motivo_de_pago = 'MP001';


/*3. Inscripciones pagadas de un alumno
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



/*4. Mensualidades pagadas de un alumno en un periodo escolar
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
WHERE a.matricula = 'MTC0000070' AND pe.codigo = 'PE2024' AND p.motivo_de_pago = 'MP030' ORDER BY a.matricula limit 12;



/*5. Alumnos de un grupo que pagaron inscripcion para un periodo escolar
a. fecha de inicio de periodo escolar
b. fecha final de periodo escolar
c. grado
d. nivel
e. matricula del alumno
f. nombre del alumno
*/
SELECT 
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio',                                                                                   /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final',                                                                                         /*'*/
    gg.grado AS 'Grado',
    ne.nombre AS 'Nivel',
    a.matricula AS 'Matrícula del alumno',                                                                                                          /*'*/
    CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno'                                                      /*'*/
FROM ALUMNO a
INNER JOIN PAGO p ON a.matricula = p.alumno
INNER JOIN GRADO_Y_GRUPO gg ON p.gradoAlumno = gg.codigo
INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo
INNER JOIN NIVEL_EDUCATIVO ne ON gg.nivel_educativo = ne.codigo
INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo
WHERE mp.nombre LIKE 'Inscripción%' AND gg.grado = '1' AND pe.codigo = 'PE2020';


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

/*7. lista de precios de las inscripciones para un periodo escolar por nivel educativo
a. fecha de inicio de periodo escolar
b. fecha final de periodo escolar
c. nivel educativo
d. precio de la inscripcion
*/
SELECT 
    DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio',                                                                                   /*'*/
    DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final',                                                                                         /*'*/
    ne.nombre AS 'Nivel educativo',                                                                                                                  /*'*/
    mp.precio AS 'Precio de la inscripción'                                                                                              /*'*/
FROM PERIODO_ESCOLAR pe
INNER JOIN MOTIVO_DE_PAGO mp ON pe.codigo = mp.periodo_escolar
INNER JOIN NIVEL_EDUCATIVO ne ON mp.nivel_educativo = ne.codigo
WHERE mp.nombre LIKE 'Inscripción%';
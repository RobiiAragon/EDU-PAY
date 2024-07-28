import java.util.Scanner;
import java.sql.*;
public class Addons {
    //-------------------------------------------------------- Banner
    public static void banner() {
        System.out.println("UNIVERSIDAD TECNOLOGICA DE TIJUANA");
        System.out.println("Programacion Orientada a Objetos");
        System.out.println("EDUPAY - SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR");
        System.out.println("2do G TI EVND");
        System.out.println("=============================================");
        System.out.println("Integrantes:\nJesus Roberto Aragon Lopez\nDiana Carolina Lopez Martinez\nIris Abigail Roque Vargas\nBrian Cruz Melendrez\nMaximiliano Vasquez Becerra");
        System.out.println("===============================");
        System.out.println("Fecha Actual: " + java.time.LocalDate.now());
        System.out.println("===========================");
    }
    //-------------------------------------------------------- Programa de Cobros
   public static void ProgramaCobros() {
    Scanner scanner = new Scanner(System.in);
    int PC;
    PC = scanner.nextInt();
            switch (PC) {
                case 1:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
    }
    //-------------------------------------------------------- Consultas Proyecto 7
    public static void ConsultasProyecto7() {
        Scanner scanner = new Scanner(System.in);
        int CP7;
        CP7 = scanner.nextInt();
        switch (CP7) {
            case 1:
            System.out.println("=============================================");
                System.out.println("Datos de un alumno en un periodo escolar");
                System.out.println("Ingrese el periodo escolar: ");
                String periodoEscolar = scanner.next();
                System.out.println("Ingrese la matrícula del alumno: ");
                String matricula = scanner.next();
                String query = "SELECT " +
                        "pe.codigo AS 'Periodo escolar', " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final', " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel', " +
                        "GROUP_CONCAT(CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) SEPARATOR ', ') AS 'Nombre de los tutores', " +
                        "a.direccion AS 'Dirección' " +
                        "FROM ALUMNO a " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                        "LEFT JOIN TUTOR t ON a.tutor = t.folio " +
                        "WHERE pe.codigo = ? AND a.matricula = ? " +
                        "GROUP BY a.matricula;";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                     PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, periodoEscolar);
                    pstmt.setString(2, matricula);
                    ResultSet rs = pstmt.executeQuery();
                    // Extraer datos del conjunto de resultados
                    while (rs.next()) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Periodo escolar: " + rs.getString("Periodo escolar"));
                        System.out.println("Fecha de inicio: " + rs.getString("Fecha de inicio"));
                        System.out.println("Fecha final: " + rs.getString("Fecha final"));
                        System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                        System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                        System.out.println("Grado: " + rs.getString("Grado"));
                        System.out.println("Nivel: " + rs.getString("Nivel"));
                        System.out.println("Nombre de los tutores: " + rs.getString("Nombre de los tutores"));
                        System.out.println("Dirección: " + rs.getString("Dirección"));
                        System.out.println("---------------------------------------------");
                        matricula = null;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("=============================================");
                System.out.println("Grupos en los que ha estado un alumno");
                System.out.println("Ingrese la matrícula del alumno: ");
                matricula = scanner.next();
                String query2 = "SELECT " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel' " +
                        "FROM ALUMNO a " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                        "WHERE a.matricula = ? ";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query2)) {
                        pstmt.setString(1, matricula);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Nivel: " + rs.getString("Nivel"));
                            System.out.println("---------------------------------------------");
                            matricula = null;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                break;
            case 3:
                System.out.println("=============================================");
                System.out.println("Números de teléfono de un tutor");
                System.out.println("Ingrese el folio del Tutor: ");
                String FOTutor = scanner.next();
                String query3 = "SELECT " +
                        "CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) AS 'Nombre del tutor', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "nt.numTel AS 'Número de teléfono' " +
                        "FROM TUTOR t " +
                        "INNER JOIN ALUMNO a ON t.folio = a.tutor " +
                        "INNER JOIN NUM_TEL nt ON t.folio = nt.tutor " +
                        "WHERE t.folio = ? ";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query3)) {
                        pstmt.setString(1, FOTutor);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Nombre del tutor: " + rs.getString("Nombre del tutor"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Número de teléfono: " + rs.getString("Número de teléfono"));
                            System.out.println("---------------------------------------------");
                            FOTutor = null;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                break;
                case 4:
                System.out.println("=============================================");
                System.out.println("Inscripciones pagadas de un alumno");
                System.out.println("Ingrese la matrícula del alumno: ");
                matricula = scanner.next();
                String query4 = "SELECT " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel' " +
                        "FROM PAGO p " +
                        "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                        "WHERE a.matricula = ? AND mp.nombre LIKE 'Inscripción%'";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                     PreparedStatement pstmt = conn.prepareStatement(query4)) {
                    pstmt.setString(1, matricula);
                    ResultSet rs = pstmt.executeQuery();
                    // Extraer datos del conjunto de resultados
                    while (rs.next()) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                        System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                        System.out.println("Fecha inicio PE: " + rs.getString("Fecha inicio PE"));
                        System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                        System.out.println("Fecha de pago: " + rs.getString("Fecha de pago"));
                        System.out.println("Grado: " + rs.getString("Grado"));
                        System.out.println("Nivel: " + rs.getString("Nivel"));
                        System.out.println("---------------------------------------------");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
                case 5:
                    System.out.println("=============================================");
                    System.out.println("Mensualidades pagadas de un alumno en un periodo escolar");
                    System.out.println("Ingrese la matrícula del alumno: ");
                    matricula = scanner.next();
                    System.out.println("Ingrese el periodo escolar: ");
                    periodoEscolar = scanner.next();
                    String query5 = "SELECT " +
                            "a.matricula AS 'Matrícula del alumno', " +
                            "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                            "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE', " +
                            "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                            "DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago', " +
                            "gg.grado AS 'Grado', " +
                            "ne.nombre AS 'Nivel', " +
                            "m.mes_pagado AS 'Mes pagado' " +
                            "FROM PAGO p " +
                            "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                            "INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo " +
                            "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                            "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                            "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                            "INNER JOIN MENSUALIDAD m ON mp.codigo = m.motivo_de_pago " +
                            "WHERE a.matricula = ? AND pe.codigo = ? AND mp.nombre LIKE 'Mensualidad%'";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query5)) {
                        pstmt.setString(1, matricula);
                        pstmt.setString(2, periodoEscolar);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Fecha inicio PE: " + rs.getString("Fecha inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Nivel: " + rs.getString("Nivel"));
                            System.out.println("Mes pagado: " + rs.getString("Mes pagado"));
                            System.out.println("Fecha de pago: " + rs.getString("Fecha de pago"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                break;
            case 6:
                System.out.println("=============================================");
                System.out.println("Pagos realizados por un evento especial");
                String query6 = "SELECT " +
                        "ee.descripcion AS 'Evento especial', " +
                        "DATE_FORMAT(ee.fecha, '%d/%m/%Y') AS 'Fecha del evento', " +
                        "mp.precio as 'Costo del evento', " +
                        "DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha del pago', " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "gg.grupo AS 'Grupo', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel' " +
                        "FROM PAGO p " +
                        "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                        "INNER JOIN EVENTOS_ESPECIALES ee ON mp.codigo = ee.motivo_de_pago " +
                        "WHERE ee.motivo_de_pago = 'MP013'";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query6)) {
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Evento especial: " + rs.getString("Evento especial"));
                            System.out.println("Fecha del evento: " + rs.getString("Fecha del evento"));
                            System.out.println("Costo del evento: " + rs.getString("Costo del evento"));
                            System.out.println("Fecha del pago: " + rs.getString("Fecha del pago"));
                            System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Grupo: " + rs.getString("Grupo"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Nivel: " + rs.getString("Nivel"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                break;
            case 7:
                System.out.println("=============================================");
                System.out.println("Costos del mantenimiento por periodo escolar");
                System.out.println("Ingrese el periodo escolar: ");
                periodoEscolar = scanner.next();
                String query7 = "SELECT " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "m.concepto AS 'Concepto del mantenimiento', " +
                        "mp.precio AS 'Costo' " +
                        "FROM MANTENIMIENTO m " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON m.motivo_de_pago = mp.codigo " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON m.fecha_pago BETWEEN pe.fecha_inicio AND pe.fecha_final " +
                        "WHERE pe.codigo = ?";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query7)) {
                        pstmt.setString(1, periodoEscolar);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Concepto del mantenimiento: " + rs.getString("Concepto del mantenimiento"));
                            System.out.println("Costo: " + rs.getString("Costo"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                break;
                case 8:
                System.out.println("=============================================");
                System.out.println("Lista de precios de los paquetes de útiles escolares (papelería) para un periodo y nivel escolar.");
                System.out.println("Ingrese el periodo escolar: ");
                periodoEscolar = scanner.next();
                System.out.println("Ingrese el nivel educativo: ");
                String nivelEducativo = scanner.next();
                String query8 = "SELECT " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "ne.nombre AS 'Nivel escolar', " +
                        "gg.grado AS 'Grado', " +
                        "p.descripcion AS 'Descripción del paquete de utiles', " +
                        "mp.precio AS 'Costo' " +
                        "FROM PAPELERIA p " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON mp.nombre LIKE CONCAT('%', ne.nombre, '%') " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON gg.periodo_escolar = ? " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo " +
                        "WHERE pe.codigo = ? AND ne.codigo = ?";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query8)) {
                        pstmt.setString(1, periodoEscolar);
                        pstmt.setString(2, periodoEscolar);
                        pstmt.setString(3, nivelEducativo);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Nivel escolar: " + rs.getString("Nivel escolar"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Descripción del paquete de utiles: " + rs.getString("Descripción del paquete de utiles"));
                            System.out.println("Costo: " + rs.getString("Costo"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }      
                break;
            case 9:
                    System.out.println("=============================================");
                    System.out.println("Lista de precios de los uniformes para un para un periodo y nivel escolar.");
                    System.out.println("Ingrese el periodo escolar: ");
                    periodoEscolar = scanner.next();
                    System.out.println("Ingrese el nivel educativo: ");
                    nivelEducativo = scanner.next();
                    String query9 = "SELECT " +
                            "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                            "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                            "ne.nombre AS 'Nivel escolar', " +
                            "gg.grado AS 'Grado', " +
                            "u.descripcion AS 'Descripción del uniforme', " +
                            "tu.nombre AS 'Tipo de uniforme', " +
                            "mp.precio AS 'Costo del uniforme' " +
                            "FROM UNIFORMES u " +
                            "INNER JOIN MOTIVO_DE_PAGO mp ON u.motivo_de_pago = mp.codigo " +
                            "INNER JOIN TIPO_DE_UNIFORME tu ON u.tipo_de_uniforme = tu.codigo " +
                            "INNER JOIN NIVEL_EDUCATIVO ne ON mp.nombre LIKE CONCAT('%', ne.nombre, '%') " +
                            "INNER JOIN GRADO_Y_GRUPO gg ON gg.periodo_escolar = ? " +
                            "INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo " +
                            "WHERE pe.codigo = ? AND ne.codigo = ?";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                            PreparedStatement pstmt = conn.prepareStatement(query9)) {
                            pstmt.setString(1, periodoEscolar);
                            pstmt.setString(2, periodoEscolar);
                            pstmt.setString(3, nivelEducativo);
                            ResultSet rs = pstmt.executeQuery();
                            // Extraer datos del conjunto de resultados
                            while (rs.next()) {
                                System.out.println("---------------------------------------------");
                                System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                                System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                                System.out.println("Nivel escolar: " + rs.getString("Nivel escolar"));
                                System.out.println("Grado: " + rs.getString("Grado"));
                                System.out.println("Descripción del uniforme: " + rs.getString("Descripción del uniforme"));
                                System.out.println("Tipo de uniforme: " + rs.getString("Tipo de uniforme"));
                                System.out.println("Costo del uniforme: " + rs.getString("Costo del uniforme"));
                                System.out.println("---------------------------------------------");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
            break;
            case 10:
                System.out.println("=============================================");
                System.out.println("Total de pagos realizados para un nivel educativo en un periodo escolar");
                System.out.println("Ingrese el periodo escolar: ");
                periodoEscolar = scanner.next();
                System.out.println("Ingrese el nivel educativo: ");
                nivelEducativo = scanner.next();
                String query10 = "SELECT " +
                    "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                    "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                    "ne.nombre AS 'Nivel escolar', " +
                    "SUM(p.monto_total) AS 'Total de pagos' " +
                    "FROM PAGO p " +
                    "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                    "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                    "INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo " +
                    "WHERE pe.codigo = ? AND ne.codigo = ?" +
                    "GROUP BY pe.codigo, ne.codigo";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                    PreparedStatement pstmt = conn.prepareStatement(query10)) {
                    pstmt.setString(1, periodoEscolar);
                    pstmt.setString(2, nivelEducativo);
                    ResultSet rs = pstmt.executeQuery();
                    // Extraer datos del conjunto de resultados
                    while (rs.next()) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                        System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                        System.out.println("Nivel escolar: " + rs.getString("Nivel escolar"));
                        System.out.println("Total de pagos: " + rs.getString("Total de pagos"));
                        System.out.println("---------------------------------------------");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case 11:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
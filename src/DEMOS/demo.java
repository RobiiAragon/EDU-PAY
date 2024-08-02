package DEMOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class demo {
        public static void Inscripciones() {
        
            Scanner scanner = new Scanner(System.in);
                
                            System.out.println("Estos son los niveles educativos disponibles");
                            String query3 = "SELECT * FROM NIVEL_EDUCATIVO";
                            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                                 PreparedStatement pstmt = conn.prepareStatement(query3)) {
                                ResultSet rs = pstmt.executeQuery();
                                while (rs.next()) {
                                    System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre"));
                                }
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Ingrese el nivel educativo del alumno: ");
                            String nivelEducativo = scanner.next();
                            System.out.println("Estos son los periodos escolares disponibles");
                            String query4 = "SELECT * FROM PERIODO_ESCOLAR";
                            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                                 PreparedStatement pstmt = conn.prepareStatement(query4)) {
                                ResultSet rs = pstmt.executeQuery();
                                while (rs.next()) {
                                    System.out.println(rs.getString("codigo") + ". " + rs.getString("fecha_inicio") + " - " + rs.getString("fecha_final"));
                                }
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Ingrese el periodo escolar del alumno: ");
                            String periodoEscolar = scanner.next();
                            scanner.nextLine();
                            System.out.println("Estos son los grados y grupos disponibles");
                            String query5 = "SELECT * FROM GRADO_Y_GRUPO WHERE periodo_escolar = ? AND nivel_educativo = ?";
                            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                                 PreparedStatement pstmt = conn.prepareStatement(query5)) {
                                    pstmt.setString(1, periodoEscolar);
                                    pstmt.setString(2, nivelEducativo);
                                ResultSet rs = pstmt.executeQuery();
                                while (rs.next()) {
                                    System.out.println(rs.getString("codigo") + ". " + rs.getString("grado") + rs.getString("grupo") + " - " + rs.getString("periodo_escolar"));
                                }
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Ingrese el grado y grupo del alumno: ");
                            String gradoGrupo = scanner.next();
                            scanner.nextLine();
                            
                    //mostrar motivos de pago
                    System.out.println("Estos son los motivos de pago disponibles");
                    String query8 = "SELECT * FROM MOTIVO_DE_PAGO WHERE Nivel_educativo = ? AND nombre LIKE ?";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query8)) {
                        pstmt.setString(1, nivelEducativo);
                        pstmt.setString(2, "%Inscripción%");
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre") + " - $" + rs.getString("precio"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese el motivo de pago de la inscripcion: ");
                    String motivo_de_pago = scanner.next();
                    scanner.nextLine();
                           
                            System.out.println("=============================================");
                        }
    }

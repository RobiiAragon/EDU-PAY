import java.util.Scanner;
import java.sql.*;

public class CRUD extends Conexion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuAlumno = 0;
        System.out.println("CRUD SISTEMA DE COBROS ESCOLARES");
        System.out.println("=============================================");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Volver al menú principal");
        System.out.println("=============================================");
        System.out.println("Seleccione una opción: ");
        menuAlumno = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch(menuAlumno){
            case 1:
                createAlumno(scanner);
                break;
            case 2:
                readAlumnos();
                break;
            case 3:
                updateAlumno(scanner);
                break;
            case 4:
                deleteAlumno(scanner);
                break;
            case 5:
                System.out.println("Volviendo al menu principal...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void createAlumno(Scanner scanner) {
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el primer apellido del alumno:");
        String primerApell = scanner.nextLine();
        System.out.println("Ingrese el segundo apellido del alumno:");
        String segundoApell = scanner.nextLine();
        System.out.println("Ingrese la dirección del alumno:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el código del nivel educativo:");
        String nivelEducativo = scanner.nextLine();
        System.out.println("Ingrese el código del periodo escolar:");
        String periodoEscolar = scanner.nextLine();
        System.out.println("Ingrese el código del grado y grupo:");
        String gradoYGrupo = scanner.nextLine();

        String sql = "INSERT INTO ALUMNO (nombre, primerApell, segundoApell, direccion, nivel_educativo, periodo_escolar, grado_y_grupo) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, primerApell);
            pstmt.setString(3, segundoApell);
            pstmt.setString(4, direccion);
            pstmt.setString(5, nivelEducativo);
            pstmt.setString(6, periodoEscolar);
            pstmt.setString(7, gradoYGrupo);
            pstmt.executeUpdate();
            System.out.println("Alumno creado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readAlumnos() {
        String sql = "SELECT * FROM ALUMNO";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.print("Matrícula: " + rs.getString("matricula"));
                System.out.print(", Nombre: " + rs.getString("nombre"));
                System.out.print(", Primer Apellido: " + rs.getString("primerApell"));
                System.out.print(", Segundo Apellido: " + rs.getString("segundoApell"));
                System.out.print(", Dirección: " + rs.getString("direccion"));
                System.out.print(", Nivel Educativo: " + rs.getString("nivel_educativo"));
                System.out.print(", Periodo Escolar: " + rs.getString("periodo_escolar"));
                System.out.println(", Grado y Grupo: " + rs.getString("grado_y_grupo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateAlumno(Scanner scanner) {
        System.out.println("Ingrese la matrícula del alumno a actualizar:");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del alumno:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo primer apellido del alumno:");
        String primerApell = scanner.nextLine();
        System.out.println("Ingrese el nuevo segundo apellido del alumno:");
        String segundoApell = scanner.nextLine();
        System.out.println("Ingrese la nueva dirección del alumno:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el nuevo código del nivel educativo:");
        String nivelEducativo = scanner.nextLine();
        System.out.println("Ingrese el nuevo código del periodo escolar:");
        String periodoEscolar = scanner.nextLine();
        System.out.println("Ingrese el nuevo código del grado y grupo:");
        String gradoYGrupo = scanner.nextLine();

        String sql = "UPDATE ALUMNO SET nombre = ?, primerApell = ?, segundoApell = ?, direccion = ?, nivel_educativo = ?, periodo_escolar = ?, grado_y_grupo = ? WHERE matricula = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, primerApell);
            pstmt.setString(3, segundoApell);
            pstmt.setString(4, direccion);
            pstmt.setString(5, nivelEducativo);
            pstmt.setString(6, periodoEscolar);
            pstmt.setString(7, gradoYGrupo);
            pstmt.setString(8, matricula);
            pstmt.executeUpdate();
            System.out.println("Alumno actualizado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteAlumno(Scanner scanner) {
        System.out.println("Ingrese la matrícula del alumno a eliminar:");
        String matricula = scanner.nextLine();

        String sql = "DELETE FROM ALUMNO WHERE matricula = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, matricula);
            pstmt.executeUpdate();
            System.out.println("Alumno eliminado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
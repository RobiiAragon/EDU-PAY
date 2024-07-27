import java.sql .*;

public class Conexion {
static final String DB_URL ="jdbc:mysql://localhost:3306/sistema_de_cobros_escolares";
static final String USER = "root";
static final String PASS = "";
static final String QUERY1 = "SELECT * FROM alumno";
public static void main(String[] args) {
    // Open a connection
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(QUERY1);) {
    // Extract data from result set
    while (rs.next()) {
    // Retrieve by column name
    System.out.print("" + rs.getString("matricula"));
    System.out.print(" " + rs.getString("nombre"));
    System.out.print(" " + rs.getString("primerApell"));
    System.out.print(" " + rs.getString("segundoApell"));
    System.out.print(" " + rs.getString("direccion"));
    System.out.print(" " + rs.getString("nivel_educativo"));
    System.out.print(" " + rs.getString("periodo_escolar"));
    System.out.println(" " + rs.getString("grado_y_grupo"));
    }
    
    } catch (SQLException e) {
    e.printStackTrace();
    }
}
}
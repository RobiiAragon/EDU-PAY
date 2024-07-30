package DEMOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class concatenarAlaVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estos son los motivos de pago disponibles");
                    String query8 = "SELECT * FROM MOTIVO_DE_PAGO";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                         PreparedStatement pstmt = conn.prepareStatement(query8)) {
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
    }
}
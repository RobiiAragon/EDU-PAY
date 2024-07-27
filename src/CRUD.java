import java.util.Scanner;
import java.sql.*;

public class CRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuAlumno = 0;
        System.out.println("CRUD SISTEMA DE COBROS ESCOLARES");
        System.out.println("=============================================");
        System.out.println("1. Alumnos");
        System.out.println("2. Administración");
        System.out.println("3. Volver al menú principal");
        System.out.println("=============================================");
        System.out.println("Seleccione una opción: ");
        menuAlumno = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch(menuAlumno){
            case 1:
                System.out.println("CRUD ALUMNOS - SISTEMA DE COBROS ESCOLARES");
                System.out.println("=============================================");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Volver al menú principal");
                System.out.println("=============================================");
                System.out.println("Seleccione una opción: ");
                break;
            case 2:
                System.out.println("CRUD ALUMNOS - SISTEMA DE COBROS ESCOLARES");
                System.out.println("=============================================");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Volver al menú principal");
                System.out.println("=============================================");
                System.out.println("Seleccione una opción: ");
                break;
            case 3:
                System.out.println("Volviendo al menu principal...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}
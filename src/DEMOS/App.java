package DEMOS;
import java.util.Scanner;
public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            int opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    ProgramaCobros();
                    break;
                case 3:
                    salirDelSistema();
                    return;
            }
        }
    }

    public static int mostrarMenuPrincipal() {
        while (true) {
            System.out.println("SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR");
            System.out.println("=============================================");
            System.out.println("1. CRUD");
            System.out.println("2. Programa de Cobros");
            System.out.println("3. Salir del sistema");
            System.out.println("==================");
            System.out.println("Seleccione una opción: ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                if (opcion >= 1 && opcion <= 3) {
                    return opcion;
                } else {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }


    public static void ProgramaCobros() {
        while (true) {
            System.out.println("Programa de Cobros");
            System.out.println("=============================================");
            System.out.println("1. Inscripciones");
            System.out.println("2. Consultar pagos");
            System.out.println("3. Volver al menú principal");
            System.out.println("=============================================");
            System.out.println("Seleccione una opción: ");

            try {
                int opcionCobros = Integer.parseInt(scanner.nextLine());
                switch (opcionCobros) {
                    case 1:
                    demo.Inscripciones();
                        break;
                        
                    case 2:
                    
                        
                        break;
                    case 3:
                        
                        return; // Volver al menú principal
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                
            }
        }
    }

    public static void salirDelSistema() {
        System.out.print("Saliendo");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();
    }
}
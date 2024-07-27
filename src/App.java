import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Addons.banner();
        System.out.println("SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR");
        System.out.println("=============================================");
        System.out.println("1. CRUD");
        System.out.println("2. Consultas Proyecto");
        System.out.println("3. Programa de Cobros");
        System.out.println("4. Salir");
        System.out.println("==================");
        System.out.println("Seleccione una opcion: ");
        opcion = scanner.nextInt();
        switch(opcion){
            case 1:
                CRUD.main(args);
                break;
            case 2:
                System.out.println("===================");
                System.out.println("Consultas Proyecto");
                System.out.println("=============================================");
                System.out.println("1. Datos de un alumno en un periodo escolar");
                System.out.println("2. Grupos en los que ha estado un alumno");
                System.out.println("3. Números de teléfono de un tutor");
                System.out.println("4. Inscripciones pagadas de un alumno");
                System.out.println("5. Mensualidades pagadas de un alumno en un periodo escolar");
                System.out.println("6. Pagos realizados por un evento especial");
                System.out.println("7. Costos del mantenimiento por periodo escolar");
                System.out.println("8. Lista de precios de los paquetes de útiles escolares (papelería) para un periodo y nivel escolar.");
                System.out.println("9. Lista de precios de los uniformes para un para un periodo y nivel escolar.");
                System.out.println("10. Total de pagos realizados para un nivel educativo en un periodo escolar");
                System.out.println("11. Salir");
                System.out.println("=============================================");
                System.out.println("Seleccione una opcion: ");
                Addons.ConsultasProyecto7();
                break;
            case 3:
                System.out.println("Programa de Cobros");
                System.out.println("=============================================");
                System.out.println("1. Inscripciones");
                System.out.println("2. Mantenimiento");
                System.out.println("3. Opcionales");
                System.out.println("4. Mensualidades");
                System.out.println("5. Eventos Especiales");
                System.out.println("6. Salir");
                System.out.println("=============================================");
                System.out.println("Seleccione una opcion: ");
                Addons.ProgramaCobros();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }scanner.close();
    }
    
}
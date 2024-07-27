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
                Addons.ConsultasProyecto7();
                break;
            case 3:
                
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
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        Addons.banner();
        Thread.sleep(200);
        System.out.println("SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR");
        System.out.println("=============================================");
        System.out.println("1. CRUD");
        System.out.println("2. Programa de Cobros");
        System.out.println("3. Salir del sistema");
        System.out.println("==================");
        System.out.println("Seleccione una opcion: ");
        opcion = scanner.nextInt();
        Thread.sleep(500); 
        switch(opcion){
            case 1:
                System.out.println("CRUD SISTEMA DE COBROS ESCOLARES");
                System.out.println("=============================================");
                System.out.println("1. CREATE");
                System.out.println("2. READ");
                System.out.println("3. UPDATE");
                System.out.println("4. DELETE");
                System.out.println("5. Volver al menú principal");
                System.out.println("=============================================");
                System.out.println("Seleccione una opción: ");
                CRUD.main(args);
                break;
            case 2:
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
            case 3:
            int i;
            System.out.print("Saliendo");
                for (i = 0; i < 3; i++) {
                    try {
                       Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        System.out.print(".");
                    }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }scanner.close();
    }
    
}
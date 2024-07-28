import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        Addons.banner();
        System.out.println("SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR");
        System.out.println("=============================================");
        System.out.println("1. CRUD");
        System.out.println("2. Programa de Cobros");
        System.out.println("3. Salir");
        System.out.println("==================");
        System.out.println("Seleccione una opcion: ");
        opcion = scanner.nextInt();
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
                for (i = 0; i < 3; i++) {// bucle para repetir 3 veces el . que colocamos para que se mire
                    try {
                       Thread.sleep(500); // 500 milisegundos = medio segundo
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
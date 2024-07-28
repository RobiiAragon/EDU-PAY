import java.util.Scanner;
import java.sql.*;

public class CRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuAlumno, CRUDAlumno, CRUDAdmin;
        menuAlumno = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        

        switch(menuAlumno){
            case 1:
                System.out.println("CREATE - CRUD");
                System.out.println("===============================");
                System.out.println("1. Añadir periodos Escolares");
                System.out.println("2. Añadir Grados y grupos");
                System.out.println("3. Añadir motivos de Pago");
                System.out.println("4. Añadir Uniformes");
                System.out.println("5. Añadir Tipos de Uniformes");
                System.out.println("6. Añadir Eventos Especiales");
                System.out.println("-------------------------------");
                System.out.println("7. Voler al menú principal");
                System.out.println("================================");
                System.out.println("Seleccione una opción: ");
                CRUDAlumno= scanner.nextInt();
                switch (CRUDAlumno) {
                    case 1:
                        Addons.AgregarPeriodoEscolar();
                        break;
                
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("READ - CRUD");
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
                System.out.println("-------------------------------");
                System.out.println("11. volver al menú principal");
                System.out.println("=============================================");
                System.out.println("Seleccione una opción: ");
                CRUDAdmin= scanner.nextInt();
                Addons.ConsultasProyecto7();
                break;
            case 3:
                System.out.println("UPDATE - CRUD");
                System.out.println("=============================================");
                System.out.println("1. Modificar Alumnos");
                System.out.println("2. Modificar tutores");
                System.out.println("3. Modificar Grados y grupos");
                System.out.println("4. Modificar costo base de un nivel educativo");
                System.out.println("5. Modificar el costo de motivos de Pago");
                System.out.println("6. Modificar packs de Papeleria");
                System.out.println("7. Modificar Uniformes");
                System.out.println("8. Modificar Tipos de Uniformes");
                System.out.println("9. Modificar Eventos Especiales");
                System.out.println("-------------------------------");
                System.out.println("10. volver al menú principal");
                System.out.println("=============================================");
                System.out.println("Seleccione una opción: ");
                CRUDAlumno= scanner.nextInt();
                break;
            case 4:
                System.out.println("DELETE - CRUD");
                System.out.println("=============================================");
                System.out.println("1. Eliminar Alumnos");
                System.out.println("2. Eliminar tutores");
                System.out.println("3. Eliminar Grados y grupos");
                System.out.println("4. Eliminar motivos de Pago");
                System.out.println("5. Eliminar packs de Papeleria");
                System.out.println("6. Eliminar Uniformes");
                System.out.println("7. Eliminar Tipos de Uniformes");
                System.out.println("8. Eliminar Eventos Especiales");
                System.out.println("-------------------------------");
                System.out.println("9. volver al menú principal");
                System.out.println("=============================================");
                System.out.println("Seleccione una opción: ");
                CRUDAdmin= scanner.nextInt();
                break;
            case 5:
                int i;
                System.out.print("Volviendo al menú principal");
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
                System.out.println("Opción no válida");
                break;
        }
    }

}
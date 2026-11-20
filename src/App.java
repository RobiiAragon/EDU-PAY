import java.io.Console;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        if (Addons.ADMIN_PASSWORD.equals("admin")) {
            System.out.println("AVISO: se usa la contraseña de administrador por defecto. Define EDUPAY_ADMIN_PASSWORD.");
        }
        while (true) {
            int opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    Addons.limpiarPantalla();
                    if (verificarAdmin()) {
                        Addons.limpiarPantalla();
                        Addons.Inscripciones();
                    } else {
                        Addons.limpiarPantalla();
                        System.out.println("Contraseña incorrecta. Por favor, intente de nuevo.");
                    }
                    break;
                case 2:
                    Addons.limpiarPantalla();
                    System.out.println("Alumno (A) o tutor (T)? ");
                    String tipo = scanner.nextLine().trim();
                    if (tipo.equalsIgnoreCase("A")) {
                        Addons.limpiarPantalla();
                        Addons.ModificarAlumnos();
                    } else if (tipo.equalsIgnoreCase("T")) {
                        Addons.limpiarPantalla();
                        Addons.ModificarTutores();
                    } else {
                        Addons.limpiarPantalla();
                        System.out.println("Entrada inválida. Por favor, intente de nuevo.");
                    }
                    
                    break;
                case 3:
                    Addons.limpiarPantalla();
                    if (verificarAdmin()) {
                        Addons.limpiarPantalla();
                        Addons.PortaldePagos();
                    } else {
                        Addons.limpiarPantalla();
                        System.out.println("Contraseña incorrecta. Por favor, intente de nuevo.");
                    }
                break;
                case 4:
                    Addons.limpiarPantalla();
                    System.out.println("Mostar información de un alumno");
                    System.out.println("1. Datos de un alumno en un periodo escolar");
                    System.out.println("2. Grados y grupos en los que ha estado un alumno");
                    System.out.println("3. Inscripciones pagadas por un alumno");
                    System.out.println("4. Mensualidades pagadas por un alumno");
                    System.out.println("5. Pagos de un alumno por evento especial");
                    System.out.println("----------------------");
                    System.out.println("Seleccione una opción: ");
                    int opcion4 = leerEntero();
                    switch (opcion4) {
                        case 1:
                            Addons.consulta1();
                            break;
                        case 2:
                            Addons.consulta2();
                            break;
                        case 3:
                            Addons.consulta4();
                            break;
                        case 4:
                            Addons.consulta5();
                            break;
                        case 5:
                            Addons.consulta6();
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Mostar información de un tutor");
                    Addons.consulta3();
                    break;
                case 6:
                    Addons.limpiarPantalla();
                    if (verificarAdmin()) {
                        Addons.limpiarPantalla();
                        System.out.println("Mostar registros del sistema");
                        System.out.println("1. Costos mantenimiento por periodo escolar");
                        System.out.println("2. Lista de precios Packs de Papelería por periodo escolar y nivel escolar");
                        System.out.println("3. Lista de precios Uniformes por periodo escolar y nivel escolar");
                        System.out.println("4. total de pagos realizados para un nivel educativo en un periodo escolar");
                        System.out.println("----------------------");
                        System.out.println("Seleccione una opción: ");
                        int opcion6 = leerEntero();
                        switch (opcion6) {
                            case 1:
                                Addons.consulta7();
                                break;
                            case 2:
                                Addons.consulta8();
                                break;
                            case 3:
                                Addons.consulta9();
                                break;
                            case 4:
                                Addons.consulta10();
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                break;
                        }
                    } else {
                        Addons.limpiarPantalla();
                        System.out.println("Contraseña incorrecta. Por favor, intente de nuevo.");
                    }
                    
                    break;
                case 7:
                Addons.limpiarPantalla();
                if (!verificarAdmin()) {
                    System.out.println("Contraseña incorrecta. Por favor, intente de nuevo.");
                    break;
                }
                System.out.println("1. Añadir Eventos Especiales");
                System.out.println("2. Añadir Uniformes");
                System.out.println("3. Modificar Un evento especial");
                System.out.println("4. Modificar Packs de Papelería");
                System.out.println("5. Modificar Uniformes");
                System.out.println("6. Eliminar Un evento especial");
                System.out.println("7. Eliminar Packs de Papelería");
                System.out.println("8. Eliminar Uniformes");
                System.out.println("----------------------");
                System.out.println("Seleccione una opción: ");
                int opcion7 = leerEntero();
                switch (opcion7) {
                    case 1:
                        Addons.limpiarPantalla();
                        Addons.AgregarEventosEspeciales();
                        break;
                    case 2:
                        Addons.limpiarPantalla();
                        Addons.AgregarUniformes();
                        break;
                    case 3:
                        Addons.limpiarPantalla();
                        Addons.ModificarEventosEspeciales();
                        break;
                    case 4:
                        Addons.limpiarPantalla();
                        Addons.ModificarPacksPapeleria();
                        break;
                    case 5:
                        Addons.limpiarPantalla();
                        Addons.ModificarUniformes();
                        break;
                    case 6:
                        Addons.limpiarPantalla();
                        Addons.EliminarEventosEspeciales();
                        break;
                    case 7:
                        Addons.limpiarPantalla();
                        Addons.EliminarPacksPapeleria();
                        break;
                    case 8:
                        Addons.limpiarPantalla();
                        Addons.EliminarUniformes();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
                break;
                case 8:
                Addons.limpiarPantalla();
                if (verificarAdmin()) {
                        Addons.limpiarPantalla();
                        Addons.EliminarAlumnos();
                    } else {
                        Addons.limpiarPantalla();
                        System.out.println("Contraseña incorrecta. Por favor, intente de nuevo.");
                    }
                    break;
                case 9:
                    Addons.registroTutor();
                    break;
                case 10:
                    salirDelSistema();
                    return;
            }
        }
    }

    public static int mostrarMenuPrincipal() {
        while (true) {
            System.out.println("SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR - EDUPAY");
            System.out.println("=============================================");
            System.out.println("1. Inscripciones y reinscripciones");
            System.out.println("2. Actualizar informacion de un alumno o tutor");
            System.out.println("3. Portal de pagos");
            System.out.println("4. Ver Información de un alumno");
            System.out.println("5. Ver Información de un tutor");
            System.out.println("6. Ver Registros del sistema");
            System.out.println("7. Hacer cambios en los registros del sistema");
            System.out.println("8. DAR DE BAJA A UN ALUMNO");
            System.out.println("9. Registrar a un Tutor");
            System.out.println("----------------------");
            System.out.println("10. Salir del sistema");
            System.out.println("==================");
            System.out.println("Seleccione una opción: ");
            if (!scanner.hasNextLine()) {
                return 10; // fin de la entrada (Ctrl+D / Ctrl+Z): salir
            }
            int opcion = leerEntero();
            if (opcion >= 1 && opcion <= 10) {
                return opcion;
            }
            Addons.limpiarPantalla();
            System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 10.");
        }
    }


    /**
     * Pide la contraseña de administrador. Si hay una consola real la lectura no se muestra en
     * pantalla, y la comparación es de tiempo constante.
     */
    static boolean verificarAdmin() {
        String ingresada;
        Console console = System.console();
        if (console != null) {
            char[] chars = console.readPassword("Ingrese contraseña de administrador: ");
            ingresada = chars == null ? "" : new String(chars);
            if (chars != null) java.util.Arrays.fill(chars, ' ');
        } else {
            System.out.println("Ingrese contraseña de administrador: ");
            ingresada = scanner.nextLine();
        }
        return Addons.passwordCorrecta(ingresada);
    }

    /** Lee un número del menú; devuelve -1 si la entrada no es un número (en vez de cerrar el programa). */
    static int leerEntero() {
        String linea = scanner.nextLine().trim();
        while (linea.isEmpty() && scanner.hasNextLine()) {
            linea = scanner.nextLine().trim();
        }
        try {
            return Integer.parseInt(linea);
        } catch (NumberFormatException e) {
            return -1;
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
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Addons.banner();
        while (true) {
            int opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    Addons.limpiarPantalla();
                    System.out.println("Ingrese contraseña de administrador: ");
                    String password = scanner.nextLine();
                    if (password.equals("admin")) {
                        Addons.limpiarPantalla();
                        mostrarMenuCRUD();
                    } else {
                        System.out.println("Contraseña incorrecta. Por favor, intente de nuevo.");
                        Addons.limpiarPantalla();
                    }
                    break;
                case 2:
                    Addons.limpiarPantalla();
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
                    Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
            }
        }
    }

    public static void mostrarMenuCRUD() {
        while (true) {
            System.out.println("CRUD SISTEMA DE COBROS ESCOLARES");
            System.out.println("=============================================");
            System.out.println("1. CREATE");
            System.out.println("2. READ");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. Volver al menú principal");
            System.out.println("=============================================");
            System.out.println("Seleccione una opción: ");

            try {
                int opcionCRUD = Integer.parseInt(scanner.nextLine());
                switch (opcionCRUD) {
                    case 1:
                    Addons.limpiarPantalla();
                        mostrarMenuCreate();
                        break;
                    case 2:
                    Addons.limpiarPantalla();
                        mostrarMenuRead();
                        break;
                    case 3:
                    Addons.limpiarPantalla();
                        mostrarMenuUpdate();
                        break;
                    case 4:
                    Addons.limpiarPantalla();
                        mostrarMenuDelete();
                        break;
                    case 5:
                        Addons.limpiarPantalla();
                        return; // Volver al menú principal
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
            }
        }
    }

    public static void mostrarMenuCreate() {
        while (true) {
            System.out.println("CREATE - CRUD");
            System.out.println("===============================");
            System.out.println("1. Portal de pagos (Registrar pagos)");
            System.out.println("2. Añadir periodos Escolares");
            System.out.println("3. Añadir Grados y grupos");
            System.out.println("4. Añadir motivos de Pago");
            System.out.println("5. Añadir Uniformes");
            System.out.println("6. Añadir Eventos Especiales");
            System.out.println("-------------------------------");
            System.out.println("7. Volver al menú CRUD");
            System.out.println("================================");
            System.out.println("Seleccione una opción: ");

            try {
                int opcionCreate = Integer.parseInt(scanner.nextLine());
                switch (opcionCreate) {
                    case 1:
                    Addons.limpiarPantalla();
                        Addons.PortaldePagos();
                        break;
                    case 2:
                    Addons.limpiarPantalla();
                        Addons.AgregarPeriodoEscolar();
                        break;
                    case 3:
                    Addons.limpiarPantalla();
                        Addons.AgregarGradosyGrupos();
                        break;
                    case 4:
                    Addons.limpiarPantalla();
                        Addons.AgregarMotivosdePago();
                        break;
                    case 5:
                    Addons.limpiarPantalla();
                        Addons.AgregarUniformes();
                        break;
                    case 6:
                    Addons.limpiarPantalla();
                        Addons.AgregarEventosEspeciales();
                        break;
                    case 7:
                        Addons.limpiarPantalla();
                        return; // Volver al menú CRUD
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
            }
        }
    }

    public static void mostrarMenuRead() {
        while (true) {
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
            System.out.println("9. Lista de precios de los uniformes para un periodo y nivel escolar.");
            System.out.println("10. Total de pagos realizados para un nivel educativo en un periodo escolar");
            System.out.println("11. Volver al menú CRUD");
            System.out.println("=============================================");
            System.out.println("Seleccione una opción: ");

            try {
                int opcionRead = Integer.parseInt(scanner.nextLine());
                if (opcionRead == 11) {
                    Addons.limpiarPantalla();
                    return; // Volver al menú CRUD
                } else if (opcionRead >= 1 && opcionRead <= 10) {
                    Addons.ConsultasProyecto7(opcionRead); // Pasar opcionRead como parámetro
                } else {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
            }
        }
    }

    public static void mostrarMenuUpdate() {
        while (true) {
            System.out.println("UPDATE - CRUD");
            System.out.println("=============================================");
            System.out.println("1. Modificar Alumnos");
            System.out.println("2. Modificar tutores");
            System.out.println("3. Modificar Grados y grupos");
            System.out.println("4. Modificar un Nivel Educativo");
            System.out.println("5. Modificar motivos de Pago");
            System.out.println("6. Modificar packs de Papelería");
            System.out.println("7. Modificar Uniformes");
            System.out.println("8. Modificar Tipos de Uniformes");
            System.out.println("9. Modificar Eventos Especiales");
            System.out.println("-------------------------------");
            System.out.println("10. Volver al menú CRUD");
            System.out.println("=============================================");
            System.out.println("Seleccione una opción: ");

            try {
                int opcionUpdate = Integer.parseInt(scanner.nextLine());
                switch (opcionUpdate) {
                    case 1:
                    Addons.limpiarPantalla();
                        Addons.ModificarAlumnos();
                        break;
                    case 2:
                    Addons.limpiarPantalla();
                        Addons.ModificarTutores();
                        break;
                    case 3:
                    Addons.limpiarPantalla();
                        Addons.ModificarGradosyGrupos();
                        break;
                    case 4:
                    Addons.limpiarPantalla();
                        Addons.ModificarNivelEducativo();
                        break;
                    case 5:
                    Addons.limpiarPantalla();
                        Addons.ModificarMotivosdePago();
                        break;
                    case 6:
                    Addons.limpiarPantalla();
                        Addons.ModificarPacksPapeleria();
                        break;
                    case 7:
                    Addons.limpiarPantalla();
                        Addons.ModificarUniformes();
                        break;
                    case 8:
                    Addons.limpiarPantalla();
                        Addons.ModificarTiposUniformes();
                        break;
                    case 9:
                    Addons.limpiarPantalla();
                        Addons.ModificarEventosEspeciales();
                        break;
                    case 10:
                        Addons.limpiarPantalla();
                        return; // Volver al menú CRUD
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
            }
        }
    }

    public static void mostrarMenuDelete() {
        while (true) {
            System.out.println("DELETE - CRUD");
            System.out.println("=============================================");
            System.out.println("1. Eliminar Alumnos");
            System.out.println("2. Eliminar tutores");
            System.out.println("3. Eliminar Grados y grupos");
            System.out.println("4. Eliminar motivos de Pago");
            System.out.println("5. Eliminar packs de Papelería");
            System.out.println("6. Eliminar Uniformes");
            System.out.println("7. Eliminar Tipos de Uniformes");
            System.out.println("8. Eliminar Eventos Especiales");
            System.out.println("-------------------------------");
            System.out.println("9. Volver al menú CRUD");
            System.out.println("=============================================");
            System.out.println("Seleccione una opción: ");

            try {
                int opcionDelete = Integer.parseInt(scanner.nextLine());
                switch (opcionDelete) {
                    case 1:
                    Addons.limpiarPantalla();
                        Addons.EliminarAlumnos();
                        break;
                    case 2:
                    Addons.limpiarPantalla();
                        Addons.EliminarTutores();
                        break;
                    case 3:
                    Addons.limpiarPantalla();
                        Addons.EliminarGradosyGrupos();
                        break;
                    case 4:
                    Addons.limpiarPantalla();
                        Addons.EliminarMotivosdePago();
                        break;
                    case 5:
                    Addons.limpiarPantalla();
                        Addons.EliminarPacksPapeleria();
                        break;
                    case 6:
                    Addons.limpiarPantalla();
                        Addons.EliminarUniformes();
                        break;
                    case 7:
                    Addons.limpiarPantalla();
                        Addons.EliminarTiposUniformes();
                        break;
                    case 8:
                    Addons.limpiarPantalla();
                        Addons.EliminarEventosEspeciales();
                        break;
                    case 9:
                        Addons.limpiarPantalla();
                        return; // Volver al menú CRUD
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
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
                    Addons.limpiarPantalla();
                        Addons.Inscripciones();
                        break;
                    case 2:
                    Addons.limpiarPantalla();
                        Addons.ConsultarPagos();
                        break;
                    case 3:
                        Addons.limpiarPantalla();
                        return; // Volver al menú principal
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        Addons.limpiarPantalla();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                Addons.limpiarPantalla();
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
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuAlumno, CRUDAlumno, CRUDAdmin;
        
        while (true) {
            System.out.println("Seleccione una opción del menú principal:");
            System.out.println("1. CREATE");
            System.out.println("2. READ");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. Salir del programa");
            menuAlumno = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch(menuAlumno) {
                case 1:
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
                        CRUDAlumno = scanner.nextInt();
                        switch (CRUDAlumno) {
                            case 1:
                                Addons.PortaldePagos();
                                break;
                            case 2:
                                Addons.AgregarPeriodoEscolar();
                                break;
                            case 3:
                                Addons.AgregarGradosyGrupos();
                                break;
                            case 4:
                                Addons.AgregarMotivosdePago();
                                break;
                            case 5:
                                Addons.AgregarUniformes();
                                break;
                            case 6:
                                Addons.AgregarEventosEspeciales();
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        if (CRUDAlumno == 7) break;
                    }
                    break;
                case 2:
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
                        System.out.println("-------------------------------");
                        System.out.println("11. Volver al menú CRUD");
                        System.out.println("=============================================");
                        System.out.println("Seleccione una opción: ");
                        CRUDAdmin = scanner.nextInt();
                        if (CRUDAdmin == 11) break;
                        Addons.ConsultasProyecto7();
                    }
                    break;
                case 3:
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
                        CRUDAlumno = scanner.nextInt();
                        switch(CRUDAlumno) {
                            case 1:
                                Addons.ModificarAlumnos();
                                break;
                            case 2:
                                Addons.ModificarTutores();
                                break;
                            case 3:
                                Addons.ModificarGradosyGrupos();
                                break;
                            case 4:
                                Addons.ModificarNivelEducativo();
                                break;
                            case 5:
                                Addons.ModificarMotivosdePago();
                                break;
                            case 6:
                                Addons.ModificarPacksPapeleria();
                                break;
                            case 7:
                                Addons.ModificarUniformes();
                                break;
                            case 8:
                                Addons.ModificarTiposUniformes();
                                break;
                            case 9:
                                Addons.ModificarEventosEspeciales();
                                break;
                            case 10:
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        if (CRUDAlumno == 10) break;
                    }
                    break;
                case 4:
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
                        CRUDAdmin = scanner.nextInt();
                        switch(CRUDAdmin) {
                            case 1:
                                Addons.EliminarAlumnos();
                                break;
                            case 2:
                                Addons.EliminarTutores();
                                break;
                            case 3:
                                Addons.EliminarGradosyGrupos();
                                break;
                            case 4:
                                Addons.EliminarMotivosdePago();
                                break;
                            case 5:
                                Addons.EliminarPacksPapeleria();
                                break;
                            case 6:
                                Addons.EliminarUniformes();
                                break;
                            case 7:
                                Addons.EliminarTiposUniformes();
                                break;
                            case 8:
                                Addons.EliminarEventosEspeciales();
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        if (CRUDAdmin == 9) break;
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
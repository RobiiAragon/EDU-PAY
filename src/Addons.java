import java.util.Scanner;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Addons {
    //-------------------------------------------------------- Limpiar pantalla
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        // Opcionalmente, puedes agregar esto para sistemas Unix-like
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    //-------------------------------------------------------- retrazo 200ms
    public static void retrazo() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //-------------------------------------------------------- Banner
    public static void banner() {
        System.out.println(
"                                                  -=+*##+                                          \n" +
"                                               +%%%%##**%%                                          \n" +
"                                              -@#***+++++@=                                         \n" +
"                                              -@#***+++++%#                                         \n" +
"                                               %%***+++++*@-                                        \n" +
"                                               +@**####%%%@+                                        \n" +
"                                                @%#**++++*%%                                        \n" +
"                                                #%+**##%@##@=----------                             \n" +
"                                                -@#*@#==@*-%@######%%%%%###*+-                      \n" +
"                                              -=*@*-#%==#%=*@++++++++++****##%%#=                   \n" +
"                                           -*#%#*#@=+@+=+@+=@#*#**+++++++++++**#%#-                 \n" +
"                                         +#%#++==+@+=@*==%#-#@#+*%%*++++++*******%#                 \n" +
"                                       +%%*+++++==%#-#@==*@=+@-   +%#++++++*****+#@-               \n" +
"                                      *%*++++++++=*@==@+==@+=@*    =@*++++++***+*%#                 \n" +
"                                     +@*+++++++++=+@*=%#==%%=*%     *%++++++++*#%*                  \n" +
"                                     %#+++++++++++=%%=*@==*@==@=    *%++++++*#%#=                   \n" +
"                                     %#+++++++++++=*@+=@*==@*=%#    %#++**#%#*-                     \n" +
"                                     =@#++++++++++++@#-#%==#%=*@%*=-#%####+-                       \n" +
"                                      =%%*+++++++++=#@=+@+=+@+=@#*#%#*=                            \n" +
"                                        +#%#+++++++++@+=@#==%#-#%==+*#%#+-                          \n" +
"                                          =*%#*++++++%#=*@==*@=+@+===++*#%#=                       \n" +
"                                             =*%%#*++*@==@+==@+=%#==++++++#%#-                      \n" +
"                                                =*#%#*@*=%#==%%=*@===+++++++#%=                     \n" +
"                                       --====-     -+#@%=*@==+@==@*===+++++++#%                     \n" +
"                                  =+*#%%#####%#-      =@+=@*==@*=%%====++++++*@-                   \n" +
"                               +#%%#***+++++++#%-      %#-#%==#%=+@+====+++++*@-                   \n" +
"                             -%%**+++++++++++++#%-     +@=+@+=+@+=@*=====++++%*                    \n" +
"                             -@#++++++++++++++++#%=     @+=%#==@%*%%=======*%#                     \n" +
"                              =%%*+++++++++++++++#%#=   #%*@%%%*++#@=====+#%+                      \n" +
"                                =#%#**+++++++++++++#%%##%@#------ #%===+#%*-                       \n" +
"                                  -+#%%#**++++++++++++**+#@+ -----@#*#%#+                          \n" +
"                                      -+*#%%##***+++++++++*@*-   =@%*=-                            \n" +
"                                           -=+*###%%%######%@#+**%@                                 \n" +
"                                                   -------- -%@@@@#                                 \n" +
"                                                              #@@@+                                 \n" +
"                                                               *@@-                                 \n" +
"                                                                +#                                  \n" +
"                                                                                                    \n" +
"                           -#*#####+       -##-            =#*####**=                               \n" +
"                           -%##++++=       =##-            +%%*+++###                               \n" +
"                           -%%+            =##-            +%%-   *##                               \n" +
"                           -%%+            =##-            +%%-   *##                               \n" +
"                           -%%+        =+++*##- -++   -++  +%%-   *##  -++++++=  ++=   -++          \n" +
"                           -%##****   #%##*###- +%%-  +#%  +%%-   *##  #%%**#%#= *##   ###          \n" +
"                           -%##****  =%%=  =##- +%%-  +##  +%#####%##  *#+   ##+ -##= -##=          \n" +
"                           -%%+      =%%=  =##- +%%-  +##  +%%*+++==-  =*****##+  *## *##           \n" +
"                           -%%+      =%%=  =##- +%%-  +##  +%%-        %%#***##+  -##=##=           \n" +
"                           -%%+      =%%-  =##- +%%   +##  +%%-        %%+   ##+   *#%##            \n" +
"                           -%#*====- -%%*==*##- +%%+==###  +%%-        %%*==+##+   -#*#=            \n" +
"                           -#######*  +#######- -########  =##-        *#######=    #*#             \n" +
"                                                                                   -##+             \n" +
"                                                                                   *##              \n" +
"                                                                                   ++=              \n" +
"                                                                                                    \n");
        System.out.println("UNIVERSIDAD TECNOLOGICA DE TIJUANA");
        System.out.println("Programacion Orientada a Objetos");
        System.out.println("EDUPAY - SISTEMA DE COBROS DE UNA ESCUELA PARTICULAR");
        System.out.println("2do G TI EVND");
        System.out.println("=============================================");
        System.out.println("Integrantes:\nJesus Roberto Aragon Lopez\nDiana Carolina Lopez Martinez\nIris Abigail Roque Vargas\nBrian Cruz Melendrez\nMaximiliano Vasquez Becerra");
        System.out.println("===============================");
        System.out.println("Fecha Actual: " + java.time.LocalDate.now());
        System.out.println("===========================");
    }
    //-------------------------------------------------------- Portal de Pagos
    public static void PortaldePagos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Portal de Pagos");
        System.out.println("Ingrese la matricula del alumno: ");
        String matricula = scanner.nextLine();
        
        // Obtener la información del alumno
        String queryAlumno = "SELECT nivel_educativo FROM ALUMNO WHERE matricula = ?";
        String nivelEducativo = null;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryAlumno)) {
            pstmt.setString(1, matricula);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                nivelEducativo = rs.getString("nivel_educativo");
            } else {
                retrazo();
                System.out.println("Alumno no encontrado.");
                retrazo();
                limpiarPantalla();
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Mostrar los motivos de pago disponibles
        System.out.println("Estos son los motivos de pago disponibles");
        String queryMotivosPago = "SELECT * FROM MOTIVO_DE_PAGO";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryMotivosPago)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre") + " - $" + rs.getString("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
            }
        System.out.println("Ingrese el codigo del motivo de pago: ");
        String motivoPago = scanner.nextLine();
        // Obtener el precio del motivo de pago
        String queryPrecio = "SELECT precio FROM MOTIVO_DE_PAGO WHERE codigo = ?";
        double precio = 0;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryPrecio)) {
            pstmt.setString(1, motivoPago);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                precio = rs.getDouble("precio");
            } else {
                retrazo();
                System.out.println("Motivo de pago no encontrado.");
                retrazo();
                limpiarPantalla();
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        // Obtener la fecha actual
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaActual = LocalDate.now();
        String fecha = dtf.format(fechaActual);
        // Calcular el subtotal, iva y total
        double subtotal = precio;
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        // Insertar el pago
        String queryInsertPago = "INSERT INTO PAGO (fecha, subtotal, iva, monto_total, estado, alumno, motivo_de_pago) VALUES (?, ?, ?, ?, 'Pendiente', ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryInsertPago)) {
            pstmt.setString(1, fecha);
            pstmt.setDouble(2, subtotal);
            pstmt.setDouble(3, iva);
            pstmt.setDouble(4, total);
            pstmt.setString(5, matricula);
            pstmt.setString(6, motivoPago);
            pstmt.executeUpdate();
            limpiarPantalla();
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("=============================================");
        System.out.println("Pago registrado correctamente");
        System.out.println("Fecha: " + fecha);
        System.out.println("Matrícula del alumno: " + matricula);
        System.out.println("Nivel educativo: " + nivelEducativo);
        System.out.println("Motivo de pago: " + motivoPago);
        System.out.println("---------------------------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("---------------------------------------------");
        System.out.println("Total: " + total);
        System.out.println("=============================================");
        System.out.println("El pago se realiza mediante Transferencia Bancaria a la cuenta 4815163067954720 a nombre de EDUPAY y la referncia es la matricula del alumno");
        System.out.println("El pago está pendiente de ser aprobado por el administrador");
        System.out.println("Para revisar el estado del pago, consulte en la opción de Consultar Pagos");
        return;
    }
    //-------------------------------------------------------- Consultar Pagos
    public static void ConsultarPagos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Consultar Pagos");
        System.out.println("Ingrese la matricula del alumno: ");
        String matricula = scanner.nextLine();

        // Verificar que el alumno existe en la tabla alumno
        String queryCheckAlumno = "SELECT * FROM ALUMNO WHERE matricula = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmtCheckAlumno = conn.prepareStatement(queryCheckAlumno)) {
            pstmtCheckAlumno.setString(1, matricula);
            ResultSet rsAlumno = pstmtCheckAlumno.executeQuery();
            if (!rsAlumno.next()) {
                retrazo();
                System.out.println("El alumno con matrícula " + matricula + " no existe.");
                retrazo();
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Verificar que tiene pagos pendientes
        String queryCheckPagos = "SELECT * FROM PAGO WHERE alumno = ? AND estado = 'Pendiente'";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmtCheckPagos = conn.prepareStatement(queryCheckPagos)) {
            pstmtCheckPagos.setString(1, matricula);
            ResultSet rsPagos = pstmtCheckPagos.executeQuery();
            if (rsPagos.next()) {
                System.out.println("Pagos del alumno con matrícula " + matricula);
                System.out.println("=============================================");
                do {
                    System.out.println("Fecha de pago: " + rsPagos.getString("fecha"));
                    System.out.println("Subtotal: " + rsPagos.getDouble("subtotal"));
                    System.out.println("IVA: " + rsPagos.getDouble("iva"));
                    System.out.println("Total: " + rsPagos.getDouble("monto_total"));
                    System.out.println("Estado: " + rsPagos.getString("estado"));
                    System.out.println("Alumno: " + rsPagos.getString("alumno"));
                    System.out.println("Motivo de pago: " + rsPagos.getString("motivo_de_pago"));
                    System.out.println("=============================================");
                } while (rsPagos.next());
                System.out.println("El pago se realiza mediante Transferencia Bancaria a la cuenta 4815163067954720 a nombre de EDUPAY y la referencia es la matricula del alumno");
                System.out.println("El pago está pendiente de ser aprobado por el administrador");
            } else {
                System.out.println("El alumno con matrícula " + matricula + " no tiene pagos registrados como Pendientes.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Inscripciones
    public static void Inscripciones() {
        
    Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Inscripciones y reinscripciones");
        System.out.println("El alumno ya esta registrado en el sistema?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion == 1) {
            System.out.println("Ingrese la matricula del alumno: ");
            String matricula = scanner.nextLine();
            // Verificar que el alumno existe en la tabla alumno
            String queryCheckAlumno = "SELECT COUNT(*) FROM alumno WHERE matricula = ?";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                PreparedStatement pstmt = conn.prepareStatement(queryCheckAlumno)) {
                pstmt.setString(1, matricula);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next() && rs.getInt(1) == 0) {
                    retrazo();
                    System.out.println("El alumno con matrícula " + matricula + " no existe.");
                    retrazo();
                    limpiarPantalla();
                    return;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Seleccione el nivel educativo del alumno"); 
            String query1 = "SELECT * FROM NIVEL_EDUCATIVO";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                PreparedStatement pstmt = conn.prepareStatement(query1)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Ingrese el nivel educativo del alumno: ");
            String nivelEducativo = scanner.next();
            System.out.println("Estos son los periodos escolares disponibles");
            String query2 = "SELECT * FROM PERIODO_ESCOLAR";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                PreparedStatement pstmt = conn.prepareStatement(query2)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("codigo") + ". " + rs.getString("fecha_inicio") + " - " + rs.getString("fecha_final"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Ingrese el periodo escolar del alumno: ");
            String periodoEscolar = scanner.next();
            System.out.println("Estos son los grados y grupos disponibles");
            String query3 = "SELECT * FROM GRADO_Y_GRUPO WHERE periodo_escolar = ? AND nivel_educativo = ?";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                PreparedStatement pstmt = conn.prepareStatement(query3)) {
                pstmt.setString(1, periodoEscolar);
                pstmt.setString(2, nivelEducativo);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println("---------------------------------------------");
                    System.out.println(rs.getString("codigo") + ". " + rs.getString("grado") + rs.getString("grupo") + " - " + rs.getString("periodo_escolar"));
                    System.out.println("---------------------------------------------");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Ingrese el grado y grupo del alumno: ");
            String gradoGrupo = scanner.next();

            String query4 = "UPDATE ALUMNO SET nivel_educativo = ?, periodo_escolar = ?, grado_y_grupo = ? WHERE matricula = ?";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                PreparedStatement pstmt = conn.prepareStatement(query4)) {
                pstmt.setString(1, nivelEducativo);
                pstmt.setString(2, periodoEscolar);
                pstmt.setString(3, gradoGrupo);
                pstmt.setString(4, matricula);
                pstmt.executeUpdate();
                limpiarPantalla();
                System.out.println("Alumno actualizado correctamente");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return;
        } else if (opcion == 2) {
            //----------------------------------------------------------------------------------
                    // Insertar alumno
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nombreAlumno = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el primer apellido del alumno: ");
                    String primerApellAlumno = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el segundo apellido del alumno: ");
                    String segundoApellAlumno = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese la dirección del alumno: ");
                    String direccion = scanner.next();
                    scanner.nextLine();
                    System.out.println("Estos son los niveles educativos disponibles");
                    String query3 = "SELECT * FROM NIVEL_EDUCATIVO";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query3)) {
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese el nivel educativo del alumno: ");
                    String nivelEducativo = scanner.next();
                    System.out.println("Estos son los periodos escolares disponibles");
                    String query4 = "SELECT * FROM PERIODO_ESCOLAR";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query4)) {
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("codigo") + ". " + rs.getString("fecha_inicio") + " - " + rs.getString("fecha_final"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese el periodo escolar del alumno: ");
                    String periodoEscolar = scanner.next();
                    scanner.nextLine();
                    System.out.println("Estos son los grados y grupos disponibles");
                            String query5 = "SELECT * FROM GRADO_Y_GRUPO WHERE periodo_escolar = ? AND nivel_educativo = ?";
                            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                                PreparedStatement pstmt = conn.prepareStatement(query5)) {
                                    pstmt.setString(1, periodoEscolar);
                                    pstmt.setString(2, nivelEducativo);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println(rs.getString("codigo") + ". " + rs.getString("grado") + rs.getString("grupo") + " - " + rs.getString("periodo_escolar"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese el grado y grupo del alumno: ");
                    String gradoGrupo = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del tutor: ");
                    String nombre = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el primer apellido del tutor: ");
                    String primerApell = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el segundo apellido del tutor: ");
                    String segundoApell = scanner.next();
                    scanner.nextLine();
                    // Insertar tutor
                    String query = "INSERT INTO TUTOR (nombre, primerApell, segundoApell) VALUES (?, ?, ?)";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                         PreparedStatement pstmt = conn.prepareStatement(query)) {
                        pstmt.setString(1, nombre);
                        pstmt.setString(2, primerApell);
                        pstmt.setString(3, segundoApell);
                        pstmt.executeUpdate();
                        limpiarPantalla();
                        System.out.println("Tutor agregado correctamente");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("ingrese el numero de telefono del tutor: ");
                    String num_tel = scanner.next();
                    scanner.nextLine();
                    // buscar el folio del tutor
                    String query1 = "SELECT folio FROM TUTOR WHERE nombre = ? AND primerApell = ? AND segundoApell = ?";
                    String folio = "";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                         PreparedStatement pstmt = conn.prepareStatement(query1)) {
                        pstmt.setString(1, nombre);
                        pstmt.setString(2, primerApell);
                        pstmt.setString(3, segundoApell);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            folio = rs.getString("folio");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    // Insertar numero de telefono
                    String query2 = "INSERT INTO NUM_TEL (tutor, numTel) VALUES (?, ?)";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                         PreparedStatement pstmt = conn.prepareStatement(query2)) {
                        pstmt.setString(1, folio);
                        pstmt.setString(2, num_tel);
                        pstmt.executeUpdate();
                        limpiarPantalla();
                        System.out.println("Numero de telefono agregado correctamente");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    

                    // Insertar alumno
                    String query6 = "INSERT INTO ALUMNO (nombre, primerApell, segundoApell, direccion, nivel_educativo, periodo_escolar, grado_y_grupo, tutor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                         PreparedStatement pstmt = conn.prepareStatement(query6)) {
                        pstmt.setString(1, nombreAlumno);
                        pstmt.setString(2, primerApellAlumno);
                        pstmt.setString(3, segundoApellAlumno);
                        pstmt.setString(4, direccion);
                        pstmt.setString(5, nivelEducativo);
                        pstmt.setString(6, periodoEscolar);
                        pstmt.setString(7, gradoGrupo);
                        pstmt.setString(8, folio);
                        pstmt.executeUpdate();
                        limpiarPantalla();
                        System.out.println("Alumno agregado correctamente");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    //sacar la matricula del alumno
                    String query7 = "SELECT matricula FROM ALUMNO WHERE nombre = ? AND primerApell = ? AND segundoApell = ?";
                    String matricula = "";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                         PreparedStatement pstmt = conn.prepareStatement(query7)) {
                        pstmt.setString(1, nombreAlumno);
                        pstmt.setString(2, primerApellAlumno);
                        pstmt.setString(3, segundoApellAlumno);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            matricula = rs.getString("matricula");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    //registrar pago de inscripcion
                    //mostrar motivos de pago
                    System.out.println("Estos son los motivos de pago disponibles");
                    String query8 = "SELECT * FROM MOTIVO_DE_PAGO WHERE Nivel_educativo = ? AND nombre LIKE ?";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query8)) {
                        pstmt.setString(1, nivelEducativo);
                        pstmt.setString(2, "%Inscripción%");
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre") + " - $" + rs.getString("precio"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese el motivo de pago de la inscripcion: ");
                    String motivo_de_pago = scanner.next();
                    scanner.nextLine();
                    //obtener el costo del motivo de pago
                    String query9 = "SELECT precio FROM MOTIVO_DE_PAGO WHERE codigo = ?";
                    double precio = 0;
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query9)) {
                        pstmt.setString(1, motivo_de_pago);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            precio = rs.getDouble("precio");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    // Obtener la fecha actual
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaActual = LocalDate.now();
                    String fecha = dtf.format(fechaActual);
                    //sacar el subtotal = costo del motivo de pago
                    double subtotal = precio;
                    //sacar el iva = subtotal * 0.16
                    double iva = subtotal * 0.16;
                    //sacar el total = subtotal + iva
                    double total = subtotal + iva;
                    // Verificar que el alumno existe en la tabla alumno
                    String queryCheckAlumno = "SELECT COUNT(*) FROM alumno WHERE matricula = ?";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(queryCheckAlumno)) {
                        pstmt.setString(1, matricula);
                        ResultSet rs = pstmt.executeQuery();
                        if (rs.next() && rs.getInt(1) == 0) {
                            retrazo();
                            System.out.println("El alumno con matrícula " + matricula + " no existe.");
                            retrazo();
                            limpiarPantalla();
                            return;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    //insertar el pago
                    String query10 = "INSERT INTO PAGO (fecha, subtotal, iva, monto_total, estado, alumno, motivo_de_pago) VALUES (?, ?, ?, ?, 'Pendiente', ?, ?)";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query10)) {
                        pstmt.setString(1, fecha);
                        pstmt.setDouble(2, subtotal);
                        pstmt.setDouble(3, iva);
                        pstmt.setDouble(4, total);
                        pstmt.setString(5, matricula);
                        pstmt.setString(6, motivo_de_pago);
                        pstmt.executeUpdate();
                        limpiarPantalla();
                        System.out.println("Pago de inscripcion registrado correctamente");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println("=============================================");
                    System.out.println("proceso de inscripcion completado");
                    System.out.println("Su pago esta pendiente de ser aprobado por el administrador");
                System.out.println("El pago se realiza mediante Transferencia Bancaria a la cuenta 4815163067954720 a nombre de EDUPAY y la referncia es la matricula del alumno");
                    System.out.println("Para revisar el estado del pago, consulte en la opción de Consultar Pagos");
                    // se imprime el recibo
                    System.out.println("Recibo de inscripcion");
                    System.out.println("Fecha: " + fecha);
                    System.out.println("Matrícula del alumno: " + matricula);
                    System.out.println("Nombre del alumno: " + nombreAlumno + " " + primerApellAlumno + " " + segundoApellAlumno);
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Nivel educativo: " + nivelEducativo);
                    System.out.println("Periodo escolar: " + periodoEscolar);
                    System.out.println("Grado y grupo: " + gradoGrupo);
                    System.out.println("Tutor: " + nombre + " " + primerApell + " " + segundoApell);
                    System.out.println("Motivo de pago: " + motivo_de_pago);
                    System.out.println("---------------------------------------------");
                    System.out.println("Subtotal: " + subtotal);
                    System.out.println("IVA: " + iva);
                    System.out.println("---------------------------------------------");
                    System.out.println("Total: " + total);
                    System.out.println("=============================================");
                    return;
                
                }
                }
        
    //-------------------------------------------------------- Agregar Periodo Escolar
    public static void AgregarPeriodoEscolar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Añadir Periodo Escolar");
        System.out.println("Ingrese el año del periodo escolar: ");
        String codigo = "PE"+scanner.next();
        System.out.println("Ingrese la fecha de inicio del periodo escolar (yyyy-mm-dd): ");
        String fechaInicio = scanner.next();
        System.out.println("Ingrese la fecha final del periodo escolar (yyyy-mm-dd): ");
        String fechaFinal = scanner.next();
        String query = "INSERT INTO PERIODO_ESCOLAR (codigo, fecha_inicio, fecha_final) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, codigo);
            pstmt.setString(2, fechaInicio);
            pstmt.setString(3, fechaFinal);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Periodo escolar agregado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Agregar Grado y Grupo
    public static void AgregarGradosyGrupos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Añadir Grado y Grupo");
        System.out.println("Ingrese el grado: ");
        String grado = scanner.next();
        System.out.println("Ingrese el grupo: ");
        String grupo = scanner.next();
        System.out.println("Ingrese el periodo escolar: ");
        String periodoEscolar = "PE" + scanner.next();
        String sql = "INSERT INTO GRADO_Y_GRUPO (grado, grupo, periodo_escolar) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, grado);
                pstmt.setString(2, grupo);
                pstmt.setString(3, periodoEscolar);
                pstmt.executeUpdate();
                limpiarPantalla();
            System.out.println("Grado y grupo agregado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Agregar motivos de Pago
    public static void AgregarMotivosdePago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Añadir Motivos de Pago");
        System.out.println("Ingrese el nombre del motivo de pago: ");
        String nombre = scanner.nextLine();
        double precio = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el precio del motivo de pago: ");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar la entrada no válida
            }
        }
        String query = "INSERT INTO MOTIVO_DE_PAGO (nombre, precio) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Motivo de pago agregado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Agregar Uniformes
    public static void AgregarUniformes() {
        String motivoPago = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Añadir Uniformes");
        System.out.println("------------------");
        String queryMotivoPago = "SELECT MAX(codigo) AS ultimo_motivo FROM MOTIVO_DE_PAGO";
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryMotivoPago)) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String ultimoMotivo = rs.getString("ultimo_motivo");
                if (ultimoMotivo != null && !ultimoMotivo.isEmpty()) {
                    int numero = Integer.parseInt(ultimoMotivo.substring(2));
                    motivoPago = "MP" + String.format("%03d", numero);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Si no se encontró ningún motivo de pago previo
        if (motivoPago.isEmpty()) {
            motivoPago = "MP001"; // Iniciar en MP001 si no hay registros previos
        }
        
        System.out.println("Ingrese la talla del uniforme: ");
        String talla = scanner.nextLine();
        System.out.println("Ingrese el tipo de uniforme: ");
        
        String queryTipoUniforme = "SELECT * FROM TIPO_DE_UNIFORME";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryTipoUniforme)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String tipo = scanner.nextLine();
        System.out.println("Ingrese la descripción del uniforme: ");
        String descripcion = scanner.nextLine();
        
        String queryInsertUniforme = "INSERT INTO UNIFORMES (motivo_de_pago, talla, tipo_de_uniforme, descripcion) VALUES (?, ?, ?, ?)";
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt1 = conn1.prepareStatement(queryInsertUniforme)) {
            pstmt1.setString(1, motivoPago);
            pstmt1.setString(2, talla);
            pstmt1.setString(3, tipo);
            pstmt1.setString(4, descripcion);
            pstmt1.executeUpdate();
            limpiarPantalla();
            System.out.println("Uniforme agregado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
        return;
    }
    //-------------------------------------------------------- Agregar Eventos Especiales
    public static void AgregarEventosEspeciales() {
        Scanner scanner = new Scanner(System.in);
        String motivoPago = "";
        System.out.println("=============================================");
        System.out.println("Añadir Eventos Especiales");
        String queryMotivoPago = "SELECT MAX(codigo) AS ultimo_motivo FROM MOTIVO_DE_PAGO";
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(queryMotivoPago)) {
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String ultimoMotivo = rs.getString("ultimo_motivo");
            if (ultimoMotivo != null && !ultimoMotivo.isEmpty()) {
                motivoPago = ultimoMotivo; // Utiliza el último motivo de pago registrado
            }
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Si no se encontró ningún motivo de pago previo
        if (motivoPago.isEmpty()) {
            motivoPago = "MP001"; // Iniciar en MP001 si no hay registros previos
        }
        System.out.println("Ingrese la fecha del evento (yyyy-mm-dd): ");
        String fecha = scanner.nextLine();
        System.out.println("Ingrese el lugar del evento: ");
        String lugar = scanner.nextLine();
        System.out.println("Ingrese el horario del evento especial: ");
        String horario = scanner.nextLine();
        System.out.println("Ingrese la descripcion del evento especial: ");
        String descripcion = scanner.nextLine();
        String query = "INSERT INTO EVENTOS_ESPECIALES (motivo_de_pago, fecha, lugar, horario, descripcion) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, motivoPago);
            pstmt.setString(2, fecha);
            pstmt.setString(3, lugar);
            pstmt.setString(4, horario);
            pstmt.setString(5, descripcion);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Evento especial agregado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- ModificarAlumnos
    public static void ModificarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Alumnos");
        System.out.println("=============================================");
        System.out.println("Ingrese la matricula del alumno a modificar: ");
        String matricula = scanner.nextLine();
        System.out.println("ingrese el nuevo nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo apellido paterno del alumno: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el nuevo apellido materno del alumno: ");
        String apellido2 = scanner.nextLine();
        System.out.println("Ingrese la nueva dirección del alumno: ");
        String direccion = scanner.nextLine();
        System.out.println("aqui estan los niveles educativos disponibles");
        String query = "SELECT * FROM NIVEL_EDUCATIVO";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("el alumno no existe");
            retrazo();
            limpiarPantalla();
            return;
        }
        System.out.println("Ingrese el nuevo nivel educativo del alumno: ");
        String nivelEducativo = scanner.nextLine();
        System.out.println("aqui estan los periodos escolares disponibles");
        String query1 = "SELECT * FROM PERIODO_ESCOLAR";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query1)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("fecha_inicio") + " - " + rs.getString("fecha_final"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el nuevo periodo escolar del alumno: ");
        String periodoEscolar = scanner.nextLine();

        System.out.println("aqui estan los grados y grupos disponibles");
        String query2 = "SELECT * FROM GRADO_Y_GRUPO";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query2)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("grado") + rs.getString("grupo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el nuevo grado y grupo del alumno: ");
        String gradoGrupo = scanner.nextLine();
        System.out.println("Ingrese El Tutor del alumno");
        String query3 = "SELECT * FROM TUTOR";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query3)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("folio") + ". " + rs.getString("nombre") + " " + rs.getString("primerApell") + " " + rs.getString("segundoApell"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el nuevo tutor del alumno: ");
        String tutor = scanner.nextLine();
        String query4 = "UPDATE ALUMNO SET nombre = ?, primerApell = ?, segundoApell = ?, direccion = ?, grado_y_grupo = ?, nivel_educativo = ?, tutor = ? WHERE matricula = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query4)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, apellido2);
            pstmt.setString(4, direccion);
            pstmt.setString(5, gradoGrupo);
            pstmt.setString(6, nivelEducativo);
            pstmt.setString(7, tutor);
            pstmt.setString(8, matricula);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Alumno modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //ingrese cualquer tecla para volver al menu de programa de cobros
        return;
    }
    //-------------------------------------------------------- ModificarTutores
    public static void ModificarTutores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar tutores");
        System.out.println("=============================================");
        System.out.println("Ingrese el folio del tutor a modificar: ");
        String folio = scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del tutor: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo apellido paterno del tutor: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el nuevo apellido materno del tutor: ");
        String apellido2 = scanner.nextLine();
        String query = "UPDATE TUTOR SET nombre = ?, primerApell = ?, segundoApell = ? WHERE folio = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, apellido2);
            pstmt.setString(4, folio);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Tutor modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- ModificarGradosyGrupos
    public static void ModificarGradosyGrupos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Grados y Grupos");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del grado y grupo a modificar: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nuevo grado: ");
        String grado = scanner.nextLine();
        System.out.println("Ingrese el nuevo grupo: ");
        String grupo = scanner.nextLine();
        System.out.println("Aqui esta la lista de periodos escolares disponibles");
        String query = "SELECT * FROM PERIODO_ESCOLAR";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("fecha_inicio") + " - " + rs.getString("fecha_final"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el nuevo periodo escolar: ");
        String periodoEscolar = scanner.nextLine();
        String query1 = "UPDATE GRADO_Y_GRUPO SET grado = ?, grupo = ?, periodo_escolar = ? WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query1)) {
            pstmt.setString(1, grado);
            pstmt.setString(2, grupo);
            pstmt.setString(3, periodoEscolar);
            pstmt.setString(4, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Grado y grupo modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Modificar un Nivel Educativo
    public static void ModificarNivelEducativo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar un Nivel Educativo");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del nivel educativo a modificar: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del nivel educativo: ");
        String nombre = scanner.nextLine();
        double costo = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el nuevo costo base del nivel educativo: ");
            if (scanner.hasNextDouble()) {
                costo = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar la entrada no válida
            }
        }
        String query = "UPDATE NIVEL_EDUCATIVO SET nombre = ?, costo_base = ? WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, costo);
            pstmt.setString(3, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Costo base del nivel educativo modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Modificar Motivos de Pago
    public static void ModificarMotivosdePago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Motivos de Pago");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del motivo de pago a modificar: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del motivo de pago: ");
        String nombre = scanner.nextLine();
        double precio = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el nuevo precio del motivo de pago: ");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar la entrada no válida
            }
        }
        String query = "UPDATE MOTIVO_DE_PAGO SET nombre = ?, precio = ? WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setString(3, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Motivo de pago modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- ModificarPacksPapeleria
    public static void ModificarPacksPapeleria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Packs de Papeleria");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del motivo de pago del pack de papelería a modificar: ");
        String motivo_de_pago = scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del pack de papelería: ");
        String nombre_pack = scanner.nextLine();
        String descripcion;
        System.out.println("Ingrese la nueva descripción del pack de papelería: ");
        descripcion = scanner.nextLine();
        String query = "update PAPELERIA set nombre_pack = ?, descripcion = ? where motivo_de_pago = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre_pack);
            pstmt.setString(2, descripcion);
            pstmt.setString(3, motivo_de_pago);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Pack de papelería modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- ModificarUniformes
    public static void ModificarUniformes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Uniformes");
        System.out.println("=============================================");
        System.out.println("Ingrese el motivo de pago del uniforme a modificar: ");
        String motivo_de_pago = scanner.nextLine();
        System.out.println("Ingrese la nueva talla del uniforme: ");
        String talla = scanner.nextLine();
        System.out.println("Aqui se muestran los tipos de uniformes disponibles");
        String query0 = "SELECT * FROM TIPO_DE_UNIFORME";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query0)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("codigo") + ". " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el nuevo tipo de uniforme: ");
        String tipo_de_uniforme = scanner.nextLine();
        System.out.println("Ingrese la nueva descripción del uniforme: ");
        String descripcion = scanner.nextLine();
        String query = "update UNIFORMES set talla = ?, tipo_de_uniforme = ?, descripcion = ? where motivo_de_pago = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, talla);
            pstmt.setString(2, tipo_de_uniforme);
            pstmt.setString(3, descripcion);
            pstmt.setString(4, motivo_de_pago);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Uniforme modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- ModificarTiposUniformes
    public static void ModificarTiposUniformes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Tipos de Uniformes");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del tipo de uniforme a modificar: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del tipo de uniforme: ");
        String nombre = scanner.nextLine();
        String query = "UPDATE TIPO_DE_UNIFORME SET nombre = ? WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Tipo de uniforme modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- ModificarEventosEspeciales
    public static void ModificarEventosEspeciales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Eventos Especiales");
        System.out.println("=============================================");
        System.out.println("Ingrese el motivo de pago del evento especial a modificar: ");
        String motivo_de_pago = scanner.nextLine();
        System.out.println("Ingrese la nueva fecha del evento (yyyy-mm-dd): ");
        String fecha = scanner.nextLine();
        System.out.println("Ingrese el nuevo lugar del evento: ");
        String lugar = scanner.nextLine();
        System.out.println("Ingrese el nuevo horario del evento especial (00:00-00:00): ");
        String horario = scanner.nextLine();
        System.out.println("Ingrese la nueva descripción del evento especial: ");
        String descripcion = scanner.nextLine();
        String query = "UPDATE EVENTOS_ESPECIALES SET fecha = ?, lugar = ?, horario = ?, descripcion = ? WHERE motivo_de_pago = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, fecha);
            pstmt.setString(2, lugar);
            pstmt.setString(3, horario);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, motivo_de_pago);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Evento especial modificado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Alumnos
    public static void EliminarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Alumnos");
        System.out.println("=============================================");
        System.out.println("Ingrese la matricula del alumno a eliminar: ");
        String matricula = scanner.nextLine();
        // Eliminar pagos relacionados
        String query1 = "UPDATE PAGO SET ALUMNO = NULL WHERE ALUMNO = ?";
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt1 = conn1.prepareStatement(query1)) {
            pstmt1.setString(1, matricula);
            pstmt1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String query = "DELETE FROM ALUMNO WHERE matricula = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, matricula);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Alumno eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Tutores
    public static void EliminarTutores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Tutores");
        System.out.println("=============================================");
        System.out.println("Ingrese el folio del tutor a eliminar: ");
        String folio = scanner.nextLine();
        // Eliminar numeros de telefono relacionados
        String query2 = "DELETE FROM num_tel WHERE tutor = ?";
        try (Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt2 = conn2.prepareStatement(query2)) {
            pstmt2.setString(1, folio);
            pstmt2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar alumnos relacionados
        String query1 = "UPDATE ALUMNO SET tutor = NULL WHERE tutor = ?";
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt1 = conn1.prepareStatement(query1)) {
            pstmt1.setString(1, folio);
            pstmt1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String query = "DELETE FROM TUTOR WHERE folio = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, folio);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Tutor eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Grados y Grupos
    public static void EliminarGradosyGrupos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Grados y Grupos");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del grado y grupo a eliminar: ");
        String codigo = scanner.nextLine();
        // Eliminar alumnos relacionados
        String query1 = "UPDATE ALUMNO SET grado_y_grupo = NULL WHERE grado_y_grupo = ?";
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt1 = conn1.prepareStatement(query1)) {
            pstmt1.setString(1, codigo);
            pstmt1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String query = "DELETE FROM GRADO_Y_GRUPO WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Grado y grupo eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Motivos de Pago
    public static void EliminarMotivosdePago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Motivos de Pago");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del motivo de pago a eliminar: ");
        String codigo = scanner.nextLine();
        // Eliminar pagos relacionados
        String query1 = "UPDATE PAGO SET motivo_de_pago = NULL WHERE motivo_de_pago = ?";
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt1 = conn1.prepareStatement(query1)) {
            pstmt1.setString(1, codigo);
            pstmt1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar packs de papeleria relacionados
        String query2 = "DELETE FROM PAPELERIA WHERE motivo_de_pago = ?";
        try (Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt2 = conn2.prepareStatement(query2)) {
            pstmt2.setString(1, codigo);
            pstmt2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar uniformes relacionados
        String query3 = "DELETE FROM UNIFORMES WHERE motivo_de_pago = ?";
        try (Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt3 = conn3.prepareStatement(query3)) {
            pstmt3.setString(1, codigo);
            pstmt3.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar eventos especiales relacionados
        String query4 = "DELETE FROM EVENTOS_ESPECIALES WHERE motivo_de_pago = ?";
        try (Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt4 = conn4.prepareStatement(query4)) {
            pstmt4.setString(1, codigo);
            pstmt4.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar inscripciones relacionadas
        String query5 = "DELETE FROM INSCRIPCION WHERE motivo_de_pago = ?";
        try (Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt5 = conn5.prepareStatement(query5)) {
            pstmt5.setString(1, codigo);
            pstmt5.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar mensualidades relacionadas
        String query6 = "DELETE FROM MENSUALIDAD WHERE motivo_de_pago = ?";
        try (Connection conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt6 = conn6.prepareStatement(query6)) {
            pstmt6.setString(1, codigo);
            pstmt6.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Eliminar mantenimientos relacionados
        String query7 = "DELETE FROM MANTENIMIENTO WHERE motivo_de_pago = ?";
        try (Connection conn7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt7 = conn7.prepareStatement(query7)) {
            pstmt7.setString(1, codigo);
            pstmt7.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query = "DELETE FROM MOTIVO_DE_PAGO WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Motivo de pago eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Packs de Papeleria
    public static void EliminarPacksPapeleria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Packs de Papeleria");
        System.out.println("=============================================");
        System.out.println("Ingrese el motivo de pago del pack de papelería a eliminar: ");
        String motivo_de_pago = scanner.nextLine();
        String query = "DELETE FROM PAPELERIA WHERE motivo_de_pago = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, motivo_de_pago);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Pack de papelería eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Uniformes
    public static void EliminarUniformes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Uniformes");
        System.out.println("=============================================");
        System.out.println("Ingrese el motivo de pago del uniforme a eliminar: ");
        String motivo_de_pago = scanner.nextLine();
        String query = "DELETE FROM UNIFORMES WHERE motivo_de_pago = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, motivo_de_pago);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Uniforme eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Tipos de Uniformes
    public static void EliminarTiposUniformes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Tipos de Uniformes");
        System.out.println("=============================================");
        System.out.println("Ingrese el código del tipo de uniforme a eliminar: ");
        System.out.println("(Ojo eliminar un tipo de uniforme eliminara los uniformes relacionados con este tipo de uniforme)");
        String codigo = scanner.nextLine();
        // Eliminar uniformes relacionados
        String query1 = "DELETE FROM UNIFORMES WHERE tipo_de_uniforme = ?";
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt1 = conn1.prepareStatement(query1)) {
            pstmt1.setString(1, codigo);
            pstmt1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String query = "DELETE FROM TIPO_DE_UNIFORME WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, codigo);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Tipo de uniforme eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    //-------------------------------------------------------- Eliminar Eventos Especiales
    public static void EliminarEventosEspeciales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Eventos Especiales");
        System.out.println("=============================================");
        System.out.println("Ingrese el motivo de pago del evento especial a eliminar: ");
        String motivo_de_pago = scanner.nextLine();
        String query = "DELETE FROM EVENTOS_ESPECIALES WHERE motivo_de_pago = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, motivo_de_pago);
            pstmt.executeUpdate();
            limpiarPantalla();
            System.out.println("Evento especial eliminado correctamente");
            System.out.println("---------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }

        

    //-------------------------------------------------------- Consultas Proyecto 7
    public static void consulta1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================");
                System.out.println("Datos de un alumno en un periodo escolar");
                System.out.println("Ingrese el periodo escolar: ");
                String periodoEscolar = scanner.next();
                System.out.println("Ingrese la matrícula del alumno: ");
                String matricula = scanner.next();
                String query = "SELECT " +
                    "pe.codigo AS 'Periodo escolar', " +
                    "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio', " +
                    "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final', " +
                    "a.matricula AS 'Matrícula del alumno', " +
                    "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                    "gg.grado AS 'Grado', " +
                    "ne.nombre AS 'Nivel', " +
                    "GROUP_CONCAT(CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) SEPARATOR ', ') AS 'Nombre de los tutores', " +
                    "a.direccion AS 'Dirección' " +
                    "FROM ALUMNO a " +
                    "INNER JOIN PERIODO_ESCOLAR pe ON a.periodo_escolar = pe.codigo " +
                    "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                    "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                    "LEFT JOIN TUTOR t ON a.tutor = t.folio " +
                    "WHERE pe.codigo = ? AND a.matricula = ? " +
                    "GROUP BY a.matricula;";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                     PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, periodoEscolar);
                    pstmt.setString(2, matricula);
                    ResultSet rs = pstmt.executeQuery();
                    // Extraer datos del conjunto de resultados
                    while (rs.next()) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Periodo escolar: " + rs.getString("Periodo escolar"));
                        System.out.println("Fecha de inicio: " + rs.getString("Fecha de inicio"));
                        System.out.println("Fecha final: " + rs.getString("Fecha final"));
                        System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                        System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                        System.out.println("Grado: " + rs.getString("Grado"));
                        System.out.println("Nivel: " + rs.getString("Nivel"));
                        System.out.println("Nombre de los tutores: " + rs.getString("Nombre de los tutores"));
                        System.out.println("Dirección: " + rs.getString("Dirección"));
                        System.out.println("---------------------------------------------");
                        matricula = null;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }
    public static void consulta2(){
        Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Grupos en los que ha estado un alumno");
                System.out.println("Ingrese la matrícula del alumno: ");
                String matricula = scanner.next();
                String query2 = "SELECT " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel' " +
                        "FROM ALUMNO a " +
                        "INNER JOIN PAGO p ON a.matricula = p.alumno " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON gg.nivel_educativo = ne.codigo " +
                        "WHERE a.matricula = ? AND motivo_de_pago = 'MP001'";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query2)) {
                        pstmt.setString(1, matricula);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Fecha de inicio PE: " + rs.getString(3));
                            System.out.println("Fecha final PE: " + rs.getString(4));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Nivel: " + rs.getString("Nivel"));
                            System.out.println("---------------------------------------------");
                            matricula = null;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                public static void consulta3(){
                    Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Números de teléfono de un tutor");
                System.out.println("Ingrese el folio del Tutor: ");
                String FOTutor = scanner.next();
                String query3 = "SELECT " +
                        "CONCAT(t.nombre, ' ', t.primerApell, ' ', IFNULL(t.segundoApell, '')) AS 'Nombre del tutor', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "nt.numTel AS 'Número de teléfono' " +
                        "FROM TUTOR t " +
                        "INNER JOIN ALUMNO a ON t.folio = a.tutor " +
                        "INNER JOIN NUM_TEL nt ON t.folio = nt.tutor " +
                        "WHERE t.folio = ? ";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query3)) {
                        pstmt.setString(1, FOTutor);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Nombre del tutor: " + rs.getString("Nombre del tutor"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Número de teléfono: " + rs.getString("Número de teléfono"));
                            System.out.println("---------------------------------------------");
                            FOTutor = null;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                
                }
                public static void consulta4(){
                    Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Inscripciones pagadas de un alumno");
                System.out.println("Ingrese la matrícula del alumno: ");
                String matricula = scanner.next();
                String query4 = "SELECT " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel' " +
                        "FROM PAGO p " +
                        "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON mp.periodo_escolar = pe.codigo " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON p.gradoAlumno = gg.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                        "WHERE a.matricula = ? AND mp.nombre LIKE 'Inscripción%'";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                     PreparedStatement pstmt = conn.prepareStatement(query4)) {
                    pstmt.setString(1, matricula);
                    ResultSet rs = pstmt.executeQuery();
                    // Extraer datos del conjunto de resultados
                    while (rs.next()) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                        System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                        System.out.println("Fecha inicio PE: " + rs.getString("Fecha inicio PE"));
                        System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                        System.out.println("Fecha de pago: " + rs.getString("Fecha de pago"));
                        System.out.println("Grado: " + rs.getString("Grado"));
                        System.out.println("Nivel: " + rs.getString("Nivel"));
                        System.out.println("---------------------------------------------");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }}
                public static void consulta5(){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=============================================");
                    System.out.println("Mensualidades pagadas de un alumno en un periodo escolar");
                    System.out.println("Ingrese la matrícula del alumno: ");
                    String matricula = scanner.next();
                    System.out.println("Ingrese el periodo escolar: ");
                    String periodoEscolar = scanner.next();
                    String query5 = "SELECT " +
                            "a.matricula AS 'Matrícula del alumno', " +
                            "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                            "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha inicio PE', " +
                            "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                            "DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha de pago', " +
                            "gg.grado AS 'Grado', " +
                            "ne.nombre AS 'Nivel', " +
                            "m.mes_pagado AS 'Mes pagado' " +
                            "FROM PAGO p " +
                            "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                            "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                            "INNER JOIN PERIODO_ESCOLAR pe ON mp.periodo_escolar = pe.codigo " +
                            "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                            "INNER JOIN NIVEL_EDUCATIVO ne ON mp.nivel_educativo = ne.codigo " +
                            "INNER JOIN MENSUALIDAD m ON mp.codigo = m.motivo_de_pago " +
                            "WHERE a.matricula = ? AND pe.codigo = ? AND p.motivo_de_pago = 'MP016'";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query5)) {
                        pstmt.setString(1, matricula);
                        pstmt.setString(2, periodoEscolar);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Fecha inicio PE: " + rs.getString("Fecha inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Nivel: " + rs.getString("Nivel"));
                            System.out.println("Mes pagado: " + rs.getString("Mes pagado"));
                            System.out.println("Fecha de pago: " + rs.getString("Fecha de pago"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                public static void consulta6(){
                    Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Pagos realizados por un evento especial");
                String query6 = "SELECT " +
                        "ee.descripcion AS 'Evento especial', " +
                        "DATE_FORMAT(ee.fecha, '%d/%m/%Y') AS 'Fecha del evento', " +
                        "mp.precio as 'Costo del evento', " +
                        "DATE_FORMAT(p.fecha, '%d/%m/%Y') AS 'Fecha del pago', " +
                        "a.matricula AS 'Matrícula del alumno', " +
                        "CONCAT(a.nombre, ' ', a.primerApell, ' ', IFNULL(a.segundoApell, '')) AS 'Nombre del alumno', " +
                        "gg.grupo AS 'Grupo', " +
                        "gg.grado AS 'Grado', " +
                        "ne.nombre AS 'Nivel' " +
                        "FROM PAGO p " +
                        "INNER JOIN ALUMNO a ON p.alumno = a.matricula " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON a.grado_y_grupo = gg.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON a.nivel_educativo = ne.codigo " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                        "INNER JOIN EVENTOS_ESPECIALES ee ON mp.codigo = ee.motivo_de_pago " +
                        "WHERE ee.motivo_de_pago = 'MP066'";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query6)) {
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Evento especial: " + rs.getString("Evento especial"));
                            System.out.println("Fecha del evento: " + rs.getString("Fecha del evento"));
                            System.out.println("Costo del evento: " + rs.getString("Costo del evento"));
                            System.out.println("Fecha del pago: " + rs.getString("Fecha del pago"));
                            System.out.println("Matrícula del alumno: " + rs.getString("Matrícula del alumno"));
                            System.out.println("Nombre del alumno: " + rs.getString("Nombre del alumno"));
                            System.out.println("Grupo: " + rs.getString("Grupo"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Nivel: " + rs.getString("Nivel"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                public static void consulta7(){
                    Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Costos del mantenimiento por periodo escolar");
                System.out.println("Ingrese el periodo escolar: ");
                String periodoEscolar = scanner.next();
                String query7 = "SELECT " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "m.concepto AS 'Concepto del mantenimiento', " +
                        "mp.precio AS 'Costo' " +
                        "FROM MANTENIMIENTO m " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON m.motivo_de_pago = mp.codigo " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON m.fecha_pago BETWEEN pe.fecha_inicio AND pe.fecha_final " +
                        "WHERE pe.codigo = ?";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query7)) {
                        pstmt.setString(1, periodoEscolar);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Concepto del mantenimiento: " + rs.getString("Concepto del mantenimiento"));
                            System.out.println("Costo: " + rs.getString("Costo"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                public static void consulta8(){
                    Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Lista de precios de los paquetes de útiles escolares (papelería) para un periodo y nivel escolar.");
                System.out.println("Ingrese el periodo escolar: ");
                String periodoEscolar = scanner.next();
                System.out.println("Ingrese el nivel educativo: ");
                String nivelEducativo = scanner.next();
                String query8 = "SELECT " +
                        "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                        "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                        "ne.nombre AS 'Nivel escolar', " +
                        "gg.grado AS 'Grado', " +
                        "p.descripcion AS 'Descripción del paquete de utiles', " +
                        "mp.precio AS 'Costo' " +
                        "FROM PAPELERIA p " +
                        "INNER JOIN MOTIVO_DE_PAGO mp ON p.motivo_de_pago = mp.codigo " +
                        "INNER JOIN NIVEL_EDUCATIVO ne ON mp.nivel_educativo = ne.codigo " +
                        "INNER JOIN GRADO_Y_GRUPO gg ON gg.nivel_educativo = ne.codigo " +
                        "INNER JOIN PERIODO_ESCOLAR pe ON mp.periodo_escolar = pe.codigo " +
                        "WHERE pe.codigo = ? AND ne.codigo = ?";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                        PreparedStatement pstmt = conn.prepareStatement(query8)) {
                        pstmt.setString(1, periodoEscolar);
                        pstmt.setString(2, nivelEducativo);
                        ResultSet rs = pstmt.executeQuery();
                        // Extraer datos del conjunto de resultados
                        while (rs.next()) {
                            System.out.println("---------------------------------------------");
                            System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                            System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                            System.out.println("Nivel escolar: " + rs.getString("Nivel escolar"));
                            System.out.println("Grado: " + rs.getString("Grado"));
                            System.out.println("Descripción del paquete de utiles: " + rs.getString("Descripción del paquete de utiles"));
                            System.out.println("Costo: " + rs.getString("Costo"));
                            System.out.println("---------------------------------------------");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                public static void consulta9(){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=============================================");
                    System.out.println("Lista de precios de los uniformes para un para un periodo y nivel escolar.");
                    System.out.println("Ingrese el periodo escolar: ");
                    String periodoEscolar = scanner.next();
                    System.out.println("Ingrese el nivel educativo: ");
                    String nivelEducativo = scanner.next();
                    String query9 = "SELECT " +
                            "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                            "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                            "ne.nombre AS 'Nivel escolar', " +
                            "gg.grado AS 'Grado', " +
                            "u.descripcion AS 'Descripción del uniforme', " +
                            "tu.nombre AS 'Tipo de uniforme', " +
                            "mp.precio AS 'Costo del uniforme' " +
                            "FROM UNIFORMES u " +
                            "INNER JOIN MOTIVO_DE_PAGO mp ON u.motivo_de_pago = mp.codigo " +
                            "INNER JOIN TIPO_DE_UNIFORME tu ON u.tipo_de_uniforme = tu.codigo " +
                            "INNER JOIN NIVEL_EDUCATIVO ne ON mp.nombre LIKE CONCAT('%', ne.nombre, '%') " +
                            "INNER JOIN GRADO_Y_GRUPO gg ON gg.periodo_escolar = ? " +
                            "INNER JOIN PERIODO_ESCOLAR pe ON gg.periodo_escolar = pe.codigo " +
                            "WHERE pe.codigo = ? AND ne.codigo = ?";
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                            PreparedStatement pstmt = conn.prepareStatement(query9)) {
                            pstmt.setString(1, periodoEscolar);
                            pstmt.setString(2, periodoEscolar);
                            pstmt.setString(3, nivelEducativo);
                            ResultSet rs = pstmt.executeQuery();
                            // Extraer datos del conjunto de resultados
                            while (rs.next()) {
                                System.out.println("---------------------------------------------");
                                System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                                System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                                System.out.println("Nivel escolar: " + rs.getString("Nivel escolar"));
                                System.out.println("Grado: " + rs.getString("Grado"));
                                System.out.println("Descripción del uniforme: " + rs.getString("Descripción del uniforme"));
                                System.out.println("Tipo de uniforme: " + rs.getString("Tipo de uniforme"));
                                System.out.println("Costo del uniforme: " + rs.getString("Costo del uniforme"));
                                System.out.println("---------------------------------------------");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    public static void consulta10(){
                        Scanner scanner = new Scanner(System.in);
                System.out.println("=============================================");
                System.out.println("Total de pagos realizados para un nivel educativo en un periodo escolar");
                System.out.println("Ingrese el periodo escolar: ");
                String periodoEscolar = scanner.next();
                System.out.println("Ingrese el nivel educativo: ");
                String nivelEducativo = scanner.next();
                String query10 = "SELECT " +
                    "DATE_FORMAT(pe.fecha_inicio, '%d/%m/%Y') AS 'Fecha de inicio PE', " +
                    "DATE_FORMAT(pe.fecha_final, '%d/%m/%Y') AS 'Fecha final PE', " +
                    "ne.nombre AS 'Nivel escolar', " +
                    "COUNT(p.numero) AS 'Total de pagos' " +
                    "FROM PAGO p " +
                    "INNER JOIN MOTIVO_DE_PAGO MP ON p.motivo_de_pago = MP.codigo " +
                    "INNER JOIN NIVEL_EDUCATIVO ne ON MP.Nivel_educativo = ne.codigo " +
                    "INNER JOIN PERIODO_ESCOLAR pe ON MP.periodo_escolar = pe.codigo " +
                    "WHERE pe.codigo = ? AND ne.codigo = ?";
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_cobros_escolares", "root", "");
                    PreparedStatement pstmt = conn.prepareStatement(query10)) {
                    pstmt.setString(1, periodoEscolar);
                    pstmt.setString(2, nivelEducativo);
                    ResultSet rs = pstmt.executeQuery();
                    // Extraer datos del conjunto de resultados
                    while (rs.next()) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Fecha de inicio PE: " + rs.getString("Fecha de inicio PE"));
                        System.out.println("Fecha final PE: " + rs.getString("Fecha final PE"));
                        System.out.println("Nivel escolar: " + rs.getString("Nivel escolar"));
                        System.out.println("Total de pagos: " + rs.getString("Total de pagos"));
                        System.out.println("---------------------------------------------");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
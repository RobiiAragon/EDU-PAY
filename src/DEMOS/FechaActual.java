package DEMOS;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class FechaActual {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Extraer el día, mes y año
        int dia = fechaActual.getDayOfMonth();
        Month mes = fechaActual.getMonth();
        int año = fechaActual.getYear();

        // Obtener el nombre del mes en texto
        String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        // Concatenar la fecha actual en una variable llamada fecha_pago
        String fecha_pago = dia + " de " + nombreMes + " de " + año;

        // Calcular la fecha con un mes adicional
        LocalDate fechaMesSiguiente = fechaActual.plusMonths(1);
        int diaSiguiente = fechaMesSiguiente.getDayOfMonth();
        Month mesSiguiente = fechaMesSiguiente.getMonth();
        int añoSiguiente = fechaMesSiguiente.getYear();
        String nombreMesSiguiente = mesSiguiente.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        // Concatenar en una variable llamada proximo_pago
        String proximo_pago = diaSiguiente + " de " + nombreMesSiguiente + " de " + añoSiguiente;

        // Imprimir los valores
        System.out.println("Día: " + dia);
        System.out.println("Mes: " + nombreMes);
        System.out.println("Año: " + año);
        System.out.println("Mes siguiente: " + nombreMesSiguiente);
        System.out.println("Ultimo pago realizado el día: " + fecha_pago);
        System.out.println("Próximo pago: " + proximo_pago);
    }
}

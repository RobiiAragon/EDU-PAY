package DEMOS;
import java.util.Scanner;
public class concatenarAlaVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añadir periodos Escolares");
        System.out.println("===============================");
        System.out.println("añade un periodo escolar");
        System.out.println("================================");
        String codigo = "PE"+scanner.next();
        System.out.println("El valor de la opcion es: " + codigo);
    }
}
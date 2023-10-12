import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        /*
         * Resolver un problema que utilice una estructura
         * while usando un contador regresivo.
         */

        final String CONTRASENACORRECTA = "santos";
        String contrasena;
        int contadorRegresivo = 4;

        System.out.println("\"Intentos disponibles " + contadorRegresivo + " (contador regresivo inicial)");

        while (contadorRegresivo > 0) {

            System.out.println("Ingrese su contraseña para el inicio de secion");
            contrasena = lector.nextLine();

            if (contrasena.equals(CONTRASENACORRECTA)) {
                System.out.println("BienVenido a a su pagina web");
                System.out.println("Le quedaron " + contadorRegresivo + " intentos");
                contadorRegresivo = 0;
            } else {
                System.out.println("Error, contraseña incorrecta");
                contadorRegresivo--;
                System.out.println("Le quedan " + contadorRegresivo + " intentos");
                if (contadorRegresivo == 0) {
                    System.out.println();
                    System.out.println("Intentos disponibles " + contadorRegresivo + " (contador regresivo final)");
                    System.out.println("\"Usted sobre paso los intentos permitidos\"");
                }
            }
        }
    }

}

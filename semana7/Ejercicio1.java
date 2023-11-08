package semana7
import java.util.Scanner;

//Resolver un problema que utilice una estructura do-while usando un contador progresivo
public class Ejercicio1 {
    public static void main(String[] args) {

        // Resolver un problema que utilice una estructura do-while usando un contador
        // progresivo

        Scanner lector = new Scanner(System.in);
        int numero, indice = 1;
        int suma = 0;
        int contadorNumeros = 0;
        String respuesta;

        do {
            do {
                System.out.println("Ingrese el " + indice + "° numero para la sumatoria (positivos)");
                numero = lector.nextInt();
                lector.nextLine();

            } while (numero <= 0);

            indice++;
            contadorNumeros++;
            suma += numero;

            do {
                System.out.println("¿Desea ingresar otro numero a la sumatoria? (si/no)");
                respuesta = lector.nextLine();
            } while (!((respuesta.equalsIgnoreCase("si") || (respuesta.equalsIgnoreCase("no")))));

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("cantidad de numeros: " + contadorNumeros);

    }
}

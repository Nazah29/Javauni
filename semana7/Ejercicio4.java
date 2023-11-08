package semana7;
import java.util.Scanner;
//Resolver un problema que utilice una estructura do-while usando un acumulador y un contador.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        do {
            System.out.println("Ingrese los numeros enteror positivos (utilice un numero negativo para cerrar el ciclo)");
            numero = lector.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);
        System.out.println("se han sumado " + contador + " numeros");
        System.out.println("La suma total de los numeros seria " + suma);

    }
}

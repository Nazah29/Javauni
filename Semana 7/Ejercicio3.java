
import java.util.Scanner;
//Resolver un problema que utilice una estructura do-while usando un acumulador progresivo
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int suma = 0;
        do {
            System.out.println("Ingrese los numeros enteror positivos (utilice un numero negativo para cerrar el ciclo)");
            numero = lector.nextInt();
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);
        System.out.println("La suma total de los numeros seria " + suma);

    }
}

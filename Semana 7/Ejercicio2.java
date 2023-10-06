
import java.util.Scanner;
//Resolver un problema que utilice una estructura do-while usando un contador regresivo
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese la cantidad en segundos de su temporizador");
        numero = lector.nextInt();
        lector.nextLine();
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);

    }
}

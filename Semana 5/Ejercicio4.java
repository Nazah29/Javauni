
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = -1;
        int acumulador = 1;
        int producto = 1;

        while (numero < 0) {
            System.out.println("Ingrese un numero positivo");
            numero = lector.nextInt();
            lector.nextLine();
        }
        System.out.println("Usted ingresó: " + numero);
        while (acumulador <= numero) {
            producto *= acumulador;
            acumulador++;
        }
        System.out.println("la multiplicacion entre esos numeros seria " + producto);
    }

}

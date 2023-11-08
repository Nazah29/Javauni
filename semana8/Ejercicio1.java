package semana8;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Ingrese el limite de su suma que se toma en cuenta hasta 1");
        numero = lector.nextInt();
        lector.nextLine();
        for (int i = 1; i <= numero; i++) {
            suma += i;

        }
        System.out.println("La suma de los numeros es "+ suma);
    }

}


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int num1, num2, auxiliar;
        int suma = 0;
        int contador = 0;
        boolean numerosIncorrectos = true;

        while (numerosIncorrectos) {
            System.out.println("ingrese un rango de numero a sumar: ");
            System.out.println("Desde el numero: ");
            num1 = lector.nextInt();
            lector.nextLine();
            System.out.println("Hasta el numero:");
            num2 = lector.nextInt();
            lector.nextLine();

            auxiliar = num1;

            while (auxiliar <= num2) {
                suma += auxiliar;
                contador++;
                auxiliar++;
                // System.out.println(auxiliar++);
            }

            System.out.println("Numero Inicial:" + num1 + "\nNumero final: " + num2);
            numerosIncorrectos = num1 <= 0 || num2 <= 0;

        }
        System.out.println("La suma de todos los numeros es: " + suma);
        System.out.println("lo cantidad de numeros sumados son:" + contador);
    }
}

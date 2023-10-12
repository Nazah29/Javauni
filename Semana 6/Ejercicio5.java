import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;
        double acumulador = 0.0;
        double promedio;

        System.out.println("Ingrese números positivos (ingrese un número negativo para finalizar):");

        while (true) {
            System.out.print("Ingrese un número: ");
            double numero = lector.nextDouble();

            if (numero < 0) {
                break;
            }

            if (numero > 0) {
                acumulador += numero;
                contador++;
            }
        }

        if (contador > 0) {
            promedio = acumulador / contador; // Calcula el promedio
            System.out.println("El promedio de los números positivos ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos para calcular el promedio.");
        }
    }
}

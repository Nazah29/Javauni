package Semana5;

import java.util.Scanner;

public class Ejercicio5 {

    public class PromedioNumerosPositivos {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int contador = 0;
            double acumulador = 0.0;

            System.out.println("Ingrese números positivos (ingrese un número negativo para finalizar):");

            while (true) {
                System.out.print("Ingrese un número: ");
                double numero = lector.nextDouble();

                if (numero < 0) {
                    break; // Detiene el bucle si se ingresa un número negativo
                }

                if (numero > 0) {
                    acumulador += numero; // Suma el número positivo al acumulador
                    contador++; // Incrementa el contador de números positivos
                }
            }

            if (contador > 0) {
                double promedio = acumulador / contador; // Calcula el promedio
                System.out.println("El promedio de los números positivos ingresados es: " + promedio);
            } else {
                System.out.println("No se ingresaron números positivos para calcular el promedio.");
            }
        }
    }
}


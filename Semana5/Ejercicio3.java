package Semana5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 1; 
        System.out.println("Ingrese un número entero positivo: ");
        numero = lector.nextInt();
        if (numero <= 0) {
            System.out.println("El número ingresado no es válido. Debe ser un entero positivo.");
            return;
        }
        while (contador <= numero) {
            suma += contador; 
            contador++; 
        }
        System.out.println("La suma de los números desde 1 hasta " + numero + " es: " + suma);
    }
}

package Semana5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroIngresado;
        int contador = 0;
        System.out.print("Ingrese un número entero positivo: ");
        numeroIngresado = lector.nextInt();
        if (numeroIngresado <= 0) {
            System.out.println("El número ingresado no es válido. Debe ser un entero positivo.");
            return;
        }
        System.out.println("Números pares desde 0 hasta " + numeroIngresado + ":");

        while (contador <= numeroIngresado) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }

    }
}

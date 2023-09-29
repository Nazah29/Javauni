package Semana7;

import java.util.Scanner;
//Resolver un problema que utilice una estructura do-while usando un contador progresivo
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero=0;
        int suma=0;
        do {
            System.out.println("Ingrese los numeros positivos");
            numero = lector.nextInt();
            lector.nextLine();
            if (numero >= 0) {
                System.out.println("Siga agregando");
                suma += numero;
            }
        } while (numero>=0);
        System.out.println("La suma de los numeros ingresados son " + suma);
    }
}

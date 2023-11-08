import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);   
        System.out.print("Ingrese un número: ");
        int numero = lector.nextInt();
        
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo e impar.");
            }
        } else {
            if (numero % 2 == 0) {
                System.out.println("El número es negativo y par.");
            } else {
                System.out.println("El número es negativo e impar.");
            }
        }
        
        
    }
}

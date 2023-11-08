import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = lector.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = lector.nextInt();
        
        if (num1 > num2) {
            System.out.println("El primer número es mayor.");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
    
    }
}

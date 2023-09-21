import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else if (edad >= 13) {
            System.out.println("Eres un adolescente.");
        } else {
            System.out.println("Eres un niño.");
        }
        
        
    }
}

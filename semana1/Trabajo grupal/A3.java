import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de operación: ");
        int numeroOperacion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        System.out.print("Ingrese el tipo de operación: ");
        String tipoOperacion = scanner.nextLine();
        
        System.out.print("Ingrese la fecha de la operación: ");
        String fechaOperacion = scanner.nextLine();
        
        System.out.print("Ingrese el monto de la operación: ");
        double montoOperacion = scanner.nextDouble();
        
        System.out.println("\nTicket de Operación Bancaria");
        System.out.println("Número de Operación: " + numeroOperacion);
        System.out.println("Tipo de Operación: " + tipoOperacion);
        System.out.println("Fecha de Operación: " + fechaOperacion);
        System.out.println("Monto de Operación: $" + montoOperacion);
    }
}

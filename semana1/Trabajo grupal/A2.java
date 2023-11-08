import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        
        System.out.print("Ingrese el subtotal: ");
        double subtotal = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de descuento (%): ");
        double descuentoPorcentaje = scanner.nextDouble();
        
        double descuento = subtotal * (descuentoPorcentaje / 100);
        double total = subtotal - descuento;
        
        System.out.println("\nBoleta de Pago");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total: $" + total);
    }
}

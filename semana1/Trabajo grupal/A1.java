import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        // Impresión de un Boleto de Viaje Interprovincial

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del pasajero: ");
        String nombrePasajero = scanner.nextLine();
        
        System.out.print("Ingrese la fecha de viaje: ");
        String fechaViaje = scanner.nextLine();
        
        System.out.print("Ingrese el origen: ");
        String origen = scanner.nextLine();
        
        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();
        
        System.out.print("Ingrese el precio del boleto: ");
        double precioBoleto = scanner.nextDouble();
        
        System.out.println("\nBoleto de Viaje");
        System.out.println("Nombre: " + nombrePasajero);
        System.out.println("Fecha de Viaje: " + fechaViaje);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Precio: $" + precioBoleto);
    }
}

    


import java.util.Scanner;

public class Unidimensional2 {
    public static void main(String[] args) {
        // Resolver un problema que solicite al usuario N datos que serán
        // almacenados en arreglos paralelos y muestre un reporte ASCII
        // con dichos datos. Incluir algún cálculo con contadores y
        // acumuladores.
        Scanner lector = new Scanner(System.in);
        int longitud;
        double precios;
        String[] arregloprecio, arreglo;
        System.out.println("Ingresa la cantidada de componentes que tengas en tu pc");
        longitud = lector.nextInt();
        lector.nextLine();
        arreglo = new String[longitud];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el componente numero " + i);
            arreglo[i] = lector.nextLine();
        }
        arregloprecio = new String[longitud];
        System.out.println("Ahora ingresa los precios");
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("Ingresa el precio en la poscicion numero" + j);
            arregloprecio[j] = lector.nextLine();
        }

       
        System.out.println("Recibo");
        System.out.println("**************************");
         for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Poscicion " + i + ":" + arreglo[i]);
        }
        System.out.println("***************************************");
        for (int j = 0; j < arreglo.length; j++) {
            System.out.print("Poscicion " + j + ":" + arregloprecio[j]);

        }
        

    }
}

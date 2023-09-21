import java.util.Scanner;

public class Boleta {
    public static void main(String[] args) {
        String nombre,producto;
        double precio,canditdadproducto;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = lector.nextLine();
        System.out.println("Ingrese el nombre del producto");
        producto = lector.nextLine();
        System.out.println("Ingrese el precio del producto");
        precio = lector.nextDouble();
        System.out.println("¿Cuantas veces a comprado el producto?");
        canditdadproducto = lector.nextDouble();
        System.out.println("Nombre                     :"+nombre);
        System.out.println("Producto                   :"+producto);
        System.out.println("-----------------------------------------");
        System.out.println("Precio                     :"+precio);
        System.out.println("Cantidad de veces comprado :"+canditdadproducto);
       
        
    }
}

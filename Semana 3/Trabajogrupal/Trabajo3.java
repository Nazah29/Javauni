package trabajogrupal;

import java.util.Scanner;

public class Trabajo3 {
    public static void main(String[] args) {
        int estado;
        Scanner lector = new Scanner(System.in);   
        System.out.println("""
            Ingrese su sueldo
            [1] Mayor a 10k 
            [2] Mayor a 7k
            [3] Mayor a 4k
            [4] Mayor a 1.2k
            """);
        estado=lector.nextInt();
        if (estado==1) {
            System.out.println("Usted pertenece a clase alta");   
        } else {
            if (estado==2) {
                System.out.println("Usted pertenece a la clase media");   
            } else {
                if (estado==3) {
                    System.out.println("Usted pertenece a la clase baja");   
                } else {
                    if (estado==4) {
                        System.out.println("Usted pertenece a la clase pobreza extrema");
                    } else {
                        System.out.println("Datos invalidos");
                    }
                    
                }
            }
            
        }
    }
    
}

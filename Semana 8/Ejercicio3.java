import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int lados, lad1, lad2;
        System.out.println("""
                Elije que deseas imprimir
                [1] Triangulo
                [2] Cuadrado
                        """);
        lados = lector.nextInt();
        lector.nextLine();
        switch (lados) {
            case 1:
                System.out.println("Has elegido un triangulo");
                for (int i = 1; i <= lados; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Has elegido un cuadrilatero");
                System.out.println("Elige el numero de filas");
                lad1 = lector.nextInt();
                lector.nextLine();
                for (int i = 1; i <= lad1; i++) {
                    System.out.print("*********************");
                    System.out.println();
                }
                break;
        }
    }

}

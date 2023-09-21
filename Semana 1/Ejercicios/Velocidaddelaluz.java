import java.util.Scanner;

public class Velocidaddelaluz {
    public static void main(String[] args) {
        final long VELOCIDAD_LUZ = 299792458; //m/s
        long distancia;

        Scanner lector = new Scanner(System.in);
        int numeroDias;

        System.out.println("Por favor, ingrese número de días:");
        numeroDias = lector.nextInt();

        distancia = numeroDias * 24 * 60 * 60 * VELOCIDAD_LUZ;

        System.out.printf("Distancia (en metros): %d metros", distancia);
    }
}

import java.util.Scanner;

public class Conversiongrados {

        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            double grados , farenhain ;
            System.out.println("Ingrese la temperatura en centigrados");
            grados = lector.nextDouble();
            farenhain = (((grados * 9)/5)+32);
            //Usando el println
            System.out.println(grados + " grados ");
            System.out.println("Es igual a " + farenhain+" grados");
            //Usando print form
            System.out.printf("%f+ grados",grados);
            System.out.printf("Es igual a %f grados",farenhain );      
        }
}
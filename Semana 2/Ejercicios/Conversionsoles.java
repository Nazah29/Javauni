import java.util.Scanner;

public class Conversionsoles {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double soles, dolares; 
        System.out.println("Ingrese la cantidad en soles que desea convertir");
        soles = lector.nextDouble();
        dolares = (soles * 3.48);
        //Usando print line
        System.out.println("La conversion de soles a dolares seria " + dolares+" dolares");
        //Usando print form
        System.out.printf("La conversion de soles a dolares seria %f dolares",dolares);
    }
}

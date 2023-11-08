package semana8;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int contador = 0;
        int cantnumero;
        double promedio;
        System.out.println("Ingrese la cantidad de numeros que desea promediar");
        cantnumero = lector.nextInt();

        for (int i = 1; i <= cantnumero; i++) {
            System.out.print("Ingrese los numeros para sacar el promedio : ");
            numero = lector.nextInt();
            lector.nextLine();
            suma += numero;
            contador++;
        }
        System.out.println("numeros contados " + contador);
        promedio=(suma/contador);
        System.out.println("El promedio de los numeros seria " + promedio);
    }
}
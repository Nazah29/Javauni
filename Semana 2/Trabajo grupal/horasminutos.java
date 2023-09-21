import java.util.Scanner;

public class horasminutos {
    public static void main(String[] args) {
        int hora, segundos, minutos;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas");
        hora = lector.nextInt();
        minutos = (hora * 60);
        segundos = (minutos *60 );
        System.out.println("La cantidad de minutos en una hora son " + minutos + " y " + segundos + " segundos");
    }
}

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int puntaje;
        String mensaje = "";
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el puntaje que saco en el examen");
        puntaje=lector.nextInt();
        lector.nextLine();

        mensaje = switch (puntaje) {
            case 12, 13, 17 -> "Aprobado (se espera mas para la proxima)";
            case 15, 16, 14 -> "Aprobado (Aceptable)";
            case 18, 19, 20 -> "Aprobado";
            default -> {
                if (puntaje <= 11 && puntaje >=0) {
                    yield "Desaprobado";
                } else{
                    yield "Dato invalido";
                }
            }
        };

        System.out.println(mensaje);
        
    }
}
  
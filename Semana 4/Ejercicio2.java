import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char rango;
        System.out.println("""
                Ingrese su rango en Valorant
                ----------------------------
                [H] - Hierro
                [B] - Bronce
                [S] - Plata
                [O] - Oro
                [P] - Platino
                [D] - Diamante
                [A] - Ascendente
                [I] - Inmortal
                [R] - Radiante
                """);
        rango = lector.next().charAt(0);

        String categoria;

        switch (rango) {
            case 'H', 'h', 'B', 'b', 'S', 's' -> categoria = "Elo bajo";
            case 'O', 'o', 'P', 'p', 'D', 'd' -> categoria = "Elo medio";
            case 'A', 'a', 'I', 'i', 'R', 'r' -> categoria = "Elo alto";
            default -> categoria = "Dato invalido";
        }

        System.out.println("Su elo en valorant es: " + categoria);
    }
}

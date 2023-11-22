package Triqui;

import java.util.Scanner;

public class maintriqui {
    public static void main(String[] args) {
        triqui juego = new triqui();
        Scanner lector = new Scanner(System.in);

        while (!juego.verificarGanador()) {
            System.out.println("Turno del jugador " + juego.getJugadorActual());
            juego.imprimirTablero();

            System.out.print("Ingrese la fila (0-2): ");
            int fila = lector.nextInt();
            System.out.print("Ingrese la columna (0-2): ");
            int columna = lector.nextInt();

            if (juego.realizarJugada(fila, columna)) {
                // Jugada válida, cambia el turno y sigue el juego.
            } else {
                System.out.println("Tu poscicion salio del limite");
            }
        }

        juego.imprimirTablero();
        System.out.println("El jugador " + juego.getJugadorActual() + " ha ganado!");
        lector.close();
    }
}


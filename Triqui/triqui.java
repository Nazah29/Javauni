package Triqui;

public class triqui {
    private char[][] tablero;
    private char jugadorActual;

    public triqui() {
        tablero = new char[3][3];
        jugadorActual = 'X'; // Empieza el jugador X
        inicializarTablero();
    }

    // region [Generacion get jugador actual]
    public char getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(char jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    // endregion

    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean realizarJugada(int fila, int columna) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
            tablero[fila][columna] = jugadorActual;
            cambiarTurno();
            return true;
        } else {
            return false;
        }
    }

    private void cambiarTurno() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    public boolean verificarGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                System.out.println("¡El jugador " + tablero[i][0] + " ha ganado!");
                return true; // Hay un ganador en la fila i
            } else {
                if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                    System.out.println("¡El jugador " + tablero[0][i] + " ha ganado!");
                    return true; // Hay un ganador en la columna i
                } else {
                    // Verificar diagonales
                    if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
                        System.out.println("¡El jugador " + tablero[0][0] + " ha ganado!");
                        return true; // Hay un ganador en la diagonal principal
                    } else {
                        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
                            System.out.println("¡El jugador " + tablero[0][2] + " ha ganado!");
                            return true; // Hay un ganador en la diagonal secundaria
                        }

                    }

                }

            }

        }

        return false; // No hay ganador todavía
    }

}

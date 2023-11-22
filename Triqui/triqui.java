package Triqui;

public class triqui {
    private char[][] tablero;
    private char jugadorActual;

    public triqui() {
        tablero = new char[3][3];
        jugadorActual = 'X'; // Empieza el jugador X
        inicializarTablero();
    }

    
    //region [Generacion get jugador actual]
    public char getJugadorActual() {
        return jugadorActual;
    }



    public void setJugadorActual(char jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    //endregion

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
        return false;
    }
}

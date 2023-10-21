public class avance1 {

    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;
        int numMinas = 4;
        char[][] tablero = new char[filas][columnas];
        char[][] minas = new char[filas][columnas];
        boolean gameOver = false;
        java.util.Random r = new java.util.Random();
        java.util.Scanner lector = new java.util.Scanner(System.in);

        // Interfaz 4x4 de las minas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '-';
                minas[i][j] = ' ';
            }
        }

        // Poner minas en aleatorio
        for (int i = 0; i < numMinas; i++) {
            int fila, columna;
            do {
                fila = r.nextInt(filas);
                columna = r.nextInt(columnas);
            } while (minas[fila][columna] == 'X');
            minas[fila][columna] = 'X';
        }

        while (!gameOver) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Ingresa una fila (0-3): ");
            int fila = lector.nextInt();
            System.out.print("Ingresa una columna (0-3): ");
            int columna = lector.nextInt();

            if (minas[fila][columna] == 'X') {
                System.out.println("¡Has perdido! Explotaste una mina.");
                gameOver = true;
            } else {
                // Contar minas cercanas
                int contador = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int nuevaFila = fila + i;
                        int nuevaColumna = columna + j;
                        if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
                            if (minas[nuevaFila][nuevaColumna] == 'X') {
                                contador++;
                            }
                        }
                    }
                }
                tablero[fila][columna] = (char) (contador + '0');
                // Comprobar victoria
                int casillasSinAbrir = 0;
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (tablero[i][j] == '-') {
                            casillasSinAbrir++;
                        }
                    }
                }
                if (casillasSinAbrir == numMinas) {
                    System.out.println("¡Has ganado! Has encontrado todas las minas.");
                    gameOver = true;
                }
            }
        }
    }
}

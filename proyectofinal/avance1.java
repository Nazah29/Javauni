package proyectofinal;

public class avance1 {

    public static void main(String[] args) {
        int opcion;
        int filas = 4;
        int columnas = 4;
        int numMinas = 4;
        char[][] tablero = new char[filas][columnas];
        char[][] minas = new char[filas][columnas];
        // intermedio
        int filasinter = 8;
        int columnasinter = 8;
        int numMinasinter = 8;
        char[][] tablerointer = new char[filasinter][columnasinter];
        char[][] minasinter = new char[filasinter][columnasinter];
        // dificil
        int filasdifi = 12;
        int columnasdifi = 12;
        int numMinasdifi = 12;
        char[][] tablerodifi = new char[filasdifi][columnasdifi];
        char[][] minasdifi = new char[filasdifi][columnasdifi];
        String menusalida = """
                *****************
                Que deseas?
                *****************
                [1]Jugar de nuevo
                [2]Salir
                """;
        boolean gameOver = false;
        java.util.Random random = new java.util.Random();
        java.util.Scanner lector = new java.util.Scanner(System.in);
        do {
            System.out.println("""
                    Ingresa el nivel de dificultad del busca minas
                    **********************************************
                    [1] Facil (4x4)
                    [2] Intermedio (8x8)
                    [3] Dificil (16x16)
                    [4] Salir
                    """);
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
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
                            fila = random.nextInt(filas);
                            columna = random.nextInt(columnas);
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
                                    if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0
                                            && nuevaColumna < columnas) {
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
                    break;
                case 2:
                    // Interfaz 4x4 de las minas
                    for (int i = 0; i < filasinter; i++) {
                        for (int j = 0; j < columnasinter; j++) {
                            tablerointer[i][j] = '-';
                            minasinter[i][j] = ' ';
                        }
                    }

                    // Poner minas en aleatorio
                    for (int i = 0; i < numMinasinter; i++) {
                        int filainter, columnainter;
                        do {
                            filainter = random.nextInt(filasinter);
                            columnainter = random.nextInt(columnasinter);
                        } while (minasinter[filainter][columnainter] == 'X');
                        minasinter[filainter][columnainter] = 'X';
                    }

                    while (!gameOver) {
                        for (int i = 0; i < filasinter; i++) {
                            for (int j = 0; j < columnasinter; j++) {
                                System.out.print(tablerointer[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.print("Ingresa una fila (0-7): ");
                        int filainter = lector.nextInt();
                        System.out.print("Ingresa una columna (0-7): ");
                        int columnainter = lector.nextInt();

                        if (minasinter[filainter][columnainter] == 'X') {
                            System.out.println("¡Has perdido! Explotaste una mina.");
                            gameOver = true;
                        } else {
                            // Contar minas cercanas
                            int contador = 0;
                            for (int i = -1; i <= 1; i++) {
                                for (int j = -1; j <= 1; j++) {
                                    int nuevaFila = filainter + i;
                                    int nuevaColumna = columnainter + j;
                                    if (nuevaFila >= 0 && nuevaFila < filasinter && nuevaColumna >= 0
                                            && nuevaColumna < columnasinter) {
                                        if (minasinter[nuevaFila][nuevaColumna] == 'X') {
                                            contador++;
                                        }
                                    }
                                }
                            }
                            tablerointer[filainter][columnainter] = (char) (contador + '0');
                            // Comprobar victoria
                            int casillasSinAbrir = 0;
                            for (int i = 0; i < filasinter; i++) {
                                for (int j = 0; j < columnasinter; j++) {
                                    if (tablerointer[i][j] == '-') {
                                        casillasSinAbrir++;
                                    }
                                }
                            }
                            if (casillasSinAbrir == numMinasinter) {
                                System.out.println("¡Has ganado! Has encontrado todas las minas.");
                                gameOver = true;
                            }
                        }
                    }

                    break;
                case 3:
                    // Interfaz 16x16 de las minas
                    for (int i = 0; i < filasdifi; i++) {
                        for (int j = 0; j < columnasdifi; j++) {
                            tablerodifi[i][j] = '-';
                            minasdifi[i][j] = ' ';
                        }
                    }

                    // Poner minas en aleatorio
                    for (int i = 0; i < numMinasdifi; i++) {
                        int filadifi, columnadifi;
                        do {
                            filadifi = random.nextInt(filasdifi);
                            columnadifi = random.nextInt(columnasdifi);
                        } while (minasdifi[filadifi][columnadifi] == 'X');
                        minasdifi[filadifi][columnadifi] = 'X';
                    }

                    while (!gameOver) {
                        for (int i = 0; i < filasdifi; i++) {
                            for (int j = 0; j < columnasdifi; j++) {
                                System.out.print(tablerodifi[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.print("Ingresa una fila (0-13): ");
                        int filadifi = lector.nextInt();
                        System.out.print("Ingresa una columna (0-13): ");
                        int columnadifi = lector.nextInt();

                        if (minasdifi[filadifi][columnadifi] == 'X') {
                            System.out.println("¡Has perdido! Explotaste una mina.");
                            gameOver = true;
                        } else {
                            // Contar minas cercanas
                            int contador = 0;
                            for (int i = -1; i <= 1; i++) {
                                for (int j = -1; j <= 1; j++) {
                                    int nuevaFila = filadifi + i;
                                    int nuevaColumna = columnadifi + j;
                                    if (nuevaFila >= 0 && nuevaFila < filasdifi && nuevaColumna >= 0
                                            && nuevaColumna < columnasdifi) {
                                        if (minasdifi[nuevaFila][nuevaColumna] == 'X') {
                                            contador++;
                                        }
                                    }
                                }
                            }
                            tablerodifi[filadifi][columnadifi] = (char) (contador + '0');
                            // Comprobar victoria
                            int casillasSinAbrir = 0;
                            for (int i = 0; i < filasdifi; i++) {
                                for (int j = 0; j < columnasdifi; j++) {
                                    if (tablerodifi[i][j] == '-') {
                                        casillasSinAbrir++;
                                    }
                                }
                            }
                            if (casillasSinAbrir == numMinasdifi) {
                                System.out.println("¡Has ganado! Has encontrado todas las minas.");
                                gameOver = true;
                            }
                        }
                    }
                    break;

                case 4:
                System.out.println("Gracias por jugar");
                    break;
            }

        } while (opcion > 4);

    }
}

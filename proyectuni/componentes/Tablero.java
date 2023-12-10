package proyectuni.componentes;

import java.util.Random;

public class Tablero {
    private Casilla [][] casillas;
    private int numFilas;
    private int numColumnas;
    private int numMinas;
    //implementado solo para diseño
    private String diseno = "🟦";

    //Constructores

    public Tablero() {
    }

    public Tablero(int numFilas, int numColumnas, int numMinas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas = numMinas;
    }

    // getters y setters
    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public int getNumMinas() {
        return numMinas;
    }

    public void setNumMinas(int numMinas) {
        this.numMinas = numMinas;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    /**
     * Este método inicializa y crea las instancias(objetos) del arreglo casillas formando así el tablero.
     * A través del constructor le damos un valor a la posición de la fila y columna de cada casilla.
     */
    public void inicializarCasillas(){
        casillas = new Casilla[numFilas][numColumnas];
        for (int i = 0; i < casillas.length ; i++) {
            for (int j = 0; j < casillas[i].length ; j++) {
                casillas[i][j] = new Casilla(i, j);
            }
        }
        generarMinas();
    }

    /**
     * Este método genera las minas del juego
     */
    public void generarMinas(){
        Random aleatorio = new Random();
        for (int i = 0; i < numMinas ; i++) {
            int auxiFila, auxicolumna;
            do {
                auxiFila = aleatorio.nextInt(numFilas );
                auxicolumna =aleatorio.nextInt(numColumnas);
            }while ((casillas[auxiFila][auxicolumna].getMina()).equalsIgnoreCase("👻"));
            casillas[auxiFila][auxicolumna].setMina("👻");
        }
    }
}


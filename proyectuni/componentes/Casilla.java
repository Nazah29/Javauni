package proyectuni.componentes;

public class Casilla {
    private int fila;
    private int columna;
    private String mina = "⏹️";
    private String portada = "⏹️";

    //Contructores
    public Casilla() {
    }
    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    // getters y setters

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getMina() {
        return mina;
    }

    public void setMina(String mina) {
        this.mina = mina;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
}

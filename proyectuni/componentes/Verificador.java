package proyectuni.componentes;
import proyectuni.Utilidades.Lector;

public class Verificador {
    /**
     * Este método nos permite contar las minas que este en alrededor de una casilla.
     * @param fila Indice de la fila de la casilla que abrio el usuario.
     * @param columna Indice de la columna de la casilla que abrio el usuario.
     * @param caracter Caracter (👻) a bucar al rededor de la casilla.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     * @return Retornar el numero de minas que se encuentran al rededar de la casilla (numero entero)
     */
    public static int minasCercanas(int fila,int columna,String caracter, Tablero tablero){
        Casilla[][] casillas = tablero.getCasillas();
        int contador = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;
                if (nuevaFila >= 0 && nuevaFila < tablero.getNumFilas() && nuevaColumna >= 0
                        && nuevaColumna < tablero.getNumColumnas()) {
                    if (casillas[nuevaFila][nuevaColumna].getMina().equalsIgnoreCase(caracter)) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    /**
     * Este método verifica si el usuario obtuvo la victoria en la partida del juego.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     * @return Retorna un boolean(true / false) si el usuario gano el juego.
     */
    public static boolean comprobarVictoria (Tablero tablero){
        Casilla[][] casillas = tablero.getCasillas();
        int casillasSinAbrir = 0;
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            for (int j = 0; j < tablero.getNumColumnas(); j++) {
                if (casillas[i][j].getPortada().equalsIgnoreCase("⏹️") ||
                        casillas[i][j].getPortada().equalsIgnoreCase("☠️")){
                    casillasSinAbrir++;
                }
            }
        }
        if (casillasSinAbrir == tablero.getNumMinas()){
            return true;
        }
        return false;
    }
    /**
     * Verifica si el usuario perdio el juego
     * @param filaUsuario Indice de la fila de la casilla que abrio el usuario.
     * @param columnaUsuario Indice de la columna de la casilla que abrio el usuario.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     * @return Devuelve boolean(true / false) si el usuario perdio el juego.
     */
    public static boolean perdiste(int filaUsuario, int columnaUsuario, Tablero tablero){
        Casilla [][] casillas= tablero.getCasillas();
        if (casillas[filaUsuario][columnaUsuario].getMina().equalsIgnoreCase("👻")){
            return true;
        }
        return false;
    }

    /**
     *Este metodo crea las instancias(objetos) del arreglo tableros
     * @param tableros Arreglo unidimencional de Tablero
     */
    public static void inicializarTableros(Tablero[]tableros){
        tableros[0] = new Tablero(4,4,4);
        tableros[1] = new Tablero(8,8,8);
        tableros[2] = new Tablero(12,12,12);
        tableros[3] = new Tablero(16,16,16);
    }

    /**
     * Marca la casiila con "☠️", ya que el usuario la considera potencialmente peligrosa
     * @param filaUsuario Indice de la fila de la casilla que desea marcar el usuario.
     * @param columnaUsuario Indice de la columna de la casilla que desea marcar el usuario.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     */
    public static void marcaCasilla (int filaUsuario, int columnaUsuario, Tablero tablero){
        Casilla[][] casillas = tablero.getCasillas();
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            for (int j = 0; j < tablero.getNumColumnas(); j++) {
                if ((i == filaUsuario && j == columnaUsuario) &&
                        (casillas[i][j].getPortada().equalsIgnoreCase("⏹️")) ){
                    casillas[i][j].setPortada("☠️");
                    return;
                }
            }
        }
    }
    /**
     * Este metodo permite desmarca la casilla que el usuario quiera.
     * @param filaUsuario Indice de la fila de la casilla que desea desmarcar el usuario.
     * @param columnaUsuario Indice de la columna de la casilla que desea desmarcar el usuario.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     */
    public static void desmarcarCasilla (int filaUsuario, int columnaUsuario, Tablero tablero){
        Casilla[][] casillas = tablero.getCasillas();
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            for (int j = 0; j < tablero.getNumColumnas(); j++) {
                if ((i == filaUsuario && j == columnaUsuario) &&
                        (casillas[i][j].getPortada().equalsIgnoreCase("☠️"))){
                    casillas[i][j].setPortada("⏹️");
                }
            }
        }
    }

    /**
     * Este método desmarca automáticamente todas las casillas.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     */
    public static void desmarcarCasillaAutomatica(Tablero tablero){
        Casilla[][] casillas = tablero.getCasillas();
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            for (int j = 0; j < tablero.getNumColumnas(); j++) {
                if (casillas[i][j].getPortada().equalsIgnoreCase("☠️")){
                    casillas[i][j].setPortada("⏹️");
                }
            }
        }
    }
    /**
     * Este método permite el ingreso de datos de las opciones especiales del juego, ya sea para Marcar o Desmarcar.
     * @param filaUsuario Indice de la fila de la casilla que desea  Marcar o Desmarcar el usuario.
     * @param columnaUsuario Indice de la columna de la casilla que desea  Marcar o Desmarcar el usuario.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     * @param auxiliar Cadena de caracteres que se mostraran como bordes del repote.
     */
    public static void ingresoOpcionEspecial (int filaUsuario,int columnaUsuario,Tablero tablero,String auxiliar){
        if (filaUsuario ==-1){
            System.out.println("☠️Ingrese datos de la casiila peligrosa☠️");
            filaUsuario = Lector.leerEntero("Fila (0-"+ (tablero.getNumFilas()-1)+"): ",0,(tablero.getNumFilas()-1));
            columnaUsuario = Lector.leerEntero("Columna (0-"+ (tablero.getNumColumnas()-1) +"): ",0,(tablero.getNumColumnas()-1));
            marcaCasilla(filaUsuario,columnaUsuario,tablero);
            Reporte.reporteCuerpoEspecial(tablero,auxiliar);
        }else {
            System.out.println("😁Ingrese datos de la casiila a desmarcar😁");
            filaUsuario = Lector.leerEntero("Fila (0-"+ (tablero.getNumFilas()-1)+"): ",0,(tablero.getNumFilas()-1));
            columnaUsuario = Lector.leerEntero("Columna (0-"+ (tablero.getNumColumnas()-1) +"): ",0,(tablero.getNumColumnas()-1));
            desmarcarCasilla(filaUsuario,columnaUsuario,tablero);
            Reporte.reporteCuerpoEspecial(tablero,auxiliar);
        }
    }
}
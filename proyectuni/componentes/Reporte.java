package proyectuni.componentes;

import proyectuni.componentes.Verificador;

public class Reporte {

    /**
     * Hace un reporte del inicio del juego, mostrando la portada de este sin ninguna alteración o cambio en su portada.
     * @param auxiliar Cadena de caracteres que se mostraran como bordes del repote.
     * @param tablero Tablero que escogio el usuario segun la dificultad}
     */
    public static void reporteInicio (String auxiliar,Tablero tablero){
        //inicializa el tablero
        tablero.inicializarCasillas();
        Casilla[][] copia = tablero.getCasillas();
        //Hacemos el reporte por primera vez
        System.out.println(auxiliar);
        for (int i = 0; i < copia.length ; i++) {
            System.out.printf("%s",tablero.getDiseno());
            for (int j = 0; j < copia[i].length ; j++) {
                System.out.printf("%6s", copia[i][j].getPortada());
            }
            System.out.printf("%6s\n",tablero.getDiseno());
        }
        System.out.println(auxiliar);
    }

    /**
     * Imprime las minas con la finalidad de saber la ubicación de estas mismas.
     * Método implementado solo para verificar el buen funcionamiento del juego en la opción de "GANAR".
     * @param auxiliar Cadena de caracteres que se mostraran como bordes del repote.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     */
    public static void reporteMinas (String auxiliar,Tablero tablero){
        Casilla[][] copia = tablero.getCasillas();
        // recorrido para verificar el lugar de las minas
        System.out.println("      MINAS GUIA (para ganar)\n"+auxiliar);// DIDACTICO
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            System.out.printf("%s",tablero.getDiseno());
            for (int j = 0; j < tablero.getNumColumnas(); j++) {
                System.out.printf("%6s",copia[i][j].getMina());
            }System.out.printf("%6s\n",tablero.getDiseno());
        }
        System.out.println(auxiliar);
    }

    /**
     * Reporte del cuerpo del juego remplazando una casilla por el numero de minas alrededor de esta misma.
     * @param filas Indice de la fila de la casilla que abrio el usuario.
     * @param columnas Indice de la columna de la casilla que abrio el usuario.
     * @param numMinasAlRederdor Numero de minas al rededor de la casilla.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     * @param auxiliar Cadena de caracteres que se mostraran como bordes del repote.
     */
    public static void reporteCuerpo (int filas, int columnas, int numMinasAlRederdor, Tablero tablero, String auxiliar){
        Casilla [][] casillas = tablero.getCasillas();
        casillas[filas][columnas].setPortada(numMinasAlRederdor + "") ;
        //recorrido para verificar el luagr de las minas
        System.out.println(auxiliar);
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            System.out.printf("%s",tablero.getDiseno());
            for (int j = 0; j < tablero.getNumColumnas() ; j++) {
                System.out.printf("%6s",casillas[i][j].getPortada());
            }
            System.out.printf("%6s\n",tablero.getDiseno());
        }
        System.out.println(auxiliar);
    }
    /**
     * Impresión del resultado final del juego ya sea si pierde o gana, teniendo en cuenta y mostrando
     * las casillas abiertas y desmarcando automáticamente las casillas marcadas anteriormente
     * @param auxiliar Cadena de caracteres que se mostraran como bordes del repote.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     */
    public static void reportefinal(String auxiliar, Tablero tablero){
        Casilla[][] copia = tablero.getCasillas();
        //Desmarcado automatico de las casillas
        Verificador.desmarcarCasillaAutomatica(tablero);
        System.out.println(auxiliar);
        for (int i = 0; i < copia.length ; i++) {
            System.out.printf("%s",tablero.getDiseno());
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j].getMina().equalsIgnoreCase("👻")){
                    copia[i][j].setPortada("👻");
                }
                System.out.printf("%6s",copia[i][j].getPortada());
            }System.out.printf("%6s\n",tablero.getDiseno());
        }
        System.out.println(auxiliar);
    }
    /**
     * Reporte especial en donde el usuario puede ver las casillas marcadas o desmarcadas.
     * @param tablero Tablero que escogio el usuario segun la dificultad.
     * @param auxiliar Cadena de caracteres que se mostraran como bordes del repote.
     */
    public static void reporteCuerpoEspecial (Tablero tablero,String auxiliar){
        Casilla [][] casillas = tablero.getCasillas();
        //recorrido para verificar el luagr de las minas
        System.out.println(auxiliar);
        for (int i = 0; i < tablero.getNumFilas(); i++) {
            System.out.printf("%s",tablero.getDiseno());
            for (int j = 0; j < tablero.getNumColumnas() ; j++) {
                System.out.printf("%6s",casillas[i][j].getPortada());
            }
            System.out.printf("%6s\n",tablero.getDiseno());
        }
        System.out.println(auxiliar);
    }
}


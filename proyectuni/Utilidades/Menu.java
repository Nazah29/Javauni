package proyectuni.Utilidades;

public class Menu {
    /**
     * Menu principal donde se muestran las opciones de dificultad del juego.
     * @return Retorna un mensaje ne pantalla(String).
     */
    public static String MenuPrincipal(){
        return """
              🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪
              🟪       NIVEL DE DIFICULTAD DEL BUSCA MINAS      🟪
              🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪
              🟪     [1] Facil (4x4)                            🟪
              🟪     [2] Intermedio (8x8)                       🟪
              🟪     [3] Dificil (12x12)                        🟪
              🟪     [4] avanzado (16x16)                       🟪
              🟪     [5] Salir                                  🟪
              🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪
              Ingrese opcion:""";
    }

    /**
     * Menu donde donde se le pregunta al usuario: ¿QUE DESEAS HACER?
     * Ya sea si quiere salir del juego o desea comenzar una nueva partida.
     * @return retorna un mensaje en pantalla(String).
     */
    public static String SubMenu (){
        return """
                🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪
                🟪   ¿QUE DESEAS HACER?   🟪
                🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪
                🟪   [1]Jugar de nuevo    🟪
                🟪   [2]Salir             🟪
                🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪
                Ingrese opcion:""";
    }

    /**
     * Menu donde se muestra las recomendaciones o opciones especiales que el usuario puede ingresar en el juego.
     * @return retorna un mensaje en pantalla(String).
     */
    public static String recomendacion (){
        return """
                _______________________________________________
                👀OPCIONES ESPECIALES👀
                Marcar Casilas Peligrosas = -1
                Desmarcar Casiilas  = -2
                👀Ingrese en fila y columna el mismo valor de la accion requerida👀
                -----------------------------------------------""";
    }
}

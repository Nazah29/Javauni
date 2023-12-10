package proyectuni.aplicacion;

import proyectuni.componentes.Verificador;
import proyectuni.componentes.Tablero;
import proyectuni.Utilidades.Lector;
import proyectuni.Utilidades.Menu;
import proyectuni.componentes.Reporte;

public class AppBuscaminas2 {
    public static void main(String[] args) {
        Tablero [] tableros = new Tablero[4];
        Verificador.inicializarTableros(tableros);

        int opcion;
        do {
            int contador;
            int filasTemporales;
            int columnasTemporales;
            int filaUsuario;
            int columnaUsuario;
            String auxiliar= " ";

            Tablero tableroAuxi = new Tablero();
            opcion = Lector.leerEntero(Menu.MenuPrincipal(),1,5);
            System.out.println(Menu.recomendacion());      ////////////////////////////

            switch (opcion){
                case 1: tableroAuxi = tableros[0];
                    auxiliar = "🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦";
                    break;
                case 2: tableroAuxi = tableros[1];
                    auxiliar ="🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦";
                    break;
                case 3: tableroAuxi = tableros[2];
                    auxiliar = "🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦";
                    break;
                case 4: tableroAuxi = tableros[3];
                    auxiliar ="🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦";
                    break;
            }
            if (opcion != 5){
                //Reportando el principio
                Reporte.reporteInicio(auxiliar, tableroAuxi);
                //imprimimor las minas solo de forma didactica (si gusta lo puedes borrar)////////////////////////////
                Reporte.reporteMinas(auxiliar, tableroAuxi);
            }

            while (opcion != 5){
                filasTemporales = tableroAuxi.getNumFilas()-1;
                columnasTemporales = tableroAuxi.getNumColumnas()-1;

                do {
                    //System.out.println(Menu.recomendacion()); ///////////////////////
                    // verifica si el Usuario ingreso alguna opcion especial
                    filaUsuario = Lector.leerEntero("Ingresa una fila (0-"+ filasTemporales+"): ",-2,filasTemporales);
                    columnaUsuario = Lector.leerEntero("Ingresa una columna (0-"+ columnasTemporales +"): ",-2,columnasTemporales);
                    boolean opcionEspecial = (filaUsuario == -1 && columnaUsuario == -1) || (filaUsuario == -2 && columnaUsuario ==-2);
                    if (opcionEspecial){
                        Verificador.ingresoOpcionEspecial(filaUsuario,columnaUsuario,tableroAuxi,auxiliar);
                        filaUsuario = -1;
                        columnaUsuario = -1;
                    }
                }while (filaUsuario <0 || columnaUsuario < 0);

                //Verificar si perdio
                if (Verificador.perdiste(filaUsuario,columnaUsuario,tableroAuxi)){
                    System.out.println("😔👻¡HAS PERDIDO! Explotaste una mina.👻😔");
                    Reporte.reportefinal(auxiliar, tableroAuxi);
                    opcion = 5;
                }else {

                    // Hallamos la cantidad de minas al rededor de una casilla
                    contador = Verificador.minasCercanas(filaUsuario,columnaUsuario,"👻",tableroAuxi);
                    //Reporte del cuerpo del juego, segun los movimientos del usuario
                    Reporte.reporteCuerpo(filaUsuario,columnaUsuario,contador,tableroAuxi,auxiliar);

                    if (Verificador.comprobarVictoria(tableroAuxi)){
                        System.out.println("🥳🎉🥂¡Has ganado! Has encontrado todas las minas.🥂🎉🥳");
                        Reporte.reportefinal(auxiliar,tableroAuxi);
                        opcion = 5;
                    }
                }
            }
            opcion = Lector.leerEntero(Menu.SubMenu(),1,2);
            if (opcion == 2){
                opcion = 5;
            }

        }while (opcion != 5);
        System.out.println("😎😎¡GRACIAS POR JUGAR!😎😎");
    }
}




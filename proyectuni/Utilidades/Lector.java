package proyectuni.Utilidades;
import proyectuni.Utilidades.Excepcion01;

public class Lector {
    /**
     * Lee y convalida numeros enteros.
     * Además contiene un excepcion, la captura y la trata.
     * @param mensaje Mensaje que se le mostrara en pantalla al usuario antes de pedirle que ingrese los datos.
     * @param valorMinimo Valor minimo que puede ingresar el usuario.
     * @param valorMaximo Valor maximo que puede ingresar el usuario.
     * @return Retorna un numero entero valido dentro del rango dado.
     */
    public static int leerEntero (String mensaje, int valorMinimo, int valorMaximo){
        int valor;
        do {
            System.out.print(mensaje);
            valor = Excepcion01.validarIngresoDeNumero(valorMaximo);

        }while (valor > valorMaximo || valor < valorMinimo);
        return valor;
    }
}

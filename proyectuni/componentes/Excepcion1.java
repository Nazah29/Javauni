package proyectuni.componentes;

import java.util.Scanner;

public class Excepcion1 {
    // Este método no está siendo implementado debido a que si lo trato de implementar en
    // donde se debe(Clase lector) me ocasiona problemas con las dependencias de módulos.
    /**
     * Este método trata una excepción que es ocasionada si el usuario ingrese caracteres en vez de números.
     * @param valor Valor ingresado por teclado del usuario, el cual podría causar la excepción.
     * @param valorMaximo Valor Maximo correcto que podria ingresar el usuario.
     * @return Retorna un valor entero, ya sea si ocurre la excepción o no.
     */
    public static int validarIngresoDeNumero (int valor, int valorMaximo){
        Scanner lector =new Scanner(System.in);
        try {
            valor = lector.nextInt();
            lector.nextLine();
        } catch (Exception e) {
            System.out.println("Error, ingrese numeros");
            valor = valorMaximo + 1;
        }
        return valor;
    }
}

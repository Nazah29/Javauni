package proyectuni.Utilidades;

import java.util.Scanner;

public class Excepcion01 {
    /**
     * Este método trata una excepción que es ocasionada si el usuario ingrese caracteres en vez de números.
     * @param valorMaximo Valor Maximo correcto que podria ingresar el usuario.
     * @return Retorna un valor entero, ya sea si ocurre la excepción o no.
     */
    public static int validarIngresoDeNumero (int valorMaximo){
        int valor;
        Scanner lector =new Scanner(System.in);
        try {
            valor = lector.nextInt();
            lector.nextLine();
        } catch (Exception e) {
            System.out.println("😑 Error, ingrese numeros😑");
            valor = valorMaximo + 1;
        }
        return valor;
    }
}

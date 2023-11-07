package Semana13.utilidades;

import java.util.Arrays;

public class PruebaUtilidades {
    public static void main(String[] args) {
        Utilidades prueba = new Utilidades();
        int valor = 16;
        int res = prueba.modificarValor(valor);
        // System.out.println(res);
        // System.out.println(valor);
        
        int[] valores = { 10, 20, 30 };
        prueba.modificarArreglo(valores);

        System.out.println(Arrays.toString(valores));
    }
}

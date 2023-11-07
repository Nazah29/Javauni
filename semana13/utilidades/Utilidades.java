package Semana13.utilidades;

public class Utilidades {

    public int modificarValor(int valor) {
        valor = valor + 2;
        int resultado = valor * 10;
        return resultado;
    }

    public void modificarArreglo(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            valores[i]++;
        }
        /*
         * for (int valor : valores) {
         * valor++;
         * }
         */
    }
}

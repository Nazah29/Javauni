package semana9;
import java.util.Scanner;

public class Unidimensional3 {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);

        int[] valores;
        int[] arregloCopia;
        int cantidad,opcion;
        int cantidadCopia,valorInicialCopia,valorFinalCopia;
        String menu = """
                *********** 
                    MENU DE COPIA DE VALORES
                ***********    
                [1]Copia completa de los valores
                [2]Copia parcial de los valores
                ***********
                Ingrese una opcion""";

        do {
            System.out.println("CUANTOS VALORES DESEA ALMACENAR");
            cantidad = lector.nextInt();
            lector.nextLine();
        }while (cantidad <= 0);

        valores =new int[cantidad];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("ingrese el "+(i+1)+"° valor: ");
            valores [i]= lector.nextInt();
            lector.nextLine();
        }
        do {
            System.out.println(menu);
            opcion = lector.nextInt();
            lector.nextLine();
        }while (opcion <= 0 || opcion > 2);

        if (opcion == 1){
            System.out.print("EL arreglo inicial con todos los valores ingresados es: [");
            for (int axiliar:valores) {
                System.out.print(axiliar + " ");
            }
            System.out.println("]");

            System.out.print("EL areglo resultante de los valores copiados totalmente es: [");
            for (int axiliar:valores) {
                System.out.print(axiliar + " ");
            }
            System.out.println("]");
        }else {
            do {
                System.out.println("Desde que valor quiere hacer la copia (posiciones entre \"1-"+cantidad+"\")");
                valorInicialCopia = lector.nextInt();
            }while ( valorInicialCopia <1 || valorInicialCopia >cantidad);
            do {
                System.out.println("Hasta que valor quiere hacer la copia (posiciones entre \""+valorInicialCopia+"-"+cantidad+"\")");
                valorFinalCopia = lector.nextInt();
                lector.nextLine();
            }while (valorFinalCopia < valorInicialCopia || valorFinalCopia > cantidad);

            cantidadCopia = valorFinalCopia - valorInicialCopia +1;

            arregloCopia = new int[cantidadCopia];

            System.arraycopy(valores,valorInicialCopia -1,arregloCopia, 0,cantidadCopia);

            System.out.print("EL arreglo inicial con todos los valores ingresados es: [");
            for (int axiliar:valores) {
                System.out.print(axiliar + " ");
            }
            System.out.println("]");

            System.out.print("EL arreglo resultante de los valores copiados parcialmente es: [");
            for (int auxiliar : arregloCopia) {
                System.out.print(auxiliar +" ");
            }
            System.out.println("]");
        }
    }
}

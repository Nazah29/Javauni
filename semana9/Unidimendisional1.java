package semana9;
import java.util.Arrays;
import java.util.Scanner;

public class Unidimendisional1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion, auxiliar;
        int longitud;
        int[] arreglo;
        System.out.println("Ingrese la longitud de los datos que desea ingresar");
        longitud = lector.nextInt();
        arreglo = new int[longitud];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero para la posicion " + i);
            arreglo[i] = lector.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Poscicion " + i + ":" + arreglo[i]);
        }
        System.out.println("""
                Elija la opcion de su orden
                [1] Ascendente
                [2] Descendente
                """);
        opcion = lector.nextInt();
        switch (opcion) {
            case 1:
                Arrays.sort(arreglo);
                for (int contador : arreglo) {

                }
                System.out.println(Arrays.toString(arreglo));

                break;
            case 2:
                for (int i = 0; i < arreglo.length - 1; i++) {
                    for (int j = i + 1; j < arreglo.length; j++) {
                        if (arreglo[i] < arreglo[j]) {
                            auxiliar = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = auxiliar;

                        }

                    }

                }
                System.out.println(Arrays.toString(arreglo));
                break;

        }

    }

}

package Semana7;

import java.util.Scanner;

public class Ejercicio5 {
    // Elaborar un programa que muestre un menú de 5 opciones y cada opción permita
    // resolver algún ejercicio desarrollado en alguna tarea previa.
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // Opcion 1
        int opcionprioritaria;
        String menu = """
                Ingrese la opcion que desea realizar
                [1] Imprimir una boleta
                [2] Conversion a binario
                [3] Escalera de numeros
                [4] Factorial
                [5] Averiguar si es numero primo
                [6] Salir
                """;
        String nombres = "", apellidos = "";
        int opcion;
        double salario = 0;
        String menuopc1 = """
                * *****************************
                * MENÚ DE OPCIONES            *
                * *****************************
                * 1. Ingresar empleado        *
                * 2. Ingresar salario mensual *
                * 3. Imprimir boleta          *
                * 4. Salir                    *
                * *****************************
                Ingrese opción:""";

        String boleta1 = """
                **************************************************
                * RESUMEN DE BOLETAS DE PAGO                     *
                **************************************************
                * Nombre del empleado: %1$-25s *
                * Apellidos del empleado: %2$-22s *
                * Tipo: Contratado                               *
                * Salario Ene: %3$7.1f   Salario Feb: %3$7.1f    *
                * Salario Mar: %3$7.1f   Salario Abr: %3$7.1f    *
                * Salario May: %3$7.1f   Salario Jun: %3$7.1f    *
                * Salario Jul: %3$7.1f   Salario Ago: %3$7.1f    *
                * Salario Set: %3$7.1f   Salario Oct: %3$7.1f    *
                * Salario Nov: %3$7.1f   Salario Dic: %3$7.1f    *
                **************************************************
                * TOTAL: %4$7.1f                                 *
                * Descuento: 600.0                               *
                **************************************************
                """;
        // opcion 2
        String cadenaResiduos = "";
        int numero, residuo, numeroOriginal;
        // opcion 3
        int numerobi, lineas;
        int residuoLineas;
        String cadena = "";
        // Opcion 4
        int numerofact;
        int producto = 1;
        int acumulador = 1;
        // Opcion 5
        int numeroevalu;

        do {
            System.out.println(menu);
            opcionprioritaria = lector.nextInt();
            lector.nextLine();
            if (opcionprioritaria != 6) {
                switch (opcionprioritaria) {
                    case 1:
                        do {
                            // presentar menú
                            System.out.println(menu);
                            // solicitar opción
                            opcion = lector.nextInt();
                            lector.nextLine();

                            if (opcion != 4) {
                                switch (opcion) {
                                    case 1: // ingreso datos personales
                                        do {
                                            System.out.println("Por favor, ingrese su nombre: ");
                                            nombres = lector.nextLine();
                                        } while (nombres.isBlank());
                                        do {
                                            System.out.println("Ahora ingrese sus apellidos: ");
                                            apellidos = lector.nextLine();
                                        } while (apellidos.isBlank());
                                        break;
                                    case 2: // ingresa salario
                                        do {
                                            System.out.println("Ahora ingrese su salario: ");
                                            salario = lector.nextDouble();
                                            lector.nextLine();
                                        } while (salario <= 0);
                                        break;
                                    case 3: // impresión de boleta
                                        if (!nombres.isBlank() && !apellidos.isBlank() && salario > 0) {
                                            System.out.printf(boleta1,
                                                    nombres.length() > 25 ? nombres.substring(0, 25) : nombres,
                                                    apellidos,
                                                    salario, salario * 12);
                                        } else {
                                            System.out.println(
                                                    "Por favor, ingrese primero su nombre, apellidos y salario.");
                                        }
                                        break;
                                }
                            }

                        } while (opcion != 4);

                        break;
                    case 2:
                        do {
                            System.out.println("Ingrese un numero en base decimal(mayor a 0)");
                            numero = lector.nextInt();
                            lector.nextLine();
                        } while (numero <= 0);

                        numeroOriginal = numero;

                        do {
                            residuo = numero % 2;
                            numero = numero / 2;
                            cadenaResiduos = residuo + cadenaResiduos;

                        } while (numero >= 1);
                        System.out.println("La convercion de numero " + numeroOriginal
                                + " en base decimal a binario es: " + cadenaResiduos);

                        break;
                    case 3:
                        do {
                            System.out.println("Ingrese un numero (mayor a 0)");
                            numerobi = lector.nextInt();
                            lector.nextLine();
                        } while (numerobi <= 0);

                        lineas = numerobi;

                        System.out.println("Entonces:");

                        do {
                            residuoLineas = lineas % 2;

                            if (residuoLineas == 1) {

                                cadena = 1 + cadena;
                                System.out.println(cadena);
                            } else {
                                cadena = 0 + cadena;
                                System.out.println(cadena);
                            }

                            lineas--;
                        } while (lineas > 0);

                        break;
                    case 4:
                        System.out.println("Ingrese el numero que desea hallar el factorial");
                        numerofact = lector.nextInt();
                        lector.nextLine();
                        if (numerofact > 0) {
                            do {
                                producto *= acumulador;
                                acumulador++;

                            } while (acumulador <= numerofact);

                            System.out.println("El resultado del factorial es " + producto);
                        } else {
                            System.out.println("Su el numero ingresado no es correcto");

                        }

                        break;
                    case 5:
                        do {
                            System.out.println("Ingrese un número entero");
                            numeroevalu = lector.nextInt();
                        } while (numeroevalu < 0);

                        int contadorDivisionesExactas = 0;
                        int divisor = 1;

                        do {
                            System.out.println("divisor:" + divisor);
                            if (numeroevalu % divisor == 0) {
                                contadorDivisionesExactas++;
                                System.out.println("contador" + contadorDivisionesExactas);
                            }
                            divisor++;
                            System.out.println("divisor:" + divisor);
                        } while (divisor <= numeroevalu);
                        if (contadorDivisionesExactas == 2) {
                            System.out.println("El número ingresado es primo.");
                        } else {
                            System.out.println("El número ingresado NO es primo.");
                        }
                        break;

                }

            }
        } while (opcionprioritaria != 6);
    }
}

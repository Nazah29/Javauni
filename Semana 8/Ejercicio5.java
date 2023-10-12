

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Programa de reserva de butacas de cine
        Scanner lector = new Scanner(System.in);

        String nombre,hora, dia ="",respuesta;
        String Menu = """
                ************
                RESERVACION DE BUTACA EN CINEPLANET
                ************
                   DIAS             DESCUENTOS
                [1]Lunes                0%
                [2]Martes              50%
                [3]Miercoles            0%
                [4]Jueeves             50%
                [5]Viernes              0%
                [6]Sabado              50%
                [7]Domingo              0%
                ************
                Precios por butaca:    100 soles
                ************""";

        int cantidadAsientos, opcion,auxiliar= 0,precio =100;
        double pago = 0;
        do {

            do {
                System.out.println("Ingrese una opcion del dia para la reservacion de su butaca");
                System.out.println(Menu);
                opcion = lector.nextInt();
                lector.nextLine();

            }while (opcion < 1 || opcion >7 );



            System.out.println("Inhrese el nombre del cliente");
            nombre = lector.nextLine();

            do {
                System.out.println("Ingrese la cantidad de butaca (0 - 100)");
                cantidadAsientos = lector.nextInt();
                lector.nextLine();

            }while (cantidadAsientos < 1 || cantidadAsientos >100 );
            do {
                System.out.println("Ingrese la Hora  (8:00 - 17:00) ");
                hora = lector.nextLine();

                switch (hora) {
                    case "8:00", "9:00", "10:00", "11:00", "12:00":
                        System.out.println("Gracias por reservar su butaca\n");
                        auxiliar = 1;
                        break;
                    case "13:00", "14:00", "15:00", "16:00", "17:00":
                        System.out.println("Gracias por reservar su butaca\n ");
                        auxiliar = 1;
                        break;
                    default:
                        System.out.println("Vuelva a interntarlo");
                        opcion = 0;
                }
            }while (auxiliar == 0);

            switch (opcion){
                case 1:
                    dia = "Lunes";
                    pago = precio;
                    break;
                case 2:
                    dia = "Martes";
                    pago = (double) (precio * 50) /100;
                    break;
                case 3:
                    dia = "Miercoles";
                    pago = precio;
                    break;
                case 4:
                    dia = "Jueves";
                    pago = (double) (precio * 50) /100;
                    break;
                case 5:
                    dia = "Viernes";
                    pago = precio;
                    break;
                case 6:
                    dia = "Sabado";
                    pago = (double) (precio * 50) /100;
                    break;
                case 7:
                    dia ="Domingo";
                    pago = precio;
                    break;
            }

            System.out.printf("""
                    ###############################
                          REPORTE DE BUTACA
                    ###############################
                    Nombre:  %s
                    DIA:     %s
                    Cantidad de butacas: %d
                    Precio:  %.2f
                    HOra:    %s
                    ###############################\n""", nombre,dia,cantidadAsientos,pago,hora);

            do {
                System.out.println("¿Desea reservar otra butaca? (si/no)");
                respuesta = lector.nextLine();
            }while (!((respuesta.equalsIgnoreCase("si") || (respuesta.equalsIgnoreCase("no")))));

        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("Gracias por reserva su butaca");
    }
}
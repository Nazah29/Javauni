import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // programa de reservacion de citas
        Scanner lector = new Scanner(System.in);
        int opcion, auxiliar = 0;
        String hora, dia = "", nombre;
        String respuesta;
        String Menu = """
                ******
                 DIAS DE LA SEMANA
                ******
                [1]Lunes
                [2]Martes
                [3]Miercoles
                [4]Jueeves
                [5]Viernes
                [6]Sabado
                [7]Domingo
                ******""";

        do {

            do {
                 System.out.println("Ingrese una opcion del dia para la reservacion de su cita");
                 System.out.println(Menu);
                 opcion = lector.nextInt();
                 lector.nextLine();

             }while (opcion < 1 || opcion >7 );

            System.out.println("Inhrese el nombre del paciente");
            nombre = lector.nextLine();

             do {
                 System.out.println("Ingrese la Hora en la que desea su cita (8:00 - 17:00) ");
                 hora = lector.nextLine();

                 switch (hora) {
                     case "8:00", "9:00", "10:00", "11:00", "12:00":
                         System.out.println("Gracias por reservar su cita\n");
                         auxiliar = 1;
                         break;
                     case "13:00", "14:00", "15:00", "16:00", "17:00":
                         System.out.println("Gracias por reservar su cita\n ");
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
                     break;
                 case 2:
                     dia = "Martes";
                     break;
                 case 3:
                     dia = "Miercoles";
                     break;
                 case 4:
                     dia = "Jueves";
                     break;
                 case 5:
                     dia = "Viernes";
                     break;
                 case 6:
                     dia = "Sabado";
                     break;
                 case 7:
                     dia ="Domingo";
                     break;
             }

            System.out.printf("""
                    ###############################
                    REPORTE DE LA CITA PSICOLOGICA
                    ###############################
                    Nombre:  %s
                    DIA:     %s
                    HOra:    %s
                    ###############################\n""", nombre,dia,hora);

            do {
                System.out.println("¿Desea reservar otra cita? (si/no)");
                respuesta = lector.nextLine();
            }while (!((respuesta.equalsIgnoreCase("si") || (respuesta.equalsIgnoreCase("no")))));

        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("Gracias por reserva su cita");

    }
}
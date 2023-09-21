import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        short opcion;
        byte numeroCuotas;
        double monto, montoalm;

        System.out.println("\"Ingrese el monto de la deuda que tiene con el banco\"");
        monto=lector.nextDouble();

        System.out.println("""
                -----------------------------------------------------------
                SELECCIONE QUE ACCION QUIERE HACER EN EL BANCO CON SU DEUDA
                -----------------------------------------------------------
                [1] Pagar al contado
                [2] Pagar por cuotas
                [3] No pagar
                -----------------------------------------------------------""");
        opcion = lector.nextShort();

        switch (opcion) {
            case 1: System.out.println("Gracias por pagar su deuda de "+ monto+ " soles");
                break;
            case 2: System.out.println("""
                    -------------------------------------------
                    INGRESE EL NUMERO DE CUOTAS QUE DESEA PAGAR
                    -------------------------------------------
                    [1] 3 meses
                    [2] 6 meses
                    [3] 9 meses
                    -------------------------------------------""");
                numeroCuotas = lector.nextByte();

                switch (numeroCuotas) {
                    case 1:
                        montoalm = (monto/3);
                        System.out.println("Le toca pagar " +montoalm + " soles cada mes");
                        break;
                    case 2:
                        montoalm= monto/6;
                        System.out.println("Le toca pagar " +montoalm+ " soles cada mes");
                        break;
                    case 3:
                        montoalm= monto/9;
                        System.out.println("Le toca pagar " +montoalm+ " soles cada mes");
                        break;
                    default:
                        System.out.println("Error, opcion no valida \n Vuelva a intentarlo");
                        break;
                }
                break;
            case 3:
                System.out.println("Usted a decidido no pagar, gracias por su visita");
                break;
            default:
                System.out.println("Error, opcion no valida \n Vuelva a intentarlo");
                break;
        }

    }
}

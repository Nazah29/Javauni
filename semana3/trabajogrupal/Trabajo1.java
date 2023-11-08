package semana3.trabajogrupal;
import java.util.Scanner;

public class Trabajo1 {
    public static void main(String[] args) {
        int operacion, num1 ,num2;
        Scanner lector = new Scanner(System.in);   
        System.out.println("""
            Ingrese los datos de operacion que desea realizar 
            [1] Suma 
            [2] Resta
            """);
        operacion=lector.nextInt();
        if(operacion==1){
        System.out.println("Ingrese los dos valores respectivamente");
        num1=lector.nextInt();
        num2=lector.nextInt();
        operacion=(num1+num2);
        System.out.println("Su resultado es " + operacion);
        }else{
            if(operacion==2){
                System.out.println("Ingrese los dos valores respectivamente");
                num1=lector.nextInt();
                num2=lector.nextInt();
                operacion=(num1-num2);
                System.out.println("Su resultado es " + operacion);

        }else{
            System.out.println("Datos invalidos");


    }


    }
}
}
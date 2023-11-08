package trabajogrupal;

import java.util.Scanner;

public class Trabajo2 {
    public static void main(String[] args) {
        int operacion, num1 ,num2;
        Scanner lector = new Scanner(System.in);   
        System.out.println("""
            Ingrese los datos de operacion que desea realizar 
            [1] Suma 
            [2] Resta
            [3] Multiplicacion
            [4] Division
            """);
        operacion=lector.nextInt();
        System.out.println("Ingrese los dos valores respectivamente");
            num1=lector.nextInt();
            num2=lector.nextInt();
        if(operacion==1){
            operacion=(num1+num2);
            System.out.println("Su resultado es " + operacion);
        }else{
            if(operacion==2){
                operacion=(num1-num2);
                System.out.println("Su resultado es " + operacion);
        }else{
            if(operacion==3){
                operacion=(num1*num2);
                System.out.println("Su resultado es " + operacion);
        }else{
            if(operacion==4 && num1>num2){
                operacion=(num1/num2);
                System.out.println("Su resultado es " + operacion);                

        }else{
            System.out.println("Datos invalidos");


    }


    }
    }
}
}
}
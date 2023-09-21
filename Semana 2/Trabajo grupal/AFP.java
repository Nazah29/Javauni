import java.util.Scanner;

public class AFP {
    public static void main(String[] args) {
        double sueldo,sueldoaumento,sueldoafp,sueldobenefico,sueldofinal;
        Scanner lector= new Scanner(System.in);
       System.out.println("Ingrese el sueldo que recibe mensualmente");
       sueldo = lector.nextDouble();
       sueldoaumento = (sueldo*8/100);
       sueldobenefico = (sueldoaumento+sueldo);
        sueldoafp =(sueldobenefico*3.5/100);
       sueldofinal = (sueldoafp+sueldobenefico);
       System.out.println("Su sueldo final es " + sueldofinal);
    }
    
}

import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
/**
 * Método principal a modificar. Debe incluir las condiciones 
 * necesarias para indicar correctamente si el año es bisiesto o no
 */
    public static void main(String[] args) {
        bisiesto();
    }
    
    public static void bisiesto() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print(year + " es bisiesto");
            } else {
                if (year % 400 == 0) {
                    System.out.print(year + " es bisiesto");
                } else {
                    System.out.print(year + " no es bisiesto");
                }
            }
        } else {
            System.out.print(year + " no es bisiesto");
        }
    }
}

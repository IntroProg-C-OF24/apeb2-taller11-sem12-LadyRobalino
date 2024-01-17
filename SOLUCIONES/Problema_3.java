/*
 Problema 03
Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. 
Si el promedio es: 
De 0 a 5 el promedio cualitativo es Regular 
De 5.1 a 8 el promedio es Bueno 
De 8.1 a 9 el promedio es Muy Bueno 
De 9.1 a 10 el promedio es Sobresaliente. 
A la función se la debe llamar desde un método principal. 
Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 */
import java.util.Scanner;
public class Problema_3 {
        public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        double num1, num2, num3, num4;
        System.out.print("Ingrese la nota 1: ");
        num1 = lady.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        num2 = lady.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        num3 = lady.nextDouble();
        System.out.print("Ingrese la nota 4: ");
        num4 = lady.nextDouble();
        System.out.println("El promedio cualitativo es: " + calificacionCuali(num1, num2, num3, num4));
    }

    static String calificacionCuali(double num1, double num2, double num3, double num4) {
        double prom = (num1 + num2 + num3 + num4) / 4;
        String cualitativo;

        if (prom <= 5) {
            cualitativo = "Regular";
        } else if (prom <= 8) {
            cualitativo = "Bueno";
        } else if (prom <= 9) {
            cualitativo = "Muy bueno";
        } else {
            cualitativo = "Sobresaliente";
        }
        return cualitativo;        
    }   
}
/*
EJECUCION:
Ingrese la nota 1: 10
Ingrese la nota 2: 10
Ingrese la nota 3: 9
Ingrese la nota 4: 5
El promedio cualitativo es: Muy bueno
*/
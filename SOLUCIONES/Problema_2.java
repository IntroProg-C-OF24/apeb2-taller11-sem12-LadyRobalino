/*
Problema 02
Generar una solución que implemente 3 procedimientos. 
Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. 
Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. 
Se debe invocar a los procedimientos desde un método principal; 
Si el usuario ingresa */
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elegirNum;
        double lado, baseTri, alturaTri, baseRec, alturaRec;

        System.out.println("Escoga que desea calcular:");
        System.out.println("1. Area de un Cuadrado");
        System.out.println("2. Area de un Triangulo");
        System.out.println("3. Area de un Rectangulo");
        elegirNum = scanner.nextInt();

        switch (elegirNum) {
            case 1 -> {
                System.out.println("Ingrese el lado del cuadrado:");
                lado = scanner.nextDouble();
                System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
            }
            case 2 -> {
                System.out.println("Ingrese la base del triangulo:");
                baseTri = scanner.nextDouble();
                System.out.println("Ingrese la altura del triangulo:");
                alturaTri = scanner.nextDouble();
                System.out.println("El area del triangulo es: " + areaTriangulo(baseTri, alturaTri));
            }
            case 3 -> {
                System.out.println("Ingrese la base del rectangulo:");
                baseRec = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectangulo:");
                alturaRec = scanner.nextDouble();
                System.out.println("El area del rectangulo es: " + areaRectangulo(baseRec, alturaRec));
            }
            default -> System.out.println("Solo se permite numeros del 1 al 3. Ingrese nuevamente:");
        }
    }

    static double areaCuadrado(double lado) {
        double areaTotal;
        areaTotal = lado * lado;
        return areaTotal;
    }
    static double areaTriangulo(double baseTri, double alturaTri) {
        double areaTotal;
        areaTotal = (baseTri * alturaTri) / 2;
        return areaTotal;
    }
    static double areaRectangulo(double baseRec, double alturaRec) {
        double areaTotal;
        areaTotal = baseRec * alturaRec;
        return areaTotal;
    }   
}
/*
EJECUCION:
Escoga que desea calcular:
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
1
Ingrese el lado del cuadrado:
5
El area del cuadrado es: 25.0


Escoga que desea calcular:
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
2
Ingrese la base del triangulo:
4
Ingrese la altura del triangulo:
3
El area del triangulo es: 6.0

Escoga que desea calcular:
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
3
Ingrese la base del rectangulo:
8
Ingrese la altura del rectangulo:
5
El area del rectangulo es: 40.0


Escoga que desea calcular:
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
4
Solo se permite numeros del 1 al 3. Ingrese nuevamente:
*/
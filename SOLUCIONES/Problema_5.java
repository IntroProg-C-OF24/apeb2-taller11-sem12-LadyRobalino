/*
Problema 5
Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; 
mismo que se lo recibe como parámetro.
 */
import java.util.Random;

public class Problema_5 {

    static int lim = 2;
    static int[][] matriz = new int[lim][lim];

    public static void main(String[] args) {
        llenarMatriz();
        System.out.println("Matriz Generada:");
        presentarMatriz();
        System.out.println("La suma de los números es: " + sumarNumeros());
        System.out.println("La resta de los números es: " + restarNumeros());
        System.out.println("La multiplicación de los números es: " + multiplicarNumeros());
    }

    static void llenarMatriz() {
        Random random = new Random();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    static void presentarMatriz() {
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static int sumarNumeros() {
        int sumaTotal = 0;
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        return sumaTotal;
    }

    static int restarNumeros() {
        int restaTotal = 0;
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                restaTotal -= matriz[i][j];
            }
        }
        return restaTotal;
    }

    static int multiplicarNumeros() {
        int multiplicacionTotal = 1;
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                multiplicacionTotal *= matriz[i][j];
            }
        }
        return multiplicacionTotal;
    }

}
/*
EJECUCION:
Matriz Generada:
3 | 8 | 
2 | 6 | 
La suma de los números es: 19
La resta de los números es: -19
La multiplicación de los números es: 288
*/

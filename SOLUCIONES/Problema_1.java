/*
Problema 1 Generar los procedimientos y/o funciones que impriman los valor pares,
impares y el promedio de un arreglo bidimensional.
 */
import java.util.Random;

public class ParesImpPro_1 {

    static int filas = 3;
    static int columnas = 3;
    static int[][] numeros = new int[filas][columnas];

    public static void main(String[] args) {
        generarMatriz();
        System.out.println("Los números de la matriz son: ");
        devolverMatriz();
        System.out.println("Los valores pares son: ");
        imprimirValores(valoresPares());
        System.out.println("Los valores impares son: ");
        imprimirValores(valoresImpares());
        System.out.println("El promedio es: " + promedio());
    }

    static void generarMatriz() {
        Random rand = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = rand.nextInt(10);
            }
        }
    }

    static void devolverMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static int[] valoresPares() {
        int[] pares = new int[filas * columnas];
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (numeros[i][j] % 2 == 0) {
                    pares[index++] = numeros[i][j];
                }
            }
        }
        return pares;
    }

    static int[] valoresImpares() {
        int[] impares = new int[filas * columnas];
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (numeros[i][j] % 2 != 0) {
                    impares[index++] = numeros[i][j];
                }
            }
        }
        return impares;
    }

    static void imprimirValores(int[] valores) {
        for (int valor : valores) {
            if (valor != 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();
    }

    static double promedio() {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += numeros[i][j];
                contador++;
            }
        }
        return (double) suma / contador;
    }
}
/*
EJECUCUON:
Los números de la matriz son: 
5 | 5 | 6 | 
9 | 3 | 4 | 
1 | 7 | 6 | 
Los valores pares son: 
6 4 6 
Los valores impares son: 
5 5 9 3 1 7 
El promedio es: 5.1
*/

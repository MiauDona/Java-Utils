package miau.dona;

import java.util.Random;
import java.util.Scanner;

public class UtilsJava {
    // Crea un random
    public static final Random RANDOM = new Random();

    /**
     * Pide una String por consola al usuario
     * @param mensaje Mensaje que se va a introducir para pedir el String
     * @return Devuelve la String que introduce el usuario
     */
    public static String pedir(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    /**
     * Pide un numero Int por consola al usuario
     * @param mensaje Mensaje que se va a introducir para pedir el String
     * @return Devuelve el Int que introduce el usuario
     */
    public static int pedirInt(String mensaje) {
        return Integer.parseInt(pedir(mensaje));
    }

    /**
     * Pide un Double por consola al usuario
     * @param mensaje Mensaje que se va a introducir para pedir el Double
     * @return Devuelve un Double que introduce el usuario
     */
    public static double pedirDouble(String mensaje) {
        return Double.parseDouble(pedir(mensaje));
    }

    /**
     * Pide un Float por consola al usuario
     * @param mensaje Mensaje que se va a introducir para pedir el Double
     * @return Devuelve un Double que introduce el usuario
     */
    public static float pedirFloat(String mensaje) {
        return Float.parseFloat(pedir(mensaje));
    }

    /**
     * Pide 2 numeros, el mínimo y el máximo al usuario por consola
     * @return Devuelve el número random entre los 2 numeros introducidos, minimos y maximos incluidos
     */
    public static int pedirNumerosParaRandom() {
        int min = pedirInt("Vamos a hacer un número aleatorio en un rango entre 2 numeros. Dime el número mínimo");
        int max = pedirInt("Dime el número máximo");

        // Antigua formula
        // return Math.random() * (max - min) + min;
        return RANDOM.nextInt(min, max + 1);
    }

    /**
     * Comprueba si el numero introducido es primo
     * @param numeroIntroducido Numero Int a comprobar que sea primo
     * @return Devuelve un boolean, true si es primo y si no lo es, false
     */
    public static boolean esNumeroPrimo(int numeroIntroducido) {
        boolean esPrimo = true;

        if (numeroIntroducido == 0) {
            return false;
        }
        for (int i = numeroIntroducido-1; i > 1; i--) {
            if (numeroIntroducido % i == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }

    /**
     * Muestra el array entero de int
     * @param array Array de Int para mostrar
     */
    public static void mostrarArrayInts(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Muestra el array entero de String
     * @param array Array de String para mostrar
     */
    public static void mostrarArrayStrings(String[] array) {
        for (String valor : array) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Muestra el array entero de boolean
     * @param array Array de boolean para mostrar
     */
    public static void mostrarArrayBooleans(boolean[] array) {
        for (boolean valor : array) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Convierte una String a un Array de Char y lo muestra
     * @param string String que quieres mostrar en forma de Char
     * @return Array de Char proveniente de la String introducida
     */
    public static char[] mostrarStringConvertidoACharArray(String string) {
        for (char valor : string.toCharArray()) {
            System.out.print(valor + " ");
        }
        return string.toCharArray();
    }

    /**
     * Crea un array con numeros aleatorios entre 2 números
     * @param tamanio El tamaño del array (int)
     * @param min El numero minimo para los aleatorios (int)
     * @param max El numero maximo para los aleatorios (int)
     * @return El array con los numeros aleatorios (int[])
     */
    public static int[] crearArrayIntsAleatoriosEntreNumeros(int tamanio, int min, int max) {
        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(min,max+1);
        }

        return array;
    }

    /**
     * Crea una matriz con números aleatorios entre 2 números
     * @param filas Fila para acceder a la posición querida
     * @param columnas Columna para acceder a la posición querida
     * @param min El número mínimo para los aleatorios
     * @param max El número máximo para los aleatorios
     * @return La matriz con los valores aleatorios rellena
     */
    public static int[][] crearMatrizAleatoriosEntreNumeros(int filas, int columnas, int min, int max) {
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = RANDOM.nextInt(min,max+1);
            }
        }
        
        return matriz;
    }

    /**
     * Muestra la matriz
     * @param matriz matriz a mostrar
     */
    public static void mostrarMatriz(int[][] matriz) {
        System.out.print("{" );
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        
        System.out.println("\n}");
    }

    /**
     * Muestra la diagonal principal desde la esquina izquierda
     * @param matriz matriz a mostrar
     */
    public static void mostrarMatrizDiagonalIzquierdaADerecha(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }

    /**
     * Muestra la diagonal principal desde la esquina derecha
     * @param matriz matriz a mostrar
     */
    public static void mostrarMatrizDiagonalDerechaAIzquierda(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[i][matriz[i].length-1-i] + " "); //?? nose si funciona
        }
    }

    /**
     * Muestra la columna indicada
     * @param matriz matriz de la que se va a mostrar la columna
     * @param columna columna a mostrar
     */
    public static void mostrarMatrizColumna (int[][] matriz, int columna) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println(matriz[i][columna-1] + " ");
        }
    }

    /**
     * Muestra la fila que quieras de una matriz
     * @param matriz matriz de la que se va a mostrar la columna
     * @param fila fila a mostrar
     */
    public static void mostrarMatrizFila (int[][] matriz, int fila) {
        for (int i = 0; i < matriz[fila-1].length; i++) {
            System.out.println(matriz[fila-1][i] + " ");
        }
    }

    /**
     * Comprueba si algun valor de la matriz es nulo (o igual a 0)
     * @param matriz Matriz a comprobar
     * @return True si es dispersa, de lo contrario false
     */
    public static boolean comprobarMatrizDispersa(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Rota la matriz 90º
     * @param matriz Matriz a comprobar
     * @return la matriz rotada
     */
    public static int[][] rotarMatrizValores(int matriz[][]) {
        int[][] matrizRotada = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizRotada[j][i] = matriz[i][j];
            }
        }
        
        return matrizRotada;
    }
}

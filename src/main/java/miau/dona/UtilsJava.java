package miau.dona;

import java.util.Random;
import java.util.Scanner;

public class UtilsJava {
    // Crea un random
    public static final Random RANDOM = new Random();

    /**
     * Pide una String por consola al usuario
     *
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
     *
     * @param mensaje Mensaje que se va a introducir para pedir el String
     * @return Devuelve el Int que introduce el usuario
     */
    public static int pedirInt(String mensaje) {
        return Integer.parseInt(pedir(mensaje));
    }

    /**
     * Pide un Double por consola al usuario
     *
     * @param mensaje Mensaje que se va a introducir para pedir el Double
     * @return Devuelve un Double que introduce el usuario
     */
    public static double pedirDouble(String mensaje) {
        return Double.parseDouble(pedir(mensaje));
    }

    /**
     * Pide un Float por consola al usuario
     *
     * @param mensaje Mensaje que se va a introducir para pedir el Double
     * @return Devuelve un Double que introduce el usuario
     */
    public static float pedirFloat(String mensaje) {
        return Float.parseFloat(pedir(mensaje));
    }

    /**
     * Pide 2 numeros, el mínimo y el máximo al usuario por consola
     *
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
     * Muestra el array entero de int
     *
     * @param array Array de Int para mostrar
     */
    public static void mostrarArrayInts(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    /**
     * Muestra el array entero de String
     *
     * @param array Array de String para mostrar
     */
    public static void mostrarArrayStrings(String[] array) {
        for (String valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    /**
     * Muestra el array entero de boolean
     *
     * @param array Array de boolean para mostrar
     */
    public static void mostrarArrayBooleans(boolean[] array) {
        for (boolean valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    /**
     * Convierte una String a un Array de Char y lo muestra
     *
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
     *
     * @param tamanio El tamaño del array (int)
     * @param min     El numero minimo para los aleatorios (int)
     * @param max     El numero maximo para los aleatorios (int)
     * @return El array con los numeros aleatorios (int[])
     */
    public static int[] crearArrayIntsAleatoriosEntreNumeros(int tamanio, int min, int max) {
        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(min, max + 1);
        }

        return array;
    }

    /**
     * Crea una matriz con números aleatorios entre 2 números
     *
     * @param filas    Fila para acceder a la posición querida
     * @param columnas Columna para acceder a la posición querida
     * @param min      El número mínimo para los aleatorios
     * @param max      El número máximo para los aleatorios
     * @return La matriz con los valores aleatorios rellena
     */
    public static int[][] crearMatrizAleatoriosEntreNumeros(int filas, int columnas, int min, int max) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = RANDOM.nextInt(min, max + 1);
            }
        }

        return matriz;
    }

    /**
     * Muestra la matriz
     *
     * @param matriz matriz a mostrar
     */
    public static void mostrarMatriz(int[][] matriz) {
        System.out.print("{");

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
     *
     * @param matriz matriz a mostrar
     */
    public static void mostrarMatrizDiagonalIzquierdaADerecha(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }

    /**
     * Muestra la diagonal principal desde la esquina derecha
     *
     * @param matriz matriz a mostrar
     */
    public static void mostrarMatrizDiagonalDerechaAIzquierda(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[i][matriz[i].length - 1 - i] + " "); //?? nose si funciona
        }
    }

    /**
     * Muestra la columna indicada
     *
     * @param matriz  matriz de la que se va a mostrar la columna
     * @param columna columna a mostrar
     */
    public static void mostrarMatrizColumna(int[][] matriz, int columna) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println(matriz[i][columna - 1] + " ");
        }
    }

    /**
     * Muestra la fila que quieras de una matriz
     *
     * @param matriz matriz de la que se va a mostrar la columna
     * @param fila   fila a mostrar
     */
    public static void mostrarMatrizFila(int[][] matriz, int fila) {
        for (int i = 0; i < matriz[fila - 1].length; i++) {
            System.out.println(matriz[fila - 1][i] + " ");
        }
    }

    /**
     * Comprueba si algun valor de la matriz es nulo (o igual a 0)
     *
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
     *
     * @param matriz Matriz a comprobar
     * @return la matriz rotada
     */
    public static int[][] rotarMatriz(int matriz[][]) {
        int[][] matrizRotada = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizRotada[j][i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }


    /**
     * Crea una submatriz a partir de una matriz
     *
     * @param filaArribaIzq       Fila de la esquina de arriba a la izquierda
     * @param columnaArribaIzq    Columna de la esquina de arriba a la izquierda
     * @param filaAbajoDerecha    Fila de la esquina de abajo a la derehca
     * @param columnaAbajoDerecha Columna de la esquina de abajo a la derecha
     * @param matriz              Matriz de la que se va a sacar la submatriz
     * @return Submatriz de las coordenadas
     */
    public static int[][] crearSubmatrizDeMatriz(int filaArribaIzq, int columnaArribaIzq, int filaAbajoDerecha, int columnaAbajoDerecha, int[][] matriz) {
        if (filaArribaIzq > matriz.length || filaArribaIzq > filaAbajoDerecha || filaArribaIzq < 0) {
            System.out.println("Fila arriba derecha mala");
            return new int[][]{};
        }
        if (columnaArribaIzq > matriz[0].length || columnaArribaIzq > columnaAbajoDerecha || columnaArribaIzq < 0) {
            System.out.println("Columna arriba izquierda mala");
            return new int[][]{};
        }
        if (filaAbajoDerecha > matriz.length || filaAbajoDerecha < filaArribaIzq || filaAbajoDerecha < 0) {
            System.out.println("Fila abajo derecha mala");
            return new int[][]{};
        }
        if (columnaAbajoDerecha > matriz[0].length || columnaAbajoDerecha < columnaArribaIzq || columnaAbajoDerecha < 0) {
            System.out.println("Columna abajo derecha mala");
            return new int[][]{};
        }

        int tamanofila = filaAbajoDerecha - filaArribaIzq;
        int tamanocolumna = columnaAbajoDerecha - columnaArribaIzq;
        int[][] nuevoArray = new int[tamanofila + 1][tamanocolumna + 1];


        int fila = 0;
        int columna = 0;
        for (int i = filaArribaIzq; i <= filaAbajoDerecha; i++) {
            for (int j = columnaArribaIzq; j <= columnaAbajoDerecha; j++) {
                nuevoArray[fila][columna] = matriz[i][j];
                columna++;
            }
            columna = 0;
            fila++;
        }

        return nuevoArray;
    }

    /**
     * Comprueba si un número es capicúa
     *
     * @param number Número que se comprueba si es capicúa
     * @return Devuelve true si es capicúa
     */
    public static boolean esCapicua(int number) {
        // If the number is less than 0 it's not capicua
        if (number < 0) {
            return false;

            // If the number has less than 2 digits it's not capicua, and 10 it's not capicua so it's not even tried
        } else if (number < 11) {
            return true;
        }

        // If the digit isn't the same as it's correspondent digit
        char[] charNumber = String.valueOf(number).toCharArray();

        for (int i = 0; i < charNumber.length; i++) {
            if (charNumber[i] != charNumber[charNumber.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Comprueba si un número es primo
     *
     * @param number Numero a comprobar si es primo
     * @return Devuelve true si es primo
     */
    public static boolean esPrimo(int number) {
        if (number == 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Devuelve la longitud de un número
    public static int digits(int number) {
        return String.valueOf(number).length();
    }

    /**
     * Dar la vuelta a un número
     *
     * @param number Número que se le da la vuelta
     * @return Número volteado
     */
    public static int flip(int number) {
        char[] charNumber = String.valueOf(number).toCharArray();
        char[] charNumberInvertido = new char[charNumber.length];

        for (int i = 0; i < charNumber.length; i++) {
            charNumberInvertido[i] = charNumber[charNumber.length - 1 - i];
        }

        String stringNumberInvertido = new String(charNumberInvertido);

        return Integer.parseInt(stringNumberInvertido);
    }

    /**
     * Devuelve el dígito que está en una posición de una palabra
     *
     * @param number   Número
     * @param position Posición que se va a comprobar
     * @return Dígito de la posición
     */
    public static int digitN(int number, int position) {
        return String.valueOf(number).charAt(position);
    }

    /**
     * Mira la posición de un dígito dentro de un número
     *
     * @param number     Número completo que se va a comprobar
     * @param occurrence Dígito dentro del número
     * @return Posición de un digito
     */
    public static int digitPosition(int number, int occurrence) {
        char[] charNumber = String.valueOf(number).toCharArray();

        for (int i = 0; i < charNumber.length; i++) {
            if (charNumber[i] == charNumber[occurrence]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Elimina dígitos de un número desde atrás
     *
     * @param number Número del que se van a eliminar dígitos
     * @param times  Veces que se van a eliminar los dígitos
     * @return Número con los digitos ya eliminados
     */
    public static int eliminarDigito(int number, int times) {
        if (times < 1) {
            return number;
        }

        char[] charNumber = String.valueOf(number).toCharArray();
        int position;

        for (int i = 0; i < times; i++) {
            position = charNumber.length - 1 - i;
            charNumber[position] = 'a';
        }

        String stringNumberRemoved = "";

        for (char c : charNumber) {
            if (c != 'a') {
                stringNumberRemoved = stringNumberRemoved + c;
            }
        }
        return Integer.parseInt(stringNumberRemoved);
    }

    /**
     * Añadir un numero atrás
     *
     * @param number Numero al que se le va a añadir algo
     * @param digit  Digito que se va a añadir
     * @return Numero con el digito añadido
     */
    public static int anadirDigito(int number, int digit) {
        if (digit < 1 || digit > 9) {
            return number;
        }

        char[] charNumber = new char[String.valueOf(number).length() + 1];

        for (int i = 0; i < charNumber.length - 1; i++) {
            charNumber[i] = String.valueOf(number).charAt(i);
        }

        charNumber[charNumber.length - 1] = Integer.toString(digit).charAt(0);
        return Integer.parseInt(String.valueOf(charNumber));
    }

    /**
     * Corta un trozo de números entre 2 dígitos
     *
     * @param number Número a cortar
     * @param start  Dígito por el que se empieza a cortar
     * @param end    Dígito en el que acaba de cortar
     * @return Número cortado
     */
    public static int cortarNumero(int number, int start, int end) {
        char[] charNumber = String.valueOf(number).toCharArray();

        if (start > end || end > charNumber.length || start < 0) {
            return number;
        }

        String snippetNumber = "";

        for (int i = start; i < end; i++) {
            snippetNumber += charNumber[i];
        }

        return Integer.parseInt(snippetNumber);
    }

    /**
     * Junta 2 números
     *
     * @param number1 Número que va a estar al principio
     * @param number2 Número que va a estar al final
     * @return Número completo que junta ambos números
     */
    public static int juntarNumeros(int number1, int number2) {
        String numbers = String.valueOf(number1) + String.valueOf(number2);

        return Integer.parseInt(numbers);
    }

    /**
     * Comprueba si un número es perfecto
     * @param numeroIntroducido Número a comprobar
     * @return True si es perfecto
     */
    public static boolean esNumeroPerfecto(int numeroIntroducido) {
        int n;
        int formulaPerfecto;

        for (int i = 1; i < numeroIntroducido; i++) {
            n = i;
            formulaPerfecto = (int) ((Math.pow(2, n) - 1) * Math.pow(2, n - 1));

            if (formulaPerfecto == numeroIntroducido) {
                return true;
            }
        }
        return false;
    }

    /**
     * Printea la serie de fibonacci tantos numeros como uno pida
     * @param cuantosNumeros Numeros que se van a printear
     */
    public static void fibonacci(int cuantosNumeros) {
        int num1 = 0;
        int num2 = 1;

        System.out.println(num1 + "\n" + num2);

        int cifraFibonacci;

        while (cuantosNumeros > 0) {
            cifraFibonacci = num1 + num2;
            num1 = num2;
            num2 = cifraFibonacci;
            cuantosNumeros--;
            System.out.println(cifraFibonacci);
        }
    }

    /**
     * Suma los dígitos de un único número
     *
     * @param miNumero Número del que se van a sumar sus dígitos
     * @return Suma total de los dígitos
     */
    public static int sumaDigitos(int miNumero) {
        String numeroString = String.valueOf(miNumero);
        int suma = 0;

        for (char i : numeroString.toCharArray()) {
            suma = Integer.parseInt(String.valueOf(i)) + suma;
        }

        return suma;
    }

    /**
     * Convierte a binario un número
     *
     * @param numero Número a convertir
     * @return Numero en binario
     */
    public static int numeroBinario(int numero) {
        int numDividido = numero;
        int digitoBinario;

        if (numero < 0) {
            System.out.println("Es negativo, error");
            return numero;
        }
        if (numero == 1 || numero == 0) {
            return numero;
        }

        String miResultado ="";

        while (numDividido != 1) {
            digitoBinario = numDividido % 2;
            numDividido /= 2;
            miResultado += digitoBinario;

            if (numDividido == 1) {
                miResultado = numDividido + miResultado;
            }
        }

        return Integer.parseInt(miResultado);
    }

    /**
     * Ordenar con bubble sort
     *
     * @param array Array a ordenar
     * @return Array ordenado
     */
    public static int[] bubbleSort(int[] array) {
        int cambio;
        int[] arrayBubble = new int[array.length];
        System.arraycopy(array, 0, arrayBubble, 0, array.length);

        // La i en este caso es el numero de numeros grandes ordenados al final
        for (int i = 0; i < arrayBubble.length; i++) {
            for (int j = 0; j < arrayBubble.length-1-i; j++) {
                if (arrayBubble[j] > arrayBubble[j+1]) {
                    cambio = arrayBubble[j+1];
                    arrayBubble[j+1] = arrayBubble[j];
                    arrayBubble[j] = cambio;
                }
            }
        }

        return arrayBubble;
    }

    /**
     * Ordenar con insertion sort
     *
     * @param array Array a ordenar
     * @return Array ordenado
     */
    public static int[] insertionSort(int[] array) {
        int cambio;
        int[] arrayInsertion = new int[array.length];
        System.arraycopy(array, 0, arrayInsertion, 0, array.length);

        for (int i = 1; i < arrayInsertion.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayInsertion[j] < arrayInsertion[j-1] ) {
                    cambio = arrayInsertion[j-1];
                    arrayInsertion[j-1] = arrayInsertion[j];
                    arrayInsertion[j] = cambio;
                }
            }
        }

        return arrayInsertion;
    }

    /**
     * Ordena con shell sort
     *
     * @param array array a ordenar
     * @return Array ordenado
     */
    public static int[] shellSort(int[] array) {
        int longitud = array.length;

        int[] arrayShell = new int[array.length];
        System.arraycopy(arrayShell, 0, arrayShell, 0, array.length);
        // j es la iteracion actual
        // k es la iteracion anterior
        for (int i = longitud / 2; i > 0; i /= 2) {
            for (int j = i; j < longitud; j++) {
                int valorActual = arrayShell[j];
                int k;

                for (k = j; k >= i && arrayShell[k - i] > valorActual; k -= i) {
                    arrayShell[k] = arrayShell[k - i];
                }

                arrayShell[k] = valorActual;
            }
        }

        return arrayShell;
    }

    // Encuentra la suma contigua más grande de números teniendo en cuenta que hay
    // números positivos y negativos. Muestra la lista de números contiguos dentro de la lista
    public static int kadaneSumaContigua(int[] array) {
        int sumaActual = 0;
        int maxSuma = Integer.MIN_VALUE;
        int inicio = 0;
        int fin = 0;
        int inicioTemporal = 0;
        int longitud = array.length;

        for (int i = 0; i < longitud; i++) {
            sumaActual += array[i];

            if (sumaActual < 0) {
                inicioTemporal = i+1;
            }

            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
                fin = i;
                inicio = inicioTemporal;
            }

            if (sumaActual < 0) {
                sumaActual = 0;
            }
        }

        int[] numerosSumados = new int[fin-inicio+1];

        for (int i = 0; i <= fin-inicio; i++) {
            numerosSumados[i] = array[inicio+i];
        }

        mostrarArrayInts(numerosSumados);

        return maxSuma;
    }

    /**
     * Une dos arrays
     * @param array1 Array que va a estar al principio
     * @param array2 Array que va a estar al final
     * @return Array con los dos arrays unidos
     */
    public static int[] unirArraysInt(int[] array1, int[] array2) {
        int[] arrayResultado = new int[array1.length+array2.length];

        for (int i = 0; i < arrayResultado.length; i++) {
            if (i < array1.length) {
                arrayResultado[i] = array1[i];
            } else {
                arrayResultado[i] = array2[i-array1.length];
            }
        }

        return arrayResultado;
    }
}

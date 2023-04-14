/**
 * Clase Arrays
 * 3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
 * arreglo B de 20 números reales. Crear la clase ArregloService, en el
 * paquete servicio, con los siguientes métodos:
 * 1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
 * números aleatorios.
 * 2) Método mostrar recibe un arreglo por parámetro y lo muestra por
 * pantalla.
 * 3) Método ordenar recibe un arreglo por parámetro y lo ordena de
 * mayor a menor.
 * 4) Método inicializarB copia los primeros 10 números del arreglo A en el
 * arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
 * mostrar A y B.
 */
package Servicios;

import java.util.Arrays;
import java.util.Random;

public class ArraysService {
    
    public static void inicializarA(double[] arreglo) {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextDouble() * 100;
        }
    }
    
    public static void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
    
    public static void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }
    
    public static void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
    }
}

   

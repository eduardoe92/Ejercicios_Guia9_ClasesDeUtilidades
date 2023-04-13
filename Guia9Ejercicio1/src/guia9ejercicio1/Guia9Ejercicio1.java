/**
 * Realizar una clase llamada Cadena, en el paquete de entidades, que
 * tenga como atributos una frase (String) y su longitud. Agregar
 * constructor vacío y con atributo frase solamente. Agregar getters y
 * setters. El constructor con frase como atributo debe setear la longitud
 * de la frase de manera automática. Crear una clase CadenaServicio en el
 * paquete servicios que implemente los siguientes métodos:
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
 * que tiene la frase ingresada.
 * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
 * por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * c) Método vecesRepetido(String letra), recibirá un carácter ingresado
 * por el usuario y contabilizar cuántas veces se repite el carácter en la
 * frase.
 * d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
 * veces.
 * e) Método compararLongitud(String frase), deberá comparar la longitud
 * de la frase que compone la clase con otra nueva frase ingresada por
 * el usuario.
 * f) Método unirFrases(String frase), deberá unir la frase contenida en la
 * clase Cadena con una nueva frase ingresada por el usuario y mostrar
 * la frase resultante.
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras
 * “a” que se encuentren en la frase, por algún otro carácter
 * seleccionado por el usuario y mostrar la frase resultante.
 * h) Método contiene(String letra), deberá comprobar si la frase contiene
 * una letra que ingresa el usuario y devuelve verdadero si la contiene y
 * falso si no.
 */

package guia9ejercicio1;

import java.util.Scanner;
import Entidades.Cadena;
import Servicio.CadenaServicio;

public class Guia9Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        Cadena cadena = new Cadena(frase);
        
        CadenaServicio cadenaServicio = new CadenaServicio();
        
        // Método mostrarVocales
        System.out.println("==============================================");
        System.out.println("Cantidad de vocales: " + cadenaServicio.mostrarVocales(cadena));
        
        // Método invertirFrase
        System.out.println("==============================================");
        System.out.println("Frase invertida: " + cadenaServicio.invertirFrase(cadena));
        
        // Método vecesRepetido
        System.out.println("==============================================");
        System.out.print("Ingrese una letra para buscar cuantas veces se repite en la frase: ");
        String letra = leer.nextLine().toLowerCase();
        System.out.println("La letra " + letra.toUpperCase() + " se repite " + cadenaServicio.vecesRepetido(cadena, letra.charAt(0)) + " veces.");
        
        // Método compararLongitud
        System.out.println("==============================================");
        System.out.println("Ingrese una nueva frase para comparar su longitud con la anterior: ");
        String nuevaFrase = leer.nextLine();
        System.out.print("¿La frase nueva tiene la misma longitud que la anterior? ");
        System.out.println(cadenaServicio.compararLongitud(cadena, new Cadena(nuevaFrase)));
        
        // Método unirFrases
        System.out.println("==============================================");
        System.out.println("Ingrese una frase para unir con la anterior: ");
        String frase2 = leer.nextLine();
        System.out.println(cadenaServicio.unirFrases(cadena, new Cadena(frase2)));
        
        // Método reemplazar carácter
        System.out.println("==============================================");
        System.out.print("Ingrese un carácter para reemplazar las 'A' en la frase: ");
        String nuevaLetra = leer.nextLine();
        System.out.println(cadenaServicio.reemplazar(cadena, 'a', nuevaLetra.charAt(0)));
        
        // Método contiene letra
        System.out.println("==============================================");
        System.out.print("Ingrese una letra para comprobar si está en la frase: ");
        letra = leer.nextLine().toLowerCase();
        System.out.print("¿La letra " +letra.toUpperCase()+ " se encuentra en la frase? ");
        System.out.println(cadenaServicio.contiene(cadena, letra.charAt(0)));
    }
}
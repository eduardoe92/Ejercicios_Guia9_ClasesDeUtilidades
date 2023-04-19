
/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
 * deberá contener como atributos, un vector con la palabra a buscar, la
 * cantidad de letras encontradas y la cantidad jugadas máximas que
 * puede realizar el usuario. Definir los siguientes métodos en
 * AhorcadoService:
 * ● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
 * jugadas máxima. Con la palabra del usuario, pone la longitud de la
 * palabra, como la longitud del vector. Después ingresa la palabra en el
 * vector, letra por letra, quedando cada letra de la palabra en un índice
 * del vector. Y también, guarda la cantidad de jugadas máximas y el
 * valor que ingresó el usuario.
 * Método longitud(): muestra la longitud de la palabra que se debe
 * encontrar. Nota: buscar como se usa el vector.length.
 * ● Método buscar(letra): este método recibe una letra dada por el
 * usuario y busca si la letra ingresada es parte de la palabra o no.
 * También informará si la letra estaba o no.
 * ● Método encontradas(letra): que reciba una letra ingresada por el
 * usuario y muestre cuantas letras han sido encontradas y cuántas le
 * faltan. Este método además deberá devolver true si la letra estaba y
 * false si la letra no estaba, ya que, cada vez que se busque una letra
 * que no esté, se le restará uno a sus oportunidades.
 * ● Método intentos(): para mostrar cuántas oportunidades le queda al
 * jugador.
 * ● Método juego(): el método juego se encargará de llamar todos los
 * métodos previamente mencionados e informará cuando el usuario
 * descubra toda la palabra o se quede sin intentos. Este método se
 * llamará en el main.
 * Un ejemplo de salida puede ser así:
 * Ingrese una letra:
 * a
 * Longitud de la palabra: 6
 * Mensaje: La letra pertenece a la palabra
 * Número de letras (encontradas, faltantes): (3,4)
 * Número de oportunidades restantes: 4
 * ----------------------------------------------
 * Ingrese una letra:
 * z
 * Longitud de la palabra: 6
 * Mensaje: La letra no pertenece a la palabra
 * Número de letras (encontradas, faltantes): (3,4)
 * Número de oportunidades restantes: 3
 * ---------------------------------------------
 * Ingrese una letra:
 * b
 * Longitud de la palabra: 6
 * Mensaje: La letra no pertenece a la palabra
 * Número de letras (encontradas, faltantes): (4,3)
 * Número de oportunidades restantes: 2
 * ----------------------------------------------
 * Ingrese una letra:
 * u
 * Longitud de la palabra: 6
 * Mensaje: La letra no pertenece a la palabra
 * Número de letras (encontradas, faltantes): (4,3)
 * Número de oportunidades restantes: 1
 * ----------------------------------------------
 * Ingrese una letra:
 * q
 * Longitud de la palabra: 6
 * Mensaje: La letra no pertenece a la palabra
 * Mensaje: Lo sentimos, no hay más oportunidades
 */

package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.print("Ingrese la palabra secreta: ");
        String palabra = leer.nextLine().toLowerCase();
        System.out.print("Ingrese la cantidad de intentos máximo: ");
        int intentosMax = leer.nextInt();
        leer.nextLine();
        return new Ahorcado(palabra, intentosMax);
    }

    public void juego(Ahorcado a) {
        String letra;
        mostrarLetrasEncontradas(a);
        while (intentos(a) > 0) {
            do {
                System.out.print("Ingrese una letra: ");
                letra = leer.nextLine().toLowerCase();
            } while (letra.length() > 1);
            encontradas(letra, a);
            if (longitud(a) - contarNoLetras(a.getLetrasEncontradas()) == a.getLetrasEncontradas().length) {
                System.out.println("¡¡Genial!! Adivinaste la palabra secreta");
                break;
            }
        }
        if (intentos(a) == 0) {
            System.out.println("Lamentablemente te has quedado sin intentos");
        }
    }

    public int longitud(Ahorcado a) {
        return a.getPalabraSecreta().length;
    }

    public Boolean buscar(String letra, Ahorcado a) {
        Boolean encontrado = false;
        for (String l : a.getPalabraSecreta()) {
            if (letra.equals(l)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void encontradas(String letra, Ahorcado a) {
        int vecesEncontrado = 0;
        if (buscar(letra, a)) {
            for (int i = 0; i < longitud(a); i++) {
                if (letra.equals(a.getPalabraSecreta()[i])) {
                    vecesEncontrado++;
                    a.getLetrasEncontradas()[i] = letra.charAt(0);
                }
            }
            System.out.println("Has descubierto " + vecesEncontrado + " letras secretas");
            System.out.println(new String(a.getLetrasEncontradas()));
        } else {
            a.setIntentosRestantes(intentos(a) - 1);
            System.out.println("La letra no está,te quedan: " + intentos(a) + " intentos");
        }
    }

    public int intentos(Ahorcado a) {
        return a.getIntentosRestantes();
    }

    public void mostrarLetrasEncontradas(Ahorcado a) {
        char[] letrasEncontradas = new char[a.getPalabraSecreta().length];
        for (int i = 0; i < a.getPalabraSecreta().length; i++) {
            letrasEncontradas[i] = '_';
        }
        System.out.println(new String(letrasEncontradas));
    }

    public int contarNoLetras(char[] letras) {
        int contador = 0;
        for (char letra : letras) {
            if (!Character.isLetter(letra)) {
                contador++;
            }
        }
        return contador;
    }
}

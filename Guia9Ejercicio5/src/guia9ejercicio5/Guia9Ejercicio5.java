/**
 Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */

package guia9ejercicio5;
import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

public class Guia9Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio s1 = new PersonaServicio();
        Persona p1 = s1.crearPersona();

        System.out.print("Escribe una edad para comparar la base de datos: ");
        int edadProvista = leer.nextInt();
        
        boolean var1 = s1.menorQue(p1, edadProvista);
        if (var1) {
            System.out.println("La persona es menor a la edad señalada");
        } else {
            System.out.println("La persona es mayor a la edad señalada");
        }
        System.out.println(p1);
    }
}

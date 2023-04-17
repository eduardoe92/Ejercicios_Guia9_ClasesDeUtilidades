
/**
 Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */

package Servicios;
import java.util.Random;
import java.util.Scanner;

public class MesService {
    
    Scanner leer = new Scanner(System.in);
    Random random = new Random();
    
    public void AdivinaMesSecreto (){
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
                          "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int mesAleatorio = random.nextInt(meses.length);
        String mesSecreto = meses[mesAleatorio];
        String respuesta;
        System.out.println("Adivina el mes secreto");
        do {
            respuesta = leer.nextLine().toLowerCase();
            if (respuesta.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        } while (true);
    }
}

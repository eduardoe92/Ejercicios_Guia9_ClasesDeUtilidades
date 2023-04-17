
/**
 Clase Date
4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */

package Servicios;
import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        int dia = (int) leer.nextInt();
        System.out.print("Mes: ");
        int mes = (int) leer.nextInt();
        System.out.print("Año: ");
        int anio = (int) leer.nextInt();
        
        System.out.println("Su fecha de nacimiento es: " +dia+ "/" +mes+ "/" +anio);
        
        Date fechaNacimiento = new Date (anio-1900, mes-1, dia);
        return (fechaNacimiento);
    }
    
    public Date fechaActual(){
        
        System.out.println("Ingrese la fecha del día de hoy");
        System.out.print("Día: ");
        int dia = (int) leer.nextInt();
        System.out.print("Mes: ");
        int mes = (int) leer.nextInt();
        System.out.print("Año: ");
        int anio = (int) leer.nextInt();
        
        System.out.println("La fecha actual es: " +dia+ "/" +mes+ "/" +anio);
        
        Date fechaActual = new Date(anio-1900,mes-1,dia);
        return (fechaActual);
    }
    public int diferenciaAnios(Date fechaNacimiento, Date fechaActual) {
        
    //Se convierte ambas fechas a milisegundos
    long milisegundosFecha1 = fechaNacimiento.getTime();
    long milisegundosFecha2 = fechaActual.getTime();

    //Se calcula la diferencia en milisegundos entre las fechas
    long diferenciaMilisegundos = Math.abs(milisegundosFecha2 - milisegundosFecha1);

    // Convertir la diferencia de milisegundos a años
    // 31536000000L es la cantidad de milisegundos en un año
    int diferenciaAnios = (int) (diferenciaMilisegundos / 31536000000L);

    return diferenciaAnios;
}

}

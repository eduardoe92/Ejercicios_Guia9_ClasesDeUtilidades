package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

        public Persona crearPersona() {
            System.out.print("Ingrese su nombre: ");
            String nombre = leer.next();
            System.out.println("Ingrese su fecha de nacimiento: ");
            System.out.print("Día: ");
            int dia = leer.nextInt();
            System.out.print("Mes: ");
            int mes = leer.nextInt();
            System.out.print("Año: ");
            int anio = leer.nextInt();
            Date fechaDeNacimiento = new Date(anio - 1900, mes - 1, dia);
            return new Persona(nombre, fechaDeNacimiento);
        }

        public void calcularEdad(Date fechaDeNacimiento) {
            Date fechaActual = new Date();
            int edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
            System.out.println("Edad: " + edad);
        }

        public boolean menorQue(Persona p1, int edadProvista) {
            Date fechaActual = new Date();
            int edadDelta = fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();
            return edadDelta < edadProvista;
        }
    }

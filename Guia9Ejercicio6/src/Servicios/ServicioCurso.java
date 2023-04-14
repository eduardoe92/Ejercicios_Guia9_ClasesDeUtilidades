package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class ServicioCurso {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();

    private static void cargarAlumnos(Curso alumnos) {
        String[] aux = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("====================================================");
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            aux[i] = leer.nextLine();
        }
        alumnos.setAlumnos(aux);
    }

    public void crearCurso() {

        System.out.println("====================================================");
        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = leer.nextLine();
        System.out.print("Ingrese la cantidad de horas cursadas por día: ");
        float cantidadHorasPorDia = leer.nextFloat();
        System.out.print("Ingrese la cantidad de días cursados por semana: ");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        String turno = leer.next();
        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = leer.nextDouble();
        leer.nextLine();

        curso.setNombreCurso(nombreCurso);
        curso.setCantidadHorasPorDia(cantidadHorasPorDia);
        curso.setCantidadDiasPorSemana(cantidadDiasPorSemana);
        curso.setTurno(turno);
        curso.setPrecioPorHora(precioPorHora);

        cargarAlumnos(curso);
    }

    public double calcularGananciaSemanal() {
        double gananciaSemanal = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * 5;
        System.out.println("====================================================");
        System.out.println ("El total de ganancias semanales es: $" + gananciaSemanal);
        System.out.println("====================================================");
        return gananciaSemanal;
    }

}

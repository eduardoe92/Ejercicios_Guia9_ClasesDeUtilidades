
package Entidades;

import java.util.Date;


public class Persona {
    
    private String nombre;
    private Date fechaDeNacimiento;
    
    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Datos de la Persona" + "\nNombre: " + nombre + "\nFecha de Nacimiento: " + fechaDeNacimiento;
    }    
}

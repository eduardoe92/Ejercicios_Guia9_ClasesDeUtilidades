/**
 Método Static y Clase Math
2. Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServices {
    
    public void mostrarValores (ParDeNumeros parDeNum){ 
        System.out.println("Num 1: " +parDeNum.getNum1());
        System.out.println("Num 2: " +parDeNum.getNum2());
    }
    
    public double devolverMayor (ParDeNumeros parDeNum){
        if (parDeNum.getNum1()> parDeNum.getNum2()) {
            return parDeNum.getNum1();
        }else{
            return parDeNum.getNum2();
        }
    }
           
    public double calcularPotencia(ParDeNumeros parDeNum) {
        double mayor = this.devolverMayor(parDeNum);
        double menor;
        if (parDeNum.getNum1() == mayor) {
            menor = parDeNum.getNum2();
        } else {
            menor = parDeNum.getNum1();
        }
        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    public double calcularRaiz(ParDeNumeros parDeNum) {
        double menor;
        if (parDeNum.getNum1() > parDeNum.getNum2()) {
            menor = Math.abs(parDeNum.getNum2());
        } else {
            menor = Math.abs(parDeNum.getNum1());
        }
        return Math.sqrt(menor);
    }
}
package Servicio;

import Entidades.Cadena;

public class CadenaServicio {
    
    
    public int mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letra = cadena.getFrase().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        } return contador;
    }
    
    public String invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud()-1; i >= 0; i--) {
            fraseInvertida += cadena.getFrase().charAt(i);
        }return fraseInvertida;
    }
    
    public int vecesRepetido(Cadena cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().toLowerCase().charAt(i) == letra) {
                contador++;
            }
        }return contador;
    }
    
    public boolean compararLongitud(Cadena cadena1, Cadena cadena2) {
        return cadena1.getLongitud() == cadena2.getLongitud();
    }
    
    public String unirFrases(Cadena cadena1, Cadena cadena2) {
        return cadena1.getFrase() + " " + cadena2.getFrase();
    }
    
    public String reemplazar(Cadena cadena, char letraOriginal, char letraReemplazo) {
        return cadena.getFrase().replace(letraOriginal, letraReemplazo);
    }
    
    public boolean contiene(Cadena cadena, char letra) {
        return cadena.getFrase().toLowerCase().indexOf(letra) != -1;
    }
}


















    


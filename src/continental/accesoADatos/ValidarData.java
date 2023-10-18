package continental.accesoADatos;

import continental.entidades.TipoCama;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author Grupo 61
 */
public class ValidarData {

    //Valida si una cadena contiene caracteres especiales
    //En caso de contener retorna verdadero, caso contrario, falso
    public static boolean caracteresEspeciales(String cadena){
        
        String sup = "ºª!|@·#$~%€&¬/()=?¿¡'`^[*+]´¨{çÇ},;:.-_<>1234567890";
        for (int i = 0; i < cadena.length(); i++) {
            String letra = cadena.substring(i, i + 1);
            if (sup.contains(letra)) {
                return true;
            }
        }
        return false;
    }
    
    //Valida si una cadena cumple con un largo determinado
    //En caso de encontrarse fuera del rango retorna verdadero, caso contrario, falso
    public static boolean largoCadena(String cadena){
        
        return (cadena.length() <= 2 || cadena.length() >= 100);
    }
    
    //Valida si una entero se encuentra dentro de un rango
    //En caso de encontrarse fuera del rango retorna verdadero, caso contrario, falso
    public static boolean validarDNI(int dni){
        
        return (dni <= 10000000 || dni >= 69999999);
    }
    
    //Valida si una fecha se encuentra dentro de un rango
    //En caso de encontrarse fuera del rango retorna verdadero, caso contrario, falso
    public static boolean validarFecha(LocalDate fecha){
        
        return (fecha.isBefore(LocalDate.of(1950, 01, 01)) || fecha.isAfter(LocalDate.now(ZoneId.systemDefault())));
    }
     public static boolean validarPiso(int piso){
        
        return (piso<0 || piso>20);
    }
     public static boolean validarNumero(int num){
        
        return (num<0 || num>200);
    }
     
     
    public boolean minimoPersonas(int n){
     
       return n<1;
    }
     
    public static int numeroCama(TipoCama tc){
        switch (tc) {
            case SIMPLE:
                return 1;
            case DOBLE:
                return 2;
            case MATRIMONIAL:
                return 3;
            case QUEEN_SIZE:
                return 4;
            case KING_SIZE:
                return 5;
            default:
                return 0;
        }
    }
    
    public static TipoCama nombreCama(int num){
        switch (num) {
            case 1:
                return TipoCama.SIMPLE;
            case 2:
                return TipoCama.DOBLE;
            case 3:
                return TipoCama.MATRIMONIAL;
            case 4:
                return TipoCama.QUEEN_SIZE;
            default:
                return TipoCama.KING_SIZE;
        }
    }
}

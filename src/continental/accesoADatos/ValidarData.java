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
    public static boolean caracteresEspeciales(String cadena) {

        String sup = "ºª!|@·#$~%€&¬/()=?¿¡'`^[*+]´¨{çÇ},;:.-_<>1234567890";
        for (int i = 0; i < cadena.length(); i++) {

            String letra = cadena.substring(i, i + 1);
            if (sup.contains(letra)) {

                return true;
            }
        }
        return false;
    }
    
    public static boolean caracteresEspecialesDomicilio(String cadena) {

        String sup = "ºª!|@·#$~%€&¬/()=?¿¡'`^[*+]´¨{çÇ},;:.-_<>";
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
    public static boolean largoCadena(String cadena) {

        return (cadena.length() <= 3 || cadena.length() >= 100);
    }

    //Valida si una entero se encuentra dentro de un rango
    //En caso de encontrarse fuera del rango retorna verdadero, caso contrario, falso
    public static boolean validarDNI(int dni) {

        return (dni <= 10000000 || dni >= 69999999);
    }

    //Valida si una fecha se encuentra dentro de un rango
    //En caso de encontrarse fuera del rango retorna verdadero, caso contrario, falso
    public static boolean validarFecha(LocalDate fecha) {

        return (fecha.isBefore(LocalDate.of(1950, 01, 01)) || fecha.isAfter(LocalDate.now(ZoneId.systemDefault())));
    }

    //Valida si el valor ingresado de piso es correcto
    public static boolean validarPiso(int piso) {

        return (piso < 0 || piso > 20);
    }

    //Valida si el valor ingresado de habitacion es correcto
    public static boolean validarNumero(int num) {

        return (num < 0 || num > 200);
    }

    //Recibe un entero y devuelve un tipo de cama
    public static int numeroCama(TipoCama tc) {

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

    //Recibe un tipo de cama y devuelve un entero
    public static TipoCama nombreCama(int num) {

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

    //Controla que no hayan caracteres especiales en un numero
    public static boolean caracteresEspecialesNum(String str) {

        String sup = "ºª!|@·#$~%€&¬/()=?¿¡'`^[*+]´¨{çÇ},;:.-_<> ";
        for (int i = 0; i < str.length(); i++) {

            String letra = str.substring(i, i + 1);
            if (sup.contains(letra)) {

                return true;
            }
        }
        return false;
    }

    //Controla que el email contenga un solo @ y una extencion valida
    public static boolean caracteresEspecialesMail(String str) {

        String sup = "ºª!|·#$~€¬/=?¿¡'`^*+´¨{çÇ}()<>,;:\"[]%&éýúíóáèùìòàëÿüïöä ";
        int arroba = 0;
        int extension = 0;
        for (int i = 0; i < str.length(); i++) {

            String letra = str.substring(i, i + 1);
            if (sup.contains(letra)) {

                return true;
            }
            if (letra.equals("@")) {

                arroba++;
                if (arroba > 1) {

                    return true;
                }
            }
        }
        if (str.endsWith(".com") || str.endsWith(".ar") || str.endsWith(".edu") || str.endsWith(".gov") || str.endsWith(".org") || str.endsWith(".net")) {

            extension++;
        }
        if (extension == 0 || arroba == 0) {

            return true;
        }
        return false;
    }

    public static boolean validarLargoCelular (String celular){
                   
        return (celular.length()<8 || celular.length()>12);
    }
    
    public static boolean validarCelular (String celular){
        
        String especial = "1234567890";
        for (int i = 0; i < celular.length(); i++) {
            
            String letra = celular.substring(i,i+1);
            
            if (!especial.contains(letra)) {
                
                return true;
            } 
        }
        return false;
    }
    
}

package continental;

import continental.accedoADatos.HuespedData;
import continental.entidades.Huesped;
import java.util.ArrayList;

/**
 *
 * @author Grupo 61
 */
public class Continental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de ejecucion
        HuespedData hd = new HuespedData();
        Huesped huesped1 = new Huesped("Juan Pablo", "Lopez", "Colon 1015", "juanpablo@ahsdgfka.com", "324516656", 12345678, 1, true);

//        //Prueba de alta
//        int resultado = hd.guardarHuesped(huesped1);
//        if (resultado != 0 ) {
//            System.out.println("Se creo el huesped");
//            huesped1.setIdHuesped(resultado);
//        } else {
//            System.out.println("Fallo al crear huesped");
//        }

//        //Prueba de baja
//        int resultado = hd.eliminarHuesped(huesped1.getDni());
//        if (resultado != 0) {
//            System.out.println("Se elimino el huesped");
//        } else {
//            System.out.println("Fallo al eliminar huesped");
//        }

//        //Prueba de nueva alta
//        int resultado = hd.editarHuesped(huesped1);
//        if (resultado != 0) {
//            System.out.println("Se edito correctamente");
//        } else {
//            System.out.println("Fallo al editar");
//        }

//        //Prueba de modificacion
//        huesped1.setApellido("Gonzales");
//        huesped1.setNombre("Carlos");
//        huesped1.setDni(56565656);
//        int resultado = hd.editarHuesped(huesped1);
//        if (resultado != 0) {
//            System.out.println("Se edito correctamente");
//        } else {
//            System.out.println("Fallo al editar");
//        }

//        //Prueba busqueda por id
//        Huesped resultado = hd.buscarHuespedPorId(huesped1.getIdHuesped());
//        if (resultado != null) {
//            System.out.println("Se encontro el huesped " + resultado.getApellido() + ", " + resultado.getNombre());
//        } else {
//            System.out.println("Fallo al encontrar el huesped");
//        }
        
//        //Prueba busqueda por DNI
//        huesped1.setDni(56565656);
//        Huesped resultado = hd.buscarHuespedPorDni(huesped1.getDni());
//        if (resultado != null) {
//            System.out.println("Se encontro el huesped " + resultado.getApellido() + ", " + resultado.getNombre());
//        } else {
//            System.out.println("Fallo al encontrar el huesped");
//        }
        
//        //Prueba de lista
//        ArrayList<Huesped> resultado = hd.listarHuesped();
//        for (Huesped huesped : resultado) {
//            System.out.println(huesped.toString());
//        }
    }
}

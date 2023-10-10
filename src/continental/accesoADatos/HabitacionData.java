package continental.accesoADatos;

import continental.entidades.Habitacion;
import continental.vistas.Vista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 61
 */
public class HabitacionData {
    
    private Connection con = null;

    public HabitacionData() {
        
        this.con = Conexion.buscarConexion();
    }
    
    //Este metodo permite crear una Habitacion en la DB del hotel
    public int guardarHabitacion(Habitacion habitacion) {
        
        //Se define consulta SQL, colocando comodines para los valores que luego seran seteados.
        String query = "INSERT INTO habitacion (numero, piso, estado,habilitada, idCategoria) "
                + "VALUES (?, ?, ?,?, ?)";
        
        //Esta variable se utilizará para almacenar el ID generado del nuevo registro en la base de datos.
        int registro = 0;
        try {

            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getNro());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3, habitacion.isEstado());
            ps.setBoolean(4,true);
            ps.setInt(5, habitacion.getCategoria().getIdCategoria());
            //Se ejecuta la consulta
            ps.executeUpdate();
            //Se recupera un conjunto de resultados
            ResultSet rs = ps.getGeneratedKeys();
            
            //Consulta si el conjunto de resultados tiene un valor posterior
            if (rs.next()) {
                
                //Si se obtuvieron claves generadas, se asigna el ID generado al objeto habitacion y el valor del id se guarda en registro
                habitacion.setIdHabitacion(rs.getInt(1));
                registro = rs.getInt(1);
                System.out.println("Se creo la habitacion");
            } else {                
                
                System.out.println("No se pudo recuperar el ID");
            }
            
            //Se cierra la consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al guardar la habitacion: " + habitacion.getNro() + " del piso: " + habitacion.getPiso() + " " + e.getMessage());
        }
        
        //Retorna un registro que tendra valor 0 en caso de fallar o el id de la habitacion en caso de tener exito
        return registro;
    }
    
    //Este metodo permite dar de baja una habitacion de la BD del hotel
    public int eliminarHabitacion(int nro) {
        
        String query = "UPDATE habitacion SET habilitada=0 WHERE numero=?";
        //Esta variable almacenara si hubo cambios en el registro de la DB
        int registro = 0;
        try {
            
            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nro);
            //Se ejecuta la consulta preparada utilizando el metodo executeUpdate() y se recupera llave generada automaticamente
            registro = ps.executeUpdate();

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al borrar la habitacion" + e.getMessage());
        }
        
        //Retorna variable registro al metodo que lo invoca
        return registro; 
    }
    
    //Este metodo permite actualizar los datos de la habitacion
    public int editarHabitacion(Habitacion habitacion) {
        
        String query = "UPDATE habitacion SET numero = ?, piso = ?, estado = ?,habilitada=?, idCategoria = ? WHERE idHabitacion = ?";
        
        int registro = 0;
        try {
            
            //Preparación y ejecución de la consulta SQL
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getNro());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3, habitacion.isEstado());
            ps.setBoolean(4, habitacion.isHabilitada());
            ps.setInt(5, habitacion.getCategoria().getIdCategoria());
            ps.setInt(6, habitacion.getIdHabitacion());
            registro = ps.executeUpdate(); //ejecuta Update
            ps.close();//Cierra consulta
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al guardar la habitacion: " + habitacion.getNro() + " del piso: " + habitacion.getPiso() + " " + e.getMessage());
        }
        return registro;
    }
    
    //Este metodo permite buscar una habitacion por su ID
    public Habitacion buscarHabitacionPorId(int idHab) {
       
        Habitacion hab = null;//Declara una variable al de tipo Habitacion e inicializa su valor como null. Esta variable se utilizará para almacenar el resultado de la búsqueda.
        String query = "SELECT * FROM habitacion WHERE idHabitacion = ?";
        try {
            
            //se prepara la consulta PS y se solicita las claves generadas automaticamente
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idHab);// se modifica el ID
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta y se almacena en un resulset "rs"
            if (rs.next()) {// si rs contiene valores, se recuperan abajo
                
                hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setNro(rs.getInt("numero"));
                hab.setPiso(rs.getInt("piso"));
                hab.setEstado(rs.getBoolean("estado"));
                hab.setCategoria(Vista.getCD().buscarCategoriaPorId(rs.getInt("idCategoria")));
                hab.setHabilitada(rs.getBoolean("habilitada"));
                
            } else {
                
                //si no se encuentra una habitacion con los parametros buscados deja el msj
//                JOptionPane.showMessageDialog(null, "No existe la habitacion");
            }
            
            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar la habitacion" + e.getMessage());
        }
        return hab;//retorna una habitacion
    }
    //Este metodo permite buscar una habitacion por su numero
     public Habitacion buscarHabitacionPorNumero(int nDH) {
       
        Habitacion hab = null;//Declara una variable al de tipo Habitacion e inicializa su valor como null. Esta variable se utilizará para almacenar el resultado de la búsqueda.
        String query = "SELECT * FROM habitacion WHERE numero = ?";
        try {
            
            //se prepara la consulta PS y se solicita las claves generadas automaticamente
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nDH);// se modifica el ID
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta y se almacena en un resulset "rs"
            if (rs.next()) {// si rs contiene valores, se recuperan abajo
                
                hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setNro(rs.getInt("numero"));
                hab.setPiso(rs.getInt("piso"));
                hab.setEstado(rs.getBoolean("estado"));
                hab.setCategoria(Vista.getCD().buscarCategoriaPorId(rs.getInt("idCategoria")));
                hab.setHabilitada(rs.getBoolean("habilitada"));
            } else {
                
                //si no se encuentra una habitacion con los parametros buscados deja el msj
//                JOptionPane.showMessageDialog(null, "No existe la habitacion");
            }
            
            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar la habitacion" + e.getMessage());
        }
        return hab;//retorna una habitacion
    }
    //Este metodo devuelve una lista de habitaciones
    public ArrayList<Habitacion> listarHabitaciones() {
        
        ArrayList<Habitacion> listaHabitaciones = new ArrayList();//se  creo una lista paraa almacenar Habitaciones
        String query = "SELECT * FROM habitacion WHERE estado = 1";//se define consulta
        try {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta, para un conjunto de resultados(resulset)
            Habitacion hab = null;// se inicializa una Habitacion en null
           
            while (rs.next()) {//se inicializa un bucle para modificar la Habitacion
                hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setNro(rs.getInt("numero"));
                hab.setPiso(rs.getInt("piso"));
                hab.setEstado(rs.getBoolean("estado"));
                hab.setCategoria(Vista.getCD().buscarCategoriaPorId(rs.getInt("idCategoria")));
                hab.setHabilitada(rs.getBoolean("habilitada"));
                listaHabitaciones.add(hab);//se agrega ela habitacion a la lista
            }
            ps.close();//cierra  el PS
        } catch (SQLException e) {
            
            System.out.println("Error al encontrar al huesped" + e.getMessage());
        }
        return listaHabitaciones;//retorna una lista de habitaciones
    }
     public int habilitarHabitacion(int nro) {
        
        String query = "UPDATE habitacion SET habilitada=1 WHERE numero=?";
        //Esta variable almacenara si hubo cambios en el registro de la DB
        int registro = 0;
        try {
            
            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nro);
            //Se ejecuta la consulta preparada utilizando el metodo executeUpdate() y se recupera llave generada automaticamente
            registro = ps.executeUpdate();

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al habilitar la habitacion" + e.getMessage());
        }
        
        //Retorna variable registro al metodo que lo invoca
        return registro; 
    }
}

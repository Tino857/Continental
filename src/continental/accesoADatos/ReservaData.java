package continental.accesoADatos;

import continental.entidades.Reserva;
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
public class ReservaData {
    
    private Connection con = null;

    public ReservaData() {
        
        this.con = Conexion.buscarConexion();
    }
    
    //Este metodo permite crear una reserva en la DB del hotel
    public int guardarReserva(Reserva reserva) {
        
        //Se define consulta SQL, colocando comodines para los valores que luego seran seteados.
        String query = "INSERT INTO reserva (idHabitacion, idHuesped, fechaInicio, fechaFin, dias, monto, estado, cantidadPersonas) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        //Esta variable se utilizará para almacenar el ID generado del nuevo registro en la base de datos.
        int registro = 0;
        try {

            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getHabitacion().getIdHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setString(3, reserva.getFi().toString());
            ps.setString(4, reserva.getFf().toString());
            ps.setInt(5, reserva.getDias());
            ps.setDouble(6, reserva.getMonto());
            ps.setBoolean(7, reserva.isEstado());
            ps.setInt(8, reserva.getCantDePersonas());
            //Se ejecuta la consulta
            ps.executeUpdate();
            //Se recupera un conjunto de resultados
            ResultSet rs = ps.getGeneratedKeys();
            
            
            //Consulta si el conjunto de resultados tiene un valor posterior
            if (rs.next()) {
                
                //Si se obtuvieron claves generadas, se asigna el ID generado al objeto reserva y el valor del id se guarda en registro
                reserva.setIdReserva(rs.getInt(1));
                registro = rs.getInt(1);
                System.out.println("Se creo la reserva");
            } else {                
                
                System.out.println("No se pudo recuperar el ID");
            }
            
            //Se cierra la consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al guardar la reserva: " + reserva.getIdReserva()+ ", correspondiente a " + reserva.getHuesped().getApellido() + " de la habitacion " + reserva.getHabitacion().getNro());
        }
        
        //Retorna un registro que tendra valor 0 en caso de fallar o el id de la  en caso de tener exito
        return registro;
    }
    
    //Este metodo permite dar de baja una reserva de la BD del hotel
    public int eliminarReserva(int idRes) {
        
        String query = "UPDATE reserva SET estado = 0 WHERE idReserva = ?";
        //Esta variable almacenara si hubo cambios en el registro de la DB
        int registro = 0;
        try {
            
            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idRes);
            //Se ejecuta la consulta preparada utilizando el metodo executeUpdate() y se recupera llave generada automaticamente
            registro = ps.executeUpdate();

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al borrar la reserva " + e.getMessage());
        }
        
        //Retorna variable registro al metodo que lo invoca
        return registro; 
    }
    
    //Este metodo permite actualizar los datos de la reserva
    public int editarReserva(Reserva reserva) {
        
        String query = "UPDATE reserva SET idHabitacion = ?, idHuesped = ?, fechaInicio = ?, fechaFin = ?, monto = ?, estado = ?, cantidadPersonas = ? WHERE idReserva = ?";
        
        int registro = 0;
        try {
            
            //Preparación y ejecución de la consulta SQL
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getHabitacion().getIdHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setString(3, reserva.getFi().toString());
            ps.setString(4, reserva.getFf().toString());
            ps.setDouble(5, reserva.getMonto());
            ps.setBoolean(6, reserva.isEstado());
            ps.setInt(7, reserva.getCantDePersonas());
            registro = ps.executeUpdate(); //ejecuta Update
            ps.close();//Cierra consulta
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error editar la reserva: " + reserva.getIdReserva() + " correspondiente a la habitacion " + reserva.getHabitacion().getNro() + " " + e.getMessage());
        }
        return registro;
    }
    
    //Este metodo permite buscar una reserva por su ID
    public Reserva buscarReservaPorId(int idRes) {
        HuespedData huespedD = new HuespedData();
        HabitacionData habitacionD = new HabitacionData();
        Reserva reserva = null;//Declara una variable al de tipo Reserva e inicializa su valor como null. Esta variable se utilizará para almacenar el resultado de la búsqueda.
        String query = "SELECT * FROM reserva WHERE idReserva = ?";
        try {
            
            //se prepara la consulta PS y se solicita las claves generadas automaticamente
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idRes);// se modifica el ID
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta y se almacena en un resulset "rs"
            if (rs.next()) {// si rs contiene valores, se recuperan abajo
                
                reserva = new Reserva();
                reserva.setHuesped(huespedD.buscarHuespedPorId(rs.getInt("idHuesped")));
                reserva.setHabitacion(habitacionD.buscarHabitacionPorId(rs.getInt("idHabitacion")));
                reserva.setFi(rs.getDate("fechaInicio").toLocalDate());
                reserva.setFf(rs.getDate("fechaFin").toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setCantDePersonas(rs.getInt("cantidadPersonas"));
            } else {
                
                //si no se encuentra un reserva con los parametros buscados deja el msj
                JOptionPane.showMessageDialog(null, "No existe la reserva");
            }
            
            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar la reserva" + e.getMessage());
        }
        return reserva;//retorna una reserva
    }
    
    //Este metodo devuelve una lista de reservas
    public ArrayList<Reserva> listarReservas() {
      
        ArrayList<Reserva> listaReservas = new ArrayList();//se  creo una lista paraa almacenar Reservas
        String query = "SELECT * FROM reserva WHERE estado = 1";//se define consulta
        try {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta, para un conjunto de resultados(resulset)
            Reserva reserva = null;// se inicializa una reserva en null
            while (rs.next()) {//se inicializa un bucle para modificar la reserva
                reserva = new Reserva();
                reserva.setHuesped(Vista.getHD().buscarHuespedPorId(rs.getInt("idHuesped")));
                reserva.setHabitacion(Vista.getHabD().buscarHabitacionPorId(rs.getInt("idHabitacion")));
                reserva.setFi(rs.getDate("fechaInicio").toLocalDate());
                reserva.setFf(rs.getDate("fechaFin").toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setCantDePersonas(rs.getInt("cantidadPersonas"));
                listaReservas.add(reserva);//se agrega la reserva a la lista
            }
            ps.close();//cierra  el PS
        } catch (SQLException e) {
            
            System.out.println("Error al encontrar la reserva" + e.getMessage());
        }
        return listaReservas;//retorna una lista de reservas
    }
}

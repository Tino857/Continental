package continental.accesoADatos;

import continental.entidades.Huesped;
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
public class HuespedData {

    private Connection con = null;

    public HuespedData() {

        this.con = Conexion.buscarConexion();
    }

    //Este metodo permite crear un huesped en la DB del hotel
    public int guardarHuesped(Huesped huesped) {

        //Se define consulta SQL, colocando comodines para los valores que luego seran seteados.
        String query = "INSERT INTO huesped (dni, apellido, nombre, domicilio, correo, celular, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        //Esta variable se utilizará para almacenar el ID generado del nuevo registro en la base de datos.
        int registro = 0;
        try {
            Huesped h = buscarHuespedPorDni(huesped.getDni());// Esto se hace para verificar si el huesped ya existe en la base de datos
            if (h != null) {//Se verifica si se encontró un huesped en la base de datos

                if (h.getIdHuesped() != huesped.getIdHuesped()) {//compara el ID por parametro con el de la base para no duplicar un DNI
                    
                    return registro;
                }
            }

            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, huesped.getDni());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getNombre());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            //Se ejecuta la consulta
            ps.executeUpdate();
            //Se recupera un conjunto de resultados
            ResultSet rs = ps.getGeneratedKeys();

            //Consulta si el conjunto de resultados tiene un valor posterior
            if (rs.next()) {

                //Si se obtuvieron claves generadas, se asigna el ID generado al objeto huesped y el valor del id se guarda en registro
                huesped.setIdHuesped(rs.getInt(1));
                registro = rs.getInt(1);
                System.out.println("Se creo el huesped");
            } else {

                System.out.println("No se pudo recuperar el ID");
            }

            //Se cierra la consulta
            ps.close();
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error al guardar al huesped: " + huesped.getNombre() + " " + huesped.getApellido() + " " + e.getMessage());
        }

        //Retorna un registro que tendra valor 0 en caso de fallar o el id del husped en caso de tener exito
        return registro;
    }

    //Este metodo permite dar de baja un huesped de la BD del hotel
    public int eliminarHuesped(int dni) {

        String query = "UPDATE huesped SET estado=0 WHERE dni=?";
        //Esta variable almacenara si hubo cambios en el registro de la DB
        int registro = 0;
        try {

            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            //Se ejecuta la consulta preparada utilizando el metodo executeUpdate() y se recupera llave generada automaticamente
            registro = ps.executeUpdate();

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error al borrar al huesped" + e.getMessage());
        }

        //Retorna variable registro al metodo que lo invoca
        return registro;
    }

    //Este metodo permite actualizar los datos del huesped
    public int editarHuesped(Huesped huesped) {

        String query = "UPDATE huesped SET dni = ?, apellido = ?, nombre = ?, domicilio = ?, correo = ?, celular = ?, estado = ? WHERE idHuesped = ?";

        int registro = 0;
        try {

            //Preparación y ejecución de la consulta SQL
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, huesped.getDni());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getNombre());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            ps.setInt(8, huesped.getIdHuesped());
            registro = ps.executeUpdate(); //ejecuta Update
            ps.close();//Cierra consulta
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error editar al huesped: " + huesped.getNombre() + " " + huesped.getApellido() + " " + e.getMessage());
        }
        return registro;
    }

    //Este metodo permite buscar un huesped por su ID
    public Huesped buscarHuespedPorId(int id) {

        Huesped huesped = null;//Declara una variable al de tipo Huesped e inicializa su valor como null. Esta variable se utilizará para almacenar el resultado de la búsqueda.
        String query = "SELECT * FROM huesped WHERE idHuesped = ?";
        try {

            //se prepara la consulta PS y se solicita las claves generadas automaticamente
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);// se modifica el ID
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta y se almacena en un resulset "rs"
            if (rs.next()) {// si rs contiene valores, se recuperan abajo

                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setEstado(rs.getBoolean("estado"));
            } else {
                System.out.println("No se encontro el huesped");
            }

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar el huesped" + e.getMessage());
        }
        return huesped;//retorna un Huesped
    }

    //Este metodo permite buscar un Huesped en la base de datos por medio del dni
    public Huesped buscarHuespedPorDni(int dni) {

        Huesped huesped = null;// se crea instancia de huesped para utilizarlo dentro del try
        String query = "SELECT * FROM huesped WHERE dni = ?";
        try {

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);//se modifica el comodin por el pasado por teclado
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta

            if (rs.next()) {

                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setEstado(rs.getBoolean("estado"));
            } else {

                System.out.println("No existe el huesped");
            }
            //Se cierra la consulta
            ps.close();
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar el huesped" + e.getMessage());
        }
        return huesped;
    }

    //Este metodo devuelve una lista de huespedes
    public ArrayList<Huesped> listarHuespedAct() {

        ArrayList<Huesped> listaHuespedes = new ArrayList();//se  creo una lista paraa almacenar Huespedes
        String query = "SELECT * FROM huesped WHERE estado = 1";//se define consulta
        try {

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta, para un conjunto de resultados(resulset)
            Huesped huesped = null;// se inicializa un huesped en null
            while (rs.next()) {//se inicializa un bucle para modificar al huesped
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setEstado(rs.getBoolean("estado"));
                listaHuespedes.add(huesped);//se agrega el huesped a la lista
            }
            ps.close();//cierra  el PS
        } catch (SQLException e) {

            System.out.println("Error al encontrar al huesped" + e.getMessage());
        }
        return listaHuespedes;//retorna una lista de huespedes
    }

    public ArrayList<Huesped> listarHuespedIn() {

        ArrayList<Huesped> listaHuespedes = new ArrayList();//se  creo una lista paraa almacenar Huespedes
        String query = "SELECT * FROM huesped WHERE estado = 0";//se define consulta
        try {

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta, para un conjunto de resultados(resulset)
            Huesped huesped = null;// se inicializa un huesped en null
            while (rs.next()) {//se inicializa un bucle para modificar al huesped
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setEstado(rs.getBoolean("estado"));
                listaHuespedes.add(huesped);//se agrega el huesped a la lista
            }
            ps.close();//cierra  el PS
        } catch (SQLException e) {

            System.out.println("Error al encontrar al huesped" + e.getMessage());
        }
        return listaHuespedes;//retorna una lista de huespedes
    }
     public int habilitarHuesped(int dni) {

        String query = "UPDATE huesped SET estado=1 WHERE dni=?";
        //Esta variable almacenara si hubo cambios en el registro de la DB
        int registro = 0;
        try {

            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            //Se ejecuta la consulta preparada utilizando el metodo executeUpdate() y se recupera llave generada automaticamente
            registro = ps.executeUpdate();

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error al habilitar al huesped" + e.getMessage());
        }

        //Retorna variable registro al metodo que lo invoca
        return registro;
    }
     public Huesped buscarHuespedPorCel(String cel){
         Huesped huesped = null;// se crea instancia de huesped para utilizarlo dentro del try
        String query = "SELECT * FROM huesped WHERE celular = ?";
        try {

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cel);//se modifica el comodin por el pasado por teclado
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta

            if (rs.next()) {

                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setEstado(rs.getBoolean("estado"));
            } else {

                System.out.println("No existe el huesped");
            }
            //Se cierra la consulta
            ps.close();
        } catch (SQLException e) {

            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar el huesped" + e.getMessage());
        }
              return huesped;
  
     }
}

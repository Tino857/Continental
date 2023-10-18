package continental.accesoADatos;

import continental.entidades.Categoria;
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
public class CategoriaData {
    
    private Connection con = null;

    public CategoriaData() {
        
        this.con = Conexion.buscarConexion();
    }
    
    //Este metodo permite crear una categoria en la DB del hotel
    public int guardarCategoria(Categoria categoria) {
        
        //Se define consulta SQL, colocando comodines para los valores que luego seran seteados.
        String query = "INSERT INTO categoria (cantidadPersonas, precio, cantidadCamas, tipoCama, tipoCategoria)"
                + "VALUES (?, ?, ?, ?, ?)";
        
        //Esta variable se utilizará para almacenar el ID generado del nuevo registro en la base de datos.
        int registro = 0;
        try {

            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, categoria.getCantDePersonas());
            ps.setDouble(2, categoria.getPrecio());
            ps.setInt(3, categoria.getCantDeCamas());
            ps.setInt(4, ValidarData.numeroCama(categoria.getTipoDeCamas()));
            ps.setString(5, categoria.getTipoCategoria());
            //Se ejecuta la consulta
            ps.executeUpdate();
            //Se recupera un conjunto de resultados
            ResultSet rs = ps.getGeneratedKeys();
            
            //Consulta si el conjunto de resultados tiene un valor posterior
            if (rs.next()) {
                
                //Si se obtuvieron claves generadas, se asigna el ID generado al objeto categoria y el valor del id se guarda en registro
                categoria.setIdCategoria(rs.getInt(1));
                registro = rs.getInt(1);
                System.out.println("Se creo la categoria");
            } else {                
                
                System.out.println("No se pudo recuperar el ID");
            }
            
            //Se cierra la consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al guardar la categoria: " + categoria.getIdCategoria() + " - " + categoria.getTipoCategoria());
        }
        
        //Retorna un registro que tendra valor 0 en caso de fallar o el id de la categoria en caso de tener exito
        return registro;
    }
    
    //Este metodo permite dar de baja una categoria de la BD del hotel
    public int eliminarCategoria(int idCat) {
        
        String query = "UPDATE categoria SET estado=0 WHERE idCategoria = ?";
        //Esta variable almacenara si hubo cambios en el registro de la DB
        int registro = 0;
        try {
            
            //Se crea un prepared statement, se prepara la declaracion con la consulta sql definida previamente y se setean los valores
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCat);
            //Se ejecuta la consulta preparada utilizando el metodo executeUpdate() y se recupera llave generada automaticamente
            registro = ps.executeUpdate();

            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al borrar la categoria" + e.getMessage());
        }
        
        //Retorna variable registro al metodo que lo invoca
        return registro; 
    }
    
    //Este metodo permite actualizar los datos de una categoria
    public int editarCategoria(Categoria categoria) {
        
        String query = "UPDATE categoria SET cantidadPersonas = ?, precio = ?, cantidadCamas = ?, tipoCama = ?, tipoCategoria = ? WHERE idCategoria = ?";
        
        int registro = 0;
        try {
            
            //Preparación y ejecución de la consulta SQL
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, categoria.getCantDePersonas());
            ps.setDouble(2, categoria.getPrecio());
            ps.setInt(3, categoria.getCantDeCamas());
            ps.setInt(4, ValidarData.numeroCama(categoria.getTipoDeCamas()));
            ps.setString(5, categoria.getTipoCategoria());
            ps.setInt(6, categoria.getIdCategoria());
            registro = ps.executeUpdate(); //ejecuta Update
            ps.close();//Cierra consulta
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al guardar la categoria: " + categoria.getIdCategoria() + " - " + categoria.getTipoCategoria());
        }
        return registro;
    }
    
    //Este metodo permite buscar una categoria por su ID
    public Categoria buscarCategoriaPorId(int idCat) {
        
        Categoria categoria = null;//Declara una variable al de tipo Categoria e inicializa su valor como null. Esta variable se utilizará para almacenar el resultado de la búsqueda.
        String query = "SELECT * FROM categoria WHERE idCategoria = ?";
        try {
            
            //se prepara la consulta PS y se solicita las claves generadas automaticamente
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCat);// se modifica el ID
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta y se almacena en un resulset "rs"
            categoria = new Categoria();
            if (rs.next()) {// si rs contiene valores, se recuperan abajo
                    
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setCantDePersonas(rs.getInt("cantidadPersonas"));
                categoria.setPrecio(rs.getDouble("precio"));
                categoria.setCantDeCamas(rs.getInt("cantidadCamas"));
                categoria.setTipoDeCamas(ValidarData.nombreCama(rs.getInt("tipoCama")));
                categoria.setTipoCategoria(rs.getString("tipoCategoria"));
                
            } else {
                
                //si no se encuentra una categoria con los parametros buscados deja el msj
                JOptionPane.showMessageDialog(null, "No existe la categoria");
            }
            
            //Cierra consulta
            ps.close();
        } catch (SQLException e) {
            
            //Se captura una posible excepcion SQL
            System.out.println("Error al buscar la categoria" + e.getMessage());
        }
        return categoria;//retorna una categoria
    }
    
    //Este metodo devuelve una lista de categorias
    public ArrayList<Categoria> listarCategorias() {
        
        ArrayList<Categoria> listaCategorias = new ArrayList();//se  creo una lista paraa almacenar categorias
        String query = "SELECT * FROM categoria";//se define consulta
        try {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();//se ejecuta la consulta, para un conjunto de resultados(resulset)
            Categoria categoria = null;// se inicializa una categoria en null
            while (rs.next()) {//se inicializa un bucle para modificar la categoria
                categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setCantDePersonas(rs.getInt("cantidadPersonas"));
                categoria.setPrecio(rs.getDouble("precio"));
                categoria.setCantDeCamas(rs.getInt("cantidadCamas"));
                categoria.setTipoDeCamas(ValidarData.nombreCama(rs.getInt("tipoCama")));
                categoria.setTipoCategoria(rs.getString("tipoCategoria"));
                listaCategorias.add(categoria);//se agrega la categoria a la lista
            }
            ps.close();//cierra  el PS
        } catch (SQLException e) {
            
            System.out.println("Error al encontrar al huesped" + e.getMessage());
        }
        return listaCategorias;//retorna una lista de categorias
    }
}

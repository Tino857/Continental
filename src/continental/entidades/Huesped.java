package continental.entidades;

/**
 *
 * @author Grupo 61
 */
public class Huesped {
    
    private String nombre,apellido,domicilio,correo,celular;
    private int dni,idHuesped;
    private boolean estado;

    public Huesped() {
    }

    public Huesped(String nombre, String apellido, String domicilio, String correo, String celular, int dni, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.dni = dni;
        this.estado = estado;
    }
    
    public Huesped(String nombre, String apellido, String domicilio, String correo, String celular, int dni, int idHuesped, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.dni = dni;
        this.idHuesped = idHuesped;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
        
    @Override
    public String toString() {
        return "Apellido: " + apellido + "\n"
                + "Nombre: " + nombre + "\n"
                + "Correo: " + correo + "\n"
                +"Celular: "+celular+"\n"
                + "Domicilio: "+domicilio;
    }
}

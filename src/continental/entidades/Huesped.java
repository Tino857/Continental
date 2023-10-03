/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continental.entidades;

/**
 *
 * @author valen
 */
public class Huesped {
    private String nombre,apellido,domicilio,correo,celular;
    private int dni,idHuesped;
    

    public Huesped(String nombre, String apellido, String domicilio, String correo, int dni, int idHuesped, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.correo = correo;
        this.dni = dni;
        this.idHuesped = idHuesped;
        this.celular = celular;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    @Override
    public String toString() {
        return "Apellido: " + apellido + "\n"
                + "Nombre: " + nombre + "\n"
                + "Correo: " + correo
                +"Celular: "+celular+"\n"
                + "Domicilio: "+domicilio;
    }
}

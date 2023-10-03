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
public class Habitacion {
    private int piso, nro;
    private Categoria categoria;
    private boolean estado;

    public Habitacion(int piso, int nro, Categoria categoria, boolean estado) {
        this.piso = piso;
        this.nro = nro;
        this.categoria = categoria;
        this.estado = estado;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}

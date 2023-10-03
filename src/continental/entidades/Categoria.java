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
public class Categoria {
    private int idCategoria,cantDePersonas,cantDeCamas,tipoDeCamas;
    private Double precio;
 

    public Categoria(int codigoTipo, int cantDePersonas, int cantDeCamas, Double precio, int tipoDeCamas) {
        this.idCategoria = codigoTipo;
        this.cantDePersonas = cantDePersonas;
        this.cantDeCamas = cantDeCamas;
        this.precio = precio;
        this.tipoDeCamas = tipoDeCamas;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

 
    public int getCantDePersonas() {
        return cantDePersonas;
    }

    public void setCantDePersonas(int cantDePersonas) {
        this.cantDePersonas = cantDePersonas;
    }

    public int getCantDeCamas() {
        return cantDeCamas;
    }

    public void setCantDeCamas(int cantDeCamas) {
        this.cantDeCamas = cantDeCamas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getTipoDeCamas() {
        return tipoDeCamas;
    }

    public void setTipoDeCamas(int tipoDeCamas) {
        this.tipoDeCamas = tipoDeCamas;
    }


}

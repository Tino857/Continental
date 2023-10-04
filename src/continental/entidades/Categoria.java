package continental.entidades;

/**
 *
 * @author valen
 */
public class Categoria {
    private int idCategoria,cantDePersonas,cantDeCamas,tipoDeCamas;
    private Double precio;
    private String tipoCategoria;

    public Categoria() {
    }

    public Categoria(int cantDePersonas, int cantDeCamas, int tipoDeCamas, Double precio, String tipoCategoria) {
        this.cantDePersonas = cantDePersonas;
        this.cantDeCamas = cantDeCamas;
        this.tipoDeCamas = tipoDeCamas;
        this.precio = precio;
        this.tipoCategoria = tipoCategoria;
    }

    public Categoria(int idCategoria, int cantDePersonas, int cantDeCamas, Double precio, int tipoDeCamas, String tipoCategoria) {
        this.idCategoria = idCategoria;
        this.cantDePersonas = cantDePersonas;
        this.cantDeCamas = cantDeCamas;
        this.precio = precio;
        this.tipoDeCamas = tipoDeCamas;
        this.tipoCategoria = tipoCategoria;
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

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public String toString() {
        return idCategoria + " - " + tipoCategoria;
    }

}

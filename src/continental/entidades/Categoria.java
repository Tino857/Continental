package continental.entidades;

/**
 *
 * @author Grupo 61
 */
public class Categoria {
    private int idCategoria,cantDePersonas,cantDeCamas;
    private double precio;
    private String tipoCategoria;
    private TipoCama tipoDeCamas;

    public Categoria() {
    }

    public Categoria(int cantDePersonas, int cantDeCamas, TipoCama tipoDeCamas, double precio, String tipoCategoria) {
        this.cantDePersonas = cantDePersonas;
        this.cantDeCamas = cantDeCamas;
        this.tipoDeCamas = tipoDeCamas;
        this.precio = precio;
        this.tipoCategoria = tipoCategoria;
    }

    public Categoria(int idCategoria, int cantDePersonas, int cantDeCamas, double precio, TipoCama tipoDeCamas, String tipoCategoria) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public TipoCama getTipoDeCamas() {
        return tipoDeCamas;
    }

    public void setTipoDeCamas(TipoCama tipoDeCamas) {
        this.tipoDeCamas = tipoDeCamas;
    }

    @Override
    public String toString() {
        return idCategoria + " - " + tipoCategoria;
    }
}

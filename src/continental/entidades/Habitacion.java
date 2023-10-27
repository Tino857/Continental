package continental.entidades;

/**
 *
 * @author Grupo 61
 */
public class Habitacion {

    private int piso, nro, idHabitacion;
    private Categoria categoria;
    private boolean estado, habilitada;

    public Habitacion() {
    }

    public Habitacion(int piso, int nro, Categoria categoria, boolean estado) {
        this.piso = piso;
        this.nro = nro;
        this.categoria = categoria;
        this.estado = estado;
        this.habilitada = true;
    }

    public Habitacion(int piso, int nro, int idHabitacion, Categoria categoria, boolean estado) {
        this.piso = piso;
        this.nro = nro;
        this.idHabitacion = idHabitacion;
        this.categoria = categoria;
        this.estado = estado;
        this.habilitada = true;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
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

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
}

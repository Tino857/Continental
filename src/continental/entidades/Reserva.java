package continental.entidades;

import java.time.LocalDate;

/**
 *
 * @author Gurpo 61
 */
public class Reserva {

    private Huesped huesped;
    private Habitacion habitacion;
    private LocalDate fi, ff;
    private int dias, cantDePersonas, idReserva;
    private double monto;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fi, LocalDate ff, int dias, int cantDePersonas, double monto, boolean estado) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fi = fi;
        this.ff = ff;
        this.dias = dias;
        this.cantDePersonas = cantDePersonas;
        this.monto = monto;
        this.estado = estado;
    }

    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fi, LocalDate ff, int dias, int cantDePersonas, int idReserva, double monto, boolean estado) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fi = fi;
        this.ff = ff;
        this.dias = dias;
        this.cantDePersonas = cantDePersonas;
        this.idReserva = idReserva;
        this.monto = monto;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCantDePersonas() {
        return cantDePersonas;
    }

    public void setCantDePersonas(int cantDePersonas) {
        this.cantDePersonas = cantDePersonas;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFi() {
        return fi;
    }

    public void setFi(LocalDate fi) {
        this.fi = fi;
    }

    public LocalDate getFf() {
        return ff;
    }

    public void setFf(LocalDate ff) {
        this.ff = ff;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

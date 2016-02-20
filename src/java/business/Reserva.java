/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Aquino
 */
public class Reserva {

    private int id_reserva;
    private Habitacion habitacion;
    private String fec_reserva;
    private String fec_inicio;
    private String fec_fin;
    private int dias;
    private Cliente cliente;
    private float venta_total;
    private String observacion;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFec_fin() {
        return fec_fin;
    }

    public void setFec_fin(String fec_fin) {
        this.fec_fin = fec_fin;
    }

    public String getFec_inicio() {
        return fec_inicio;
    }

    public void setFec_inicio(String fec_inicio) {
        this.fec_inicio = fec_inicio;
    }

    public String getFec_reserva() {
        return fec_reserva;
    }

    public void setFec_reserva(String fec_reserva) {
        this.fec_reserva = fec_reserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public float getVenta_total() {
        return venta_total;
    }

    public void setVenta_total(float venta_total) {
        this.venta_total = venta_total;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}

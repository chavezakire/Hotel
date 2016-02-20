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
public class Habitacion {

    private int id_habitacion;
    private Hotel hotel;
    private Tipo_Habitacion tipo_hab;
    private String cod_habitacion;
    private String estado;
    private String numhab;
    private String piso;
    private float precio;

    public String getCod_habitacion() {
        return cod_habitacion;
    }

    public void setCod_habitacion(String cod_habitacion) {
        this.cod_habitacion = cod_habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getNumhab() {
        return numhab;
    }

    public void setNumhab(String numhab) {
        this.numhab = numhab;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Tipo_Habitacion getTipo_hab() {
        return tipo_hab;
    }

    public void setTipo_hab(Tipo_Habitacion tipo_hab) {
        this.tipo_hab = tipo_hab;
    }
}

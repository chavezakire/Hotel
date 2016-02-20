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
public class Tipo_Habitacion {

    private int id_tipo_hab;
    private String nombre;
    private String detalle;

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getId_tipo_hab() {
        return id_tipo_hab;
    }

    public void setId_tipo_hab(int id_tipo_hab) {
        this.id_tipo_hab = id_tipo_hab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

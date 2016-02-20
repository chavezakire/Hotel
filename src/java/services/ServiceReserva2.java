/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import business.Cliente;
import business.Habitacion;
import business.Reserva;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import managers.MngReserva;

/**
 *
 * @author Javier
 */
@WebService(serviceName = "ServiceReserva2")
public class ServiceReserva2 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "add_Reserva")
    public boolean add_Reserva(@WebParam(name = "habitacion") int habitacion, @WebParam(name = "fecini") String fecini, @WebParam(name = "fecfin") String fecfin, @WebParam(name = "venta") float venta, @WebParam(name = "cliente") String cliente) {

        Reserva reserv = new Reserva();

        Habitacion habi = new Habitacion();
        habi.setId_habitacion(habitacion);

        reserv.setHabitacion(habi);
        reserv.setFec_inicio(fecini);
        reserv.setFec_fin(fecfin);
        reserv.setVenta_total(venta);

        Cliente cli = new Cliente();
        cli.setDni(cliente);

        reserv.setCliente(cli);
        MngReserva mngreserva = new MngReserva();
        try {
            mngreserva.add_Reserva(reserv);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @WebMethod(operationName = "HistorialReservaCliente")
    public ArrayList<Reserva> HistorialReservaCliente(@WebParam(name = "dni") String dni) {
        ArrayList<Reserva> reserv = null;
        MngReserva mngres = new MngReserva();
        reserv = new ArrayList<Reserva>();
        try {
            reserv = mngres.HistorialReservaCliente(dni);
        } catch (Exception e) {
        }
        return reserv;
    }
}

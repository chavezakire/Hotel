/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import business.Habitacion;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import managers.MnHabitacion;

/**
 *
 * @author Javier
 */
@WebService(serviceName = "ServiceHabitacion2")
public class ServiceHabitacion2 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "findHabDisponible")
    public ArrayList<Habitacion> findHabDisponible(@WebParam(name = "idhotel") int idhotel, @WebParam(name = "tipohab") int tipohab, @WebParam(name = "fd") String fd, @WebParam(name = "fh") String fh) {
        ArrayList<Habitacion> habs = null;
        MnHabitacion mnghab = new MnHabitacion();
        habs = new ArrayList<Habitacion>();
        try {
            habs = mnghab.findHabDisponible(idhotel, tipohab, fd, fh);
        } catch (Exception e) {
        }
        return habs;
    }
}

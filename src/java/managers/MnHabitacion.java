/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import business.Habitacion;
import business.Hotel;
import business.Tipo_Habitacion;
import java.util.ArrayList;

/**
 *
 * @author Aquino
 */
public class MnHabitacion extends Manager {

    public ArrayList<Habitacion> findHabDisponible(int idhotel, int tipohab, String fd, String fh) {
        ArrayList<Habitacion> habs = null;
        String sql = "";
        sql = " SELECT h.id_habitacion, h.id_hotel, des_razon_social, h.id_tipo_habitacion, des_nombre, num_piso, num_habitacion, num_precio "
                + " FROM tb_habitacion h "
                + " INNER JOIN tb_hotel hot ON hot.id_hotel = h.id_hotel INNER JOIN tb_tipo_habitacion th ON th.id_tipo_habitacion = h.id_tipo_habitacion"
                + " WHERE id_habitacion NOT IN "
                + " (SELECT DISTINCT id_habitacion FROM tb_reserva "
                + " WHERE fec_inicio BETWEEN '" + fd + "' AND '" + fh + "' AND fec_fin BETWEEN '" + fd + "' AND '" + fh + "')";
        if (idhotel > 0) {
            sql += " AND h.id_hotel = " + idhotel;
        }
        if (tipohab > 0) {
            sql += " AND h.id_tipo_habitacion = " + tipohab;
        }
       
        try {
            habs = new ArrayList<Habitacion>();
            rst = stmt.executeQuery(sql);

            while (rst.next()) {
                Habitacion hab = new Habitacion();
                hab.setId_habitacion(rst.getInt("h.id_habitacion"));

                Hotel hot = new Hotel();
                hot.setId_hotel(rst.getInt("h.id_hotel"));
                hot.setRazon_social(rst.getString("des_razon_social"));

                hab.setHotel(hot);

                Tipo_Habitacion thab = new Tipo_Habitacion();
                thab.setId_tipo_hab(rst.getInt("h.id_tipo_habitacion"));
                thab.setNombre(rst.getString("des_nombre"));

                hab.setTipo_hab(thab);

                hab.setPiso(rst.getString("num_piso"));
                hab.setNumhab(rst.getString("num_habitacion"));
                hab.setPrecio(rst.getFloat("num_precio"));
                habs.add(hab);
            }
        } catch (Exception e) {

        }
        return habs;

    }

}

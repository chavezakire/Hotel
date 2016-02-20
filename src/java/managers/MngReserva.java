/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import business.Habitacion;
import business.Hotel;
import business.Reserva;
import business.Tipo_Habitacion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Aquino
 */
public class MngReserva extends Manager {

    public boolean add_Reserva(Reserva reserv) throws SQLException {

        if (reserv.getHabitacion().getId_habitacion() > 0) {
            try {
                String sql = "";
                sql = "INSERT INTO tb_reserva (id_habitacion, fec_reserva, fec_inicio, fec_fin, num_precio_venta, ind_estado, clie_docdni, id_empleado, ind_tipo_reserva) values "
                        + "(" + reserv.getHabitacion().getId_habitacion() + ",now(),'" + reserv.getFec_inicio() + "','" + reserv.getFec_fin() + "'," + reserv.getVenta_total() + ",1,'" + reserv.getCliente().getDni() + "', null, 1)";
                stmt.execute(sql);
                return true;
            } catch (SQLException e) {
                throw new SQLException("No accedio");
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            throw new SQLException("No guardo!");
        }
    }

    public ArrayList<Reserva> HistorialReservaCliente(String dni) {
        ArrayList<Reserva> reserv = null;
        try {
            String str = "";
            str = "SELECT id_reserva, r.id_habitacion, h.id_hotel, des_razon_social, h.id_tipo_habitacion, des_nombre, num_habitacion, num_piso,"
                    + " fec_inicio, fec_fin, datediff(fec_fin,fec_inicio) AS dias, num_precio "
                    + " FROM tb_reserva r INNER JOIN tb_habitacion h ON h.id_habitacion = r.id_habitacion "
                    + " INNER JOIN tb_hotel ho ON ho.id_hotel = h.id_hotel "
                    + " INNER JOIN tb_tipo_habitacion thab ON thab.id_tipo_habitacion = h.id_tipo_habitacion"
                    + " WHERE clie_docdni = '" + dni + "' ORDER BY fec_reserva desc";

            reserv = new ArrayList<Reserva>();
            rst = stmt.executeQuery(str);
            while (rst.next()) {
                Reserva resv = new Reserva();
                resv.setId_reserva(rst.getInt("id_reserva"));

                Habitacion hab = new Habitacion();
                hab.setId_habitacion(rst.getInt("r.id_habitacion"));

                Hotel hot = new Hotel();
                hot.setId_hotel(rst.getInt("h.id_hotel"));
                hot.setRazon_social(rst.getString("des_razon_social"));

                Tipo_Habitacion thab = new Tipo_Habitacion();
                thab.setId_tipo_hab(rst.getInt("h.id_tipo_habitacion"));
                thab.setNombre(rst.getString("des_nombre"));

                hab.setHotel(hot);
                hab.setTipo_hab(thab);
                hab.setNumhab(rst.getString("num_habitacion"));
                hab.setPiso(rst.getString("num_piso"));

                resv.setHabitacion(hab);
                resv.setFec_inicio(rst.getString("fec_inicio"));
                resv.setFec_fin(rst.getString("fec_fin"));
                resv.setDias(rst.getInt("dias"));
                resv.setVenta_total(rst.getFloat("num_precio"));

                reserv.add(resv);

            }
        } catch (Exception e) {
        }
        return reserv;
    }
}

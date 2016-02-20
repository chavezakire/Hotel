/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aquino
 */
public class Conn {

    private static Connection conn;

    public static void setConn() {
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/bdhotel2";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                setConn();
            }
        } catch (SQLException e) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }

}

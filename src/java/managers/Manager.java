/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aquino
 */
import conn.Conn;
import java.sql.SQLException;

public class Manager {

    protected Statement stmt;
    protected Statement stmt1;
    protected Statement stmt2;
    protected Statement stmt3;
    protected CallableStatement cstm;
    protected ResultSet rst;

    public Manager() {
        try {
            stmt = Conn.getConn().createStatement();
            stmt1 = Conn.getConn().createStatement();
            stmt2 = Conn.getConn().createStatement();
            stmt3 = Conn.getConn().createStatement();
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }

}

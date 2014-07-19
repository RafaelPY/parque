/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class Helper {

    private String _Class = "net.sourceforge.jtds.jdbc.Driver";
    private static String _host = "jdbc:jtds:sqlserver://";
    private static String User = "sa";
    private static String pass = "ponce";
    private static String Server = "localhost:28660/";
    private static String bd = "BDPARQUE;TDS=4.2;";
    private static String url = _host + Server + bd;
    CallableStatement cmd;

    public Connection Conexion() {
        Connection cn = null;
        try {
            Class.forName(_Class);
            cn = DriverManager.getConnection(url, User, pass);
            System.out.println("Conecto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de la conexión");
        }
        return cn;
    }

    public ResultSet executeDataset(String proc, Object[] args) throws Exception {
        ResultSet result = null;
        try {
            cmd = this.Conexion().prepareCall(proc);
            for (int i = 0; i < args.length; i++) {
                cmd.setObject(i + 1, args[i]);
            }
            result = cmd.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " executeDataset");
        } finally {
            try {
            } catch (Exception e) {
            }
        }
        return result;
    }

    public int executeNonQuery(String proc, Object[] args) throws Exception {
        int f = 0;
        try {
            cmd = this.Conexion().prepareCall(proc);
            for (int i = 0; i < args.length; i++) {
                cmd.setObject(i + 1, args[i]);
            }
            f = cmd.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " executeNonQuery Exception");
        } finally {
            try {
            } catch (Exception e) {
            }
        }
        return f;
    }

}

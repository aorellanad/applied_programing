/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bpuni
 */
public class Conexion {

    private String servername = "localhost";
    private String database = "ejemplo";
    private String url = "jdbc:mysql://localhost:3306/" + database;
    private String username = "root";
    private String password = "123";
    private Connection con = null;
    private Statement stm = null;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public void Conectar() {

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            System.out.println("Conectado a la base de datos");
        } catch (Exception ex) {
            String ErrString = "Error al conectar a la base de datos" + ex.getMessage();
            System.out.println(ErrString);

        }
    }

    public void Desconectar() {
        if (this.con != null) {
            try {
                this.stm.close();
                this.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

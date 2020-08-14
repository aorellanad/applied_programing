package main;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String servername = "localhost";
    private String database = "Taller";
    private String url = "jdbc:mysql://localhost:3307/" + database;
    private String username = "root";
    private String password = "123";
    
    private Connection con=null;
    private Statement stm=null;
    
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con = con;
    }
    public Statement getStm(){
        return stm;
    }
    public void setStm(Statement stm){
        this.stm=stm;
    }

    public Statement Conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            System.out.println("Coneccion a la base...");
        } catch (Exception ex) {
            String ErrString = "error al conectar a la base de datos" + ex.getMessage();
            System.out.println(ErrString);
        }
        return stm;
    }
    
    public void Desconectar()
    {
        if (this.con != null) {
            try {
                this.stm.close();
                this.con.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null,ex);
                //System.out.println("Error al desconectar");
            }
        }
    }
}

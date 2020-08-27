/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author bpuni
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import main.Conexion;
import models.Datos;

public class CrudJuegos {

    private Datos Dtojuego;

    public Datos getDtojuego() {
        return Dtojuego;
    }

    public void setDtoPersona(Datos Dtojuego) {
        this.Dtojuego = Dtojuego;
    }

    public String GuardarNuevo(Datos DtoPersona) {
        this.setDtoPersona(DtoPersona);
        String mensaje = "";
        try {
            Conexion cn = new Conexion();
            cn.Conectar();
            String sentencia = "Insert into juegos (nombre_juego, fecha_lanzamiento,precio,tipo_consola,apto_niños,genero) values (?,?,?,?,?,?)";
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setString(1, this.Dtojuego.getNombre());
            pst.setString(2, this.Dtojuego.getFechaLan());
            pst.setString(3, this.Dtojuego.getPrecio());
            pst.setInt(4, this.Dtojuego.getConsola());
            pst.setString(5, this.Dtojuego.getApto());
            //pst.setString(6, this.Dtojuego.getGenero());
            pst.execute();
            mensaje = "REGISTRO GUARDADO EXITOSAMENTE";
        } catch (SQLException ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

}

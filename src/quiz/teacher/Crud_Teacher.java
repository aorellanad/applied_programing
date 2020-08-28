/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.teacher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bpuni
 */
public class Crud_Teacher {

    private Datos DtoTeac;

    public Datos getDtoTeac() {
        return DtoTeac;
    }

    public void setDtoTeac(Datos DtoTeac) {
        this.DtoTeac = DtoTeac;
    }


    public String GuardarNuevo(Datos DtoTeac) {
        this.setDtoTeac(DtoTeac);
        String mensaje = "";
        try {
            Conexion cn = new Conexion();
            cn.Conectar();
            String sentencia = "Insert into datos (id,nombres,apellidos,edad,registro,genero,idioma) values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, this.DtoTeac.getId());
            pst.setString(2, this.DtoTeac.getNombres());
            pst.setString(3, this.DtoTeac.getApellidos());
            pst.setInt(4, this.DtoTeac.getEdad());
            pst.setInt(5, this.DtoTeac.getRegistro());
            pst.setString(6, this.DtoTeac.getGenero());
            pst.setString(7, this.DtoTeac.getIdioma());
            pst.execute();
            mensaje = "REGISTRO GUARDADO EXITOSAMENTE";
        } catch (SQLException ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

    public ArrayList<Datos> getLista() {
        ArrayList<Datos> listado = new ArrayList<Datos>();

        try {
            Conexion cn = new Conexion();
            String sentencia = "Select * from datos";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareCall(sentencia);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Datos p = new Datos(rs.getInt("id"), rs.getString("nombres"), rs.getString("apellidos"), rs.getInt("edad"), rs.getInt("registro"), rs.getString("genero"), rs.getString("idioma"));
                listado.add(p);
            }
            cn.Desconectar();
        } catch (SQLException ex) {

        }
        return listado;

    }
     public Datos BuscarxCodigo(int id){
       Datos dto=new Datos();
       try{
           Conexion cn = new Conexion();
           String sentencia="Select * from datos where id=?";
           cn.Conectar();
           PreparedStatement pst=cn.getCon().prepareStatement(sentencia);
           pst.setInt(1, id);
           ResultSet rs=pst.executeQuery();
           while (rs.next()){
               dto.setId(rs.getInt("id"));
               dto.setNombres(rs.getString("nombres"));
               dto.setApellidos(rs.getString("apellidos"));
               dto.setEdad(rs.getInt("edad"));
               dto.setRegistro(rs.getInt("registro"));
               dto.setGenero(rs.getString("genero"));
               dto.setIdioma(rs.getString("idioma"));
           
       }
           cn.Desconectar();
       }catch (Exception ex){
           System.out.println("NO SE PUDO CONSULTAR.....");
       }
       return dto;
   }
   
   public String Actualizar(Datos DtoTeac){
       this.setDtoTeac(DtoTeac);
       String mensaje="";
       try{
           Conexion cn=new Conexion();
           String sentencia="Update datos set nombres=?,apellidos=?,edad=?,registro=?,genero=?,idioma=? where id=? ";
           cn.Conectar();
           PreparedStatement pst=cn.getCon().prepareStatement(sentencia);
           pst.setString(1, this.DtoTeac.getNombres());
           pst.setString(2, this.DtoTeac.getApellidos());
           pst.setInt(3, this.DtoTeac.getEdad());
           pst.setInt(4, this.DtoTeac.getRegistro());
           pst.setString(5, this.DtoTeac.getGenero());
           pst.setString(6, this.DtoTeac.getIdioma());
           pst.setInt(7, this.DtoTeac.getId());
           pst.execute();
           mensaje="Registro actualizado...";
           cn.Desconectar();
        }catch(Exception ex){
            mensaje="Error "+ex.getMessage();
        }
       return mensaje;
    }
}

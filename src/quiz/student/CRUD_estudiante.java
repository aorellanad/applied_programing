package quiz.student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUD_estudiante {

    private datosEstudiantes estcrud;

    public datosEstudiantes getEstcrud() {
        return estcrud;
    }

    public void setEstcrud(datosEstudiantes estcrud) {
        this.estcrud = estcrud;
    }

    public String GuardarNuevo(datosEstudiantes estcrud) {
        this.setEstcrud(estcrud);
        String mensaje = "";
        try {
            coneccion cn = new coneccion();
            cn.Conectar();
            String sentencia = "Insert into estudiante (codigo,nombre,apellido,edad,cedula,genero,direccion,quintil,asignatura) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, this.estcrud.getCodigo());
            pst.setString(2, this.estcrud.getNombre());
            pst.setString(3, this.estcrud.getApellido());
            pst.setInt(4, this.estcrud.getEdad());
            pst.setString(5, this.estcrud.getCedula());
            pst.setString(6, this.estcrud.getGenero());
            pst.setString(7, this.estcrud.getDireccion());
            pst.setInt(8, this.estcrud.getQuintil());
            pst.setString(9, this.estcrud.getAsignatura());
            pst.execute();
            mensaje = "REGISTRO GUARDADO EXITOSAMENTE";
        } catch (SQLException ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

    public ArrayList<datosEstudiantes> getLista() {
        ArrayList<datosEstudiantes> listado = new ArrayList<datosEstudiantes>();

        try {
            coneccion cn = new coneccion();
            String sentencia = "Select * from estudiante";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareCall(sentencia);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //---estudiante (codigo,nombre,apellido,edad,cedula,genero,direccion,quintil,asignatura)
                datosEstudiantes p = new datosEstudiantes(rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("cedula"),
                        rs.getString("genero"),
                        rs.getString("direccion"),
                        rs.getInt("quintil"),
                        rs.getString("asignatura"));
                listado.add(p);
            }
            cn.Desconectar();
        } catch (SQLException ex) {

        }
        return listado;

    }

    public datosEstudiantes BuscarxCodigo(int codigo) {
        datosEstudiantes dto = new datosEstudiantes();
        try {
            coneccion cn = new coneccion();
            String sentencia = "Select * from estudiante where codigo=?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //---estudiante (codigo,nombre,apellido,edad,cedula,genero,direccion,quintil,asignatura)
                dto.setCodigo(rs.getInt("codigo"));
                dto.setNombre(rs.getString("nombre"));
                dto.setApellido(rs.getString("apellido"));
                dto.setEdad(rs.getInt("edad"));
                dto.setCedula(rs.getString("cedula"));
                dto.setGenero(rs.getString("genero"));
                dto.setDireccion(rs.getString("direccion"));
                dto.setQuintil(rs.getInt("quintil"));
                dto.setAsignatura(rs.getString("asignatura"));
                //----

            }
            cn.Desconectar();
        } catch (Exception ex) {
            System.out.println("NO SE PUDO CONSULTAR.....");
        }
        return dto;
    }

    public String Actualizar(datosEstudiantes estcrud) {
        this.setEstcrud(estcrud);
        String mensaje = "";
        try {
            coneccion cn = new coneccion();
            String sentencia = "Update estudiante set nombre=?,apellido=?,edad=?,cedula=?,genero?,direccion=?,quintil=?,asignatura=? where codigo=? ";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, this.estcrud.getCodigo());
            pst.setString(2, this.estcrud.getNombre());
            pst.setString(3, this.estcrud.getApellido());
            pst.setInt(4, this.estcrud.getEdad());
            pst.setString(5, this.estcrud.getCedula());
            pst.setString(6, this.estcrud.getGenero());
            pst.setString(7, this.estcrud.getDireccion());
            pst.setInt(8, this.estcrud.getQuintil());
            pst.setString(9, this.estcrud.getAsignatura());
            pst.execute();
            mensaje = "Registro actualizado...";
            cn.Desconectar();
        } catch (Exception ex) {
            mensaje = "Error " + ex.getMessage();
        }
        return mensaje;
    }

}

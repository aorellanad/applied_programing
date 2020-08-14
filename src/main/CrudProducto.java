package main;

//import coneccion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CrudProducto {

    private ArrayList<producto1> lista = new ArrayList();
    private producto1 dtoProducto;
    String mensaje = "";

    public producto1 getDtoProducto() {
        return dtoProducto;
    }

    public void setDtoProducto(producto1 dtoProducto) {
        this.dtoProducto = dtoProducto;
    }

    public String guardarNuevo(producto1 dtoProducto) {
        this.dtoProducto = dtoProducto;
        //String mensaje = "";
        try {
            Conexion cn = new Conexion();
            Statement st = cn.Conectar();
            String sentencia = "Insert into producto (IDproducto,Descripcion,Stock,precio) values(?,?,?,?) ";
            //st.getConnection().prepareStatement(sentencia);
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia); //preparedtatement(sentencia);
            pst.setInt(1, this.dtoProducto.getIDproducto());
            pst.setString(2, this.dtoProducto.getDescripcion());
            pst.setInt(3, this.dtoProducto.getStock());
            pst.setDouble(4, this.dtoProducto.getPrecio());
            pst.execute();
            mensaje = "registro guardado...";

        } catch (Exception ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

    public ArrayList<producto1> getLista() {
        ArrayList<producto1> listado = new ArrayList<producto1>();
        try {
            Conexion cn = new Conexion();
            String sentencia = "Select * from producto";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                producto1 dto = new producto1(rs.getInt("IDproducto"), rs.getString("Descripcion"), rs.getInt("Stock"), rs.getInt("Precio"));
                listado.add(dto);
            }
            cn.Desconectar();
        } catch (Exception ex) {
            System.out.println("no se pudo consultar...");
        }
        return listado;
    }

    public producto1 BuscarxProducto(int IDProducto) {
        producto1 prod = new producto1();
        try {
            Conexion cn = new Conexion();
            String sentencia = "Select * from producto where IDproducto =?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, IDProducto);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                prod.setIDproducto(rs.getInt("IDproducto"));
                prod.setDescripcion(rs.getString("Descripcion"));
                prod.setStock(rs.getInt("Stock"));
                prod.setPrecio(rs.getDouble("Precio"));
            }
            cn.Desconectar();
        } catch (Exception ex) {
            System.out.println("no se pudo conectar...");
        }
        return prod;
    }

    public String Actualizar(producto1 dtoProducto) {
        this.setDtoProducto(dtoProducto);
        String mensaje = "";
        try {
            Conexion cn = new Conexion();
            String sentencia = "Update producto set Descripcion=?,Stock=?,Precio=? where IDproducto=?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setString(1, this.dtoProducto.getDescripcion());
            pst.setInt(2, this.dtoProducto.getStock());
            pst.setDouble(3, this.dtoProducto.getPrecio());
            pst.setInt(4, this.dtoProducto.getIDproducto());
            pst.execute();
            mensaje = "Registro actualizado...";
            cn.Desconectar();
        } catch (Exception ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

    public String EliminarxProducto(int IDprodicto)
    {
        String mensaje;
        try {
            Conexion cn= new Conexion();
            String sentencia="Delete from producto Where IDproducto=?";
            cn.Conectar();
            PreparedStatement pst=cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, IDprodicto);
            pst.execute();
            cn.Desconectar();
            mensaje = "Registro eliminado";
        } catch (Exception ex)
        {
            mensaje= "no se pudo eliminar...";
        }
        return mensaje;
    }
    
}

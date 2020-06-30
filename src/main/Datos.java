
package main;


public class Datos {
    private String Nombre;
    private String fechaLan;
    private String precio;
    private int consola;
    private String apto;
    private int[] genero= new int[6];
    private String comentarios;

    public Datos() {
    }

    public Datos(String Nombre, String fechaLan, String precio, int consola, String apto, int [] genero, String comentarios) {
        this.Nombre = Nombre;
        this.fechaLan = fechaLan;
        this.precio = precio;
        this.consola = consola;
        this.apto = apto;
        this.genero= genero;
        this.comentarios= comentarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaLan() {
        return fechaLan;
    }

    public void setFechaLan(String fechaLan) {
        this.fechaLan = fechaLan;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public int[] getGenero() {
        return genero;
    }

    public void setGenero(int[] genero) {
        this.genero = genero;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }    
}

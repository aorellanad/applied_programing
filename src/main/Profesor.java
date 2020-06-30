
package main;

public class Profesor {
    private String nombre;
    private String apellido;
    private String cedula;
    private int titulo;
    private String sueldo;
    private String asociado;
     private int[] profesionales= new int[5];

    public Profesor(String nombre, String apellido, String cedula, int titulo, String sueldo, String asociado, int[] profesionales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.titulo = titulo;
        this.sueldo = sueldo;
        this.asociado = asociado;
        this.profesionales=profesionales;
    }

    Profesor() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getAsociado() {
        return asociado;
    }

    public void setAsociado(String asociado) {
        this.asociado = asociado;
    }

    public int[] getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(int[] profesionales) {
        this.profesionales = profesionales;
    }
     
     
}

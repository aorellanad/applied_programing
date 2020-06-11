
package main;


public class Persona {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String genero;
    private int instruccion;
    /**
     @param nombres
     @param apellidos
     @param cedula
     @param genero
     @param instruccion
     */
    
    public Persona(String nombres, String apellidos, String cedula, String genero, int instruccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.genero = genero;
        this.instruccion = instruccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(int instruccion) {
        this.instruccion = instruccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", genero=" + genero + ", instruccion=" + instruccion + '}';
    }
    
}

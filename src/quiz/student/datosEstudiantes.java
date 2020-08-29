package quiz.student;

public class datosEstudiantes {

    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String genero;
    private String direccion;
    private int quintil;
    private String asignatura;

    public datosEstudiantes(int codigo, String nombre, String apellido, int edad, String cedula, String genero, String direccion, int quintil, String asignatura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
        this.direccion = direccion;
        this.quintil = quintil;
        this.asignatura = asignatura;
    }

    
    
    public datosEstudiantes() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getQuintil() {
        return quintil;
    }

    public void setQuintil(int quintil) {
        this.quintil = quintil;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    
}

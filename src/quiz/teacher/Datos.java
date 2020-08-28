package quiz.teacher;

/**
 *
 * @author bpuni
 */
public class Datos {

    private int id;
    private String Nombres;
    private String Apellidos;
    private int edad;
    private int registro;
    private String genero;
    private String idioma;

    public Datos() {
    }

    public Datos(int id, String Nombres, String Apellidos, int edad, int registro, String genero, String idioma) {
        this.id = id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.registro = registro;
        this.genero = genero;
        this.idioma = idioma;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}

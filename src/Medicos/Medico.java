package Medicos;
public class Medico {
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private int Especialidad;
    private double Sueldo;
    private String CodigoRegistroDeColegioDeMedicos;
    private String FechadeRegistro;
    private String PrestadordelIESS;//SI y No
    private int ListadeSegurosMedicosAsociados;
    private int[]ListaSeguroMedico = new int [5];
    
        public Medico(String Nombre, String Apellido, String Cedula, double Sueldo, String CodigoRegistroDeColegioDeMedicos, String FechadeRegistro, String PrestadordelIESS, int ListadeSegurosMedicosAsociados,int[]ListaSeguroMedico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Sueldo = Sueldo;
        this.CodigoRegistroDeColegioDeMedicos = CodigoRegistroDeColegioDeMedicos;
        this.FechadeRegistro = FechadeRegistro;
        this.PrestadordelIESS = PrestadordelIESS;
        this.ListadeSegurosMedicosAsociados = ListadeSegurosMedicosAsociados;
        this.ListaSeguroMedico = ListaSeguroMedico;
    }

    public Medico() {
    }

    public int[] getListaSeguroMedico() {
        return ListaSeguroMedico;
    }

    public void setListaSeguroMedico(int[] ListaSeguroMedico) {
        this.ListaSeguroMedico = ListaSeguroMedico;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(int Especialidad) {
        this.Especialidad = Especialidad;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getCodigoRegistroDeColegioDeMedicos() {
        return CodigoRegistroDeColegioDeMedicos;
    }

    public void setCodigoRegistroDeColegioDeMedicos(String CodigoRegistroDeColegioDeMedicos) {
        this.CodigoRegistroDeColegioDeMedicos = CodigoRegistroDeColegioDeMedicos;
    }

    public String getFechadeRegistro() {
        return FechadeRegistro;
    }

    public void setFechadeRegistro(String FechadeRegistro) {
        this.FechadeRegistro = FechadeRegistro;
    }

    public String getPrestadordelIESS() {
        return PrestadordelIESS;
    }

    public void setPrestadordelIESS(String PrestadordelIESS) {
        this.PrestadordelIESS = PrestadordelIESS;
    }

    public int getListadeSegurosMedicosAsociados() {
        return ListadeSegurosMedicosAsociados;
    }

    public void setListadeSegurosMedicosAsociados(int ListadeSegurosMedicosAsociados) {
        this.ListadeSegurosMedicosAsociados = ListadeSegurosMedicosAsociados;
    }
    
    
    
}

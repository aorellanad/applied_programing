package models;

public class Calificaciones {
    
    int nota1, nota2, nota3;
    
    public Calificaciones(String Nota1, String Nota2, String Nota3){
        nota1 = Integer.valueOf(Nota1);
        nota2 = Integer.valueOf(Nota2);
        nota3 = Integer.valueOf(Nota3);
    }
    
    int calcularPromedio(){
        return (this.nota1 + this.nota2 + this.nota3)/3;
    }
    
    public String observacion(){
        int promedio = calcularPromedio();
        if(promedio>14){
            return "APROBADO";
        }else if(promedio>7 && promedio<13){
            return "SUPLETORIO";
        }else{
            return "REPROBADO";
        }
    }
}

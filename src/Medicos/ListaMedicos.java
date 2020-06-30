package Medicos;
import java.util.ArrayList;
public class ListaMedicos {
    protected ArrayList<Medico> lista=new ArrayList<Medico>();
    public ArrayList<Medico>getLista(){
        return lista;
    }
    public void Agregar(Medico Mdc){
        lista.add(Mdc);
    }
    public Medico Buscar_cedula(String cedula)
    {   Medico M=new Medico();
        for (int i = 0; i < lista.size(); i++) 
        {
            if (lista.get(i).getCedula().equals(cedula))
            {
                return lista.get(i);
            }
                  }
        return M;
    }
    public void Eliminar_cedula(String cedula)
    {
        for (int i = 0; i < lista.size(); i++) 
        {
            if (lista.get(i).getCedula().equals(cedula))
            {
                lista.remove(i);
            }
        }
    }
    
    
}

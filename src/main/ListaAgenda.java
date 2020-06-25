/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Steven Pérez
 */
public class ListaAgenda {
    private ArrayList<Agenda> lista=new ArrayList<Agenda>();

    public ArrayList<Agenda> getLista() {
        return lista;
    }
   
    public void Agregar(Agenda p)
    {
        lista.add(p);
    }
    
    public Agenda Buscarxnombre (String nombre)
    {  Agenda p=new Agenda();
        for(int i=0;i<lista.size();i++)
        {
            if(lista.get(i).getNombre().equals(nombre))
            {
                return lista.get(i);
            }
        }
        return p;
    }
    
    public void Actualizarxnombre(Agenda p)
    {  
        for(int i=0;i<lista.size();i++)
        {
            if(lista.get(i).getNombre().equals(p.getNombre()))
            {
                lista.get(i).setNombre(p.getNombre());
                lista.get(i).setActividad(p.getActividad());
                lista.get(i).setH_inicio(p.getH_inicio());
                lista.get(i).setH_final(p.getH_final());
                lista.get(i).setT_ac(p.getT_ac()); 
                lista.get(i).setDia_actividad(p.getDia_actividad());
            }
        }
    }
    
    public void Eliminarxnombre(String nombre)
    {
        for(int i=0;i<lista.size();i++)
        {
            if(lista.get(i).getNombre().equals(nombre))
            {
                lista.remove(i);
            }
        }
    }
    
   
}

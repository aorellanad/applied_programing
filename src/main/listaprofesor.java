/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class listaprofesor {
    ArrayList<Profesor> lista=new ArrayList<Profesor>();
    
    public ArrayList<Profesor> getLista(){
        return lista;
    }
    public void Agregar(Profesor p){
        lista.add(p);
    }
    
    public Profesor Buscarxcedula(String cedula){
        Profesor p= new Profesor();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(cedula)) {
                return lista.get(i);
            }
        }
        return p;
    }
    
    public void Actualizarxcedula(Profesor p){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(p.getCedula())) {
                lista.get(i).setNombre(p.getNombre());
                lista.get(i).setApellido(p.getApellido());
                lista.get(i).setTitulo(p.getTitulo());
                lista.get(i).setAsociado(p.getAsociado());
                lista.get(i).setProfesionales(p.getProfesionales());
                lista.get(i).setSueldo(p.getSueldo());
            }
        }
    }
    
    public void Eliminarxcedula(String Cedula){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(Cedula)) {
               lista.remove(i);
            }
        }
    }

    }
    


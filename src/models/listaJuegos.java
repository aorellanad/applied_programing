/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.Datos;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class listaJuegos {
    private ArrayList<Datos> lista = new ArrayList<Datos>();

    public ArrayList<Datos> getLista() {
        return lista;
    }

    public void Agregar(Datos p) {
        lista.add(p);
    }

    public Datos BuscarxFecha(String nombre, String fechalan) {
        Datos p = new Datos();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(nombre)) {
                if (lista.get(i).getFechaLan().equals(fechalan)) {
                    return lista.get(i);
                }

            }
        }
        return p;
    }

    public void ModificarxFecha(Datos p) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(p.getNombre())) {
                if (lista.get(i).getFechaLan().equals(p.getFechaLan())) {
                    lista.get(i).setPrecio(p.getPrecio());
                    lista.get(i).setApto(p.getApto());
                    lista.get(i).setConsola(p.getConsola());
                    lista.get(i).setGenero(p.getGenero());
                }
            }
        }
    }

    public void EliminarxFecha(String nombre, String fechalan) {
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getNombre().equals(nombre)) {
                if (lista.get(i).getFechaLan().equals(fechalan)) {
                    lista.remove(i);
                }
            }
        }
    }
}

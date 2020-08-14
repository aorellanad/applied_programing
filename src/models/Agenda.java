/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Steven Pérez
 */
public class Agenda {
    private String nombre;
    private int t_ac;
    private String h_inicio;
    private String h_final;
    private String actividad;
    private int[] dia_actividad;
    /**
     @param nombre
     @param t_ac
     @param h_inicio
     @param h_final
     @param actividad
     @param dia_actividad
     */
    
    public Agenda() {
    }

    public Agenda(String nombre, int t_ac, String h_inicio, String h_final, String actividad, int[] dia_actividad) {
        this.nombre = nombre;
        this.t_ac = t_ac;
        this.h_inicio = h_inicio;
        this.h_final = h_final;
        this.actividad = actividad;
        this.dia_actividad = dia_actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getT_ac() {
        return t_ac;
    }

    public void setT_ac(int t_ac) {
        this.t_ac = t_ac;
    }

    public String getH_inicio() {
        return h_inicio;
    }

    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    public String getH_final() {
        return h_final;
    }

    public void setH_final(String h_final) {
        this.h_final = h_final;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int[] getDia_actividad() {
        return dia_actividad;
    }

    public void setDia_actividad(int[] dia_actividad) {
        this.dia_actividad = dia_actividad;
    }

   
}

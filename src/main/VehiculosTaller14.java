/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Steven Pérez
 */
public class VehiculosTaller14 {
    public String propietario;
    public String Tipo_de_vehiculo;
    public int Numero_de_Puertas;
    public String Color;
    public String Modelo;
    public String Marca;
    public String Placa;
    public int chasis;
    public String Importacion;
    public int año;
    public double precio;

    public VehiculosTaller14(String propietario, String Tipo_de_vehiculo, int Numero_de_Puertas, String Color, String Modelo, String Marca, String Placa, int chasis, String Importacion, int año, double precio) {
        this.propietario = propietario;
        this.Tipo_de_vehiculo = Tipo_de_vehiculo;
        this.Numero_de_Puertas = Numero_de_Puertas;
        this.Color = Color;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Placa = Placa;
        this.chasis = chasis;
        this.Importacion = Importacion;
        this.año = año;
        this.precio = precio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String Propietario) {
        this.propietario = propietario;
    }

    public String getTipo_de_vehiculo() {
        return Tipo_de_vehiculo;
    }

    public void setTipo_de_vehiculo(String Tipo_de_vehiculo) {
        this.Tipo_de_vehiculo = Tipo_de_vehiculo;
    }

    public int getNumero_de_Puertas() {
        return Numero_de_Puertas;
    }

    public void setNumero_de_Puertas(int Numero_de_Puertas) {
        this.Numero_de_Puertas = Numero_de_Puertas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getImportacion() {
        return Importacion;
    }

    public void setImportacion(String Importacion) {
        this.Importacion = Importacion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}

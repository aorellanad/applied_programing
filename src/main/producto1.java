
package main;

public class producto1 {
    private int IDproducto;
    private String Descripcion;
    private int Stock;
    private double precio;

    public producto1(int IDproducto, String Descripcion, int Stock, double precio) {

        this.IDproducto = IDproducto;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.precio = precio;
    }

    public producto1() {
    }

    public int getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

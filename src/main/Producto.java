
package main;


public class Producto {
    
    private String codigo;
    private String descripcion;
    private float precio;
    private int stock;
    private String importado;
    private int tipo;
    private String fechaElab;
    private String fechaExp;

    public Producto() {
    }

    public Producto(String codigo, String descripcion, float precio, int stock, String importado, int tipo, String fechaElab, String fechaExp) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.importado = importado;
        this.tipo = tipo;
        this.fechaElab = fechaElab;
        this.fechaExp = fechaExp;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFechaElab() {
        return fechaElab;
    }

    public void setFechaElab(String fechaElab) {
        this.fechaElab = fechaElab;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }
}

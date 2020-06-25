
package main;

import java.util.ArrayList;

public class ListaProducto {
    private ArrayList<Producto> lista = new ArrayList<>();

    public ArrayList<Producto> getLista() {
        return lista;
    }
    
    public void Agregar(Producto p) {
        lista.add(p);
    }
    
    public Producto Buscarxcog(String codigo) {
        Producto p = new Producto();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(codigo)) {
                return lista.get(i);
            }
        }
        return p;
    }
    
    public void Actualizarxcodigo(Producto p) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(p.getCodigo())) {
                
                lista.get(i).setDescripcion(p.getDescripcion());
                lista.get(i).setPrecio(p.getPrecio());
                lista.get(i).setStock(p.getStock());
                lista.get(i).setImportado(p.getImportado());
                lista.get(i).setTipo(p.getTipo());
                lista.get(i).setFechaElab(p.getFechaElab());
                lista.get(i).setFechaExp(p.getFechaExp());
            }
        }
    }
    public void Eliminarxcedula(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(codigo)) {
                lista.remove(i);
            }
        }
    }
}

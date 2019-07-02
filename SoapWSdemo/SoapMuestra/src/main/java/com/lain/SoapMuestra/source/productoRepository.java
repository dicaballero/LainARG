
package com.lain.SoapMuestra.source;

import java.util.ArrayList;
import java.util.List;

public class productoRepository {
  
    private static List <producto> listaProducto = new ArrayList();

 
    public productoRepository() {}

    public producto getProducto(int i) {
        return listaProducto.get(i);
    }

    public void setProducto(producto p) {
        this.listaProducto.add(p);
    }
    
    public void delProducto(int i) {
        this.listaProducto.remove(i);
    }
    
    public List<producto> getListaProducto() {
        return listaProducto;
    }
    
    public void clearListaProducto(){
    listaProducto.clear();
    }
    
    
    
}

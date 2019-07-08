
package com.lain.SoapMuestra.source;

import java.util.ArrayList;
import java.util.List;

public class productoRepository {
  
    private static List <producto> listaProducto = new ArrayList();

 
    public productoRepository() {}
    
    public static Object createProducto(String s, int i, int ii, double d) {
        producto p = new producto();
        p.setNombre(s);
        p.setId(i);
        p.setCantidad(ii);
        p.setPrecio(d);
        listaProducto.add(p);
        return "Create producto: "+p;
    }
     
    public static Object readProducto(int i) {
        for(producto p:listaProducto){
        if(p.getId()==i){
        return "Read producto: "+p; 
        } 
        }
        return "El producto con id="+i+", no fue encontrado";
    }
 
    public static Object deleteProducto(int i) {
        int index=-1;
        for(producto p:listaProducto){
        index++;
        if(p.getId()==i){
        listaProducto.remove(index);
        return "Delete producto: "+p; 
        }
        
    }
        return "El producto con id="+i+", no fue encontrado";
    }
    
    public static Object updateProducto(String s, int i, int ii, double d){
        for(producto p:listaProducto){
        if(p.getId()==i){
        p.setNombre(s);
        p.setCantidad(ii);
        p.setPrecio(d);
        return "Update producto: "+p;
        }
        }
        return "El producto con id="+i+", no fue encontrado";
    }
    
    public static Object getListaProducto() {
        return "Contenido del repositorio: "+listaProducto;
    }
    
    public static Object clearListaProducto(){
    listaProducto.clear();
    return "Repositorio formateado";
    }
    
    
    
}

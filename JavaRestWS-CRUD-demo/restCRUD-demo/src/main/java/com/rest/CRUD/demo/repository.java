
package com.rest.CRUD.demo;

import java.util.ArrayList;
import java.util.List;

public class repository {
    
    private static List<dataObj> db = new ArrayList(); 

    public repository() {
    }
    
    public String createDb(String s, Long l, int i, double d) {
        for(dataObj dobj:db){
        if(dobj.getId().equals(l)){
        return "Create Producto: El producto con id="+l+", Ya existe!";    
        }    
        }
        dataObj dbj = new dataObj();
        dbj.setNombre(s);
        dbj.setId(l);
        dbj.setCantidad(i);
        dbj.setPrecio(d);
        repository.db.add(dbj);
        return "Create Producto: "+dbj;
    }
    
    public String readDb(Long l) {
        dataObj geted = new dataObj(); 
        for (dataObj s: db){
        if(s.getId().equals(l)) 
        {
            geted=s;
            return "Read Producto: "+geted;
        }
        }
        return "Read Producto: El producto con id="+l+", no fue encontrado";
    } 

    public String updateDb(String s,Long l,int i,double d) {
        
        for (dataObj dbj: db){
        if(dbj.getId().equals(l)){
        dbj.setNombre(s);
        dbj.setCantidad(i);
        dbj.setPrecio(d);
        return "Update Producto: "+dbj;
        }
        }
        return "Update Producto: El producto con id="+l+", no fue encontrado";
        
     }
    
    public String deleteDb(Long l) {   
        
        int index=-1;
        for (dataObj s: db){
        index++;
        if(s.getId().equals(l)){
        db.remove(index);
        return "Delete Producto: El Producto con id="+l+", fue eliminado";
        }
        }
       return  "Delete Producto: El producto con id="+l+", no fue encontrado";
    }
    
    public static String getRepository(){
      return   "Contenido del repositorio: "+db;   
    }
    
    public static String clearRepository(){
        db.clear();
        return "Repositorio formateado";
    } 
}

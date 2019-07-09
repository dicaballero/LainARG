
package com.lain.restws.crud.demo;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.*;
import java.io.*;

public class Main {
 
    private static HttpResponse<String> response; 
    
    public static void main(String[] args) throws UnirestException, IOException {
        
        
        createProducto("SEL",1L,1,1998);
        createProducto("Claymore",2L,1,2007);
        readProducto(2L);
        getListaProducto();
        deleteProducto(2L);
        getListaProducto();
        updateProducto("Serial Experiments Lain",1L,1,1998);
        clearListaProducto();
        getListaProducto();
    }
/*Configuración para realizar parseo JSON, no fue incluido en esta demo*/
/*public static Object cfg(){
    
             Unirest.setObjectMapper(new com.mashape.unirest.http.ObjectMapper() {
                  
                  com.fasterxml.jackson.databind.ObjectMapper objm = new com.fasterxml.jackson.databind.ObjectMapper();
                  
                    @Override
                    public <T> T readValue(String s, Class<T> type) {
                      try {
                          return objm.readValue(s,type);
                      } catch (IOException ex) {
                          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      return "No se pudo concretar readValue";
                    
                    }

                    @Override
                    public String writeValue(Object o) {
                      try {
                          return objm.writeValueAsString(o);
                      } catch (JsonProcessingException ex) {
                          return "JsonProcessingException, writeValue"+ex;
                      }
                    }
                });   
               return "No se pudo concretar writeValue";   
}*/

public static void createProducto(String s,Long l,int i, double d) throws UnirestException{
      
      response = Unirest.post("http://localhost:8080/app/service/create/"+s+"/"+l+"/"+i+"/"+d+"/")
                .header("Content-type","application/json")
                .asString();
                System.out.println(response.getBody());
                
}  

public static void readProducto(Long l) throws UnirestException{
      
      response = Unirest.get("http://localhost:8080/app/service/read/"+l+"/")
                .header("Content-type","application/json")
                .asString();
                System.out.println(response.getBody());
                
}  

public static void updateProducto(String s,Long l,int i, double d) throws UnirestException{
      
      response = Unirest.put("http://localhost:8080/app/service/update/"+s+"/"+l+"/"+i+"/"+d+"/")
                .header("Content-type","application/json")
                .asString();
                System.out.println(response.getBody());
                
}  

public static void deleteProducto(Long l) throws UnirestException{
      
      response = Unirest.delete("http://localhost:8080/app/service/delete/"+l+"/")
                .header("Content-type","application/json")
                .asString();
                System.out.println(response.getBody());
                
} 

public static void getListaProducto() throws UnirestException{
      
      response = Unirest.get("http://localhost:8080/app/service/getRepo")
                .header("Content-type","application/json")
                .asString();
                System.out.println(response.getBody());
                
} 

public static void clearListaProducto() throws UnirestException{
      
      response = Unirest.delete("http://localhost:8080/app/service/clearRepo")
                .header("Content-type","application/json")
                .asString();
                System.out.println(response.getBody());
                
} 



}
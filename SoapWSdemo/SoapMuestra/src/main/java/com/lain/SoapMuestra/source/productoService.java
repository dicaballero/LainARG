
package com.lain.SoapMuestra.source;

import java.util.*;
import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public class productoService {
    
 @WebMethod(operationName="createProducto")   
  public @WebResult(name="Rtdo")producto createProducto(@WebParam(name="nombre")String s, @WebParam(name="id")int i, @WebParam(name="cantidad")int in, @WebParam(name="precio")double d){
    productoRepository pr = new productoRepository();
    producto p = new producto();
    p.setNombre(s);
    p.setId(i);
    p.setCantidad(in);
    p.setPrecio(d);
    pr.setProducto(p);
    return p;
    }
  
  @WebMethod(operationName="readProducto")   
  public @WebResult(name="Rtdo")producto readProducto(@WebParam(name="serviceparam")int i){
     productoRepository pr = new productoRepository();
     producto p = pr.getProducto(i);
     return p;
     }
     
  @WebMethod(operationName="updateProducto")   
  public @WebResult(name="Rtdo")producto updateProducto(@WebParam(name="nombretoupdate")String s, @WebParam(name="idtoupdate")int i, @WebParam(name="cantidadtoupdate")int in, @WebParam(name="preciotoupdate")double d){
    productoRepository pr = new productoRepository();
    producto p = pr.getProducto(i);
    pr.delProducto(i);
    p.setNombre(s);
    p.setCantidad(in);
    p.setPrecio(d);
    pr.setProducto(p);
    return p;
    }
 
  @WebMethod(operationName="deleteProducto")   
  public @WebResult(name="Rtdo")producto deleteProducto(@WebParam(name="serviceparam")int i){
     productoRepository pr = new productoRepository();
     producto p = pr.getProducto(i);
     pr.delProducto(i);
     return p;
     }
  
   @WebMethod(operationName="getListaProducto")   
   public @WebResult(name="Rtdo")List<producto> getListaProducto(){
     productoRepository pr = new productoRepository();
     return pr.getListaProducto();
     }
    
    @WebMethod(operationName="clearListaProducto")   
    public @WebResult(name="Rtdo")String clearListaProducto(){
     productoRepository pr = new productoRepository();
     pr.clearListaProducto();
     return "repositorio borrado";
     }
 
}

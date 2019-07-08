
package com.lain.SoapMuestra.source;

import java.util.*;
import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public class productoService {
    
 @WebMethod(operationName="createProducto")   
  public @WebResult(name="Rtdo")Object createProducto(@WebParam(name="nombre")String s, @WebParam(name="id")int i, @WebParam(name="cantidad")int ii, @WebParam(name="precio")double d){
    return productoRepository.createProducto(s, i, ii, d);
 }
  
  @WebMethod(operationName="readProducto")   
  public @WebResult(name="Rtdo")Object readProducto(@WebParam(name="serviceparam")int i){
    return productoRepository.readProducto(i);
    }
     
  @WebMethod(operationName="updateProducto")   
  public @WebResult(name="Rtdo")Object updateProducto(@WebParam(name="nombretoupdate")String s, @WebParam(name="idtoupdate")int i, @WebParam(name="cantidadtoupdate")int ii, @WebParam(name="preciotoupdate")double d){
    return productoRepository.updateProducto(s, i, ii, d);
    }
 
  @WebMethod(operationName="deleteProducto")   
  public @WebResult(name="Rtdo")Object deleteProducto(@WebParam(name="serviceparam")int i){
    return productoRepository.deleteProducto(i);
    }
  
   @WebMethod(operationName="getListaProducto")   
   public @WebResult(name="Rtdo")Object getListaProducto(){
     return productoRepository.getListaProducto();
     }
    
    @WebMethod(operationName="clearListaProducto")   
    public @WebResult(name="Rtdo")Object clearListaProducto(){
     return productoRepository.clearListaProducto();
     }
 
}

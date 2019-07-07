
package com.lain.soapmuestra.source;

import java.util.List;


public class Main {
    
    private static final String createOutPut     = "Create producto: ";
    private static final String readOutPut       = "Read producto: ";
    private static final String updateOutPut     = "Update producto: ";
    private static final String deleteOutPut     = "Delete producto: ";
    private static final String getRepoOutPut    = "Contenido del repositorio: ";
    private static final String clearRepoOutPut  = "Repositorio formateado: ";
    
    public static void main(String[] args) {
        
        ProductoServiceService pss = new ProductoServiceService();
        ProductoService ps = pss.getProductoServicePort();
        List <Type> lt;
        Type t = new Type();
        
        t = ps.createProducto("SEL", 0, 1, 9999.99);
        outPut(createOutPut,t);
        t = ps.createProducto("Claymore", 1, 1, 9999.99);
        outPut(createOutPut,t);
        lt = ps.getListaProducto();
        outPut(getRepoOutPut,lt);
        t = ps.readProducto(1);
        outPut(readOutPut,t);
        t = ps.deleteProducto(1);
        outPut(deleteOutPut,t);
        lt = ps.getListaProducto();
        outPut(getRepoOutPut,lt);
        t = ps.updateProducto("Serial Experiments Lain", 0, 1, 9999.99);
        outPut(updateOutPut,t);
        lt = ps.getListaProducto();
        outPut(getRepoOutPut,lt);
        ps.clearListaProducto();
        outPut(clearRepoOutPut,"");
        lt = ps.getListaProducto();
        outPut(getRepoOutPut,lt);
              
    }
 
    public static void outPut(String s, Object t){
    System.out.println(s+t);    
    int a;
    }    
    
}

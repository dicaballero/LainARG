
package com.lain.soapmuestra.source;

public class Main {
    
  
    
    public static void main(String[] args) {
        
        ProductoServiceService pss = new ProductoServiceService();
        ProductoService ps = pss.getProductoServicePort();
        
        
        outPut(ps.createProducto("SEL", 0, 1, 9999.99));
        outPut(ps.createProducto("Claymore", 1, 1, 9999.99));
        outPut(ps.getListaProducto());
        outPut(ps.readProducto(1));
        outPut(ps.deleteProducto(1));
        outPut(ps.getListaProducto());
        outPut(ps.updateProducto("Serial Experiments Lain", 0, 1, 9999.99));
        outPut(ps.getListaProducto());
        outPut(ps.clearListaProducto());
        outPut(ps.getListaProducto());
        
    }
 
    public static void outPut(Object o){
        System.out.println(o);
    }
    
}

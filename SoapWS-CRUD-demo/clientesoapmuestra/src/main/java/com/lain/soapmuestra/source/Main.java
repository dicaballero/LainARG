
package com.lain.soapmuestra.source;

import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        
         ProductoServiceService pss = new ProductoServiceService();
        ProductoService ps = pss.getProductoServicePort();
        List <Type> lt;
        Type t = ps.createProducto("SEL", 0, 1, 9999.99);
        System.out.println("Create producto: "+t);
        t = ps.createProducto("Claymore", 1, 1, 9999.99);
        System.out.println("Create producto: "+t);
        t=ps.readProducto(1);
        System.out.println("Read producto: "+t);
        t= ps.deleteProducto(1);
        System.out.println("Delete producto: "+t);
        t=ps.updateProducto("Serial Experiments Lain", 0, 1, 9999.99);
        System.out.println("Update producto: "+t);
        lt=ps.getListaProducto();
        System.out.println("Get Repo: "+lt);
        ps.clearListaProducto();
        System.out.println("Delete Repo");
        lt = ps.getListaProducto();
        System.out.println("Get Repo: "+lt);        
    }
    
}

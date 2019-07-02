
package com.lain.soapmuestra.source;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deleteProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deleteProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceparam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteProducto", propOrder = {
    "serviceparam"
})
public class DeleteProducto {

    protected int serviceparam;

    /**
     * Obtiene el valor de la propiedad serviceparam.
     * 
     */
    public int getServiceparam() {
        return serviceparam;
    }

    /**
     * Define el valor de la propiedad serviceparam.
     * 
     */
    public void setServiceparam(int value) {
        this.serviceparam = value;
    }

}

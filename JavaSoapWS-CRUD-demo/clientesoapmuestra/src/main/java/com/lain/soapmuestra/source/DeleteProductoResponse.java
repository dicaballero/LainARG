
package com.lain.soapmuestra.source;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deleteProductoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deleteProductoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rtdo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteProductoResponse", propOrder = {
    "rtdo"
})
public class DeleteProductoResponse {

    @XmlElement(name = "Rtdo")
    protected Object rtdo;

    /**
     * Obtiene el valor de la propiedad rtdo.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRtdo() {
        return rtdo;
    }

    /**
     * Define el valor de la propiedad rtdo.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRtdo(Object value) {
        this.rtdo = value;
    }

}

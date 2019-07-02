
package com.lain.soapmuestra.source;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clearListaProductoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clearListaProductoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rtdo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearListaProductoResponse", propOrder = {
    "rtdo"
})
public class ClearListaProductoResponse {

    @XmlElement(name = "Rtdo")
    protected String rtdo;

    /**
     * Obtiene el valor de la propiedad rtdo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtdo() {
        return rtdo;
    }

    /**
     * Define el valor de la propiedad rtdo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtdo(String value) {
        this.rtdo = value;
    }

}

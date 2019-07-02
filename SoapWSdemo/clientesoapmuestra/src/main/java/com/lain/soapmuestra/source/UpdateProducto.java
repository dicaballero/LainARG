
package com.lain.soapmuestra.source;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombretoupdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idtoupdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadtoupdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preciotoupdate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProducto", propOrder = {
    "nombretoupdate",
    "idtoupdate",
    "cantidadtoupdate",
    "preciotoupdate"
})
public class UpdateProducto {

    protected String nombretoupdate;
    protected int idtoupdate;
    protected int cantidadtoupdate;
    protected double preciotoupdate;

    /**
     * Obtiene el valor de la propiedad nombretoupdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombretoupdate() {
        return nombretoupdate;
    }

    /**
     * Define el valor de la propiedad nombretoupdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombretoupdate(String value) {
        this.nombretoupdate = value;
    }

    /**
     * Obtiene el valor de la propiedad idtoupdate.
     * 
     */
    public int getIdtoupdate() {
        return idtoupdate;
    }

    /**
     * Define el valor de la propiedad idtoupdate.
     * 
     */
    public void setIdtoupdate(int value) {
        this.idtoupdate = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadtoupdate.
     * 
     */
    public int getCantidadtoupdate() {
        return cantidadtoupdate;
    }

    /**
     * Define el valor de la propiedad cantidadtoupdate.
     * 
     */
    public void setCantidadtoupdate(int value) {
        this.cantidadtoupdate = value;
    }

    /**
     * Obtiene el valor de la propiedad preciotoupdate.
     * 
     */
    public double getPreciotoupdate() {
        return preciotoupdate;
    }

    /**
     * Define el valor de la propiedad preciotoupdate.
     * 
     */
    public void setPreciotoupdate(double value) {
        this.preciotoupdate = value;
    }

}

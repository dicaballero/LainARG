
package com.lain.SoapMuestra.source;

 import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="type")
public class producto {
    
 @XmlElement(name="nombre")   
 private String nombre;
 @XmlElement(name="cantidad")
 private int cantidad;
 @XmlElement(name="id")
 private int id;
 @XmlElement(name="precio")
 private double precio;

    public producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", id=" + id + ", precio=" + precio + '}';
    }

    


 
 
 
    
}

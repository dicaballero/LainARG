
package com.rest.CRUD.demo;


public class dataObj {
    
    private String nombre;
    private Long id;
    private int cantidad;
    private double precio;

    public dataObj() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "objeto{" + "nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
   
    
    
}

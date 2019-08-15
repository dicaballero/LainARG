
package DAL;

import javax.persistence.*;

@Entity
@Table(name="Productos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Producto {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="nombre")
private String nombre;
@Column(name="marca")
private String marca;
@Column(name="precio")
private String precio;
@Column(name="cantidad")
private String cantidad;
@Column(name="codigoID")
private String codigoIdentificador;

    public Producto(String nombre, String marca, String precio, String cantidad, String codigoIdentificador) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigoIdentificador = codigoIdentificador;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidad=" + cantidad + ", codigoIdentificador=" + codigoIdentificador;
    }

    public void setNombre(Object nombre) {
        this.nombre = (String)nombre;
    }

    public void setMarca(Object marca) {
        this.marca = (String)marca;
    }

    public void setPrecio(Object precio) {
        this.precio = (String)precio;
    }

    public void setCantidad(Object cantidad) {
        this.cantidad = (String)cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
  





  

    
}

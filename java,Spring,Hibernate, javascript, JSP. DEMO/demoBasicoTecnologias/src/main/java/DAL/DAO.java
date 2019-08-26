
package DAL;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class DAO{
    
    public static Object registrar(String nombre, String marca, String precio, String cantidad, String codigoIdentificador){
       Object o1 =consultar(codigoIdentificador);
       if(o1 instanceof Exception){
        return o1;   
       }
       try{
       if(o1 instanceof String){
       Producto p = new Producto(nombre,marca,precio,cantidad,codigoIdentificador);
       Session session = sessionManager.getSession(); 
       Transaction tx = session.beginTransaction();
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       session.save(p);
       tx.commit();
       session.close();
       }else{
       return "Producto no ingresado!";      
       }
       Object o =consultar(codigoIdentificador);
       if(o instanceof List && o!=null){
        return o;   
       }else{
        return "Producto no ingresado!";   
       }
       }catch(Exception e){
          return e; 
       }
       }
    
    public static Object consultar(Object s){
       try{
       Session session = sessionManager.getSession();
       Transaction tx = session.beginTransaction();
       List db=null;
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       db = session.createQuery("FROM DAL.Producto where codigoIdentificador='"+s+"'").list();
       tx.commit();
       session.close();
       if(db!=null && !db.isEmpty()){
       return db;    
       }
       else{
       return "Producto no encontrado!";    
       }
       }catch(Exception e){
       return e;    
       }
       }
    
     public static Object eliminar(String s){
       Object o =consultar(s);
       if(o instanceof Exception){
       return o;    
       }
       try{
       Session session = sessionManager.getSession();
       Transaction tx = session.beginTransaction();
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       session.createSQLQuery("delete FROM hibernate.productos where codigoID='"+s+"'").executeUpdate();
       tx.commit();
       session.close();
       }catch(Exception e){
         return e;
       }
       return o;
       }
    
      public static Object actualizar(Object nombre, Object marca, Object precio, Object cantidad, Object codigoIdentificador){
       Object o = consultar(codigoIdentificador);
       if(o instanceof Exception){
       return o;
       }
       try{
       Session session = sessionManager.getSession();
       Transaction tx = session.beginTransaction();
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       Object o2;
       if(o instanceof List && !((List)o).isEmpty()){
       o2=((List)o).get(0);
       }else{
       return o;
       }
       Object [] db = {nombre,marca,precio,cantidad};
       for(int i=0;i<db.length;i++){
       if(!db[i].equals("")){
       if(i==0){
       ((Producto)o2).setNombre(nombre);
       }
       if(i==1){
       ((Producto)o2).setMarca(marca);
       }
       if(i==2){
       ((Producto)o2).setPrecio(precio);
       }
       if(i==3){
       ((Producto)o2).setCantidad(cantidad);
       }
       }    
       }
       session.update(o2);
       tx.commit();
       session.close();
       List lp=new ArrayList();
       lp.add(o2);
       return lp;
       }catch(Exception e){
           return e;
       }
       
    }
     
    
    public static Object consultarDb(){
       try{
       Session session = sessionManager.getSession();
       Transaction tx = session.beginTransaction();
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       List db = session.createQuery("FROM DAL.Producto").list();
       tx.commit();
       session.close();
       if(!db.isEmpty()){
       return db;    
       }
       else{
       return "La base de datos se encuentra vacía!";    
       }
       }catch(Exception e){
        return e;   
       }
    }
    
     public static Object eliminarDb(){
       try{
       Session session = sessionManager.getSession();
       Transaction tx = session.beginTransaction();
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       session.createSQLQuery("DROP TABLE IF EXISTS hibernate.productos;").executeUpdate();
       session.createSQLQuery("CREATE TABLE hibernate.productos(\n" +
       "id int primary key AUTO_INCREMENT not null,\n" +
       "nombre varchar(40) not null,\n" +
       "marca varchar(40) not null,\n" +
       "precio float not null,\n" +
       "cantidad int not null,\n" +
       "codigoID int not null UNIQUE\n" +
       ");").executeUpdate();
       tx.commit();
       session.close();
       Object o = consultarDb();
       if(o instanceof String){
       return o;
       }
       else{
       return "La base de datos no pudo ser formateada";
       }
       }catch(Exception e){
        return e;   
       }
       }
    
       public static Object crearDb(){
       try{
       Session session = sessionManager.getSession();
       Transaction tx = session.beginTransaction();
       session.createSQLQuery("SET SQL_SAFE_UPDATES = 0;").executeUpdate();
       session.createSQLQuery("DROP DATABASE IF EXISTS hibernate;").executeUpdate();
       session.createSQLQuery("CREATE DATABASE hibernate;").executeUpdate();
       session.createSQLQuery("DROP TABLE IF EXISTS hibernate.productos;").executeUpdate();
       session.createSQLQuery("CREATE TABLE hibernate.productos(\n" +
       "id int primary key AUTO_INCREMENT not null,\n" +
       "nombre varchar(40) not null,\n" +
       "marca varchar(40) not null,\n" +
       "precio float not null,\n" +
       "cantidad int not null,\n" +
       "codigoID int not null UNIQUE\n" +
       ");").executeUpdate();
       tx.commit();
       session.close();
       Object o = consultarDb();
       if(o instanceof String){
       return "La base de datos fue creada correctamente: "+o;
       }
       else{
       return "La base de datos no pudo ser creada";
       }
       }catch(Exception e){
        return e;   
       }
       }
       
       
       }
     


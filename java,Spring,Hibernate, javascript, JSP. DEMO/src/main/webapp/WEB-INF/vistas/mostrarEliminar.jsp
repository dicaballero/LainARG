<%-- 
    Document   : mostrarEliminar
    Created on : 09-ago-2019, 23:16:18
    Author     : Lain
--%>

<%@page import="DAL.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/recursos/estilos.css">
        <link rel="stylesheet" type="text/css" href="/recursos/estiloTablas.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
    <table>
        <th><h3>Eliminar producto</h3></th> 
    </table>
    <table>
          <tr>
      <th><strong>ID</strong></th>
      <th><strong>Nombre</strong></th>         
      <th><strong>Marca</strong></th>
      <th><strong>Precio</strong></th>   
      <th><strong>Cantidad</strong></th>
      <th><strong>Codigo Identificador</strong></th> 
          </tr>
    </table>    
       <%
      Object o = request.getAttribute("db");
      if(o instanceof List){
      List<Producto> l = (List<Producto>)o;
      for(Producto o1:l){
       %>
       <table>
        <tr>
      <td><%=o1.getId()%></td>
      <td><%=o1.getNombre()%></td>         
      <td><%=o1.getMarca()%></td>
      <td><%=o1.getPrecio()%></td>   
      <td><%=o1.getCantidad()%></td>
      <td><%=o1.getCodigoIdentificador()%></td> 
        </tr>
       </table>
        <%}}else{%>
      <table>
        <tr>
    <td><%=o%></td>
        </tr>
       </table>
      <%}%>
      <br>
      <br>
      <h1><a href="/">Volver al inicio!</a></h1>
    </body>
</html>
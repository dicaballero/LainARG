<%-- 
    Document   : mostrarExcepciones
    Created on : 14-ago-2019, 1:38:58
    Author     : Lain
--%>

<%@page import="org.hibernate.service.spi.ServiceException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css" href="/recursos/estilos.css">
         <link rel="stylesheet" type="text/css" href="/recursos/estiloTablas.css">
    </head>
     <body>
    <%
      Object o = request.getAttribute("db");
      Object o1 = o;
      if(o instanceof ServiceException){
         o = "Ocurrió una excepción ServiceException, compruebe la disponibilidad de la \n"
                 + "conexión con la base de datos."; 
      }else{
       o = "Ocurrió una excepción de tipo: "+o1;   
      }
    %>
       
      <table>
        <tr>
    <td><h5><%=o%></h5></td>
        </tr>
     </table>
      <br>
      <br>
      <h1><a href="/">Volver al inicio!</a></h1>
    </body>
</html>

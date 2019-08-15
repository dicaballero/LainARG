<%-- 
    Document   : MostrarEliminarDb
    Created on : 11-ago-2019, 0:17:38
    Author     : Lain
--%>

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
        <th><h3>Formatear base de datos</h3></th> 
    </table>  
      <%
      Object o = request.getAttribute("db");
      
      %>
    <table>
       <table>
        <tr>
    <td><%=o%></td>
        </tr>
     </table>
     </table>
     <br>
     <br>
     <h1><a href="/">Volver al inicio!</a></h1>
    </body>
</html>

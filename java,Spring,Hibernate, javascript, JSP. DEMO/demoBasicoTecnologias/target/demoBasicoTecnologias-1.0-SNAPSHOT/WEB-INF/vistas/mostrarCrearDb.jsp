<%-- 
    Document   : mostrarCrearDb
    Created on : 13-ago-2019, 22:17:58
    Author     : Lain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/recursos/estilos.css">
        <link rel="stylesheet" type="text/css" href="/recursos/estiloTablas.css">
        <title>JSP Page</title>
    </head>
    <body>
      <%
      Object o = request.getAttribute("db");
      %>
      <table>
        <tr>
    <td><%=o%></td>   
        </tr>
      </table>
      <br>
      <br>
      <h1><a href="/">Volver al inicio!</a></h1>
    </body>
</html>

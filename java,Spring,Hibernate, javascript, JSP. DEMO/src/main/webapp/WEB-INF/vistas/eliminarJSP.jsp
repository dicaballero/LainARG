<%-- 
    Document   : eliminarJSP
    Created on : 09-ago-2019, 23:08:31
    Author     : Lain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
        <link rel="stylesheet" type="text/css" href="/recursos/estiloTablas.css">

        <script src="/recursos/frontValidateNum.js"></script>
    </head>
    <body>
        <div id="center">
        <h1>Ingrese el codigo identificador del producto que desea eliminar</h1>
        <form action="ctrlSecundario/eliminar" id="validar">
        Codigo identificador:<input type="text" name="dato" required>
                             <input type="submit" value="Enviar">
        </form>
        </div>
          <br>
          <br>
          <h1><a href="/">Volver al inicio!</a></h1>
    </body>
</html>

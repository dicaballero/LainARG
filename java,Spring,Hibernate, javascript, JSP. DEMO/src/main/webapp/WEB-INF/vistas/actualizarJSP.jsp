<%-- 
    Document   : actualizarJSP
    Created on : 10-ago-2019, 0:31:29
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

        <script src="/recursos/frontValidateStr.js"></script>
    </head>
    <body>
        <div id="center">
        <h1>Rellene los campos que desea actualizar. El campo codigo identificador es requerido 
            para identificar el producto que se desea actualizar.</h1>
        <form action="ctrlSecundario/actualizar" id="validar">
            Nombre: <input type="text" name="nombre">
            <br>
            <br>
            Marca: <input type="text" name="marca">
            <br>
            <br>
            Precio: <input type="text" name="precio">
            <br>
            <br>
            Cantidad: <input type="text" name="cantidad">
            <br>
            <br>
            Codigo Identificador: <input type="text" name="codigoIdentificador" required>
            <br>
            <br>
            <input type="submit" value="Enviar">
        </form>
          <br>
          <br>
          <h1><a href="/">Volver al inicio!</a></h1>
    </body>
</html>

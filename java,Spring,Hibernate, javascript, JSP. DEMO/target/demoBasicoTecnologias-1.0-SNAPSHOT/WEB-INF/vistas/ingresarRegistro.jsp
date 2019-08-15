<%-- 
    Document   : ingresarRegistro
    Created on : 08-ago-2019, 16:43:16
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
        <h1>Registro del producto</h1>
        <form action="ctrlSecundario/registrar" id="validar">
            Nombre: <input type="text" name="nombre" required>
            <br>
            <br>
            Marca: <input type="text" name="marca" required>
            <br>
            <br>
            Precio: <input type="text" name="precio" required>
            <br>
            <br>
            Cantidad: <input type="text" name="cantidad" required>
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

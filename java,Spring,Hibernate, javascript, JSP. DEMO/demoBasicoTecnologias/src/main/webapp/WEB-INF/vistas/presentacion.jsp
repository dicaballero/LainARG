<%-- 
    Document   : presentacion
    Created on : 08-ago-2019, 21:28:32
    Author     : Lain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
    </head>
    <body>
        <h1>Bienvenido al Software DEMO</h1>
        <hr>
        <h4>Por favor, presione un botón para realizar una acción, si es la 
            primera vez que ejecuta este programa verifique la existencia de 
            la base de datos o presione el botón "Crear la base de datos". 
            
        </h4>
      
        <br>
        <br>
        <button form="f1">Registrar un producto en la base de datos</button>
        <br>
        <br>
        <button form="f2">Consultar un producto de la base de datos</button>
        <br>
        <br>
        <button form="f3">Actualizar un producto de la base de datos</button>
        <br>
        <br>
        <button form="f4">Eliminar un producto de la base de datos</button>
        <br>
        <br>
        <button form="f5">Visualizar la base de datos</button>
        <br>
        <br>
        <button form="f6">Formatear la base de datos</button>
        <br>
        <br>
        <button form="f7">Crear la base de datos</button>
      
        <form action="registrar" id="f1"></form>
        <form action="consultar" id="f2"></form>
        <form action="actualizar" id="f3"></form>
        <form action="eliminar" id="f4"></form>
        <form action="ctrlSecundario/consultarDb" id="f5"></form>
        <form action="ctrlSecundario/eliminarDb" id="f6"></form>
        <form action="ctrlSecundario/crearDb" id="f7"></form>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 28 jun. 2021, 13:53:29
    Author     : dreyna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container w-25">
            <div class="form-group">
                <input type="text" class="form-control" id="user">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" id="pass">
            </div>
            <button class="btn btn-danger" id="boton">Enviar</button>
        </div>
        <script src="recursos/js/jquery.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script>
            $("#boton").click(function () {
                $.post("lc", {"user":$("#user").val(),"pass":$("#pass").val()}, function (data) {
                    var w = data;
                        if(w == 1){
                            alert("Bienvenido: "+$("#user").val());
                        }else{
                            alert("Datos incorrectos");
                        }
                });
            });
        </script>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/png" href="img/icon.png"/>
        <title>Página de Agregar</title>
    </head>
    <body style="background: #245269">
        <div class="container">
            <div class="col-lg-  ">
                <h1 class=" btn-primary text-center">Agregar un Registro</h1>
                <form action="Controlador">
                    <div class="btn btn-info" style="float:left"> 
                    DPI:
                    </div>
                    <input class="form-control" type="text" name="txtDPI"><br>  
  
                    <div class="btn btn-info" style="float:left"> 
                    Nombres:
                    </div>
                    <input class="form-control" type="text" name="txtNombre">
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">              
                    <a class="btn btn-danger" href="Controlador?accion=listar"> Cancelar</a>               
                </form>
            </div>
        </div>
    </body>
</html>

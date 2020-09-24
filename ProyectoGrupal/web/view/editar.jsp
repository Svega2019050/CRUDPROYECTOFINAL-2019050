<%@page import="modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page import= "modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/png" href="img/icon.png"/>
        <title>Editar</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-5" >
                <%
                    PersonaDAO nuevaPersonaDao = new PersonaDAO();
                    int codPersona = Integer.parseInt((String)request.getAttribute("codPer"));
                    Persona nuevaPersona = (Persona)nuevaPersonaDao.list(codPersona);

                %>
                <h1>Modificar Persona</h1>
                <form action="Controlador">
                    <strong>DPI:</strong><br>
                    <input class="form-control" type="text" name="txtDPI" value="<%= nuevaPersona.getDPI() %>"><br>
                    Nombres:<br>
                    <input class="form-control" type="text" name="txtNombre" value="<%= nuevaPersona.getNombrePersona()%>"><br><br>
                    <input type="hidden" name="txtCodigoPersona" value="<%= nuevaPersona.getCodigoPersona()%>"> 
                    <input class="btn btn-primary form-primary" type="submit" name="accion" value="Actualizar">
                    <a class="btn btn-primary" href="Controlador?accion=listar"> Cancelar</a>  
                </form>
            <div
        </div>
    </body>
</html>
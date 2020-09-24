<%--
    Document   : Listar
    Created on : 23/09/2020, 02:43:39 PM
    Author     : 15cab
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Página Web - Listar</title>
    </head>
    <body>
        <div class="jumbotron jumbotron-fluid">
            <h1 class="display-4 text-center">Bievenido a la pagina de listar</h1>
            <p class="lead">Aquí podra encontrar los datos ya ingresados.</p>
            <hr class="my-4">
            <p><b>Para agregar un nuevo dato, hacer click en el siguiente botón</b></p>
            <a class="btn btn-primary btn-lg" href="Controlador?accion=add">Agregar Nuevo</a><br>
        </div>
    </div>
    <br><br>
    <div class="container">
        <table class="table table-bordered">
            <thead>
                <tr>

                    <td class=" btn-primary btn-lg text-center "><Strong>CODIGO PERSONA</Strong></td>
                    <td class="btn-primary btn-lg text-center"><Strong>DPI</Strong></td>
                    <td class="btn-primary btn-lg text-center"><Strong>NOMBRES</Strong></td>
                    <td class="btn-primary btn-lg text-center"><Strong>ACCIONES</Strong></td>

                </tr>
            </thead>
            <%
                PersonaDAO dao = new PersonaDAO();
                List<Persona> listaPersona = dao.listar();
                Iterator<Persona> iterator = listaPersona.iterator();
                Persona per = null;
                while (iterator.hasNext()) {
                    per = iterator.next();

            %>
            <tbody>
                <tr>
                    <td class="text-center "><%=per.getCodigoPersona()%></td>
                    <td class="text-center"><%=per.getDPI()%></td>
                    <td class="text-center "><%=per.getNombrePersona()%></td>

                    <td class="text-center">
                        <a  class=" btn btn-primary "  href="Controlador?accion=editar&codigoPersona=<%= per.getCodigoPersona()%>"> Editar </a>
                        <a   class="btn btn-danger" href= "Controlador?accion=eliminar&codigoPersona=<%= per.getCodigoPersona()%>"> Eliminar </a>
                    </td>

                </tr>
                <% }%>
            </tbody>
        </table>
    </div>
</body>
</html>

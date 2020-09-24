 
<%@page import="modeloDAO.PersonaDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/png" href="img/icon.png"/>
        <title>Lista</title>
    </head>
    <body style="background: #761c19">
        
        <div class="container">
            <h1 class=" text-center p-3 mb-2 bg-primary text-white">Personas</h1>
            <a class="btn btn-danger" href="Controlador?accion=add"> Agregar Nuevo </a>
            <a class="btn btn-danger" href="./index.jsp"> Pagina Principal</a>
            <table class="table table-bordered ">  
                <thead>
                    <tr>
                        <td class="text-center p-3 mb-2 bg-primary text-white"><strong>CODIGO PERSONA </td>
                        <td class="text-center p-3 mb-2 bg-primary text-white"><strong>DPI</td>
                        <td class="text-center p-3 mb-2 bg-primary text-white"><strong>NOMBRES</td>
                        <td class="text-center p-3 mb-2 bg-primary text-white"><strong>ACCIONES</td>
                    </tr>
                </thead>
               <%
                    PersonaDAO dao = new PersonaDAO();
                    List<Persona> listaPersona = dao.listar();
                    Iterator<Persona> iterator = listaPersona.iterator();
                    Persona per = null;
                    while(iterator.hasNext()){
                        per = iterator.next();
                %>
                <tbody>
                    <tr>
                        <td class=" text-center p-3 mb-2 bg-success text-white"><%=per.getCodigoPersona()%></td>
                        <td class=" text-center p-3 mb-2 bg-success text-white"><%=per.getDPI()%></td>
                        <td class=" text-center p-3 mb-2 bg-success text-white"><%=per.getNombrePersona()%></td>
                        <td class=" text-center p-3 mb-2 bg-success text-white">
                            <a class="btn btn-info" href="Controlador?accion=editar&codigoPersona=<%= per.getCodigoPersona()%>">Edit</a>
                           <a class="btn btn-warning" style="float: right" href="Controlador?accion=eliminar&codigoPersona=<%= per.getCodigoPersona()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
           
        </div>        
    </body>
</html>
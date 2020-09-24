<%-- 
    Document   : editar
    Created on : 23/09/2020, 06:11:15 PM
    Author     : matthew
--%>

<%@page import="modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	 <head>
		  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		  <title>Pagina de Editar</title>
	 </head>
	 <body>
		  <div class="container">
			   <div class="col-lg-5">
					<%
						 PersonaDAO nuevaPersonaDAO = new PersonaDAO();
						 int codPersona = Integer.parseInt((String)request.getAttribute("codPer"));
						 Persona nuevaPersona = (Persona)nuevaPersonaDAO.list(codPersona);
					%>					
					<h1>Modificar Persona</h1>
					<form action="Controlador">
						 <strong>DPI:</strong><br>
						 <input class="form-control" type="text" name="txtDPI" value="<%=nuevaPersona.getDPI()%>"><br> 
						 Nombres:<br>
						 <input class="form-control" type="text" name="txtNombre" value="<%=nuevaPersona.getNombrePersona()%>"><br><br> 
						 <input type="hidden" name="txtCodigoPersona" value="<%=nuevaPersona.getCodigoPersona()%>"><br><br>
						 <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>	
					</form>
			   </div>
		  </div>
	 </body>
</html>

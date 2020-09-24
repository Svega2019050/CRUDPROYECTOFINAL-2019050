<%-- 
    Document   : listar
    Created on : 23/09/2020, 06:11:01 PM
    Author     : matthew
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	 <head>
		  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		  <title>Pagina De Listar</title>
	 </head>
	 <body>
		  <div class="container">
			   <h1>Personas</h1>
			   <a class="btn btn-success" href="Controlador?accion=add"> Agregar nueva persona</a>
			   <br><br>
			   <table class="table-bordered">
					<thead>
						 <tr>
							  <td class="text-center text-primary">CODIGO DE PERSONA</td>
							  <td class="text-center text-primary">DPI</td>
							  <td class="text-center text-primary">NOMBRES</td>
							  <td class="text-center text-primary">ACCIONES</td>
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
							  <td class="text-center active"><%=per.getCodigoPersona()%></td>		
							  <td class="text-center"><%=per.getDPI()%></td>		
							  <td class="text-center active"><%=per.getNombrePersona()%></td>
							  <td class="text-center">
								   <a>Edit</a>
								   <a>Remove</a>							  
							  </td>
						 </tr>
					<%}%>
					</tbody>			   			   
			   </table>		   
		  </div>
	 </body>
</html>

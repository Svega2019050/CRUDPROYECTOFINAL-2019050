/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
import modeloDAO.PersonaDAO;

public class Controlador extends HttpServlet {
	 String listar = "view/listar.jsp";
	 String add = "view/add.jsp";
	 String edit = "view/editar.jsp";
	 Persona nuevaPersona = new Persona();
	 PersonaDAO nuevaPersonaDAO = new PersonaDAO();
	 int codigoPersona;
	 
	 /**
	  * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	  * methods.
	  *
	  * @param request servlet request
	  * @param response servlet response
	  * @throws ServletException if a servlet-specific error occurs
	  * @throws IOException if an I/O error occurs
	  */
	 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			   throws ServletException, IOException {
		  response.setContentType("text/html;charset=UTF-8");
		  try (PrintWriter out = response.getWriter()) {
			   /* TODO output your page here. You may use following sample code. */
			   out.println("<!DOCTYPE html>");
			   out.println("<html>");
			   out.println("<head>");
			   out.println("<title>Servlet Controlador</title>");			   
			   out.println("</head>");
			   out.println("<body>");
			   out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
			   out.println("</body>");
			   out.println("</html>");
		  }
	 }
	 @Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			   throws ServletException, IOException {
		   String access = "";
		  String action = request.getParameter("accion");
		  if(action.equalsIgnoreCase("listar")){
			   access = listar;			   
		  }else if (action.equalsIgnoreCase("add")){
			   access = add;
		  }else if (action.equalsIgnoreCase("Agregar")){
			   String DPI = request.getParameter("txtDPI");
			   String nombre = request.getParameter("txtNombre");
			   nuevaPersona.setDPI(DPI);
			   nuevaPersona.setNombrePersona(nombre);
			   nuevaPersonaDAO.add(nuevaPersona);
			   access = listar;
		  }else if(action.equalsIgnoreCase("editar")){
                            request.setAttribute("codPer", request.getParameter("codigoPersona"));
                            access = edit;
                  }else if(action.equalsIgnoreCase("actualizar")){
                            codigoPersona = Integer.parseInt(request.getParameter("txtCodigoPersona"));
                            String DPI = request.getParameter("txtDPI");
                            String nombres = request.getParameter("txtNombre");
                            nuevaPersona.setCodigoPersona(codigoPersona);
                            nuevaPersona.setDPI(DPI);
                            nuevaPersona.setNombrePersona(nombres);
                            nuevaPersonaDAO.edit(nuevaPersona);
                            access = listar;
                  }else if(action.equalsIgnoreCase("eliminar")){
                            codigoPersona = Integer.parseInt(request.getParameter("codigoPersona"));
                            nuevaPersona.setCodigoPersona(codigoPersona);
                            nuevaPersonaDAO.eliminar(codigoPersona);
                            access = listar;
                  }
		  RequestDispatcher vista = request.getRequestDispatcher(access);
                  vista.forward(request, response);
	 }
	 @Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			   throws ServletException, IOException {
		  processRequest(request, response);
	 }
	 @Override
	 public String getServletInfo() {
		  return "Short description";
	 }// </editor-fold>

}


	
	 
	

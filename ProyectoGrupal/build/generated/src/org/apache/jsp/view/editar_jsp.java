package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Persona;
import modeloDAO.PersonaDAO;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t <head>\n");
      out.write("\t\t  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t  <title>Pagina de Editar</title>\n");
      out.write("\t </head>\n");
      out.write("\t <body>\n");
      out.write("\t\t  <div class=\"container\">\n");
      out.write("\t\t\t   <div class=\"col-lg-5\">\n");
      out.write("\t\t\t\t\t");

						 PersonaDAO nuevaPersonaDAO = new PersonaDAO();
						 int codPersona = Integer.parseInt((String)request.getAttribute("codPer"));
						 Persona nuevaPersona = (Persona)nuevaPersonaDAO.list(codPersona);
					
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h1>Modificar Persona</h1>\n");
      out.write("\t\t\t\t\t<form action=\"Controlador\">\n");
      out.write("\t\t\t\t\t\t <strong>DPI:</strong><br>\n");
      out.write("\t\t\t\t\t\t <input class=\"form-control\" type=\"text\" name=\"txtDPI\" value=\"");
      out.print(nuevaPersona.getDPI());
      out.write("\"><br> \n");
      out.write("\t\t\t\t\t\t Nombres:<br>\n");
      out.write("\t\t\t\t\t\t <input class=\"form-control\" type=\"text\" name=\"txtNombre\" value=\"");
      out.print(nuevaPersona.getNombrePersona());
      out.write("\"><br><br> \n");
      out.write("\t\t\t\t\t\t <input type=\"hidden\" name=\"txtCodigoPersona\" value=\"");
      out.print(nuevaPersona.getCodigoPersona());
      out.write("\"><br><br>\n");
      out.write("\t\t\t\t\t\t <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Actualizar\"><br>\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

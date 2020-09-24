package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import modelo.Persona;
import modeloDAO.PersonaDAO;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t <head>\n");
      out.write("\t\t  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t  <title>Pagina De Listar</title>\n");
      out.write("\t </head>\n");
      out.write("\t <body>\n");
      out.write("\t\t  <div class=\"container\">\n");
      out.write("\t\t\t   <h1>Personas</h1>\n");
      out.write("\t\t\t   <a class=\"btn btn-success\" href=\"Controlador?accion=add\"> Agregar nueva persona</a>\n");
      out.write("\t\t\t   <br><br>\n");
      out.write("\t\t\t   <table class=\"table-bordered\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t <tr>\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center text-primary\">CODIGO DE PERSONA</td>\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center text-primary\">DPI</td>\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center text-primary\">NOMBRES</td>\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center text-primary\">ACCIONES</td>\n");
      out.write("\t\t\t\t\t\t </tr>\n");
      out.write("\t\t\t\t\t</thead>\t \n");
      out.write("\t\t\t\t\t");

						 PersonaDAO dao = new PersonaDAO();
						 List<Persona> listaPersona = dao.listar();
						 Iterator<Persona> iterator = listaPersona.iterator();
						 Persona per = null;
						 while(iterator.hasNext()){
							  per = iterator.next();	
					
      out.write("\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t <tr>\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center active\">");
      out.print(per.getCodigoPersona());
      out.write("</td>\t\t\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center\">");
      out.print(per.getDPI());
      out.write("</td>\t\t\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center active\">");
      out.print(per.getNombrePersona());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t  <td class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t   <a>Edit</a>\n");
      out.write("\t\t\t\t\t\t\t\t   <a>Remove</a>\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t\t </tr>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t</tbody>\t\t\t   \t\t\t   \n");
      out.write("\t\t\t   </table>\t\t   \n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("            <h1>Cadastro Aluno</h1>\n");
      out.write("            </div>\n");
      out.write("       <form class=\"form-horizontal\"  action=\"CadastroUsuario\" method=\"POST\">\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("            <label class=\"control-label\">CPF</label>\n");
      out.write("             <input type=\"text\" class=\"form-control  col-sm-3\" name=\"CPF\" value=\"\"><br>\n");
      out.write("            Nome <input type=\"text\" class=\"form-control col-sm-7 \" name=\"nome\" value=\"\"><br>\n");
      out.write("           \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            Data matricula  <input type=\"date\" class =\"form-control col-sm-2\" name=\"dataMatricula\" value=\"\">\n");
      out.write("               \n");
      out.write("            Data Nascimento <input type=\"date\" class =\"form-control col-sm-2\" name=\"dataNascimento\" value=\"\">\n");
      out.write("            </div>\n");
      out.write("            Filiacao<input type=\"text\" class=\"form-control col-sm-7\" name=\"filiacao\" value=\"\"><br>\n");
      out.write("            <div class=\"jumbotron\">        \n");
      out.write("            <h1>Dados Curso</h1>\n");
      out.write("            </div>\n");
      out.write("            Nome do curso<input type=\"text\" class=\"form-control col-sm-3\"  name=\"nomedocurso\" value=\"\"><br>\n");
      out.write("            \n");
      out.write("            Data de Inicio <input type=\"date\" class=\"form-control col-sm-2\"  name=\"dataInicio\" value=\"\"><br>\n");
      out.write("            \n");
      out.write("            Nivel<br>\n");
      out.write("            <select name=\"nivel\" class=\"custom-select mb-3 col-sm-2\">\n");
      out.write("            <option selected>Nivel</option>\n");
      out.write("            <option  value=\"1\">1</option>\n");
      out.write("            <option  value=\"2\">2</option>\n");
      out.write("            <option  value=\"3\">3</option>\n");
      out.write("                </select>\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("            <h1>Dados Disciplina</h1>\n");
      out.write("            </div>\n");
      out.write("            Nome da Disciplina <input type=\"text\" class=\"form-control  col-sm-7 \" name=\"nomeDisciplina\" value=\"\"><br>\n");
      out.write("            Carga Horaria <input type=\"text\" class=\"form-control col-sm-2\" name=\"cargaHoraria\" value=\"\"><br>\n");
      out.write("            Ementa <textarea type=\"text\" class=\"form-control\" name=\"ementa\" value=\"\"></textarea>\n");
      out.write("           </div>\n");
      out.write("\t\t   \n");
      out.write("\t\t   \n");
      out.write("            <input type=\"submit\" value= \"Cadastrar Aluno\">\n");
      out.write("            \n");
      out.write("            <a class=\"btn btn-info\" role=\"button\"  href=\"ListarServlet\" >Verificar</a> \n");
      out.write("            \n");
      out.write("     \n");
      out.write("\n");
      out.write("        </form><br><br>\n");
      out.write("           </div>\n");
      out.write("    </body>\n");
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

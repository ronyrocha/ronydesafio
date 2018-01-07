package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.util.List;
import model.bean.Registro;
import model.dao.RegistroDAO;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("    <title>Desafio Virada Tech!</title>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("\n");
      out.write("    <!-- css -->\n");
      out.write("\n");
      out.write("    <link href=\"css.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"home.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Virada Tech</a>\n");
      out.write("\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navbarsExample02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"Home.html\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-md-0\">\n");
      out.write("          <input class=\"form-control\" type=\"text\" placeholder=\"Pesquisar\">\n");
      out.write("        </form>\n");
      out.write("        <button type=\"button\" class=\"btn btn-outline-danger\">Sair</button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <a class=\"btn btn-primary\" href=\"NovoRegistro.jsp\" role=\"button\">Criar novo registro!</a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    <div class=\"row\"> \n");
      out.write("        <table class=\"table table-striped table-dark\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"col\"></th>\n");
      out.write("              <th scope=\"col\">Nome</th>\n");
      out.write("              <th scope=\"col\">Login</th>\n");
      out.write("              <th scope=\"col\">Senha</th>\n");
      out.write("              <th scope=\"col\">Alterar</th>\n");
      out.write("              <th scope=\"col\">Excluir</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody>\n");
      out.write("            \n");
      out.write("            ");

                RegistroDAO dao = new RegistroDAO();
                List<Registro> registro;
                registro = dao.buscaAll();
                for(Registro re: registro){
            
      out.write("\n");
      out.write("             <tr>\n");
      out.write("              <th scope=\"row\"> ");
      out.print(re.getIdRegistro());
      out.write(" </th>\n");
      out.write("              <td> ");
      out.print(re.getLocal());
      out.write(" </td>\n");
      out.write("              <td> ");
      out.print(re.getLogin());
      out.write(" </td>\n");
      out.write("              <td> ");
      out.print(re.getSenha());
      out.write(" </td>\n");
      out.write("              <td> <button type=\"button\" class=\"btn btn-outline-warning\"> <a href=\"Editar.jsp\">Editar</a> </button> </td>\n");
      out.write("              <td> <button type=\"button\" class=\"btn btn-outline-danger\"> <a href=\"fimExcluir.jsp?id=");
      out.print(re.getIdRegistro());
      out.write("\">Editar</a> </button> </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
                }
            
      out.write("\n");
      out.write("          \n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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

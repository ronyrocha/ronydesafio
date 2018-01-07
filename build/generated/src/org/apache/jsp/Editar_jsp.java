package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.RegistroDAO;
import model.bean.Registro;

public final class Editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

 
    Registro registro = new Registro();
    RegistroDAO dao = new RegistroDAO();
    
    
     String idd = (request.getParameter("id").trim());
     registro.setIdRegistro(Integer.parseInt(idd));
    
     registro = dao.buscar(registro);


      out.write("    \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Desafio Virada Tech!</title>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- css -->\n");
      out.write("    <link href=\"css.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"Cadastro.css\" rel=\"stylesheet\" >\n");
      out.write("    <link href=\"Editar.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
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
      out.write("        \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("            <form  action=\"fimEditar.jsp\" method=\"post\" class=\"form-signin\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("\n");
      out.write("           <h2 class=\"form-signin-heading\"> <font face=\"Arial\">Editar Dados</p> </font></h2>\n");
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
      out.write("           <div class=\"form-group\"> \n");
      out.write("                  <label for=\"textNome\" class=\"control-label\"> <font face=\"Arial\"> Nome: </font> </label> \n");
      out.write("                     <input name=\"nome\" id=\"textNome\" class=\"form-control\" value=\"");
      out.print(registro.getLocal());
      out.write(" \" type=\"text\" data-error=\"Por favor, insira um nome.\" required>\n");
      out.write("                     <div class=\"help-block with-errors\"></div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                   <label for=\"inputEmail\" class=\"control-label\"> <font face=\"Arial\">  Login: </font> </label>\n");
      out.write("                      <input name=\"email\" id=\"inputEmail\" class=\"form-control\" value=\"");
      out.print( registro.getLogin() );
      out.write("\" type=\"email\" data-error=\"Por favor, informe um e-mail válido.\" required> \n");
      out.write("                         <div class=\"help-block with-errors\"></div>\n");
      out.write("           </div> \n");
      out.write("\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                  <label for=\"inputPassword\" class=\"control-label\"> <font face=\"Arial\"> Senha: </font> </label>\n");
      out.write("                     <input name=\"senha\" type=\"password\" class=\"form-control\" id=\"inputPassword\" value=\"");
      out.print( registro.getSenha());
      out.write("\" data-minlength=\"6\" data-error=\"Mínimo de seis (6) digitos.\" required>\n");
      out.write("                     <div class=\"help-block with-errors\"></div>\n");
      out.write("                        \n");
      out.write("           </div> \n");
      out.write("\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                   <label for=\"inputConfirm\" class=\"control-label\"> <font face=\"Arial\"> Confirme a Senha: </font> </label> \n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"inputConfirm\" placeholder=\"Confirme sua Senha...\" data-match=\"#inputPassword\"\n");
      out.write("                       data-match-error=\"Atenção! As senhas não estão iguais.\" required>\n");
      out.write("                          <div class=\"help-block with-errors\"></div>\n");
      out.write("           </div>  \n");
      out.write("                     \n");
      out.write("                      \n");
      out.write("                  <label name=\"id\" for=\"textID\" class=\"control-label\" value=\"");
      out.print(registro.getIdRegistro());
      out.write(" </label> \n");
      out.write("                     \n");
      out.write("\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Enviar</button>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       </form>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/validator.min.js\"></script>\n");
      out.write("\n");
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

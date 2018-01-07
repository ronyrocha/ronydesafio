package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dao.RegistroDAO;
import model.bean.Registro;

public final class FimCadastroRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\n");
      out.write("\n");

      Registro registro = new Registro();
       // informaçoes do formulario 
      registro.setLocal(request.getParameter("nome"));
      registro.setLogin(request.getParameter("email"));
      registro.setSenha(request.getParameter("senha"));
      

      //inserindo no banco
      RegistroDAO dao = new RegistroDAO();
      
      Boolean retorno = dao.inserir(registro);
  

      out.write("\n");
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
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");

                    if(retorno==true){
                
      out.write("\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                     <div id=\"erro\" class=\"alert alert-success\">\n");
      out.write("                     <strong>Sucesso!</strong> Resgistro salvo! <a href=\"Home.jsp\" class=\"alert-link\">Voltar para página Home!</a>.\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }else{
                
      out.write("\n");
      out.write("                    <div class=\"col-6\">\n");
      out.write("                     <div id=\"erro\" class=\"alert alert-danger\">\n");
      out.write("                     <strong>Erro!</strong> Falha ao salvar o resgistro! <a href=\"Home.jsp\" class=\"alert-link\">Voltar para página Home!</a>.\n");
      out.write("                     </div>\n");
      out.write("                    </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <div class=\"col\">\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("        \n");
      out.write("             </div>\n");
      out.write("        </div>\n");
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
      out.write("</html>");
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

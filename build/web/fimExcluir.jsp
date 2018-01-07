<%-- 
    Document   : fimExcluir
    Created on : 06/01/2018, 23:31:20
    Author     : Rony
--%>


<%@page import="model.bean.Registro"%>
<%@page import="model.dao.RegistroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>

<%
   
   
   /*if(request.getParameter("id")== null)
   {
       response.sendRedirect("erro404.jsp");
   }
   else
   {*/
         RegistroDAO dao = new RegistroDAO();
         Registro registro = new Registro();
         
         String idd = (request.getParameter("id").trim());
         registro.setIdRegistro(Integer.parseInt(idd));
         
         //registro.setIdRegistro();
         
         Boolean retorno = dao.excluir(registro);
   
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fim Excluir</title
        
             <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    
    <!-- css -->
    <link href="erro.css" rel="stylesheet">
    
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col">
                </div>
                
                <%
                    if(retorno == true){
                %>
                <div class="col-6">
                     <div id="erro" class="alert alert-success">
                     <strong>Sucesso!</strong> Registro excluido com sucesso! <a href="Home.jsp" class="alert-link">Ir para página Home!</a>.
                     </div>
                </div>
                <%
                    }else{
                %>
                    <div class="col-6">
                     <div id="erro" class="alert alert-danger">
                     <strong>Erro!</strong> Falha ao excluir o resgistro! <a href="Home.jsp" class="alert-link">Voltar para página Home!</a>.
                     </div>
                    </div>
                <%
                    }
                   // }
                %>
                <div class="col">
                </div>
               
        
             </div>
        </div>
	
    </body>
</html>

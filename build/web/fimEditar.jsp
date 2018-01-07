<%-- 
    Document   : fimEditar
    Created on : 07/01/2018, 14:18:06
    Author     : Rony
--%>



<%@page import="model.dao.RegistroDAO"%>
<%@page import="model.bean.Registro"%>
<%@page import="model.bean.Usuario"%>
<%@page import="model.dao.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<%
   
       
      Registro registro = new Registro();
      RegistroDAO rd = new RegistroDAO();
       // informaçoes do formulario 
      registro.setLocal(request.getParameter("nome"));
      registro.setLogin(request.getParameter("email"));
      registro.setSenha(request.getParameter("senha"));
      registro.setSenha(request.getParameter("id"));
      
      Boolean retorno = rd.Editar(registro);
      


%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        
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
                     <strong>Sucesso!</strong> Registro editado com sucesso! <a href="Home.jsp" class="alert-link">Ir para página Home!</a>.
                     </div>
                </div>
                <%
                    }else{
                %>
                    <div class="col-6">
                     <div id="erro" class="alert alert-danger">
                     <strong>Erro!</strong> Falha ao editar o resgistro! <a href="Home.jsp" class="alert-link">Voltar para página Home!</a>.
                     </div>
                    </div>
                <%
                    }
                   
                %>
                <div class="col">
                </div>
               
        
             </div>
        </div>
	
    </body>
</html>

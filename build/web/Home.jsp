<%@page import="model.bean.Usuario"%>
<%@page import="model.dao.UsuarioDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="model.bean.Registro"%>
<%@page import="model.dao.RegistroDAO"%>
<%
  
        


    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Desafio Virada Tech!</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    <!-- css -->

    <link href="css.css" rel="stylesheet">
    <link href="home.css" rel="stylesheet">

  </head>
  <body>
    
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
      <a class="navbar-brand" href="#">Virada Tech</a>

      <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="Home.html">Home <span class="sr-only">(current)</span></a>
          </li>
        </ul>
        <form class="form-inline my-2 my-md-0">
          <input class="form-control" type="text" placeholder="Pesquisar">
        </form>
        <button type="button" class="btn btn-outline-danger">Sair</button>
      </div>

    </nav>



	<div class="container">
      <div class="row">
        <a class="btn btn-primary" href="NovoRegistro.jsp" role="button">Criar novo registro!</a>
      </div>

    <div class="row"> 
        <table class="table table-striped table-dark">
          <thead>
            <tr>
              <th scope="col"></th>
              <th scope="col">Nome</th>
              <th scope="col">Login</th>
              <th scope="col">Senha</th>
              <th scope="col">Alterar</th>
              <th scope="col">Excluir</th>
            </tr>
          </thead>
          <tbody>
            
            <%
                RegistroDAO dao = new RegistroDAO();
                List<Registro> registro;
                registro = dao.buscaAll();
                for(Registro re: registro){
            %>
             <tr>
              <th scope="row"> <%=re.getIdRegistro()%> </th>
              <td> <%=re.getLocal()%> </td>
              <td> <%=re.getLogin()%> </td>
              <td> <%=re.getSenha()%> </td>
              <td> <button type="button" class="btn btn-outline-warning"> <a href="Editar.jsp?id= <%=re.getIdRegistro()%> ">Editar</a> </button> </td>
              <td> <button type="button" class="btn btn-outline-danger"> <a href="fimExcluir.jsp?id= <%=re.getIdRegistro()%> ">Excluir</a> </button> </td>
            </tr>
            <% 
                }
            %>
          
          </tbody>
        </table>
      </div>
	</div>
	
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
  </body>
</html>

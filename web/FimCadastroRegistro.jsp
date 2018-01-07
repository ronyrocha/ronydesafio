<%@page import="model.dao.RegistroDAO"%>
<%@page import="model.bean.Registro"%>

<!doctype html>

<%
      Registro registro = new Registro();
       // informaçoes do formulario 
      registro.setLocal(request.getParameter("local"));
      registro.setLogin(request.getParameter("email"));
      registro.setSenha(request.getParameter("senha"));
      

      //inserindo no banco
      RegistroDAO dao = new RegistroDAO();
      
      Boolean retorno = dao.inserir(registro);
  
%>

<html>
  <head>
    <title>Desafio Virada Tech!</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <!-- css -->
    <link href="css.css" rel="stylesheet">
    <link href="Cadastro.css" rel="stylesheet" >

  </head>
  <body>
    
<div class="container">
            <div class="row">
                <div class="col">
                </div>
                
                <%
                    if(retorno==true){
                %>
                <div class="col-6">
                     <div id="erro" class="alert alert-success">
                     <strong>Sucesso!</strong> Resgistro salvo! <a href="Home.jsp" class="alert-link">Voltar para página Home!</a>.
                     </div>
                </div>
                <%
                    }else{
                %>
                    <div class="col-6">
                     <div id="erro" class="alert alert-danger">
                     <strong>Erro!</strong> Falha ao salvar o resgistro! <a href="Home.jsp" class="alert-link">Voltar para página Home!</a>.
                     </div>
                    </div>
                <%
                    }
                %>
                <div class="col">
                </div>
               
        
             </div>
        </div>
	
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    <script src="js/validator.min.js"></script>

  </body>
</html>
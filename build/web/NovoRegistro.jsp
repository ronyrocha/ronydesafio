

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

    <!-- css -->
    <link href="css.css" rel="stylesheet">
    <link href="Cadastro.css" rel="stylesheet" >
    <link href="Editar.css" rel="stylesheet">

  </head>
  <body>

      
<!-- inicio menu -->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
      <a class="navbar-brand" href="#">Virada Tech</a>

      <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
        </ul>
        
      </div>

    </nav>
    <!-- fim menu -->
 
    
    <!-- form cadastro -->
	<div class="container-fluid">

      <form  action="fimCadastroRegistro.jsp" method="post" class="form-signin" data-toggle="validator" role="form">

           <h2 class="form-signin-heading"> <font face="Arial">Inserir novo registro</p> </font></h2>

           <div class="form-group"> 
                  <label for="textNome" class="control-label"> <font face="Arial"> Nome: </font> </label> 
                  <input name="local" id="textNome" class="form-control" placeholder="Digite um nome para seu novo registro ..." type="text" data-eNomerror="Por favor, insira um nome." required>
                     <div class="help-block with-errors"></div>
           </div>

           <div class="form-group">
                   <label for="inputEmail" class="control-label"> <font face="Arial">  Login: </font> </label>
                      <input name="email" id="inputEmail" class="form-control" placeholder="Digite um E-mail..." type="email" data-error="Por favor, informe um e-mail válido." required> 
                         <div class="help-block with-errors"></div>
           </div> 

           <div class="form-group">
                  <label for="inputPassword" class="control-label"> <font face="Arial"> Senha: </font> </label>
                     <input name="senha" id="inputPassword" type="password" class="form-control" placeholder="Digite uma Senha..." data-minlength="6" data-error="Mínimo de seis (6) digitos." required>
                     <div class="help-block with-errors"></div>
                        
           </div> 

           <div class="form-group">
                   <label for="inputConfirm" class="control-label"> <font face="Arial"> Confirme a Senha: </font> </label> 
                      <input type="password" class="form-control" id="inputConfirm" placeholder="Confirme sua Senha..." data-match="#inputPassword"
                       data-match-error="Atenção! As senhas não estão iguais." required>
                          <div class="help-block with-errors"></div>
           </div>    

           <div class="form-group">
             <button class="btn btn-lg btn-primary btn-block" type="submit">Enviar</button>
           </div>


       </form>
		
	</div>
    
    <!-- fim form cadastro -->
	
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    <script src="js/validator.min.js"></script>

  </body>
</html>

<%-- 
    Document   : Login
    Created on : 05/01/2018, 00:29:37
    Author     : Rony
--%>

<!DOCTYPE html>
<html>
     <head>
        <title>Desafio Virada Tech!</title>
    <!-- Required meta tags -->
    <meta charset="utf-8"> </meta>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> </meta>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous"> </link>

    <!-- css -->
    <link href="css.css" rel="stylesheet"> </link>
    </head>
    
    
    <h:body>
        <div class="container-fluid">

          <form class="form-signin" action="Home.jsp" method="post"  >
              <h2 class="form-signin-heading"> <font face="Arial">ACESSO <p>Virada Tech</p> </font></h2>
              
                <label for="inputEmail" class="sr-only">Email address</label>
                <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email" required="autofocus"></input>
                 
                  <label for="inputPassword" class="sr-only">Password</label>
                  <input name="senha" type="password" id="inputPassword" class="form-control" placeholder="Senha" required="autofocus"> </input>
                 
                     <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
                 
                        <div id="cadastro">
                          <label>
                           <a href="Cadastro.jsp">Criar conta!</a>
                          </label>
                        </div>
                 
          </form>
		
	</div>
	
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    
    </h:body>
</html>


<%@page import="model.bean.Usuario"%>
<%@page import="org.hibernate.validator.constraints.Email"%>
<%@page import="model.dao.UsuarioDAO"%>
 import javax.servlet.http.HttpSession;
         




<%
   
    Usuario usuario = new Usuario();
    
      usuario.setEmail(request.getParameter("email"));
      usuario.setSenha(request.getParameter("senha"));
        
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuarioAutenticado = dao.checkLogin(usuario);
            if( usuarioAutenticado!=null){
               
                response.sendRedirect("Home.jsp");
                 
            }else
            {
                response.sendRedirect("ErroLogin.jsp");
            }
   
   
       //usuario = dao.checkLogin(usuario);
       //usuario.getIdUsuario();

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
       
    </body>
</html>

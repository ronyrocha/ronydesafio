/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import model.bean.Usuario;

/**
 *
 * @author Rony
 */
public class UsuarioDAO {

 
  
    private Connection con = null;
    
     public UsuarioDAO() {
         con = ConnectionFactory.getConnection();  
    }
  
     
     /* Verificação de login */
     public Usuario checkLogin(Usuario usuario)throws ClassNotFoundException, SQLException {

        con = ConnectionFactory.getConnection();
        
        Usuario us = null;
        PreparedStatement stmt = null;
        
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE email = ? and senha = ?");
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());

            ResultSet resultado = stmt.executeQuery();
                //rs = stmt.executeQuery();

            if (resultado.next()) {
                us=new Usuario();
                   us.setEmail(resultado.getString("email"));
                   us.setSenha(resultado.getString("senha"));
                   us.setIdUsuario(resultado.getInt("idUsuario"));
                   
                   
            }
                con.close();
                return us;
        } 
        

     
    /* Inserindo dados no banco */
    public boolean inserir(Usuario usuario){
       
        String sql = "INSERT INTO usuario(nome,email,senha) VALUES (?,?,?)";
        
        PreparedStatement stmt = null ;
        
       try {
           stmt = con.prepareStatement(sql);
           stmt.setString(1, usuario.getNome());
           stmt.setString(2, usuario.getEmail());
           stmt.setString(3, usuario.getSenha());
           
           stmt.executeUpdate();
           return true;
           
       } catch (SQLException ex) {
           System.err.println("Erro"+ ex);
           return false;
           
       }finally{
             
           ConnectionFactory.closeConnection(con,stmt);
           
       }
       
    }

         

 
     
       
    }
   
   
    


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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import model.bean.Registro;
import model.bean.Usuario;
import model.dao.UsuarioDAO;



/**
 *
 * @author Rony
 */
public class RegistroDAO {

  
    private Connection con = null;
    
     public RegistroDAO() {
         con = ConnectionFactory.getConnection();
         
    }
    
   
    /* Inserindo dados no banco */
    public boolean inserir(Registro registro){
       
        String sql = "INSERT INTO registro(local,login,senha) VALUES (?,?,?)";
        
        PreparedStatement stmt = null ;
        
       try {
           stmt = con.prepareStatement(sql);
           stmt.setString(1, registro.getLocal());
           stmt.setString(2, registro.getLogin());
           stmt.setString(3, registro.getSenha());
           
           stmt.executeUpdate();
           return true;
           
       } catch (SQLException ex) {
           System.err.println("Erro"+ ex);
           return false;
           
       }finally{
             
           ConnectionFactory.closeConnection(con,stmt);
           
       }
       
    }
    
    
    
    /* Editar dados no banco */
    public boolean Editar(Registro registro){
       
        String sql = "UPDATE registro SET (local,login,senha) VALUES (?,?,?)";
        
        PreparedStatement stmt = null ;
        
       try {
           stmt = con.prepareStatement(sql);
           stmt.setString(1, registro.getLocal());
           stmt.setString(2, registro.getLogin());
           stmt.setString(3, registro.getSenha());
           
           stmt.executeUpdate();
           return true;
           
       } catch (SQLException ex) {
           System.err.println("Erro"+ ex);
           return false;
           
       }finally{
             
           ConnectionFactory.closeConnection(con,stmt);
           
       }
       
    }
    
    
    
    
    /* Ecluir dados no banco */
    public boolean excluir(Registro registro){
       
        String sql = "DELETE FROM registro WHERE idRegistro = ?";
        
        PreparedStatement stmt = null ;
        
       try {
           stmt = con.prepareStatement(sql);
           stmt.setInt(1,registro.getIdRegistro());
           stmt.executeUpdate();
           return true;
           
       } catch (SQLException ex) {
           System.err.println("Erro"+ ex);
           return false;
           
       }finally{
             
           ConnectionFactory.closeConnection(con,stmt);
           
       }
       
    }
    
    
   
     /* lista com dados do banco */
    public List<Registro> buscaAll(){
        
       // WHERE Usuario_idUsuario='" + id + "'"
       
        String sql = "SELECT * FROM registro";
        
        PreparedStatement stmt = null ;
        ResultSet rs = null;
        
        List<Registro> registros = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
              
              Registro registro = new Registro();
              
              
              registro.setIdRegistro(rs.getInt("idRegistro"));
              registro.setLocal(rs.getString("Local"));
              registro.setLogin(rs.getString("Login"));
              registro.setSenha(rs.getString("Senha"));
              
              registros.add(registro);
              
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro"+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return registros;
        
    }
    
    
    
    
    
     /* Registro para edição */
    public Registro buscar (Registro registro){
        
        String sql = "SELECT * FROM registro where idRegistro=?";
        
        PreparedStatement stmt = null ;
        Registro retorno = null; 
         
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,registro.getIdRegistro());
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                
              retorno = new Registro();
              
              retorno.setIdRegistro(rs.getInt("idRegistro"));
              retorno.setLocal(rs.getString("Local"));
              retorno.setLogin(rs.getString("Login"));
              retorno.setSenha(rs.getString("Senha"));
             
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro"+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return retorno;
        
    }

   
    
}
    
   
   
    


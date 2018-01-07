/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Rony
 */
public class Registro {
    
    private int idRegistro;
    private String local;
    private String login;
    private String senha;
    private Usuario usuario;
    private int Usuario_idUsuario;

  
     public Registro(){
    }
    
    public Registro(int idRegistro,String local, String login, String senha, Usuario usuario){
        this.idRegistro = idRegistro;
        this.local = local;
        this.login = login;
        this.senha = senha;
        this.usuario = usuario;
    }
    

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    
     public int getUsuario_idUsuario() {
        return Usuario_idUsuario;
    }

    public void setUsuario_idUsuario(int Usuario_idUsuario) {
        this.Usuario_idUsuario = Usuario_idUsuario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
   
    
    
    
    
    
    
    
}

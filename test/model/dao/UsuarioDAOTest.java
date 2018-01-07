/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rony
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @Test
    public void inserir() {
        
        Usuario usuario = new Usuario("teste", "teste@teste.com", "teste123");
        UsuarioDAO dao = new UsuarioDAO();
        
        if(dao.inserir(usuario)){
            System.out.println("OK");
        }else{
            fail("NO");
        }
        
    }
    
}

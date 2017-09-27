/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoaoPedroThedin
 */
public class receita {
    private String nome;
    private String ingredientes;
    private String preparo;
    
    
    public static void main (String args[]) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/receita","postgres", "123456");
        } catch (SQLException ex) {
           
           String sql = "insert into receita (nome, ingredientes, preparo ) values (?,?,?)";
      
                   PreparedStatement stmt = conn.prepareStatement(sql);
       
       stmt.setString(1, "nome");
       stmt.setString(1, "ingredientes");
       stmt.setString(1, "preparo");
       
       
       stmt.executeUpdate();
       //conn.commit();
        }    
    
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ingredientes
     */
    public String getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the preparo
     */
    public String getPreparo() {
        return preparo;
    }

    /**
     * @param preparo the preparo to set
     */
    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }
}

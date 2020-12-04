/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.pet;

/**
 *
 * @author larissa.ferreira
 */
public class petdao {
    public void create(pet p){
        Connection con = connectionDB.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cadastro(nome, dono, especie, sexo, nascimento) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDono());
            stmt.setString(3, p.getEspecie());
            stmt.setString(4, p.getSexo());
            stmt.setString(5, p.getNascimento());
            
            
            
            stmt.executeUpdate();
                    
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!!");
            
                    } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao salvar " +ex);
        
    }finally{
            connectionDB.closeConnection(con, stmt);
        }
    
}
}

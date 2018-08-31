/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Classe.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class DisciplinaDAO {
    
 private Connection conn = null;
    
    public DisciplinaDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    
      public List<Disciplina> listar() throws SQLException, Exception{
        String sql = "SELECT * FROM Disciplina";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Disciplina> disciplinas = new ArrayList();
        {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
                while(rs.next()){
                Disciplina disciplina = new Disciplina();
      
            disciplina.setNomeDisciplina(rs.getString("nomeDisciplina"));
            disciplina.setCargaHoraria(rs.getFloat("cargaHoraria"));
            disciplina.setEmenta(rs.getString("ementa"));
          
            disciplinas.add(disciplina);
        }
                 return disciplinas;   
                 
    }
}
    
    
      //  private int coddisciplina;
      //  private String nomeDisciplina;
      //  private float cargaHoraria;
      //  private String ementa;
    
        public void inserir(Disciplina disciplinas){
        String sql = "INSERT INTO Disciplina(nomedisciplina, cargahoraria, ementa ) VALUES ((?), (?), (?))";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement(sql);   
            stmt.setString(1, disciplinas.getNomeDisciplina());
            stmt.setFloat(2, disciplinas.getCargaHoraria());
            stmt.setString(3, disciplinas.getEmenta());
            
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

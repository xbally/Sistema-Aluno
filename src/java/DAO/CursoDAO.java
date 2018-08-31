/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;



import Classe.Curso;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class CursoDAO {
   
    private Connection conn = null;
    
    public CursoDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
   public List<Curso> listar() throws SQLException{
        String sql = "SELECT * FROM Curso";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Curso> cursos = new ArrayList();
        {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
                while(rs.next()){
                Curso curso = new Curso();
      
            curso.setNomeCurso(rs.getString("nomeCurso"));
            curso.setDataInicio(rs.getDate("dataInicio"));
            curso.setNivel(rs.getInt("nivel"));
            cursos.add(curso);
        }
                 return cursos;   
                 
    }
}
    
    
//private int codcurso;
//private String nomeCurso ;
//private String dataInicio ;
//private int nivel ;
    
    
    
        public void inserir(Curso cursos){
        String sql = "INSERT INTO Curso(nomecurso, datainicio, nivel) VALUES ((?), (?), (?))";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement(sql);   
            stmt.setString(1, cursos.getNomeCurso());
            stmt.setDate(2,  new java.sql.Date(cursos.getDataInicio().getTime()));
            stmt.setInt(3, cursos.getNivel());
            stmt.executeQuery();
             
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

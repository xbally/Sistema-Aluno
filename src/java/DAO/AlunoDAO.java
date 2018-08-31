/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classe.Aluno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class AlunoDAO {
       private Connection conn = null;
    
    public AlunoDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    
    public List<Aluno> listar() throws SQLException{
        String sql = "SELECT * FROM Aluno";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Aluno> usuario = new ArrayList();
        {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
                while(rs.next()){
                Aluno usuarios = new Aluno();
      
            usuarios.setCPF(rs.getString("CPF"));
            usuarios.setNome(rs.getString("nome"));
            usuarios.setDataMatricula(rs.getDate("dataMatricula"));
            usuarios.setDataNascimento(rs.getDate("dataNascimento"));
            usuarios.setFiliacao(rs.getString("filiacao"));
            usuario.add(usuarios);
        }
                 return usuario;   
                 
    }
}
    
     
    public void inserir(Aluno usuarios){
        String sql = "INSERT INTO Aluno (CPF, nome, dataMatricula, dataNascimento, filiacao) VALUES ((?), (?), (?), (?), (?))";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement(sql);   
            stmt.setString(1, usuarios.getCPF());
            stmt.setString(2, usuarios.getNome());
            stmt.setDate(3, new java.sql.Date(usuarios.getDataMatricula().getTime()));        
            stmt.setDate(4, new java.sql.Date(usuarios.getDataNascimento().getTime()));
            stmt.setString(5, usuarios.getFiliacao());       
            stmt.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Update(Aluno usuarios){
        String sql = "UPDATE SET Aluno (codaluno ,CPF, nome, dataMatricula, dataNascimento, filiacao) VALUES (((?), (?), (?), (?), (?)) WHERE codaluno= (?)";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(0, usuarios.getCodaluno());
            stmt.setString(1, usuarios.getCPF());
            stmt.setString(2, usuarios.getNome());
            stmt.setDate(3, new java.sql.Date(usuarios.getDataMatricula().getTime()));
            stmt.setDate(4, new java.sql.Date(usuarios.getDataMatricula().getTime()));
            stmt.setString(5, usuarios.getFiliacao());
                stmt.executeUpdate();
           } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
   // DAO FALTANDO, BUSCA ALUNO POR CURSO E DISCIPLINA 
   // VERIFICAÇÃO DE CPF EXISTENTE 
}

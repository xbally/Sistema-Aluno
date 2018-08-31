/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Classe.Aluno;
import Classe.Curso;
import Classe.Disciplina;
import DAO.AlunoDAO;
import DAO.CursoDAO;
import DAO.DisciplinaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static java.util.Date.parse;

/**
 *
 * @author gabri
 */
@WebServlet(name = "CadastroUsuario", urlPatterns = {"/CadastroUsuario"})
public class CadastroUsuario extends HttpServlet  {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                 //Aluno
            Aluno usuarios = new Aluno();
            AlunoDAO dao = new AlunoDAO();
            
           //Trata datas
                         
          //Aluno
          //Arrumar DAOS e Comandos
            usuarios.setCPF(request.getParameter("CPF"));
            usuarios.setNome(request.getParameter("nome"));
            usuarios.setDataMatricula(new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("dataMatricula")));
            usuarios.setDataNascimento(new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("dataNascimento")));
            usuarios.setFiliacao(request.getParameter("filiacao"));
            dao.inserir(usuarios);

                   Curso cursos = new Curso();
            CursoDAO daoC = new CursoDAO();            
            cursos.setNomeCurso(request.getParameter("nomedocurso"));
            cursos.setDataInicio(new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("dataInicio")));
            cursos.setNivel(Integer.parseInt(request.getParameter("nivel")));
            daoC.inserir(cursos);
           //Disciplina
             
            Disciplina disciplinas = new Disciplina();
            DisciplinaDAO daoD = new DisciplinaDAO();
            disciplinas.setNomeDisciplina(request.getParameter("nomeDisciplina"));
            disciplinas.setCargaHoraria(Float.parseFloat(request.getParameter("cargaHoraria")));
            disciplinas.setEmenta(request.getParameter("ementa"));
            daoD.inserir(disciplinas);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastraUsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastraUsuarioServlet at " + request.getContextPath() + "</h1>");
                        out.println("<a href=\"Lista\">VerificarLista</a>");

            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

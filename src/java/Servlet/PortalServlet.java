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
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabri
 */
@WebServlet(name = "PortalServlet", urlPatterns = {"/PortalServlet"})
public class PortalServlet extends HttpServlet {

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
         
            
                   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PortalServlet</title>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<div class=\"jumbotron\">");
            out.print("<h1>Cadastro Aluno</h1>");
            out.println("</div>");
            out.println("");
            out.println("<form class=\"form-horizontal\"  action=\"CadastroUsuario\" method=\"POST\">");
            out.println("<div class=\"form-group\">");
            out.println("<label class=\"control-label col-sm-2\"\">CPF </label>");
            out.println("<input type=\"text\" class=\"form-control\" name=\"CPF\" value=\"\"><br>");
            out.println("Login <input type=\"text\" class=\"form-control\" name=\"nome\" value=\"\"><br>");
            out.println("Data matricula <input type=\"text\" class=\"form-control\" name=\"dataMatricula\" value=\"\"><br>");
            out.println("Data Nascimento<input type=\"text\"  class=\"form-control\" name=\"dataNascimento\" value=\"\"><br>");
            out.println("Filiacao<input type=\"text\" class=\"form-control\" name=\"filiacao\" value=\"\"><br>");
            
            out.println("<h1>Dados do Curso</h1>");
            out.println("Nome do curso<input type=\"text\" class=\"form-control\"  name=\"nomedocurso\" value=\"\"><br>");
            out.println("Data de Inicio <input type=\"text\" class=\"form-control\"  name=\"dataInicio\" value=\"\"><br>");
            out.println("Nivel <input type=\"text\" class=\"form-control\" name=\"nivel\" value=\"\"><br>");
 
            out.println("<h1>Dados da Disciplina</h1>");
            out.println("Nome da Disciplina <input type=\"text\" class=\"form-control\" name=\"nomeDisciplina\" value=\"\"><br>");
            out.println("Carga Horaria <input type=\"text\" class=\"form-control\" name=\"cargaHoraria\" value=\"\"><br>");
            out.println("Ementa <input type=\"text\" class=\"form-control\" name=\"ementa\" value=\"\"><br>");
            out.println("</div");
              out.println("</form><br><br>");
             out.println("<input type=\"submit\" value=\"Cadastrar Aluno\">");
                      out.println("<a href=\"ListarServlet\">VerificarLista</a>");     
            
     
            
            out.println("<a href=\"LogoutServlet\">Log out</a>");
            
            out.println("</body>");
            out.println("</html>");
        
     
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

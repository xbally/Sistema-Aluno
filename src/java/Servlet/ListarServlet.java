/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Classe.Aluno;
import DAO.AlunoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
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
@WebServlet(name = "ListarServlet", urlPatterns = {"/ListarServlet"})
public class ListarServlet extends HttpServlet {

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
            
             AlunoDAO dao = new AlunoDAO();
            
            int id;
            String nome, CPF, filiacao;
            
            List<Aluno> lista = dao.listar();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListarServlet</title>");  
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
            out.println("<h1>Dados Aluno matriculados na disciplina e Curso</h1>");
            out.println("</div>");
            out.println("<div class=\"container\">");
            out.println("<table class=\"table table-dark table-striped\"><thread>");
            out.println("<tr><th>CPF</th>"
                    + "<th>Nome</th>"
                    + "<th>Data Matricula</th>"
                    + "<th>Data Nascimento</th>"
                    + "<th>Filiacao</th>"
                    + "<th>Ação</th></tr>");
               for (Aluno x : lista) {
                  CPF = x.getCPF();
                nome = x.getNome();
              Date  DATAM = x.getDataNascimento();
              Date  DATAN = x.getDataNascimento();
                filiacao = x.getFiliacao();
                out.println(" <tbody><tr><td>" + CPF + "</td>"
                       + "<td>" + nome + "</td>"
                       + "<td>" + DATAM + "</td>"
                       + "<td>" + DATAN + "</td>"
                       + "<td>" + filiacao + "</td>");
                out.println("<td><a class=\"btn btn-danger btn-sm\">Alterar</a></td></tr>");
           }
               
           out.println("</tbody>");
            out.println("</thread>");
            out.println("</table><br><br>");
            
            out.println("</div></body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(ListarServlet.class.getName()).log(Level.SEVERE, null, ex);
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

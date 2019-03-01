/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suraj
 */
@WebServlet(urlPatterns = {"/answerservlet"})
public class answerservlet extends HttpServlet {

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
            try
        {
            
            
            Class.forName("org.postgresql.Driver");   
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234");
       
        
        String text=request.getParameter("textarea");
        out.println(request.getParameter("postid"));
        int postid=Integer.parseInt(request.getParameter("postid"));
        int userid=Integer.parseInt(request.getParameter("userid"));
        
        PreparedStatement st2=con.prepareStatement("insert into posts(posttypeid,creationdate,body,owneruserid,lasteditoruserid,lasteditdate,lastactivitydate,title,tags,parentid) values(2,current_timestamp,?,?,?,current_timestamp,current_timestamp,'','',?);");
        Statement st3=con.createStatement();
        Statement st4=con.createStatement();
        Statement st5=con.createStatement();
        Statement st6=con.createStatement();
        
        st2.setString(1, text);
        st2.setInt(2,userid);
        st2.setInt(3,userid);
        st2.setInt(4,postid);
        st2.executeUpdate();
        st4.executeQuery("select last_edit_date("+postid+",1)");
        st5.executeQuery("select last_edit_user("+postid+","+userid+")");
        st6.executeQuery("select increment_answercount("+postid+")");
        con.close();
        response.sendRedirect("postpage.jsp?postid="+postid);
        }
        catch(Exception e)
        {
            out.println("Error="+e);
        }
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

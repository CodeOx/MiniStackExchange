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
@WebServlet(urlPatterns = {"/commentservlet"})
public class commentservlet extends HttpServlet {

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
       Statement st=con.createStatement();
       Statement st4=con.createStatement();
       Statement st6=con.createStatement();
         
        String text=request.getParameter("textarea");
        out.println(request.getParameter("postid"));
        int postid=Integer.parseInt(request.getParameter("postid"));
        int userid=Integer.parseInt(request.getParameter("userid"));
        
        PreparedStatement st2=con.prepareStatement("insert into comments(postid,texts,creationdate,userid) values(?,?,current_timestamp,?);");
        st4.executeQuery("select last_edit_date("+postid+",1)");
        st4.executeQuery("select last_edit_date("+postid+","+userid+")");
        st6.executeQuery("select increment_answercount("+postid+")");
        st2.setString(2, text);
        st2.setInt(3,userid);
        st2.setInt(1,postid);
        st2.executeUpdate();
        ResultSet m=st.executeQuery("select parentid from posts where id="+postid);
        int postid2=0;
        if(m.next())
            postid2=m.getInt("parentid");
          
        con.close();
        if(postid2!=0)
        response.sendRedirect("postpage.jsp?postid="+postid2);
        else
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

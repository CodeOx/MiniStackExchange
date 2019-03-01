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
@WebServlet(urlPatterns = {"/upvote"})
public class upvote extends HttpServlet {

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
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "group_31", "235-563-714");
       Statement st=con.createStatement();
       Statement st3=con.createStatement();
       Statement st4=con.createStatement();
       Statement st5=con.createStatement();
       Statement st6=con.createStatement();
       Statement st7=con.createStatement();
       Statement st8=con.createStatement();
        out.println(request.getParameter("postid"));
        
        int postid=Integer.parseInt(request.getParameter("postid"));
        if(request.getParameter("userid").equals("null"))
            response.sendRedirect("loginpage.jsp?anscom=True");
        int userid=Integer.parseInt(request.getParameter("userid"));
        
        ResultSet executeQuery = st.executeQuery("select * from votes where postid="+postid+"and userid="+userid);
        ResultSet m=st3.executeQuery("select * from posts where id="+postid);
        int postid2=0;
        if(m.next())
            postid2=m.getInt("parentid");
              
                if(executeQuery.next()){
                    if(postid2!=0)
               response.sendRedirect("postpage.jsp?postid="+postid2+"&alr=True");
                    else
               response.sendRedirect("postpage.jsp?postid="+postid+"&alr=True");
                          
               }
               else{
               
                Statement st2=con.createStatement();
                if(m.getInt("owneruserid")==userid){
                    if(postid2!=0)
               response.sendRedirect("postpage.jsp?postid="+postid2+"&als=True");
                    else
               response.sendRedirect("postpage.jsp?postid="+postid+"&als=True");
                con.close();}
                else{
        st2.executeUpdate("insert into votes(postid,creationdate,votetypeid,userid) values("+postid+",current_timestamp,2,"+userid+")");
        st4.executeQuery("select score_update("+postid+",2)");
        st5.executeQuery("select reputation_update("+postid+",2)");
        ResultSet n=st7.executeQuery("select * from users where id="+m.getInt("owneruserid"));
        if(n.next())
        st6.executeQuery("select class_update("+m.getInt("owneruserid")+","+n.getInt("reputation")+")");
        st8.executeQuery("select updownvotecounter("+postid+","+"2)");
        
        con.close();
        if(postid2!=0)
        response.sendRedirect("postpage.jsp?postid="+postid2);
               else
               response.sendRedirect("postpage.jsp?postid="+postid);}}
        
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

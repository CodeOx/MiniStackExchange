import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import sun.misc.*;

/**
 *
 * @author Suraj
 */
public class loginservlet extends HttpServlet {
    HttpSession session;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String passwd=request.getParameter("password");
        String email=request.getParameter("email");
        ResultSet rs=null;

        try
        {
            
            
            Class.forName("org.postgresql.Driver");   
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234");
        Statement st = con.createStatement();
        Statement st2 = con.createStatement();
        Statement st5=con.createStatement();
            String selectStatement = "SELECT * FROM logindetails WHERE userid ='"+email+"';";
            rs = st.executeQuery(selectStatement);
            ResultSet rs3=st2.executeQuery("SELECT md5('"+passwd+"') as mn");
            if(rs.next())
            {
               String km=null;
               if(rs3.next())
                   km=rs3.getString("mn");
                if(km.equals(rs.getString("password")))
                {
                    session.setAttribute("userid",rs.getString("id"));
                    session.setAttribute("emailid",rs.getString("userid"));
                    String am=rs.getString("id");
                    ResultSet rs2=st.executeQuery("SELECT * FROM users where id="+rs.getString("id")+";");
                    if(rs2.next())
                    session.setAttribute("username",rs2.getString("displayname"));
                    st5.executeUpdate("update users set lastaccessdate=current_timestamp where id="+am);
                    con.close();
        
                    response.sendRedirect("index.jsp");                    
                }
                else
                {
                    con.close();
                    response.sendRedirect("loginpage.jsp?RetryLogin=True");
                }
            }
            else{
                con.close();
               response.sendRedirect("loginpage.jsp?RetryLogin=True");
            }

            con.close();
        }
        catch(Exception e)
        {
            out.println("Error="+e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        session = request.getSession(true);
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

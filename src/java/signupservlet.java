import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import sun.misc.*;

/**
 *
 * @author Suraj
 */
public class signupservlet extends HttpServlet {
    HttpSession session;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String passwd=request.getParameter("password");
        String email=request.getParameter("email");
        String confirm=request.getParameter("confirm");
        String location=request.getParameter("location");
        String about=request.getParameter("textarea");
        String usernm=request.getParameter("username");
        Part photo=request.getPart("userphoto");
        ResultSet rs=null;
        if(confirm.equals(passwd)){
        try
        {
            out.println(location);
            
            Class.forName("org.postgresql.Driver");   
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234");
        Statement st = con.createStatement();
        
            String selectStatement = "SELECT * FROM logindetails WHERE userid ='"+email+"';";
            rs = st.executeQuery(selectStatement);
            if(rs.next())
            {

             con.close();
             response.sendRedirect("signuppage.jsp?exists=True");
            }
            else{
               
                if(location.equals(""))
                {
                con.close();
                response.sendRedirect("signuppage.jsp?loc=True");
                }
                else if(about.equals("")){
                    con.close();
                response.sendRedirect("signuppage.jsp?empty=True");

                }
                else
                {   Statement st2=con.createStatement();
                    ResultSet rs2=st2.executeQuery("select max(id) as max from users");
                    rs2.next();
                    int id=rs2.getInt("max");
                    id++;
                    st.executeUpdate("insert into logindetails values("+id+",'"+email+"',md5('"+passwd+"'));");
                    st.executeUpdate("insert into users values("+id+","+500+",CURRENT_TIMESTAMP,'"+usernm+"',CURRENT_TIMESTAMP,"+"'"+location+"','"+about+"',"+"0,0,0,"+id+");");
                    
                    PreparedStatement ps=con.prepareStatement("insert into userimage values(?,?)");
                    
                    ps.setBinaryStream(2, photo.getInputStream(), (int)  photo.getSize());
                    ps.setInt(1, id);
                    ps.executeUpdate();
                    
                    session.setAttribute("userid",id);
                    
                    session.setAttribute("username",usernm);
                    response.sendRedirect("index.jsp");
                }
            }

            con.close();
        }
        catch(Exception e)
        {
            out.println("Error="+e);
        }}
        else{
        response.sendRedirect("signuppage.jsp?mismatch=True");
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

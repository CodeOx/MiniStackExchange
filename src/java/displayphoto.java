import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.postgresql.largeobject.LargeObject;
import org.postgresql.largeobject.LargeObjectManager;

@WebServlet(name = "displayphoto", urlPatterns = {"/displayphoto"})
public class displayphoto extends HttpServlet {

    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");   
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234");
       PreparedStatement ps = con.prepareStatement("select img from profilepicture where userid = ?");
       LargeObjectManager lobj = ((org.postgresql.PGConnection)con).getLargeObjectAPI();
                 
       int name;
            name = Integer.parseInt(request.getParameter("userid"));
            ps.setInt(1,name );
            ResultSet rs = ps.executeQuery();
            rs.next();
           
            response.setContentType("image/jpg");
            InputStream is=rs.getBinaryStream(1);
            OutputStream os = response.getOutputStream();
            
            byte buf[];
            buf = new byte[rs.getString(1).length()];
            int read=0;    
            while ((read = is.read(buf)) != -1) {
                    os.write(buf,0,read);
                     
                }
                    os.flush();
                    os.close();
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}

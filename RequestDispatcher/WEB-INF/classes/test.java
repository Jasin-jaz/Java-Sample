import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class test extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws
ServletException,IOException
{
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
out.println("<body><br><br>This is from test <br>");
}
}

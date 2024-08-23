import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class request_dispatch_servlet2 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws
ServletException,IOException
{
PrintWriter out=resp.getWriter();
RequestDispatcher d= getServletContext().getRequestDispatcher("/test");
Object str=req.getAttribute("attribute1");
d.include(req,resp);// the output of test servlet will be displayed within this servlet’s output.
out.println("<body><br><br>"+str.toString()+"<br>The attribute set by the first servlet(request_dispatch_servlet1) is getting displayed in the second servlet</body>");
}
}

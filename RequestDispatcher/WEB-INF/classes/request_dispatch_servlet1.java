import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class request_dispatch_servlet1 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
RequestDispatcher d=getServletContext().getRequestDispatcher("/request_dispatch_servlet2");
resp.setContentType("text/html");
req.setAttribute("attribute1","This attribute is set in request_dispatch_servlet1");
d.forward(req,resp);
}
}

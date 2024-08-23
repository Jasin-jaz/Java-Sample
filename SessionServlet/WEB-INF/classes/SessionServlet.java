import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SessionServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse
response)throws
ServletException, IOException {
// Get the session
HttpSession session = request.getSession();
PrintWriter out=response.getWriter();
// Get or create a session attribute
Integer visitCount = (Integer) session.getAttribute("visitCount");
if (visitCount == null) {
visitCount = 1;
} else
{
visitCount++;
}
session.setAttribute("visitCount", visitCount);
response.setContentType("text/html");
out.println("<html><body>");
out.println("<h2>Session Example</h2>");
out.println("<p>Session ID: " + session.getId() + "</p>");
out.println("<p>Number of Visits: " + visitCount + "</p>");
out.println("</body></html>");
}
}



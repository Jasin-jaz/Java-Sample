import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FormServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse
	response)throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Form Data Result</title></head>");
		out.println("<body>");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		out.println("<h2>Form Data Result</h2>");
		out.println("<p>Name: " + name + "</p>");
		out.println("<p>Email: " + email + "</p>");
		out.println("</body>");
		out.println("</html>");
	}
}

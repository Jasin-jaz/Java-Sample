import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class cookie extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)throws
ServletException, IOException {
// Get the existing cookies
Cookie[] cookies = request.getCookies();
// Check if cookies exist
if (cookies != null) {
for (Cookie cookie : cookies) {
String name = cookie.getName();
String value = cookie.getValue();
response.getWriter().println("Cookie Name: " + name + ", Value: " + value);
}
} else {
response.getWriter().println("No cookies found.");
}
// Create a new cookie
Cookie newCookie = new Cookie("username", "Jasin");
newCookie.setMaxAge(100); // Set the cookie's max age in seconds
response.addCookie(newCookie);
String value = newCookie.getValue();
response.getWriter().println("New cookie set and value :"+value);
}
}

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import register.createRegistration;

public class registerController extends HttpServlet 
{
    private String loginUser;
    private String loginPwd;
    private String loginUrl;
    private String group;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
	
 	HttpSession session = request.getSession(false);
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String grade = request.getParameter("grade");

	createRegistration registration = new createRegistration(firstName, lastName, grade);
	session.setAttribute("registration", registration);
	String address = "createRegistration.jsp";
	RequestDispatcher rd = request.getRequestDispatcher(address);
	rd.forward(request, response);
			
	
    }

}
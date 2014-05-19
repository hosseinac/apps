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
	//String age = request.getParameter("age");
	//String school = request.getParameter("school");
	//String homeAddress = request.getParameter("homeAddress");
	//String homeCity = request.getParameter("homeCity");
	//String homeZIP = request.getParameter("homeZIP");
	//String cellularPhone = request.getParameter("cellularPhone");
	//String homePhone = request.getParameter("homePhone");
	//String studentEmail = request.getParameter("studentEmail");
	//String pgFirst = request.getParameter("pgFirst");
	//String pgLast = request.getParameter("pgLast");
	//String pgPhone = request.getParameter("pgPhone");
	//String pgEmail = request.getParameter("pgEmail");
	//String session1 = request.getParameter("session1");
	//String session2 = request.getParameter("session2");
	//String session3 = request.getParameter("session3");
	//String session4 = request.getParameter("session4");
	
	response.setContentType("text/event-stream");   
 	response.setCharacterEncoding("UTF-8");

	//createRegistration registration = new createRegistration(firstName, lastName, grade, age, school, homeAddress, homeCity, homeZIP, cellularPhone, homePhone, studentEmail, pgFirst, pgLast, pgPhone, pgEmail, session1, session2, session3, session4);
	//session.setAttribute("registration", registration);
	//String data = (String)session.getAttribute("registration");

	response.getWriter().write("TEST");

	//String address = "createRegistration.jsp";
	//RequestDispatcher rd = request.getRequestDispatcher(address);
	//rd.forward(request, response);
	
    }

}
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import validate.accountValidation;

public class validateAccount extends HttpServlet 
{
    private String uid;
    private String pwd;
  
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		 			
			HttpSession session = request.getSession(true);
			
			uid = request.getParameter("uid");
			pwd = request.getParameter("pwd");

			accountValidation validation = new accountValidation(uid, pwd);
			session.setAttribute("validation", validation);
			String address = "reports.jsp";

			if (!validation.getValidation().equals(null))
			{
				session.setAttribute("uid", uid);
				RequestDispatcher rd = request.getRequestDispatcher(address);
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("nowhere");
				rd.forward(request, response);
			}
    }

}
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import validate.accessValidation;
import reports.queryDataDownload;

public class queryAccessController extends HttpServlet 
{
    private String pwd;
    private String accessCode;
    private String address;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		 			
			HttpSession session = request.getSession(true);

			pwd = request.getParameter("pwd");
			accessValidation validation = new accessValidation(pwd);
			accessCode = validation.getValidation();
	

			if (accessCode.equals("valid"))
			{
				address = "queryResultsDownload.jsp";

				queryDataDownload queryResultsDownload = new queryDataDownload(accessCode);
				session.setAttribute("queryResultsDownload", queryResultsDownload);

				RequestDispatcher rd = request.getRequestDispatcher(address);
				response.setContentType("application/force-download");
				response.setHeader("Content-Disposition","attachment; filename=QueryResults.csv");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("nowhere");
				rd.forward(request, response);
			}
    }

}
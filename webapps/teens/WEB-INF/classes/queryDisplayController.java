import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import reports.queryDataDisplay;

public class queryDisplayController extends HttpServlet 
{
    private String reportType;
    private String queryParameter0;
    private String queryParameter1;
    private String queryParameter2;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
	
 	HttpSession session = request.getSession(false);
	String valid = (String)session.getAttribute("uid");

	String reportType = request.getParameter("reportType");
	String queryColumn = request.getParameter("queryColumn");
	String queryParameter0 = request.getParameter("queryParameter0");
	
	if (!valid.equals(""))
	{
		queryDataDisplay queryResultsDisplay = new queryDataDisplay(reportType, queryColumn, queryParameter0);
		session.setAttribute("queryResultsDisplay", queryResultsDisplay);
		String address = "queryResultsDisplay.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(address);
		rd.forward(request, response);
	}
	
    }

}
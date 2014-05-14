import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import reports.queryData;

public class queryController extends HttpServlet 
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
		queryData queryResults = new queryData(reportType, queryColumn, queryParameter0);
		session.setAttribute("queryResults", queryResults);
		String address = "queryResults.jsp";

		RequestDispatcher rd = request.getRequestDispatcher(address);

		response.setContentType("application/force-download");
		response.setHeader("Content-Disposition","attachment; filename=QueryResults.txt");
			
		rd.forward(request, response);
	}
	
    }

}
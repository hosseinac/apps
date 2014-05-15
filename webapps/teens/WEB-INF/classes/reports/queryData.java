package reports;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class queryData
{
    String queryResults = "";    

    public queryData(String reportType, String queryColumn, String queryParameter0) 
    {
	Context ctx = null;
       	Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try
	{
            ctx = new InitialContext();

            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/postgresqldb");
             
            con = ds.getConnection();

            stmt = con.createStatement();
             
            rs = stmt.executeQuery("select * from "+reportType+" where "+queryColumn+" = '"+queryParameter0+"'");

		        //queryResults = "<table><tr><td>First Name</td><td>Last Name</td><td>Grade</td></tr>";

                	while (rs.next())
                	{
				queryResults += rs.getString("firstName")+","+rs.getString("lastName")+","+rs.getString("grade")+"\r\n";
			}
			
			//queryResults += "</table>";
            
             
	    stmt.close();
	    con.close();
	    ctx.close();
               
        }
	catch(NamingException e)
	{

            queryResults = e.toString();

        } 
	catch (SQLException e) 
	{

            queryResults = e.toString();

        }
			
    }
    
    public String getqueryResults()
    {
	return(queryResults);
    }

}
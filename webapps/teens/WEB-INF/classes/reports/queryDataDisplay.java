package reports;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class queryDataDisplay
{
    String queryResultsDisplay = "";    

    public queryDataDisplay(String reportType, String queryColumn, String queryParameter0) 
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

		        queryResultsDisplay = "<table><tr><td>First Name</td><td>Last Name</td><td>Grade</td></tr>";

                	while (rs.next())
                	{
				queryResultsDisplay += "<tr><td>"+rs.getString("firstName")+"</td><td>"+rs.getString("lastName")+"</td><td>"+rs.getString("grade")+"</td></tr>";
			}
			
			queryResultsDisplay += "</table>";
            
             
	    stmt.close();
	    con.close();
	    ctx.close();
               
        }
	catch(NamingException e)
	{

            queryResultsDisplay = e.toString();

        } 
	catch (SQLException e) 
	{

            queryResultsDisplay = e.toString();

        }
			
    }
    
    public String getqueryResultsDisplay()
    {
	return(queryResultsDisplay);
    }

}
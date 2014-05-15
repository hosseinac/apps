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

public class queryDataDownload
{
    String queryResultsDownload = "";    

    public queryDataDownload(String pwd) 
    {
	Context ctx = null;
       	Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
	
	if (pwd.equals("valid"))
	{

        try
	{
            ctx = new InitialContext();

            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/postgresqldb");
             
            con = ds.getConnection();

            stmt = con.createStatement();
             
            rs = stmt.executeQuery("select * from register");

                	while (rs.next())
                	{
				queryResultsDownload += rs.getString("firstName")+","+rs.getString("lastName")+","+rs.getString("grade")+rs.getString("age")+","+rs.getString("school")+","+rs.getString("homeaddress")+rs.getString("homecity")+","+rs.getString("homezip")+","+rs.getString("cellularphone")+rs.getString("homephone")+","+rs.getString("studentemail)+","+rs.getString("pgFirst")+rs.getString("pgLast")+","+rs.getString("pgPhone")+","+rs.getString("pgEmail")+rs.getString("session1")+","+rs.getString("session2")+"\r\n";
			}			
		
	    stmt.close();
	    con.close();
	    ctx.close();
               
        }
	catch(NamingException e)
	{

            queryResultsDownload = e.toString();

        } 
	catch (SQLException e) 
	{

            queryResultsDownload = e.toString();

        }
	}
	else
	{
	    queryResultsDownload = "You are not authorized to access this information.";
	}
			
    }
    
    public String getqueryResultsDownload()
    {
	return(queryResultsDownload);
    }

}
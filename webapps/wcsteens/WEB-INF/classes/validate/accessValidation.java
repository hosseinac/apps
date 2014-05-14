package validate;

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

public class accessValidation
{
    String validation = null;    
    
    public accessValidation(String pwd) 
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
             
            rs = stmt.executeQuery("select * from users where pwd = '"+pwd+"'");

                while (rs.next())
               	{
			validation =  "valid";
		}
           
            stmt.close();
	    con.close();
	    ctx.close();
               
        }
	catch(NamingException e)
	{

            validation = e.toString();

        } 
	catch (SQLException e) 
	{

            validation = e.toString();

        }
			
    }
    
    public String getValidation()
    {
	return(validation);
    }

}
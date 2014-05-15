package register;

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

public class createRegistration
{
    String registration = "";    

    public createRegistration(String firstName, String lastName, String grade, String age, String school, String homeAddress, String homeCity, String homeZIP, String cellularPhone, String homePhone, String studentEmail, String pgFirst, String pgLast, String pgPhone, String pgEmail, String session1, String session2) 
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
             
            stmt.executeUpdate("insert into register (firstName, lastName, grade, age, school, homeaddress, homecity, homezip, cellularPhone, homePhone, studentEmail, pgFirst, pgLast, pgPhone, pgEmail, session1, session2) values ('"+firstName+"','"+lastName+"','"+grade+"','"+age+"','"+school+"','"+homeAddress+"','"+homeCity+"','"+homeZIP+"','"+cellularPhone+"','"+homePhone+"','"+studentEmail+"','"+pgFirst+"','"+pgLast+"','"+pgPhone+"','"+pgEmail+"','"+session1+"','"+session2+"')");
            
            registration = "Hello "+firstName+" "+lastName+".  Thank you for registering for the teen summit.";
             
	    stmt.close();
	    con.close();
	    ctx.close();
               
        }
	catch(NamingException e)
	{

            registration = e.toString();

        } 
	catch (SQLException e) 
	{

            registration = e.toString();

        }
			
    }
    
    public String getRegistration()
    {
	return(registration);
    }

}
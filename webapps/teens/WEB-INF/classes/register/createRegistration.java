package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
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

    public createRegistration(String firstName, String lastName, String grade, String age, String school, String homeAddress, String homeCity, String homeZIP, String cellularPhone, String homePhone, String studentEmail, String pgFirst, String pgLast, String pgPhone, String pgEmail, String session1, String session2, String session3, String session4) 
    {
	Context ctx = null;
       	Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try
	{

            ctx = new InitialContext();

            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/postgresqldb");
             
            con = ds.getConnection();

	    String stmtStr = "insert into register (firstName, lastName, grade, age, school, homeaddress, homecity, homezip, cellularPhone, homePhone, studentEmail, pgFirst, pgLast, pgPhone, pgEmail, session1, session2, session3, session4) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            stmt = con.prepareStatement(stmtStr, stmt.RETURN_GENERATED_KEYS);

	    stmt.setString(1, firstName);
 	    stmt.setString(2, lastName);
 	    stmt.setString(3, grade);
	    stmt.setString(4, age);
            stmt.setString(5, school);
            stmt.setString(6, homeAddress);
            stmt.setString(7, homeCity);
            stmt.setString(8, homeZIP);
            stmt.setString(9, cellularPhone);
            stmt.setString(10, homePhone);
            stmt.setString(11, studentEmail);
            stmt.setString(12, pgFirst);
            stmt.setString(13, pgLast);
            stmt.setString(14, pgPhone);
            stmt.setString(15, pgEmail);
            stmt.setString(16, session1);
            stmt.setString(17, session2);
            stmt.setString(18, session3);
            stmt.setString(19, session4);
                           
            stmt.executeUpdate();

	    rs = stmt.getGeneratedKeys();

	   while (rs.next())
	   {
    		for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++)
    		{
       			registration = rs.getString("regid");
    		}
	   }
	    
	    
	    rs.close();
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
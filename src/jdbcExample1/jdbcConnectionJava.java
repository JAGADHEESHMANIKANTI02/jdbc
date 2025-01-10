
package jdbcExample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnectionJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbc";
	String user="root";
	String password="root@123";
	Connection con =DriverManager.getConnection(url,user,password);
	Statement statement = con.createStatement();
	int rows=statement.executeUpdate("insert into student(name) values ('ravi') ;");
	
	System.out.println(rows);
	

	}

}

package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() throws SQLException {
		Connection c = null;
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;encrypt=true;trustServerCertificate=true";
		String username = "sa";
		String password = "123456";
		c = DriverManager.getConnection(url, username, password);
	
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;	
		
	}
	public static void closeConnection(Connection c) {
		try {
			if (c != null){
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

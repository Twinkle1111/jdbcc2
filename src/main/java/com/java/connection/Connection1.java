package com.java.connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class Connection1  {
	private static String url="jdbc:mysql://localhost:3306/hrdb1";
	private static String user="root";
	private static String password="";
	
	public static Connection getConnection() throws SQLException
	{
		Connection con= DriverManager.getConnection(url, user, password);
		(con).setAutoCommit(false);
		return con;
	}
	
	public static void closeConnection(Connection con) throws SQLException
	{
		if(con!=null)
		{
			con.close();
		}
	}
}

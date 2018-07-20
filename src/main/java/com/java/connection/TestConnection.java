package com.java.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection  {
	public static void main(String[] args) throws SQLException {
		
		Connection con=Connection1.getConnection();
		System.out.println(con);
		Connection1.closeConnection(con);
}
}

package com.simplilearn.jdbc.util;

import java.sql.*;

public class StatementExample {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con=jdbcutil.getmysqlConnection();
			stmt = con.createStatement();
			rs=stmt.executeQuery("select * from Employees1");
			while (rs.next()) {
				System.out.println(
						"ID-" + rs.getInt(1)+
						" age-"+ rs.getInt(2)+
						" Name-"+ rs.getString(3)+
						" City-"+ rs.getString(4)
						);				
			}
			System.out.println("Closing the resources");
			jdbcutil.cleanup(rs, stmt, con);
			
		}

			catch(Exception e) { 
				e.printStackTrace();
			}
	}
}
package com.Simplilearn.jdbc.statement;

import java.sql.*;

public class StatementExample {
	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","root12345");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employees1");
			while (rs.next()) {
				System.out.println(
						"ID-" + rs.getInt(1)+
						" age-"+ rs.getInt(2)+
						" Name-"+ rs.getString(3)+
						" City-"+ rs.getString(4)
						);				
			}
			con.close();
			rs.close();
			stmt.close();
		}

			catch(Exception e) { 
				e.printStackTrace();
			}
	}
}
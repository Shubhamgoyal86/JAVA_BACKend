package com.Simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class deleteStatementExamples {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",
					"root12345");
			Statement stmt = con.createStatement();
			int record = stmt.executeUpdate("delete from Employees1 where id=6");
			

			if (record > 0) {
				System.out.println("Records deleted Successfully");
			} else {
				System.out.println("Eroor while delete");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

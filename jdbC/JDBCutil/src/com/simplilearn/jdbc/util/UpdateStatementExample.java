package com.simplilearn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// this jjava code used to updatte the data query
public class UpdateStatementExample {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",
					"root12345");
			Statement stmt = con.createStatement();
			// to insert the data in mysql from JDBC "; is not needed"
			int record = stmt.executeUpdate("update Employees1 set Name='Mahi' where id=6");
			if (record > 0) {
				System.out.println("Record Update Successfully");
			} else
				System.out.println("Record Not Update Due to error");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

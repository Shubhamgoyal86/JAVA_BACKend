package com.Simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// we need to write a jdbc program to insert data into mysql DB;
public class InsertStatementExample {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",
					"root12345");
			Statement stmt = con.createStatement();
			// to insert the data in mysql from JDBC "; is not needed"
			int record = stmt.executeUpdate("insert into Employees1 values(7,28,'Green','Mumbai')");
			// if record =0 means no record inserted
			// if record >0 means data is inserted successfully

			if (record > 0) {
				System.out.println("Records inserted Successfully");
			} else {
				System.out.println("Eroor while inserted");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

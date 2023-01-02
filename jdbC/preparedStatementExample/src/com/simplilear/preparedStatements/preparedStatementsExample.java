package com.simplilear.preparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilear.util.jdbcutil;

public class preparedStatementsExample {

public static void main(String[] args) {
	Connection con=null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		con=jdbcutil.getmysqlConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into Student1 values(?,?,?,?)");
		
		pstmt.setInt(1, 101);
		pstmt.setInt(2, 28);
		pstmt.setString(3, "Steve");
		pstmt.setString(4, "Smith");
		pstmt.execute();

		pstmt.setInt(1, 102);
		pstmt.setInt(2, 38);
		pstmt.setString(3, "Sachin");
		pstmt.setString(4, "ten.");
		pstmt.execute();
		
		pstmt.setInt(1, 103);
		pstmt.setInt(2, 32);
		pstmt.setString(3, "Virat");
		pstmt.setString(4, "Kohli");
		pstmt.execute();
		System.out.println("Query executed");
		con.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

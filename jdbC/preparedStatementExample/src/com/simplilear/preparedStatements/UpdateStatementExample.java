package com.simplilear.preparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilear.util.jdbcutil;

public class UpdateStatementExample {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con=jdbcutil.getmysqlConnection();
			PreparedStatement pstmt=con.prepareStatement("update  Student1 set age=? where id=?");
			pstmt.setInt(1, 48);
			pstmt.setInt(2, 102);
			pstmt.executeUpdate();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

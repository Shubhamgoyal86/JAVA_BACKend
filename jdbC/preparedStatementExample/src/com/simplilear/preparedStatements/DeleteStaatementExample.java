package com.simplilear.preparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilear.util.jdbcutil;

public class DeleteStaatementExample {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con=jdbcutil.getmysqlConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from Student1 where id=?");
			pstmt.setInt(1, 102);
			pstmt.executeUpdate();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
